package animals;

public class Veterinar {
    public static String treatAnimal(Animal animal){
        return animal.getClass() + " " + animal.getFood() + " " + animal.getLocation();
    }
}
