package 接口的定义与实现;

//用户业务层,接口都需要有实现类

/**
 *interface 定义的关键字
 */
public interface UserService {
    //增删改查
    void add(String name);
    void delete(String name);
    void update(String name);
    void select(String name);
}
