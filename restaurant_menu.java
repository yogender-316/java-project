import java.util.Scanner;
public class menu{
    
    static Scanner sc = new Scanner(System.in);//now sc will take input
    public double Total;
    

    public static void hello()
    {
        System.out.println("Welcome To Richman Hotel \n1. Fried rice (Rs.160.00) \n2. Fries (Rs.90.00) \n3. Cold Coffee (Rs.120.00) \n4. Manchurian (Rs.150.00) \n5. Spring Roll (Rs.129.00) \n");
    }


    public static void main(String[] args)
    {
        hello();
        double Total=0;
        int quantity;
        //double itemPrice;
        Scanner sc = new Scanner(System.in);
        lb:
        for(int i=0;i<1;i++)
        {
        System.out.println("Enter your choice of food item:");
        int menuOption=sc.nextInt();
        if (menuOption == 1) {
            // Fried rice (Rs.160.00)
            System.out.println("You've ordered a Fried rice");
            System.out.println("Enter Quantity: ");
            quantity=sc.nextInt();
            Total+=160*quantity;
        }
        if (menuOption == 2) {
            // Fries (Rs.90.00)
            System.out.println("You've ordered Fries");
            System.out.println("Enter Quantity: ");
            quantity=sc.nextInt();
            Total+=90*quantity;
        }
        if (menuOption == 3) {
            // Cold Coffee (Rs.120.00)
            System.out.println("You've ordered a Cold Coffee");
            System.out.println("Enter Quantity: ");
            quantity=sc.nextInt();
            Total+=120*quantity;
        }
        if (menuOption == 4) {
            // Manchurian (Rs.150.00)
            System.out.println("You've ordered a Manchurian");
            System.out.println("Enter Quantity: ");
            quantity=sc.nextInt();
            Total+=150*quantity;
        }
        if (menuOption == 5) {
            //  Spring Roll (Rs.129.00)
            System.out.println("You've ordered a Spring Roll");
            System.out.println("Enter Quantity: ");
            quantity=sc.nextInt();
            Total+=129*quantity;
        }
         
        System.out.println("Want to enter more food items yes(y) or no (n):");
        char choice=sc.next().charAt(0);
        if(choice=='y')
       { continue lb;}
        }
    System.out.println("So your total order is:"+ Total);
    }
}