import 内部类的学习.Outer;

public class Application3 {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner =  outer.new Inner();
        inner.in();

    }
}
