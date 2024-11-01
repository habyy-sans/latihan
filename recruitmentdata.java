import java.util.Scanner; 
public class recruitmentdata {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Name;
    byte number;
    double academicGrades,EnglishtestScores,nasionalismTest,GPA,Score;
    boolean physicalHealthCertificate,spiritualHealthCertificate;

    System.out.print("Input Name: ");
    Name = sc.nextLine();
    System.out.print("Enter the serial number: ");
    number = sc.nextByte();
    System.out.print("Input academic grades: ");
    academicGrades = sc.nextDouble();
    System.out.print("Input English test scores: ");
    EnglishtestScores = sc.nextDouble();
    System.out.print("Input nationalism test scores: ");
    nasionalismTest = sc.nextDouble();
    System.out.print("Input GPA: ");
    GPA = sc.nextDouble();
    System.out.print("Has physical health certificate? (true/false): ");
    physicalHealthCertificate = sc.nextBoolean();
    System.out.print("Has spiritual health certificate? (true/false): ");
    spiritualHealthCertificate = sc.nextBoolean();
    Score = (academicGrades + EnglishtestScores+ nasionalismTest) / 3;
    if (Score >= 78 && academicGrades > 75 && EnglishtestScores > 75 && nasionalismTest > 75 && GPA >= 3.25 
        && physicalHealthCertificate && spiritualHealthCertificate) {
        System.out.println("Participant's name: " + Name + ", Serial number: " + number);
        System.out.println("Test average: " + Score);
        System.out.println("Status: PASSED");
    } else {
        System.out.println("Participant's name: " + Name + ", Serial number: " + number);
        System.out.println("Test average: " + Score);
        System.out.println("Status: FAILED");
    }
  }
}