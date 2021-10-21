/* создать класс Bubble
 у пузырька должен быть обьем, газовый состав
 он должен уметь лопаться с выводом в консоль «Cramp!»
 обьем пузырька постоянный и равен 0.3 мм2, а газовый состав переменный
 в зависимости от образующего газа и задается в конструкторе класса*/
package project.boxing;

public class Bubble {

    private  double volume = 0.3;
    private String gas;

    public Bubble(String gas){ //передается строка с названием газа пузырька
        this.gas = gas;
        System.out.println("input name gas");

    }
    public String getGas() {
        return gas;

    }
    public void setGas(String gas) {
        this.gas = gas;

    }
    public void cramp(){ //в консоль выводит слово "Cramp!"
        System.out.println("Cramp!");

    }
    public double getVolume() { //возвращающий обьем пузырька
        System.out.printf("Volume bubbles is: %s", volume).println();
        return volume;
    }
}
