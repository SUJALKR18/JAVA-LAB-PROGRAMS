import java.util.*; 
public class LoginSystem { 
    public static void main(String[] args) { 
        HashMap<String, String> loginDB = new HashMap<>(); 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter number of users to add initially: "); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
 
        for (int i = 0; i < n; i++) { 
            System.out.print("Enter username: "); 
            String user = sc.nextLine(); 
            System.out.print("Enter password: "); 
            String pass = sc.nextLine(); 
            loginDB.put(user, pass); 
        } 
        while (true) { 
            System.out.println("\n1. Add User\n2. Login\n3. View All Users\n4. Exit"); 
            System.out.print("Enter choice: "); 
            int choice = sc.nextInt(); 
            sc.nextLine(); 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter new username: "); 
                    String newUser = sc.nextLine(); 
                    if (loginDB.containsKey(newUser)) { 
                        System.out.println("Username already exists!"); 
                    } else { 
                        System.out.print("Enter password: "); 
                        String newPass = sc.nextLine(); 
                        loginDB.put(newUser, newPass); 
                        System.out.println("User added successfully!"); 
                    } 
                    break; 
 
                case 2: 
                    System.out.print("Enter username: "); 
                    String username = sc.nextLine(); 
                    System.out.print("Enter password: "); 
                    String password = sc.nextLine(); 
 
                    if (loginDB.containsKey(username)) { 
                        if (loginDB.get(username).equals(password)) { 
                            System.out.println("Login Successful! Welcome, " + username + "!"); 
                        } else { 
                            System.out.println("Incorrect password!"); 
                        } 
                    } else { 
                        System.out.println("Username not found!"); 
                    } 
                    break; 
 
                case 3: 
                    System.out.println("\nCurrent Users:"); 
                    for (String user : loginDB.keySet()) 
                        System.out.println("- " + user); 
                    break; 
 
                case 4: 
                    System.out.println("Exiting..."); 
                    sc.close(); 
                    return; 
 
                default: 
                    System.out.println("Invalid choice!"); 
            } 
        } 
    } 
}