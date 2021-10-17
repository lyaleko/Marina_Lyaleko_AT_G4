package tasks.classwork.day6;

public class B{
    public static void main(String[] args) {

        A a = new A(){
            public int foo(int x) {
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }

        };

        A b = new C();
        C c = new C();

        method(b, 2);
        method(c, 3);

        a.foo(5);
    }
    public static void method(A a, int z){
        int d = a.foo(z);
    }
}
