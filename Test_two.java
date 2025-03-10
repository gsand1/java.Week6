//Gabe Sand
// 3/10
// Test_two
import java .util.*;
public class Test_two {
    public static void main (String[]args){
        int m;
        int n;
        int side1;
        int side2;
        int hypotenuse;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        m = input.nextInt();
        System.out.println("Enter a value less than the previous one: ");
        n = input.nextInt();
        side1 = (m * m) - (n * n);
        side2 = (m * m) * n;
        hypotenuse = (m * m) + (n * n);
        System.out.println("Your pythagorean triplet is " + side1 + side2 + hypotenuse);





    }
}
