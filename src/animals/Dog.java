package animals;

public class Dog extends Animal{
    String name = "Dog";
    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукаеть");
    }

    @Override
    public void eat() {
        System.out.println("Кошка есть");
    }
}
