import java.util.Scanner;

class Calculator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter opeartion [sum, div, mul, mod, sub]: ");
        String op = scanner.nextLine();

        switch (op) {
            case "sum":
                System.out.printf("%d + %d = %d \n", number1, number2, number1 + number2);
                break;
            case "div":
                if (number1 == 0 || number2 == 0){
                    System.out.println("Cannot divide by zero");
                }
                else{
                    System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
                }
                break;
            case "mul":
                System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
                break;
            case "sub":
                System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
                break;
            default:
                System.out.printf("%svoperation is not supported\n", op);
        }
    }
}