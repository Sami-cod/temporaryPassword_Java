/*
* This class main method, it uses the Insurance class to run
* This class uses Insurance class to input customer detail
* Use the clock code method to compute and get the result
* @author 20152761
* @version 2.00 Date 06/12/2020
*/
import javax.swing.JOptionPane;
public class TemporaryPasswordApp{
        public static void main(String[] args){
            //declare variables
            String fullName;
            String password;
            int fullNameLength;
            //objects
            TemporaryPassword tp;
            tp= new TemporaryPassword();
            //input
            fullName=JOptionPane.showInputDialog(null,"Enter your full name: ");
            //setter
            tp.setFullName(fullName);
            //compute
            tp.NewPassword();
            //getter
            fullNameLength=tp.getFullNameLength();
            password=tp.getPassword();
            //output - prints the result
            JOptionPane.showMessageDialog(null,"Your full Name is: "+ fullName + "\n" + "Do you want your Password created?");
            JOptionPane.showMessageDialog(null, "Your new Password id: " + password);
        }
    }