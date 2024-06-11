package less2.impl;

public interface ActorBehaviour {
    void setMakeOrder(boolean flag);
    void setTakeOrder(boolean flag);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
