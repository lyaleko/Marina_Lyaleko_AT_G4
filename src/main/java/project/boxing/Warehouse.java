package project.boxing;

import project.feature.Stocktaking;
import project.material.Glass;
import java.io.IOException;

public class Warehouse {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Warehouse warehouse = new Warehouse(9, 25);
        warehouse.init();

        Stocktaking stocktaking = new Stocktaking();
        stocktaking.save(warehouse.bottle,"bottle.txt");
        stocktaking.save(warehouse.cup,"cup.txt");
        VesselBox<Bottle> bottleLoaded = stocktaking.load(VesselBox.class, "bottle.txt");
        VesselBox<Cup> cupLoaded = stocktaking.load(VesselBox.class, "cup.txt");

        System.out.println(bottleLoaded);
        System.out.println(bottleLoaded.array[0].getClass().toString() + " " + bottleLoaded.array.length);
        System.out.println(cupLoaded);
        System.out.println(cupLoaded.array[0].getClass().toString() + " " + cupLoaded.array.length);
    }

    VesselBox<Bottle> bottle;
    VesselBox<Cup> cup;

    int cupSize;
    int bottleSize;

    public Warehouse(int cupSize, int bottleSize) {
        this.cupSize = cupSize;
        this.bottleSize = bottleSize;
        this.bottle = new VesselBox<>(bottleSize, Bottle.class);
        this.cup = new VesselBox<>(cupSize, Cup.class);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "bottle=" + bottle +
                ", cup=" + cup +
                '}';
    }

    public void init(){

        for (int i = 0; i < cupSize; i++) {
            cup.array[i] = new Cup(2, 3.5, 1, new Glass(2, "white", 2.5)) ;

        }
        for (int i = 0; i < bottleSize; i++) {
            bottle.array[i] = new Bottle(i) ;
        }
    }
}