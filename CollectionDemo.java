import java.util.ArrayList;

import ec.edu.epn.saew.Exam;
import ec.edu.epn.saew.Grading;
import ec.edu.epn.saew.Student;
import ec.edu.epn.saew.Test;

public class CollectionDemo {
    
    public static void main(String[] args) {
        
        //Primitivos 
        int a = 10;
        double b = 1052.2;
        float c = 134.6f;
        char d = 'A';
        boolean e = true;
        String f = "Hello World!";

        String g = new String("Test");

        // Arreglos
        int[] arreglo = new int[2];
        arreglo[0] = 1;
        arreglo[1] = 2;

        int[] arreglo2 = new int[2];
        arreglo[0] = 1;
        arreglo[1] = 2;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo[" + i + "] = " + arreglo[i]);
        }

        if (arreglo == arreglo2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        //Comparación de objetos
        Student student = new Student("Alejandra", "Sistemas");
        Student student2 = new Student("Alejandra", "Sistemas");

        if (student.equals(student2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        // Clases de arreglos
        ArrayList<Student> lista = new ArrayList<Student>();

        lista.add(student);
        lista.add(student2);

        System.out.println("Lista de Estudiantes");
        for (Student s : lista) {
            s.printInfo();
        }

        //Uso de interfaces
        Grading examen = new Exam();
        System.out.println("Nota del examen: " + examen.grade());

        Grading test = new Test();
        System.out.println("Nota del test: " + test.grade());
    }
}
