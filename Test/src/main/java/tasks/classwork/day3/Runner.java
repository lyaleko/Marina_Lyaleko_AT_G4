package day3;

import basetask.TrainMethodsString;

public class Runner {

    public static void main(String[] args) {

        Person person = new Man();
        Man man = new Man();

        man.speak("tratata");

        new Person().speak("bbb");
        new Dog().speak("tttt");
        new Cat().speak("yyy");

        speakAny(new Person());
        speakAny(new Cat());
        speakAny(new Dog());

    }

    private static void speakAny(Speakable speakable){
        speakable.speak("Speach");
        speakable.shout("Shout");
    }


}
