package 抽象类;

//注意abstract和接口的区别
//=====================
//使用abstract使其变为抽象类
public abstract class Action {
    //abstract：只有方法约束，没有方法的实现
    public abstract void doSomething();

    //抽象类特点：
    /*
    1. 不能在void main（）{
    }
    里面new这个抽象类（e.g. 不能new Action（），智能靠子类的去实现他的约束
    2. 抽象类里面可以写普通方法和抽象方法，但要有抽象方法，必须要用抽象类
     */
}
