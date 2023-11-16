package emailapp;
import java.util.Scanner;

public class Email {
    String firstName;
        String lastName;
        String passWord;
        String department; 
        private int mailboxCapacity = 500;
        private int defaultPassLength = 10;
        private String email;
        private String altEmail;
        private String companySuff = "microsoft.com";

        //Constructor
        public Email(String firstN, String lastN){
            //Class level variable (this.) will equal the constructor argument variable
            this.firstName = firstN;
            this.lastName = lastN;

            //Call a method asking for department, return department
            this.department = setDepartment();

            //Call a method that returns random password
            this.passWord = randPassword(defaultPassLength);
            System.out.println("Your password is: " + passWord);

            //Combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuff; 
            System.out.println(email);
        }

        //Ask for department
        private String setDepartment(){
            //Open scanner
            Scanner input = new Scanner (System.in);
            int deptChoice; 

            System.out.println("Please enter the department: \n \t 1 for Sales" + 
            "\n \t 2 for Development \n \t 3 for Accounting \n \t 0 for None ");
            deptChoice = input.nextInt();
            
            if (deptChoice == 1){
                input.close();
                return "sales";
            }
            else if (deptChoice == 2){
                input.close();
                return "devlopment";
            }
            else if (deptChoice == 3){
                input.close();
                return "accounting"; 
            }
            else{
                input.close();
                return "";
            }

        }

        private String randPassword(int length){
            String setPW = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
            char[] passArray = new char[length];

            for (int i = 0; i < length; i++){
                //Generate 0 or 1, multipled by the num of characters in setPW, turn into int and store in rand
                int rand = (int) (Math.random() * setPW.length());
                passArray[i] = setPW.charAt(rand);
            }
            return new String(passArray);
        }

        //Set mailbox capacity (setter)
        public void setMBC(int capacity){
            this.mailboxCapacity = capacity;
        }

        //Set alternate email (setter)
        public void setAE(String alternateEmail){
            this.altEmail = alternateEmail;
        }

        //Change password
        public void changePass(String password){
            this.passWord = password; 
        }

        //Getter for capacity
        public int getMBC(){
            return mailboxCapacity;
        }

        //Getter for alternate email
        public String getAE(){
            return altEmail;
        }

        //Getter for password
        public String getPW(){
            return passWord;
        }

        public String showInfo(){
            return "\t DISPLAY NAME: " + firstName + " " + lastName + "\n" +
            "\t YOUR PASSWORD: " + passWord + "\n \t COMPANY EMAIL " + email + "\n \t MAILBOX CAPACITY " + mailboxCapacity; 
        }

}
