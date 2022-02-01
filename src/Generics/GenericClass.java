package Generics;

/**
 * MyClass<T>
 */
class MyClass<T> {
    T id;
    public void getId() {
        System.out.println(id);
    }
    public void setId(T id) {
        this.id = id;
    }
 }
public class GenericClass {
    public static void main(String[] args) {
        MyClass<Integer> m1= new MyClass<Integer>();
        m1.setId(101);
        m1.getId();
        MyClass<String> m2 = new MyClass<String>();
        m2.setId("EMP101");
        m2.getId();
        System.exit(0);
    }
}
