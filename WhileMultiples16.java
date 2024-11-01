import java.util.Scanner;
public class WhileMultiples16 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;
        double average = 0;
        System.out.print("input the multiple: ");
        multiple = sc.nextInt();
        for (int i=1; i<=50; i++){
            if (i%multiple == 0){
            sum +=i;
            counter++;
            }
            if (counter != 0) {
                average = (double) sum/counter;
            }
        System.out.println("sum of multiple: " + sum);
        System.out.println("average of multiple: " + average);
        }
    }
    
}
