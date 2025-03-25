
import java.util.Scanner;

class Input_Output_Var{
    public static void main(String[] args) {
        // Output
        System.out.println("*\n**\n***\n****");

        // Variables
        String name = "Drish Thareja";
        int a = 25, b = 10;
        double c = 5.25;
        int sum = a + b;
        System.out.println(sum + " " + name + " " + c);
        System.out.println(b-a);

        // Input
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        System.out.println(names);

        /*
         * nextLine = String input
         * nextInt = integer
         * nextFloat = float
         */

         
         int x = sc.nextInt();
         int y = sc.nextInt();
         int addition = x+y;
         System.out.println(addition);
    }
}