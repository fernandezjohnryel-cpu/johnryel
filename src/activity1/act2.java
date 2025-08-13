package activity1;


 import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print ("enter employee name :");
        String ename = sc.nextLine();
        System.out.print("ENter hourly rate : ");
        float hrate = sc.nextFloat();
        System.out.println("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("--------------wage summary---------------");
        System.out.println("Employee: "+ename);
        System.out.println("Hourly Rate: P"+hrate);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Gross weekly wage: "+(hours*hrate));
        System.out.printf("SSS contributions(10%%): P%.2f", (hours*hrate)*0.1);
        System.out.println("\n\n-----------------------------------------");
        System.out.printf("net weekly wage: P%.2f\n\n", (hours*hrate)-((hours*hrate)*0.1));
        
        
        
    }
}
