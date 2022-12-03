package Tutorial.SwitchCase;
import java.util.Scanner;


public class nestedswitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID=in.nextInt();

        //with normal-switch case
        String department =in.next();
        switch(empID){
            case 1:
                System.out.println("Lokesh Ghosh");
                break;
            case 2:
                System.out.println("Ranjit kumar");
                break;
            case 3:
                System.out.println("emp number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");

                }
                break;
            default:
                System.out.println("invalid empId");
        }

//With enhance switch case
        switch (empID) {
            case 1 -> System.out.println("Lokesh Ghosh");
            case 2 -> System.out.println("Ranjit kumar");
            case 3 -> {
                System.out.println("emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("invalid empId");
        }

    }
}
