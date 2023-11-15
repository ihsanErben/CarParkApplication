
import java.util.*;

public class CarPark {

    Node first;
    Node last;
    int size;
    int count = 0;
    int price;
    int giro = 0;

    Scanner input = new Scanner(System.in);

    public CarPark(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public void add_car() {
        if (isFull()) {
            System.out.println("---  CAR PARK IS FULL ---");
            return;
        }
        System.out.print("plate: ");
        String plate = input.next();
        System.out.print("brand: ");
        String brand = input.next();
        System.out.print("model: ");
        String model = input.next();
        System.out.print("color: ");
        String color = input.next();
        System.out.print("time: ");
        int time = input.nextInt();

        Node newCar = new Node(plate, brand, model, color, time);

        if (isEmpty()) {
            first = newCar;
            last = newCar;
        } else {
            last.next = newCar;
            newCar.prev = last;
            last = newCar;
        }
        count++;
    }

    public void remove_car() {
        if (isEmpty()) {
            System.out.println("---  CAR PARK IS EMPTY ---");
            return;
        } else {
            System.out.print("plate: ");
            String plate = input.next();
            Node tmp = first;
            while (tmp != null) {
                if (tmp.plate.equals(plate)) {
                    giro += (tmp.time * price);
                    if (first == last) {
                        first = null;
                        last = null;
                        count--;
                        System.out.println(tmp.plate + " exited from the car park");
                        return;
                    } else if (tmp == first) {
                        first = first.next;
                        first.prev = null;
                        count--;
                        System.out.println(tmp.plate + " exited from the car park");
                        return;
                    } else if (tmp == last) {
                        last = last.prev;
                        last.next = null;
                        count--;
                        System.out.println(tmp.plate + " exited from the car park");
                        return;
                    } else {
                        tmp.prev.next = tmp.next;
                        tmp.next.prev = tmp.prev;
                        tmp.next = null;
                        tmp.prev = null;
                        count--;
                        System.out.println(tmp.plate + " exited from the car park");
                        return;
                    }
                }
                tmp = tmp.next;
            }
            System.out.println("There is no such an plate: " + plate);
        }
    }

    public void print_all_cars() {
        if (isEmpty()) {
            System.out.println("--- CAR PARK IS EMPTY ---");
            return;
        }

        System.out.println("///////////////////////////////");
        Node tmp = first;
        while (tmp != null) {
            System.out.println("plate --> " + tmp.plate);
            System.out.println("brand --> " + tmp.brand);
            System.out.println("model --> " + tmp.model);
            System.out.println("color --> " + tmp.color);
            System.out.println("time --> " + tmp.time);
            System.out.println("Price --> " + (tmp.time * price));
            System.out.println("///////////////////////////////");
            tmp = tmp.next;
        }
    }

    public void giro() {
        System.out.println("Giro: " + giro);
    }

    public boolean isFull() {
        return (size == count);
    }

    public boolean isEmpty() {
        return (count == 0);
    }
}
