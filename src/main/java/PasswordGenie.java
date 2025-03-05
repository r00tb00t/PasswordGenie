import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenie {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        // check to ensure the password length is within a valid range

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUpper = scanner.nextBoolean();
        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLower = scanner.nextBoolean();
        System.out.print("Include numbers? (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();
        System.out.print("Include symbols? (true/false): ");
        boolean includeSymbols = scanner.nextBoolean();

        String password = generatePassword(length, includeUpper, includeLower, includeNumbers, includeSymbols);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean symbols) {
        String characterPool = "";
        if (upper) characterPool += UPPERCASE;
        if (lower) characterPool += LOWERCASE;
        if (numbers) characterPool += NUMBERS;
        if (symbols) characterPool += SYMBOLS;

        if (characterPool.isEmpty()) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
