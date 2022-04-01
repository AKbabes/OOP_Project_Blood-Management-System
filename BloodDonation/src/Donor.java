public class Donor {
    private String Name;
    private int Id;
    private int Age;
    private String Bloodgrp;
    private String Lastdonate;
    private String Report;
    private String Address;
    private String PhNumber;

    public Donor(String name, int id, int age, String bloodgrp, String lastdonate, String report, String address, String phNumber) {
        Name = name;
        Id = id;
        Age = age;
        Bloodgrp = bloodgrp;
        Lastdonate = lastdonate;
        Report = report;
        Address = address;
        PhNumber = phNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setBloodgrp(String bloodgrp) {
        Bloodgrp = bloodgrp;
    }

    public String getBloodgrp() {
        return Bloodgrp;
    }

    public void setLastdonate(String lastdonate) {
        Lastdonate = lastdonate;
    }

    public String getLastdonate() {
        return Lastdonate;
    }

    public void setReport(String report) {
        Report = report;
    }

    public String getReport() {
        return Report;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setPhNumber(String phNumber) {
        PhNumber = phNumber;
    }

    public String getPhNumber() {
        return PhNumber;
    }
    public void DisplayDonor(){
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("Age : "+getAge());
        System.out.println("Blood Group : "+getBloodgrp());
        System.out.println("Last Donation : "+getLastdonate());
        System.out.println("Address : "+getAddress());
        System.out.println("Medical Checkup : "+getReport());
        System.out.println("Phone Number : "+getPhNumber());
    }
}
