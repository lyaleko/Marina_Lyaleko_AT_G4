package project.warehouse;
// - Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//????---- private Map<Integer, VesselBox> stock, которая является хранилищем ящиков
//????---- public void addBox(VesselBox box) - для добавления ящиков в хранилище
//????---- VesselBox getBox() - для получения содержимого ящиков
//????---- void removeBox() - для удаления ящиков
//????---- при добавлении/удалении ящиков Stocktaking обновляет информацию о состоянии склада

import java.util.Map;
import project.material.Glass;
import project.vessel.Bottle;
import project.vessel.Cup;
import java.io.IOException;

public class Warehouse {

    int cupSize;
    int bottleSize;

    VesselBox<Bottle> bottle;
    VesselBox<Cup> cup;

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
            cup.array[i] = new Cup(2, 3.5, new Glass(2, "white", 2.5)) ;

        }
        for (int i = 0; i < bottleSize; i++) {
            bottle.array[i] = new Bottle(i) ;
        }
    }
    private Map<Integer, VesselBox> stock;
    public void addBox(VesselBox box){};

    public VesselBox getBox() {
        return null;
    }//TODO

    void removeBox(){};
}