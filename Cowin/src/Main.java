import Models.Centre;
import Models.User;
import Models.VaccineInventory;
import Models.VaccineType;
import Service.CenterService;
import Service.UserService;
import Service.BookingService;
import utils.AppConstants.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        UserService userService= new UserService();
        CenterService centerService= new CenterService();
        BookingService bookingService=new BookingService();

        while (true){
            System.out.println("******** Please enter Operation ********");
            try {
                Operation operation=Operation.valueOf(scanner.next());
                switch (operation){
                    case RegisterUser:
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        System.out.println("Enter username: ");
                        String username = scanner.next();
                        System.out.println("Enter gender (male/female/other): ");
                        String gender = scanner.next();
                        System.out.println("Enter preferred vaccine type(COVAX/COVISHIELD): ");
                        String vaccineType = scanner.next();
                        userService.register_user(name,username,gender,VaccineType.valueOf(vaccineType));
                        break;
                    case RegisterCenter:
                        System.out.println("Enter center Id: ");
                        String centerId = scanner.next();
                        System.out.println("COVAX Quantity: ");
                        int covaxCount = scanner.nextInt();
                        System.out.println("COVSHIELD Quantity: ");
                        int coshieldCount = scanner.nextInt();
                        centerService.registerCenter(centerId, covaxCount, coshieldCount);
                        break;
                    case getCentres:
                        System.out.println("Get centers for user: ");
                        username = scanner.next();
                        centerService.getCentres(username);
                        break;
                    case bookslot:
                        System.out.println("Slot booking for user: ");
                        username = scanner.next();
                        System.out.println("Slot booking at centre: ");
                        centerId=scanner.next();
                        bookingService.bookslot(username,centerId);
                        break;
                    case getStats:
                        bookingService.getStats();
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Please enter valid input!");
            }
        }
    }
}
