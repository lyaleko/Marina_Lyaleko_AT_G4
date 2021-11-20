package project.warehouse;
// - class Warehouse
//---- private Map<Integer, VesselBox> stock, которая является хранилищем ящиков
//---- public void addBox(VesselBox box) - для добавления ящиков в хранилище
//---- VesselBox getBox() - для получения содержимого ящиков
//---- void removeBox() - для удаления ящиков
//---- при добавлении/удалении ящиков Stocktaking обновляет информацию о состоянии склада

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;
    public void addBox(VesselBox box){};

    public VesselBox getBox() {
        return null;
    }//TODO

    void removeBox(){};
}
