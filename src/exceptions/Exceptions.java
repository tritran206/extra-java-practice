package exceptions;

public class Exceptions {

    public static void main(String[] args) {
        // Try-Catch
        try {
            int[] intArray = new int[5];
            // this block runs if no errors occurs
            System.out.println("Element 6 at index 5 = " + intArray[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            // this block runs if error is Array out of bounds.
            System.out.println("Exception thrown " + e);
        }
        finally {
            // this block runs regardless of errors
            System.out.println("Finished try-catch");
        }

    }
}
