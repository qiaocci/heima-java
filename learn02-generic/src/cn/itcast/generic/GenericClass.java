package cn.itcast.generic;

/*
创建泛型类，参考ArrayList
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
