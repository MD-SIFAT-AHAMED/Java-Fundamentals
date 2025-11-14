public class typeConversion {
    public static void main(String arg[]) {
        byte a = 10;
        int b = a; // Type Conversion
        System.out.println(b);

        int num = 100;
        byte value = (byte) num; // Type Casting
        System.out.println(value);

        byte hel = 29;
        byte hel2 = 30;

        int result = hel * hel2; // Type Promotion
        System.out.println(result);
    }
}
