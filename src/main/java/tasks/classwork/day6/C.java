package tasks.classwork.day6;

public class C extends A {

    @Override
    public int foo(int x) {
        int y = super.foo(x);
        System.out.println(y);
        return y;
    }
}
