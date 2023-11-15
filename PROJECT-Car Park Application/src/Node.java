
public class Node {
    String plate;
    String brand;
    String model;
    String color;
    int time;
    
    Node next;
    Node prev;

    public Node(String plate, String brand, String model, String color, int time) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.time = time;
    }

    public String getPlate() {
        return plate;
    }

    
}
