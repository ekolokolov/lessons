package xyz.kolokolov.lesson.types;

public class MyClass {

    public MyClass(String field1, int field2) {
        System.out.println("Constructor 2");
        this.field1 = field1;
        this.field2 = field2;
    }

    public MyClass(String field1) {
        System.out.println("Constructor 1");
        this.field1 = field1;
        this.field2 = 80;
    }


    private String field1;
    private int field2;

    public int getField2() {
        return field2;
    }

    void doIt() {
    }
}
