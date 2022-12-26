package abstractPackage;


// abstract class
abstract class Animal {

    // abstract method
    abstract void move();
    abstract void eat();

    // Concrete method
    void label(){
        System.out.println("Animal's Data: ");
    }
}
