import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            Animal animal;

            System.out.print("What animal do you want? ");
            System.out.print("1=Dog, 2=Cat: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                animal = new Dog();
                animal.speak();
            }

            else if(choice == 2){
                animal = new Cat();
                animal.speak();
            }

            else {
                animal = new Animal();
                System.out.println("Invalid option");
                animal.speak();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        finally {
            scanner.close();
        }
    }
}