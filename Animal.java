public class Animal {

    /*
     * MODIFICADORES DE ACCESO
     * private - solo dentro de la clase
     * protected - dentro de la clase y sus subclases
     * public - desde cualquier clase
     * default - desde el mismo paquete
     */
    protected int size;
    protected int extremities;

    public Animal() {
        this.size = 10;
        this.extremities = 4;
    }

    public Animal(int size, int extremities) {
        this.size = size;
        this.extremities = extremities;
    }

    public void walk() {
        System.out.println("Walking... " + this.extremities + " extremities");
    }

    public void eat() {
        System.out.println("Eating...");
    }

}
