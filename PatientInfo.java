
/**
 * Write a description of class PatientInfo here.
 * 
 * @author Michael Bila
 * @version 2015.8.3
 */

import java.util.Random;
import java.util.ArrayList;

public class PatientInfo
{
    // instance variables - replace the example below with your own
    private ArrayList<String> patientArray;
    private String lastName, firstName, injuryLocation, typeOfInjury, address;
    private int idNum, injurySeverity, age;

    /**
     * Constructor for objects of class PatientInfo
     */
    public PatientInfo(String lastName, String firstName, String injuryLocation, String typeOfInjury, String address, int idNum, int injurySeverity, int age)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.injuryLocation = injuryLocation;
        this.address = address;
        this.idNum = idNum;
        this.injurySeverity = injurySeverity;
        this.age = age;
        
        patientArray = new ArrayList<String>();
    }
    
    public void fillPatientArray() {
        patientArray.add(lastName);
        patientArray.add(firstName);
        patientArray.add(injuryLocation);
        patientArray.add(address);
        patientArray.add("" + idNum);
        patientArray.add("" + injurySeverity);
        patientArray.add("" + age);
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public void setInjuryLocation(String injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

    public String getTypeOfInjury() {
        return typeOfInjury;
    }

    public void setTypeOfInjury(String typeOfInjury) {
        this.typeOfInjury = typeOfInjury;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum() {
        idNum = (int) Math.round(Math.random() * 10000);
    }

    public int getInjurySeverity() {
        return injurySeverity;
    }

    public void setInjurySeverity(int injurySeverity) {
        if (injurySeverity > 10) {
            System.out.println("Number too high, try again.");
        } else {
            this.injurySeverity = injurySeverity;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
