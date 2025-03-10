//Gabriel Sand
// 3/10
// Test_one
import java.util.*;
public class Test_one{
    public static void main (String[]args){
        double volume;
        volume = ((3.14 * 1.5) * 3.14 * 1.5) * 5;
        double numPoles;
        double cubeYards;
        double cost;
        Scanner input = new Scanner(System.in);
        System.out.println("How many poles: ");
        numPoles = input.nextDouble();
        
        cubeYards = (volume * numPoles);
        cubeYards = volume / 27.0;
        cost = cubeYards * 12.98;
        System.out.println("The cost is " + cost);


        






    }
}