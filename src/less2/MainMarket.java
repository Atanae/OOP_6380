package less2;

import less2.impl.Human;
import less2.impl.Market;

public class MainMarket {
    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Олег");
        market.acceptToMarket(human1);
        Human human2 = new Human("Виктор");
        market.acceptToMarket(human2);
        Human human3 = new Human("Мария");
        market.acceptToMarket(human3);
        market.update();

    }
}
