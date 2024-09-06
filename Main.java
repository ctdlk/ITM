import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = (new Scanner(System.in)).nextLine();
        int output;
        String[] params = input.split(" ");
        if (params.length != 3) {
            throw new Exception();
        } else {
            try {
                int firstOperand = Integer.parseInt(params[Param.FIRST_OPERAND.ordinal()]);
                int secondOperand = Integer.parseInt(params[Param.SECOND_OPERAND.ordinal()]);
                if (firstOperand <= 0 || firstOperand > 10 || secondOperand <= 0 || secondOperand > 10) {
                    throw new Exception();
                }
                String operation = params[Param.OPERATION.ordinal()];
                output = switch (operation) {
                    case "+" -> firstOperand + secondOperand;
                    case "-" -> firstOperand - secondOperand;
                    case "*" -> firstOperand * secondOperand;
                    case "/" -> firstOperand / secondOperand;
                    default -> throw new Exception();
                };
                System.out.println(output);
            } catch (IllegalArgumentException e) {
                throw new Exception();
            }
        }
    }
}