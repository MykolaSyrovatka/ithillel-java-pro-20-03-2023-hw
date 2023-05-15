package ua.ithilell.hw11;

abstract public class Fruit{

    private final float weight ;


    protected Fruit(float weight) {
        this.weight=weight;
    }

    public float getWeight() {
        return weight;
    }
}
