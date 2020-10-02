import java.util.Scanner;

/**
 *This program asks for positive interger than a negative one to quit. 
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //prompts user for a positive interger and a negative one
    System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
    //allows user to put in interger
    int userNumber = input.nextInt();

    //while loop for users number if it is positive
    while(userNumber >= 0){
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      //allows user to enter a new number
      userNumber = input.nextInt();
    }
    //prompt for negative number
      System.out.println("All done!");


  }
}
