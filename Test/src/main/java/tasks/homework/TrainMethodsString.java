package basetask;

public class TrainMethodsString {

 // 1. создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
    public void printMama() {
        System.out.println("мама мыла раму");
    }
 // 2. создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
    public void printPapa() {
        System.out.println("папа мыл раму");
    }
 // 3. создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
    public void printString(String input){
        System.out.println(input);
    }
 // 4. создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку
    public void printMamaString(String input2){
        System.out.println("мама мыла " + input2);
    }

}
