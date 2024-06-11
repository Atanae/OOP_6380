package less2.impl;

import less2.impl.Actor;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

    //void giveOrders(Actor actor);
}
