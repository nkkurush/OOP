package animals;

public class Animal {
    private String food;
    private String location;
    public void makeNoise(){}
    public void eat(){}
    public void sleep(){
        System.out.println("The is sleeping");
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
