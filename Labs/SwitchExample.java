public class SwitchExample {
  public static void main(String[] args) {
    char grade;
    grade = 'b';

    switch(grade) {
    default:
      System.out.println("Invalid grade.");
    case 'A':
    case 'a':
      System.out.println("Fantastic job!");
      break;
    case 'B':
      System.out.println("Good job!");
      //break;
    case 'C':
      System.out.println("You're doing ok.");
      break;
    case 'D':
      System.out.println("Please schedule a conference.");
      break;
    case 'F':
      System.out.println("Start finishing homework and showing up to class.");
      break;

    }
  }
}
