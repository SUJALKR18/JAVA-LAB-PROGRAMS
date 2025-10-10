import java.util.Scanner;

public class ExceptionDemo {
    static void handleArrayIndexOutOfBounds() {
        int[] arr = {10, 20, 30};
        try {
            System.out.println("Accessing array element at index 3");
            System.out.println("Value at index 3: " + arr[3]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Cannot access element outside array bounds");
        } 
        finally {
            System.out.println("Array elements are:");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
        }
    }

    static void handleIllegalArgument(int marks) {
        try {
            if(marks < 0 || marks > 100) {
                throw new IllegalArgumentException();
            }
            System.out.println("Valid marks: " + marks);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: Marks should be between 0 and 100");
        } 
        finally {
            System.out.println("Marks validation complete\n");
        }
    }

    static void handleIndexOutOfBounds() {
        String[] names = {"Ram", "Shyam"};
        try {
            System.out.println("Accessing name at index 2");
            System.out.println("Name at index 2: " + names[2]); 
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        } 
        finally {
            System.out.println("Available names:");
            for(String n : names) {
                System.out.print(n + " ");
            }
            System.out.println("\n");
        }
    }

    static void handleNegativeArraySize() {
        try {
            System.out.println("Creating array of size -3");
            System.out.println("Attempting to create the array...");
            int[] arr = new int[-3];
        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative");
        } 
        finally {
            System.out.println("Array size must be positive\n");
        }
    }

    static void handleNullPointer() {
        String str = null;
        try {
            System.out.println("Getting length of null string");
            System.out.println("String length: " + str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operations on null object");
        } 
        finally {
            System.out.println("String operation complete\n");
        }
    }

    static void handleIllegalAccess(String name) {
        try {
            if(name == null || name.isEmpty()) {
                throw new IllegalArgumentException();
            }
            System.out.println("Valid name: " + name);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: Name cannot be null or empty");
        } 
        finally {
            System.out.println("Name validation complete\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("Exception Handling Menu:");
            System.out.println("1. ArrayIndexOutOfBoundsException");
            System.out.println("2. IllegalArgumentException");
            System.out.println("3. IndexOutOfBoundsException");
            System.out.println("4. NegativeArraySizeException");
            System.out.println("5. NullPointerException");
            System.out.println("6. IllegalAccess Check");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    handleArrayIndexOutOfBounds();
                    break;
                case 2:
                    System.out.print("Enter marks (0-100): ");
                    int marks = sc.nextInt();
                    handleIllegalArgument(marks);
                    break;
                case 3:
                    handleIndexOutOfBounds();
                    break;
                case 4:
                    handleNegativeArraySize();
                    break;
                case 5:
                    handleNullPointer();
                    break;
                case 6:
                    System.out.print("Enter name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    handleIllegalAccess(name);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        } 
    }
}