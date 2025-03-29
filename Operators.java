public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10 , b = 5;
        int sum = a + b; // Addtion
        int product = a * b; //Multiplication


        //  Relational Operators
        boolean isGreater = a > b; // Greater Than

        // Logical Operators
        boolean logicalResult = (a > 5) && (b < 10); // Logical AND

        // Unary Operators
        int incrementedValue = ++a; // Pre-increment
        int decrementValue = --b; // Pre-dcrement

        // Assignment Operators
        int c = 20;
        c += 10; // Equivalent to c = c + 10

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater";

        // Output
        System.out.println("Sum : " + sum);
        System.out.println("Product : " + product);
        System.out.println("Is a is greater than b ? " + isGreater);
        System.out.println("Logical Result : " + logicalResult);
        System.out.println("Incremented value of a : " + incrementedValue);
        System.out.println("Decremented value of b : " + decrementValue);
        System.out.println("Updated value of c : " + c);
        System.out.println("Ternary result : " + result);
    }
    
}
