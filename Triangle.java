import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        /* assign edges of a triangle - input scanner
        confirm that the input is valid - if statement

        return the input is invalid or compute the perimetr
        */

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter edge a: ");
        double edgeA =  input.nextDouble();

        System.out.println("Enter edge b: ");
        double edgeB =  input.nextDouble();

        System.out.println("Enter edge c: ");
        double edgeC =  input.nextDouble();

        if (edgeA + edgeB <= edgeC) 
        System.out.println("The input is invalid.");
        else if (edgeB + edgeC <= edgeA)
        System.out.println("The input is invalid.");
        else if (edgeA + edgeC <= edgeB)
        System.out.println("The input is invalid.");
        else System.out.println("Perimetr of the triangle is " + (edgeA + edgeB + edgeC));


    }
}