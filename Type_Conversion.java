public class Type_Conversion {
    public static void main(String[] args) {
        // Implicit conversion
        int i = 100;
        long l = i;  // No casting needed

        // Explicit conversion
        long l2 = 100L;
        int i2 = (int) l2; // Casting required

        System.out.println("Implicit conversion : " + l);
        System.out.println("Explicit conversion : " + i2);
    }
    
}
