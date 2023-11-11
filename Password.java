import javax.swing.JOptionPane;
import java.util.Random;
public class Password{
    public static void main(String[] args){
        String firstName;
        String lastName;
        String email;
        String secondEmail;
        int lengthOfPassword;
        String total;
        String Password;
        String phoneNumber;
        String specialCharacters = "!@#$%^&*()";
        email = JOptionPane.showInputDialog(null, "Enter your email");
        firstName = JOptionPane.showInputDialog(null, "Enter your first name");
        lastName = JOptionPane.showInputDialog(null, "Enter your last name");
        phoneNumber = (JOptionPane.showInputDialog(null, "Enter your phone number"));

        lengthOfPassword = Integer.parseInt(JOptionPane.showInputDialog("Enter length of password to be generated"));
        Random password = new Random();
        StringBuilder result = new StringBuilder();
        total = firstName + lastName + email + phoneNumber + specialCharacters;
        for(int i = 0; i<lengthOfPassword; i++){
           result.append(total.charAt(password.nextInt(total.length())));
        }
        Password = result.toString();
        String input;
        JOptionPane.showMessageDialog(null, "Your password is " + result);
        secondEmail = JOptionPane.showInputDialog("Enter your email");
        input = JOptionPane.showInputDialog("Enter your password");
         if(Password.equals(input) && secondEmail.equals(email)){
             JOptionPane.showMessageDialog(null, "Welcome "  + firstName + lastName );
         }
         else{
             JOptionPane.showMessageDialog(null,"Login Unsuccessful");
         }

        


    }

}