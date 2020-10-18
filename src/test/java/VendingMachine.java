import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //Scanner drink= new Scanner(System.in);
        double spent=0.0;
        String drink=null;
        double poundsConvert;
        System.out.println("* Welcome to Shailendra Vending Machine *");
        System.out.println("Which drink do you like to buy");
        System.out.println("Press A for Coke\nPress B for Pepsi\nPress C for soda\nPress D to Cancel");
        Scanner sc = new Scanner(System.in);
        System.out.print("Make your selection :");
        while (!sc.hasNext("[A-Da-d]*")) {
            System.out.print("Invalid input, Enter again:");
            sc.next();
        }
        char selection = sc.next().charAt(0);
        switch(selection) {
            case 'A':
            case 'a':
                System.out.println("You have selected Coke, that will be £0.25");
                spent = 0.25;
                drink = "Coke";
                break;
            case 'B':
            case 'b':
                System.out.println("You have selected Pepsi, that will be £0.35");
                spent = 0.35;
                drink = "Pepsi";
                break;
            case 'C':
            case 'c':
                System.out.println("You have selected Soda, that will be £0.45");
                spent = 0.45;
                drink = "Soda";
                break;
            default:
                System.out.println("Good Bye!");
                System.exit(0);
                break;
        }
        Scanner sc2= new Scanner(System.in);
        System.out.println("We accept 1p, 5p, 10p and 25p");
        System.out.print("How many 1p you like to inset :\t");
        int a = sc2.nextInt();
        System.out.print("How many 5p you like to inset :\t");
        int b = sc2.nextInt();
        System.out.print("How many 10p you like to inset :\t");
        int c = sc2.nextInt();
        System.out.print("How many 25p you like to inset :\t");
        int d = sc2.nextInt();
        double total = ((a*0.01)+(b*0.05)+(c*0.10)+(d*0.25));
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("You have inserted total "+df.format(total));
        System.out.println(drink+" is of " +spent);
        if (total >= spent)
        {
            System.out.println("\nEnjoy your "+drink+" .\nYour drink is available at compartment below");
            //System.out.println("Total again "+total);
            //System.out.println("spent again "+spent);
            if (total>spent)
            {
                System.out.println("Please take your change");
            }
            else if (total==spent)
            {
                System.exit(0);
            }
        }
        else
        {
            System.out.println("\nSorry you dont have enough money. Please take back "+total+" and try again");
        }
    }
}