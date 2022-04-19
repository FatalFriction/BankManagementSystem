package BankAccount;

import java.util.Date;

public class Client {
    private String CName;
    private String CAddress;
    private String CNationality;
    private String CGender;
    private String COccupation;
    private String CEmailAddress;
    private Date CBirthday;
    private String CDOB;

    public Client(String CName, String CAddress, String CNationality, String CGender, String COccupation, String CEmailAddress, Date CBirthday, String CDOB) {
        this.CName = CName;
        this.CAddress = CAddress;
        this.CNationality = CNationality;
        this.CGender = CGender;
        this.COccupation = COccupation;
        this.CEmailAddress = CEmailAddress;
        this.CBirthday = CBirthday;
        this.CDOB = CDOB;
    }

    public Client(Client client) {
        this.CName =client.CName;
        this.CAddress = client.CAddress;
        this.CNationality = client.CNationality;
        this.CGender = client.CGender;
        this.COccupation = client.COccupation;
        this.CEmailAddress = client.CEmailAddress;
        this.CBirthday = client.CBirthday;
        this.CDOB = client.CDOB;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCAddress() {
        return CAddress;
    }

    public void setCAddress(String CAddress) {
        this.CAddress = CAddress;
    }

    public String getCNationality() {
        return CNationality;
    }

    public void setCNationality(String CNationality) {
        this.CNationality = CNationality;
    }

    public String getCGender() {
        return CGender;
    }

    public void setCGender(String CGender) {
        this.CGender = CGender;
    }

    public String getCOccupation() {
        return COccupation;
    }

    public void setCOccupation(String COccupation) {
        this.COccupation = COccupation;
    }

    public String getCEmailAddress() {
        return CEmailAddress;
    }

    public void setCEmailAddress(String CEmailAddress) {
        this.CEmailAddress = CEmailAddress;
    }

    public Date getCBirthday() {
        return CBirthday;
    }

    public void setCBirthday(Date CBirthday) {
        this.CBirthday = CBirthday;
    }

    public String getCDOB() {
        return CDOB;
    }

    public void setCDOB(String CDOB) {
        this.CDOB = CDOB;
    }

    @Override
    public String toString() {
        return "Client Information: \n" +
                "Client Name: " + CName + '\n' +
                "Client Address: " + CAddress + '\n' +
                "Client Nationality: " + CNationality + '\n' +
                "Client Gender: " + CGender + '\n' +
                "Client Occupation: " + COccupation + '\n' +
                "Client EmailAddress: " + CEmailAddress + '\n' +
                "Client Date Of Birth: " + CBirthday +
                ", " + CDOB + '\n';
    }
}
