public class Dog extends Animal {
    
    public void bark() {
        System.out.println("Barking...");

        //int tmpSize = super.size;
    }

    //Polimorfismo
    @Override
    public void eat() {
        super.eat();
        System.out.println("DOG Eating...");
    }

}
