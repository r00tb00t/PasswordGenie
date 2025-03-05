# Password Generator

## Overview
This is a simple **Password Generator** written in Java. It allows users to generate random passwords with customizable options such as length, uppercase/lowercase letters, numbers, and special symbols.

## Features
- Set a custom password length
- Choose to include/exclude uppercase letters, lowercase letters, numbers, and symbols
- Uses **SecureRandom** for strong password generation
- Ensures at least one character from each selected category (TODO: Feature to be added)
- Option to exclude ambiguous characters (TODO: Feature to be added)
- Ability to copy generated password to clipboard (TODO: Feature to be added)

## How to Run
### Using Command Line
1. **Compile the Java file**
   ```sh
   javac PasswordGenerator.java
   ```
2. **Run the program**
   ```sh
   java PasswordGenerator
   ```
3. Follow the prompts to generate a password based on your preferences.

### Using an IDE
1. Open the `PasswordGenerator.java` file in an IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).
2. Run the program and follow the on-screen prompts.

## Example Output
```
Enter password length: 12
Include uppercase letters? (true/false): true
Include lowercase letters? (true/false): true
Include numbers? (true/false): true
Include symbols? (true/false): false
Generated Password: Xyz12Abc34Kl
```

## Future Improvements
- [ ] Add constraints for minimum and maximum password length
- [ ] Ensure at least one character from each selected category is included
- [ ] Add an option to exclude ambiguous characters (O vs 0, l vs 1)
- [ ] Implement a feature to copy the generated password to clipboard