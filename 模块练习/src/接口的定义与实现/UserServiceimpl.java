package 接口的定义与实现;
//抽象类是通过extends
//实现了接口的类，就需要实现接口中的方法
//侧面通过接口实现多继承
public class UserServiceimpl implements UserService{
    //想要实现这一个类，就必须要去实现里面的所有功能
    @Override
    public void add(String name){

    };
    @Override
    public void delete(String name){

    };
    @Override
    public void update(String name){

    }

    @Override
    public void select(String name) {

    }
}
