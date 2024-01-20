import java.util.Date;

import ec.edu.epn.saew.Student;

public class HelloWorld {  
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Animal animal = new Animal(2,2);
        animal.walk();
        animal.eat();

        Dog dog = new Dog();
        dog.walk();
        dog.bark();
        dog.eat();

        Date date = new Date();
        System.out.println("Fecha actual ---> "+ date.toString());

        Student student = new Student("Alejandra", "Sistemas");
        student.printInfo();
    }
}
