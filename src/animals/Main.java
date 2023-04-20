package animals;

public class Main extends Veterinar {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Horse horse = new Horse();
        Dog dog = new Dog();

        cat.setFood("рыба");
        dog.setFood("мясо");
        horse.setFood("трава");
        cat.setLocation("House");
        dog.setLocation("Dvor");
        horse.setLocation("Конюшня");
        Animal[] animals = new Animal[3];
        animals[0]=dog;
        animals[1]=horse;
        animals[2]=cat;
        for(Animal animal: animals){
            System.out.println(treatAnimal(animal));
        }
    }
}
