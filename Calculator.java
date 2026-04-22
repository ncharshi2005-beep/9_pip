public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        
        System.out.println("--- Maven Calculator Project ---");
        System.out.println("Addition (10 + 5): " + sum);
        System.out.println("Subtraction (10 - 5): " + diff);
        System.out.println("Build Status: SUCCESS");
    }
}