package 内部类的学习;

//注重面向对象的思想
import 接口的定义与实现.UserService;

public class Test {
    public static void main(String[] args) {
        new Apple().eat();
        new UserService() {
            @Override
            public void add(String name) {

            }

            @Override
            public void delete(String name) {

            }

            @Override
            public void update(String name) {

            }

            @Override
            public void select(String name) {

            }
        };
    }
}