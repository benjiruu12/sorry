public class Main {
    public static void main(String[] args){
        Add adder = new Add();
        Subtract subtractor = new Subtract();
        Product multiplier = new Product();
        Division divider = new Division();
        Modulus modulusOperator = new Modulus();

        int sum = adder.add(5,3);
        int difference = subtractor.subtract(5,3);
        int product = multiplier.product(5,3);
        int quotient = divider.divide(6,3);   
        int modulus = modulusOperator.modulus (10,5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference)
        System.out.println("Product: " + product)
        System.out.println("Quotient: " + quotient)
        System.out.println("Modulus: " + modulus)


    }
    
}