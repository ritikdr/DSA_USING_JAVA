// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ConsoleInputExample {
//     public static void main(String[] args) {
//         System.out.println("Enter some text: ");
        
//         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//             String input = br.readLine();
//             System.out.println("You entered: " + input);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }




import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    transient private String password;  

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class TransientExample {
    public static void main(String[] args) {
        User user = new User("ritik", "ritik@example.com", "securePassword123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            oos.writeObject(user);
            System.out.println("User object has been serialized to user.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("User object has been deserialized:");
            System.out.println(deserializedUser);  
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
