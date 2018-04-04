package exceptions;

public class Exceptions2 {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) {

        double currentCocoaTemp = 200;
        try {
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That cocoa was good!");
        } catch (TooColdException e1) {
            System.out.println("That's too hot!");
        } catch (TooHotException e2) {
            System.out.println("That's too cold!");
        }

        System.out.println("And its gone..");

    }
}
