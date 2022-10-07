import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Hello. What is your name? ");
    String name = input.nextLine();
    
    Bot2 b2 = new Bot2(name);
    
    b2.greeting();
    
    System.out.println("What is your favorite animal?");
    String yourAnimal = input.nextLine();
    b2.favoriteAnimal(yourAnimal);
    
    System.out.println("Where do you live?");
    String location = input.nextLine();
    b2.home(location);
    
    System.out.println("What is your favorite number?");
    int yourNumber = input.nextInt();
    b2.favoriteNumber(yourNumber);
    
    b2.goodbye();
    }
}