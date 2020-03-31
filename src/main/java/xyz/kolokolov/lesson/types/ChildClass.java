package xyz.kolokolov.lesson.types;

public class ChildClass extends MyClass {

    public ChildClass(String field1, String field3) {
        super(field1);
        this.field3 = field3;
    }

    private String field3;

    public String childMethod() {
        return "Hello world";
    }
}
