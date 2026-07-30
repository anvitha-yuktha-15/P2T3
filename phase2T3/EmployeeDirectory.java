import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDirectory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();

        while (true) {
            System.out.println("\n1.Add 2.Search 3.Update 4.Delete 5.Display 6.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    employees.put(id, name);
                    System.out.println("Employee Added.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    if (employees.containsKey(id))
                        System.out.println("Employee Name: " + employees.get(id));
                    else
                        System.out.println("Employee Not Found.");
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    if (employees.containsKey(id)) {
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();
                        employees.put(id, name);
                        System.out.println("Employee Updated.");
                    } else {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    if (employees.remove(id) != null)
                        System.out.println("Employee Deleted.");
                    else
                        System.out.println("Employee Not Found.");
                    break;

                case 5:
                    System.out.println("\nEmployee Directory:");
                    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;

                case 6:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}