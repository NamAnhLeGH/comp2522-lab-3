import code.*;

public class Main {
    public static void main(final String[] args) {
        // Create and test IPod objects
        final IPod ipod1 = new IPod(300, 80.0);
        final IPod ipod2 = new IPod(400, 85.0);
        final IPod ipod3 = new IPod(300, 70.0);

        System.out.println("IPod Equality Test:");
        System.out.println(!ipod1.equals(ipod2) ? "CORRECT: ipod1 is not equal to ipod2" : "INCORRECT: ipod1 should not be equal to ipod2");
        System.out.println(ipod1.equals(ipod3) ? "CORRECT: ipod1 is equal to ipod3" : "INCORRECT: ipod1 should be equal to ipod3\n");

        // Create and test IPad objects
        final IPad ipad1 = new IPad(true, "iPadOS 15");
        final IPad ipad2 = new IPad(false, "iPadOS 14");
        final IPad ipad3 = new IPad(true, "iPadOS 15");

        System.out.println("IPad Equality Test:");
        System.out.println(!ipad1.equals(ipad2) ? "CORRECT: ipad1 is not equal to ipad2" : "INCORRECT: ipad1 should not be equal to ipad2");
        System.out.println(ipad1.equals(ipad3) ? "CORRECT: ipad1 is equal to ipad3" : "INCORRECT: ipad1 should be equal to ipad3\n");

        // Create and test IPhone objects
        final IPhone iphone1 = new IPhone(120.0, "Verizon");
        final IPhone iphone2 = new IPhone(180.0, "T-Mobile");
        final IPhone iphone3 = new IPhone(120.0, "AT&T");

        System.out.println("IPhone Equality Test:");
        System.out.println(!iphone1.equals(iphone2) ? "CORRECT: iphone1 is not equal to iphone2" : "INCORRECT: iphone1 should not be equal to iphone2");
        System.out.println(iphone1.equals(iphone3) ? "CORRECT: iphone1 is equal to iphone3" : "INCORRECT: iphone1 should be equal to iphone3\n");

        // Create and test IPhone16 objects
        final IPhone16 iphone16_1 = new IPhone16(100.0, "Verizon", true, 512);
        final IPhone16 iphone16_2 = new IPhone16(100.0, "Verizon", true, 256);
        final IPhone16 iphone16_3 = new IPhone16(100.0, "Verizon", false, 512);

        System.out.println("IPhone16 Equality Test:");
        System.out.println(iphone16_1.equals(iphone16_2) ? "CORRECT: iphone16_1 is equal to iphone16_2" : "INCORRECT: iphone16_1 should be equal to iphone16_2");
        System.out.println(!iphone16_1.equals(iphone16_3) ? "CORRECT: iphone16_1 is not equal to iphone16_3" : "INCORRECT: iphone16_1 should not be equal to iphone16_3");
    }
}
