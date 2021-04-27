import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;

    System.out.println("Please enter a whole number: ");
    number = input.nextInt();

    if(number % 2 == 0) {
      System.out.println("Number is even.");
    }
    else {
      System.out.println("Number is odd.");
    }
  }
}
