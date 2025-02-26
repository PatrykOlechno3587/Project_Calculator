package Project_Calculator;

public class Main {

    public static void main(String[] args) {
        SomeInterface impl = (input) -> {
            System.out.println("Calling our functional interface: " + input);

        };
        impl.consume("Myarg");

    }
}
