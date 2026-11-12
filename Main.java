import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        /*Scanner na class-is used to take input from the user
        ithu use panni tha object 's' create pannuvoam*/

        int x = s.nextInt();// nextInt() method is used to read the integer value from the user

        int y = s.nextInt();// nextInt() method is used to read the integer value from the user

        String name = s.nextLine();// nextLine() method is used to read the string[it can took sentence with space] value from the user

        String behaviour = s.next();// next() method is used to read the string[one word(before space)] value from the user

        int sum = x + y;

        System.out.println("sum is " + sum);
        s.close();
    }
}