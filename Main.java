class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        UserInput ui = new UserInput();

        int choice;
        do {
            choice = ui.getMenuChoice(); // Get user choice

            switch (choice) {
                case 1 : cal.add();
                break;

                case 2 : cal.subtract();
                break;

                case 3 : cal.multiply();
                break;

                case 4 : cal.divide();
                break;

                case 5 : cal.fibonacci();
                break;

                case 6 : {
                    System.out.println("Array Operations:");
                    cal.handleArrayOperations();
                    break;
                }
                case 0 :
                    System.out.println("Exiting Calculator...");
                    break;

                default : System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
