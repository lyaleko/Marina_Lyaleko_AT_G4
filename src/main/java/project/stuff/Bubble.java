package project.stuff;
// создать класс Bubble
// у пузырька должен быть обьем, газовый состав
// он должен уметь лопаться с выводом в консоль «Cramp!»
// ???? а газовый состав переменный в зависимости от образующего газа и
// задается в конструкторе класса*/

//--- public static final double VOLUME = 03, String gas;
//------ содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
//------ есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
//????------ есть публичный метод double getVolume(), возвращающий обьем пузырька

import java.util.Objects;

public class Bubble {

    public static final double VOLUME = 0.3;
    private String carbonicGas;

    public Bubble(double VOLUME, String carbonicGas){ //передается строка с названием газа пузырька
        System.out.printf("Gas name is: %s", carbonicGas).println();
        this.carbonicGas = carbonicGas;

    }
    public String getCarbonicGas() {
        return carbonicGas;

    }
    public void setCarbonicGas(String carbonicGas) {
        this.carbonicGas = carbonicGas;

    }
    public void cramp(){ //в консоль выводит слово "Cramp!"
        System.out.println("Cramp!");

    }
    public double getBubbleVolume() { //возвращающий обьем пузырька
        System.out.printf("Volume of bubble is: %s", VOLUME).println();
        return VOLUME;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "carbonicGas='" + carbonicGas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bubble bubble = (Bubble) o;
        return Objects.equals(carbonicGas, bubble.carbonicGas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carbonicGas);
    }
}