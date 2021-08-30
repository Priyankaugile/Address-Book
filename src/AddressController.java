import java.util.ArrayList;
import java.util.Scanner;

// controller
public class AddressController {

    public static void main(String[] args) {

        AddressService addressBookService = new AddressService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT_VALUE = 4;
        while(choice != EXIT_VALUE) {
            System.out.println(" ****Select your option****");
            System.out.println("1.Add Person\n2.Update Person\n3.Delete Person\n"+EXIT_VALUE+".Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBookService.createPerson();
                    System.out.println(" ****Your Adding Record****");
                    addressBookService.print();
                    break;
                case 2:
                    System.out.println("Enter name of person to Update");
                    String name = scanner.next();
                    addressBookService.updatePerson(name);
                    System.out.println("****Your Updating Information****");
                    addressBookService.print();
                    break;
                case 3:
                    System.out.println("Enter name of person to Delete");
                    String n = scanner.next();
                    addressBookService.deletePerson(n);
                    System.out.println("****Your Deleted Record****");
                    addressBookService.print();
                    break;
                case EXIT_VALUE :
                    System.out.println("Exit");
                    System.out.println("****BYE BYE****");
                    break;
                default:
                    System.out.println("Enter valid value");
                    break;
            }
        }

    }

}
