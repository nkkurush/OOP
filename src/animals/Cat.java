package animals;
public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака есть");;
    }

}
