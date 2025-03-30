public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {

        boolean firstValid = first > 9 && first < 100;    // Check if the first number is two digits
        boolean secondValid = second > 9 && second < 100; // Check if the second number is two digits

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;    // Get the first digit of the first number
        int firstRightDigit = first % 10;   // Get the last digit of the first number
        int secondLeftDigit = second / 10;  // Get the first digit of the second number
        int secondRightDigit = second % 10; // Get the last digit of the second number

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("Has shared digit (12, 23): " + hasSharedDigit(12, 23));   // true (shared: 2)
        System.out.println("Has shared digit (9, 99): " + hasSharedDigit(9, 99));     // false (invalid)
        System.out.println("Has shared digit (15, 55): " + hasSharedDigit(15, 55));   // true (shared: 5)
        System.out.println("Has shared digit (12, 44): " + hasSharedDigit(12, 44));   // false (no shared digit)
        System.out.println("Has shared digit (56, 65): " + hasSharedDigit(56, 65));   // true (shared: 5, 6)
        System.out.println("Has shared digit (45, 54): " + hasSharedDigit(45, 54));   // true (shared: 4, 5)
        System.out.println("Has shared digit (81, 18): " + hasSharedDigit(81, 18));   // true (shared: 1, 8)
        System.out.println("Has shared digit (99, 11): " + hasSharedDigit(99, 11));   // false (no shared digit)
    }
}
