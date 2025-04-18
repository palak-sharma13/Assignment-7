# Assignment-7
A Java-based Calculator Program that performs standard arithmetic operations, Fibonacci sequence calculation, and array-based operations such as sum, mean, variance, and standard deviation.

It follows a structured approach with three separate files: Main.java: Manages program execution and user interaction. UserInput.java: Handles user input via the console. Calculator.java: Implements calculation logic.

Features: ✅ Addition, Subtraction, Multiplication, Division ✅ Fibonacci Sequence Calculation ✅ Array Operations: Sum, Mean, Variance, Standard Deviation ✅ User Input Handling with Menu Selection (if-else or switch-case) ✅ Well-structured Code with Proper Comments

Project Structure: Java-Calculator/ │── Main.java # Entry point, handles execution
│── UserInput.java # Manages user input and menu selection
│── Calculator.java # Implements mathematical operations
│── README.md # Project documentation

Class Descriptions 1. Main.java Contains the main method to run the program. Calls methods from UserInput to gather user input. Uses a switch-case to navigate through available operations.

2. UserInput.java Manages all user inputs, including numbers, arrays, and menu choices. Uses a Scanner instance to take user input. Provides methods like userInput(), getNumber(), getArray(), getMenuChoice(), and getArrayMenuChoice().

3. Calculator.java Implements the core logic for various calculations: Arithmetic Operations: Addition, Subtraction, Multiplication, Division. Fibonacci Sequence: Generates Fibonacci numbers up to a given limit. Array Operations: Computes Sum, Mean, Variance, and Standard Deviation. Uses a single instance of UserInput to avoid redundant Scanner objects.
