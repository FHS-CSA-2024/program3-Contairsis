//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
  public static void main(String[] args){
      //declare variables
      int length = 0;
      int width = 0;
      int perimeter = 0;
      int area = 0;
      //create scanner
      Scanner numScanner = new Scanner (System.in);
      //ask for input
      System.out.println("Enter Length: ");
      length = numScanner.nextInt();
      System.out.println("Enter Width: ");
      width = numScanner.nextInt();
      //calc
      perimeter = length * 2 + width * 2;
      area = length * width;
      //print results
      System.out.println("The Length is " + length);
      System.out.println();
      System.out.println("The Width is " + width);
      System.out.println();
      System.out.println();
      System.out.println("The Area is " + area);
      System.out.println();
      System.out.println("The Perimeter is " + perimeter);
    }
}




//Paste console output below:
/*
Enter Length: 
237
Enter Width: 
55
The Length is 237

The Width is 55


The Area is 13035

The Perimeter is 584

*/
