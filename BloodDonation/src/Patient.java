public class Patient {
    private String Name;
    private int Id;
    private int Age;
    private String Bloodgrp;
    private String Address;
    private String Desies;
    private String Phnumber;

    public Patient(String name, int id, int age, String bloodgrp, String address, String desies, String phnumber) {
        Name = name;
        Id = id;
        Age = age;
        Bloodgrp = bloodgrp;
        Address = address;
        Desies = desies;
        Phnumber = phnumber;
    }
    //just for test


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

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setDesies(String desies) {
        Desies = desies;
    }

    public String getDesies() {
        return Desies;
    }

    public void setPhnumber(String phnumber) {
        Phnumber = phnumber;
    }

    public String getPhnumber() {
        return Phnumber;
    }

    public void DisplayPatient(){
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("Age : "+getAge());
        System.out.println("Blood Group : "+getBloodgrp());
        System.out.println("Address : "+getAddress());
        System.out.println("Patient Desies : "+getDesies());
        System.out.println("Phone Number : "+getPhnumber());
    }
}
