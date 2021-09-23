/*
* This is my instantiable class
* Blue print where an object is created from
* It is an object implementation of a main class
* It is dry methodology, can't repeat themselfs, their objects are reusable
* This class has no main method; it can be used by the main class
* The setter and getter will allow the program to make accessible only through its public methods and keep the values themselves private.
* This class contain the method for NewPassword
* The constructor is used to create an object
* for loop is used to go through each character of the inpute length
* Different String methods arre used to generate the new password
* @author 20152761
* @version 2.00 Date 06/12/2020
 */
import javax.swing.JOptionPane;;
public class  TemporaryPassword{
    //declare variables
    private String fullName;
    private String password;
    private StringBuffer strBuffer;
    private int fullNameLength;

    //constructor
    public TemporaryPassword(){
        strBuffer=new StringBuffer();
        }
        //setter
    public void setFullName(String fullName){
            this.fullName=fullName;
    }
    //compute
    public void NewPassword(){
        fullNameLength=fullName.length();
        strBuffer.append((fullName).replace(' ', '&'));
        for(int i=0; i<fullName.length()-1;i++){
            if(Character.isLowerCase(fullName.charAt(i))){
                if(fullName.charAt(i)=='a' || fullName.charAt(i)=='e'
                || fullName.charAt(i)=='i' || fullName.charAt(i)=='o'
                || fullName.charAt(i)=='u'){
                    //StringBuffer.setCharAt(i, Character.toUpperCase(fullName.charAt(i)));
                    //strBuffer.(fullName.toUpperCase());
                }
             }
        }
            strBuffer.append(fullName.length());
            strBuffer.append(fullName.charAt(1));
            strBuffer.append('%');
            password=strBuffer.toString();

    }
    public String getPassword(){
        return password;
    }
    public int getFullNameLength(){
        return fullNameLength;
    }
}//end class
