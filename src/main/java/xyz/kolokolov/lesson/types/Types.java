package xyz.kolokolov.lesson.types;

public class Types {

    public static void main(String[] args) {
        MyClass rinat = new MyClass("novi text", 3);
        MyClass rinat80 = new MyClass("novi text");

        System.out.println("object " + new ChildClass("he", ""));

        System.out.println(rinat.getField2());
        System.out.println(rinat80.getField2());
    }

}
