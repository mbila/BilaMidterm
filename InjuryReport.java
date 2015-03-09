
/**
 * Write a description of class InjuryReport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Random;

public class InjuryReport {
    // instance variables - replace the example below with your own
    private ArrayList<Integer> severityArray;
    private PatientInfo PatientInfo;
    private String lastName, firstName, injuryLocation, typeOfInjury, address;
    private int idNum, injurySeverity, age;

    /**
     * Constructor for objects of class InjuryReport
     */
    public InjuryReport() {
        severityArray = new ArrayList<Integer>();
    }
    
    public void generateGenericReport() {
        // Report 4a
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Id Number: " + idNum);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Type of Injury: " + typeOfInjury);
        System.out.println("Location of Injury: " + injuryLocation);
        System.out.println("Severity of Injury: " + injurySeverity);
    }
    
    public void generateExtremeSeverityReport() {
        // Report 4b
        if (injurySeverity > 8) {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Type of Injury: " + typeOfInjury);
        System.out.println("Location of Injury: " + injuryLocation);
        System.out.println("Severity of Injury: " + injurySeverity);
        }
    }
    
    public void generateSeverityReport() {
        // Report 3b
        int total = 0;
        for ( int severity : severityArray) {
            total += severity;
        }
        
        int averageSeverity = total/severityArray.size();
        System.out.println("Average Severity is: " + averageSeverity);
    }
    
    public void makePatient() {
        PatientInfo = new PatientInfo(lastName, firstName, injuryLocation, typeOfInjury, address, idNum, injurySeverity, age);
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
        
        severityArray.add(injurySeverity);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
