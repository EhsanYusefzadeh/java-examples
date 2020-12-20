public class Car {

    int weight = 500;
    String color = "White";
    String name = "Fride";

    public Car(){
        int weight = 500;
        String color = "White";
        String name = "Fride";
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String color ) {
        this.color = color;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

}