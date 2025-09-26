package Week2;

public class Program2_TypeConversion {
	public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int num = 100;
        double implicit = num; 
        System.out.println("Implicit Conversion (int -> double): " + implicit);

        // Explicit Conversion (Narrowing)
        double decimal = 99.99;
        int explicit = (int) decimal;
        System.out.println("Explicit Conversion (double -> int): " + explicit);
    }

}
//tested