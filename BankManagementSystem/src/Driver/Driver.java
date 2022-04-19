package Driver;

import BankAccount.Bank;
import BankAccount.Client;
import BankAccount.ClientAccount;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Driver {

    public static void banks()
    {
        String name,country,codes=null;
        //Longest bank name ever Founded is Brotherhood of Locomotive Engineers Co-op National Bank - 55 letters
        //Shortest bank name is N26
        do {
            name = JOptionPane.showInputDialog(null,"Register New Bank Name: ");
        }while(name.length()<2 || name.length()>54);
        //longest country name is The United Kingdom of Great Britain and Northern Ireland
        //shortest country name are Chad,Cuba,Fiji,Iran, etc
        do {
            country = JOptionPane.showInputDialog(null,"Register New Bank Country: ");
        }while(country.length()<4 || country.length()>56);
        //Assuming most of bank codes sits on 4 digits of String
        do {
            codes = JOptionPane.showInputDialog(null,"Please Input The Bank Code[Must be Exactly 4 Digits!]: ");

        }while (codes.length()<3 || codes.length()>4);

        //Creating new bank vector to store data
        Vector<Bank> vbank = new Vector<Bank>();
        //Creating new copy of Bank object for security reason
        //String BName, String country, String BCode
        Bank bank = new Bank(name,country,codes);
        //Inserting fresh inputted data
        vbank.add(bank);
        //End Output for user
        JOptionPane.showMessageDialog(null,"Bank Registration Success!");
        //Recursive
        menu();
    }

    public static boolean validateJavaDate(String strDate)
    {
        /* Check if date is 'null' */
        if (strDate.trim().equals(""))
        {
            return true;
        }
        /* Date is not 'null' */
        else
        {
            /*
             * Set preferred date format,
             * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
            sdfrmt.setLenient(false);
            /* Create Date object
             * parse the string into date
             */
            try
            {
                Date javaDate = sdfrmt.parse(strDate);
            }
            /* Date format is invalid */
            catch (ParseException e)
            {
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    public static void clients()
    {
        String name,address,nationality,gender,occupation,email,dob=null,birth=null;

        //Assuming longest name would be less than 40 and more than 2 characters at most.
        do {
            name = JOptionPane.showInputDialog(null,"Please Input Your Name: ");
        }while(name.length()<2 || name.length()>40);
        //Assuming shortest address name would be more than 4 and less than 56 characters.
        do {
            address = JOptionPane.showInputDialog(null,"Please Input Your Address: ");
        }while(address.length()<4 || address.length()>56);
        //longest country name is The United Kingdom of Great Britain and Northern Ireland
        //shortest country name are Chad,Cuba,Fiji,Iran, etc
        do {
            nationality = JOptionPane.showInputDialog(null,"Please Input Your Nationality: ");
        }while(nationality.length()<4 || nationality.length()>56);
        //Gender
        do {
            gender = JOptionPane.showInputDialog(null,"Please Input Your Address[Male / Female]: ");
        }while(gender.equalsIgnoreCase("Male")==false && gender.equalsIgnoreCase("Female")==false);
        //Occupation characters limited to save up memory
        do {
            occupation = JOptionPane.showInputDialog(null,"Please Input Your Occupation: ");

        }while (occupation.length()<3 || occupation.length()>20);
        //email characters limited to save up memory & based on common senses
        do {
            email = JOptionPane.showInputDialog(null,"Please Input Your Email Address[Must Contain @ and .com]: ");

        }while (email.length()<3 || email.length()>30 && email.toLowerCase().contains("@")==false && email.toLowerCase().contains(".com")==false);
        //dob characters limited to save up memory & based on common senses3
        do {
            dob = JOptionPane.showInputDialog(null,"Please Input Your Birthplace: ");

        }while (dob.length()<3 || dob.length()>20);
        //dob characters limited to save up memory & based on common senses
        do {
            birth = JOptionPane.showInputDialog(null,"Please Input Your Day Of Birth["+'"'+"dd/MM/yyyy"+'"'+"]: ");
        }while (birth.length()<3 || birth.length()>20 ||  validateJavaDate(birth)==true); // Calling new data validator function

        try
        {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
            //Creating new bank vector to store data
            Vector<Client> vclient = new Vector<Client>();
            //Creating new copy of Bank object for security reason
            //String CName, String CAddress, String CNationality, String CGender, String COccupation, String CEmailAddress, Date CBirthday, String CDOB
            Client client = new Client(name,address,nationality,gender,occupation,email,date1,dob);
            //Inserting fresh inputted data
            vclient.add(client);
        }
        catch (ParseException e)
        {

        }


        //End Output for user
        JOptionPane.showMessageDialog(null,"New User Registration Success!");
        //Recursive
        menu();
    }
    public static int menu()
    {
        Object[] options = {"Register new Bank Account","Register New Bank","View Bank List","View Bank Account","Check Account Balance","Exit"};
        int i= JOptionPane.showOptionDialog(null,"Press The Button According to Your Decisions","Bank Management System",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
        if(i==0)
        {
            banks();
        }
        if(i==1)
        {
            clients();
        }
    return 0;
    }

    public static void main(String[] args) {

    menu();


}
}
