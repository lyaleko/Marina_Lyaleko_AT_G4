package tasks.classwork.day6;

public class ObjectContainer {

    Object[] array = new Object[10];

    int freePlaceNumber = 0;

    public void add(Object incoming) {
        if (freePlaceNumber < array.length) {
            array[freePlaceNumber++] = incoming;
        }

    }
    public Object removeLast() {
        if (freePlaceNumber > 0) {
            Object ob = array[freePlaceNumber - 1];

            array[freePlaceNumber - 1] = null;
            freePlaceNumber--;
            return ob;
        }
        return null;
    }
    public boolean isEmpty(){
            return freePlaceNumber == 0;
    }
    public boolean isFull(){
        return freePlaceNumber == array.length;
    }

}
