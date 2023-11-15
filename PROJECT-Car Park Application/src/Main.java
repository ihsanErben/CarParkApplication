
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Car park size: ");
        int size = input.nextInt();
        System.out.print("Price of park(for a hour): ");
        int price = input.nextInt();
        CarPark x = new CarPark(size, price);
        
        int a = 1;
        while (a == 1) {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("1)New car   --   ");
            System.out.print("2)Remove a car   --   ");
            System.out.print("3)Display the car park   --   ");
            System.out.println("4)Calculate the giro");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            switch (option) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    x.add_car();
                    break;
                case 2:
                    x.remove_car();
                    break;
                case 3:
                    x.print_all_cars();
                    break;
                case 4:
                    x.giro();
                    break;
                default:
                    System.out.println("--- INVALID VALUE ---");
                    break;
            }
        }

    }
}

