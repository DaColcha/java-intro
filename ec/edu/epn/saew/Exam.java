package ec.edu.epn.saew;

public class Exam implements Grading{
    
    public void performTest() {
        Student student = new Student("Alejandra", "Sistemas");
        System.out.println("Performing test..." + student.grade);
    }

    @Override
    public int grade() {
        return 8;
    }
}
