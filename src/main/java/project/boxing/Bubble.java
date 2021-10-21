/* создать класс Bubble
 у пузырька должен быть обьем, газовый состав
 он должен уметь лопаться с выводом в консоль «Cramp!»
 обьем пузырька постоянный и равен 0.3 мм2, а газовый состав переменный
 в зависимости от образующего газа и задается в конструкторе класса*/
package project.boxing;

public class Bubble {

    private  double bubbleVolume = 0.3;
    private String carbonicGas;

    public Bubble(String carbonicGas){ //передается строка с названием газа пузырька
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
        System.out.printf("Volume of bubble is: %s", bubbleVolume).println();
        return bubbleVolume;
    }
}
