package less2.impl;



import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> actorsQueue;

    public Market() {
        this.actorsQueue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        // вход покупателя
        System.out.println("Добро пожаловать, " + actor.getName());
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            if (actor.isTakeOrder()) {
                System.out.println("До свидания, " + actor.getName());
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actorsQueue) {
            System.out.println(actor.getName() + " выбрал товар");
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void takeInQueue(Actor actor) {
        // встал в очередь на выдачу
        this.actorsQueue.add(actor);
        System.out.println("     Займите очередь");
    }

    @Override
    public void update() {
        // обновление состояния магазина
        giveOrders();
        takeOrders();
        releaseFromQueue();

    }

    @Override
    public void takeOrders() {
        // взял заказ
        for (Actor actor : actorsQueue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил товар");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        // вышел из очереди
        List<Actor> removeActors = new ArrayList<>();
        for (Actor actor : actorsQueue) {
            if (actor.isTakeOrder()) {
                removeActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        actorsQueue.removeAll(removeActors);
        releaseFromMarket(removeActors);
    }
}