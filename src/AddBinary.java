public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Ensure both strings have the same length by padding with zeros if necessary
        int length = Math.max(a.length(), b.length());
        a = String.format("%" + length + "s", a).replace(' ', '0');
        b = String.format("%" + length + "s", b).replace(' ', '0');

        // Iterate through the strings from right to left
        for (int i = length - 1; i >= 0; i--) {
            int bitSum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
            result.insert(0, bitSum % 2);
            carry = bitSum / 2;
        }

        // If there is a carry after processing all bits, add it to the result
        if (carry != 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String a1 = "11", b1 = "1";
        System.out.println(addBinary(a1, b1));  // Output: "100"

        String a2 = "1010", b2 = "1011";
        System.out.println(addBinary(a2, b2));  // Output: "10101"
    }
}
