package project.warehouse;
// - Создать 2 объекта класса VesselBox с бутылками и кружками в классе Warehouse и вывести на экран имена хранимых обьектов.
//---- private Map<Integer, VesselBox> stock, которая является хранилищем ящиков
//---- public void addBox(VesselBox box) - для добавления ящиков в хранилище
//---- VesselBox getBox() - для получения содержимого ящиков
//---- void removeBox() - для удаления ящиков
//---- при добавлении/удалении ящиков Stocktaking обновляет информацию о состоянии склада

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import project.vessel.Bottle;
import project.vessel.Cup;
import project.vessel.Vessel;

import java.io.IOException;

public class Warehouse {

    int cupSize;
    int bottleSize;

    public Warehouse(int cupSize, int bottleSize) {
        this.cupSize = cupSize;
        this.bottleSize = bottleSize;
    }

    private Map<Integer, VesselBox> stock = new HashMap<>(); // является хранилищем ящиков

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Warehouse warehouse = new Warehouse(9, 25);

        VesselBox<Bottle> bottleBox = new VesselBox<Bottle>("Bottle", new ArrayList<>(), 1);
        VesselBox<Cup> cupBox = new VesselBox<Cup>("Cup", new ArrayList<>(), 2);

        warehouse.addBox(bottleBox);
        Stocktaking.getInfo();
        warehouse.addBox(cupBox);
        Stocktaking.getInfo();

        warehouse.removeBox(bottleBox);
        Stocktaking.getInfo();
        warehouse.removeBox(cupBox);
        Stocktaking.getInfo();

    }

    public void addBox(VesselBox box){ //для добавления ящиков в хранилище
        stock.put((int)box.getId(), box);
        Stocktaking.registerBox(box);
    };

    public VesselBox getBox(int id) { // для получения содержимого ящиков
        return stock.get(id);
    }

    void removeBox(VesselBox box){ // для удаления ящиков
        stock.remove((int)box.getId());
        Stocktaking.disposeBox(box);
    };
}