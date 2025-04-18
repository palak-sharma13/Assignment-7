class Calculator {

    UserInput ui = new UserInput(); //scanner initialization to one instance

    // Addition
    int add() {
        //UserInput ui = new UserInput();
        int[] numbers = ui.userInput();
        int sum = numbers[0] + numbers[1];
        System.out.println("The sum is: " + sum);
        return sum;
    }

    // Subtraction
    int subtract() {
        // UserInput ui = new UserInput();
        int[] numbers = ui.userInput();
        int result = numbers[0] - numbers[1];
        System.out.println("The difference is: " + result);
        return result;
    }

    // Multiplication
    int multiply() {
        //UserInput ui = new UserInput();
        int[] numbers = ui.userInput();
        int result = numbers[0] * numbers[1];
        System.out.println("The product is: " + result);
        return result;
    }

    // Division
    double divide() {
        //UserInput ui = new UserInput();
        int[] numbers = ui.userInput();
        if (numbers[1] == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        double result = (double) numbers[0] / numbers[1];
        System.out.println("The quotient is: " + result);
        return result;
    }

    // Fibonacci Sequence
    void fibonacci() {
        //UserInput ui = new UserInput();
        int n = ui.getNumber();
        if (n < 1) {
            System.out.println("Invalid input! Enter a number greater than 0.");
            return;
        }

        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first );
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Sum of Array
    int sumArray(int arr[]) {
        //UserInput ui = new UserInput();
        //int[] arr = ui.getArray();
        int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    // Mean of Array
    double meanArray(int arr[]) {
        int sum = sumArray(arr);
        //UserInput ui = new UserInput();
        //int[] arr = ui.getArray();
        double mean = (double) sum / arr.length;
        System.out.println("Mean of array: " + mean);
        return mean;
    }

    // Variance of Array
    double varianceArray(int arr[]) {
        double mean = meanArray(arr);
        //UserInput ui = new UserInput();
        //int[] arr = ui.getArray();
        double sumSquaredDiffs = 0;
        for (int num : arr) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        double variance = sumSquaredDiffs / arr.length;
        System.out.println("Variance of array: " + variance);
        return variance;
    }

    // Standard Deviation of Array
    double stdDevArray(int arr[]) {
        double variance = varianceArray(arr);
        double stdDev = Math.sqrt(variance);
        System.out.println("Standard deviation of array: " + stdDev);
        return stdDev;
    }

    // Handling array operations menu
    void handleArrayOperations() {
        int[] arr = ui.getArray();
        int choice;
        do {
            choice = ui.getArrayMenuChoice();
            switch (choice) {
                case 1 : sumArray(arr);
                break;

                case 2 : meanArray(arr);
                break;

                case 3 : varianceArray(arr);
                break;

                case 4 : stdDevArray(arr);
                break;

                case 0 : System.out.println("Returning to main menu...");
                break;

                default : System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}


