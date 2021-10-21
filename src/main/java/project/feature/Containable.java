package project.feature;

import project.feature.Transformable;

public interface Containable/* implements Bottle, Cup, Can*/{

    void addStuff (Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
    int getFreeSpace();
    void open();
    void close();

}
