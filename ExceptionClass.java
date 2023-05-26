
public class ExceptionClass {

    public static void main(String[] args) {

    }
    public static void handleException(int num) {
        try {
            if (num == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            } else if (num > 0 && num < 4) {
                int result = 10 / num;
                System.out.println("Result: " + result);
            } else if (num >= 4) {
                int value = num - 4;
                System.out.println("");
            }
        }
    }
}
