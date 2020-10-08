import java.util.Scanner;

public class DaysInAMonth {

    public static void main(String[] args) {

        /* insert scanner and assign the input 
        return numbers of days for every month - switch,
        for "case 2" - february decide if the year is a leap-year (if statement) 
        */

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter chosen year: ");
        int year = input.nextInt();

        System.out.println("and a month: ");
        short month = input.nextShort();

        
        switch(month) {
            case 1 :
                System.out.println("january " + year + " has 31 days." );
                break;
            case 2 :
                if(year % 4 == 0 && year % 100 != 0) {
                    System.out.println("february " + year + " has 29 days." );
                } else {
                    System.out.println("february " + year + " has 28 days." );
                }
                break;
            case 3 :
                    System.out.println("march " + year + " has 31 days.");
                    break;
            case 4 :
                System.out.println("april " + year + " has 30 days.");
                break;
            case 5 :                    
                System.out.println("may " + year + " has 31 days.");
                break;
            case 6 :
                System.out.println("june " + year + " has 30 days.");
                break;
            case 7 :
                System.out.println("july " + year + " has 31 days.");
                break;
            case 8 :
                System.out.println("august " + year + " has 31 days.");
                break;
            case 9 :
                System.out.println("september " + year + " has 30 days.");
                break;
            case 10 :
                System.out.println("october " + year + " has 31 days.");
                break;
            case 11 :
                System.out.println("november " + year + " has 30 days.");
                break;
            case 12 :
                System.out.println("december " + year + " has 31 days.");
                break;
            default:
                System.out.println("not valid");
                
            }


            }       
       
        
    }


