import java.util.Scanner;
public class DoWhileLeaveEntitlement16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 10;
        int numLeave;
        String confirmation;
        do {
            System.out.print("Do you want to take a leave (y/t)? ");
            confirmation = input.next();
            if (confirmation.equalsIgnoreCase("t")){
                break;
            }
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many days? ");
                numLeave = input.nextInt();
                    if (numLeave > leaveEntitlement) {
                    System.out.println("You don't have enough leave entitlement.");
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                     } else {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                }
            }
        } while (true);
    }
}