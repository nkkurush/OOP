package animals;

public class Horse extends Animal {
    String food;
    String location;
    @Override
    public void makeNoise() {
        System.out.println("Лощадь кричить");
    }
    @Override
    public void eat() {
        System.out.println("Лошадь есть");
    }
}
