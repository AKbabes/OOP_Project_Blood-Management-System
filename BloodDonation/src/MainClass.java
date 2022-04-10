import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainClass {

    public static void password(){
        Scanner sc=new Scanner(System.in);
        final String passcode="ss";

        System.out.println("******YOU HAVE TO ENTERED PASSWORD******");
        System.out.println("# Password is given by the Authority.\n\n");
        System.out.print("ENTER PASSWORD : ");
        String pass=sc.nextLine();

        if(pass.equals(passcode)){
            System.out.println("*** PASSWORD MATCHED !!!");
        }
        else{
            System.out.println("Password Not Matched");
            System.out.println("*** ILLEGAL ENTRY ***");
            System.out.println("TRY AGAIN");
            password();
        }
    }

    public static void Menue(){
        System.out.println("******Welcome to the Blood Management System******");
        System.out.println("\n[------------------------------------------]");
        System.out.println("Enter your choice : ");
        System.out.println("1. Add Patient.");
        System.out.println("2. Add Doner.");
        System.out.println("3. See Patient List.");
        System.out.println("4. See Doner List.");
        System.out.println("5. Search Patient.");
        System.out.println("6. Search Donor.");
        System.out.println("0. EXIT.");
        System.out.println("[------------------------------------------]");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Patient> patiental=new ArrayList<>();
        ArrayList <Donor> donoral=new ArrayList<>();
        int press1,press2;
        password();

        do{
            Menue();

            System.out.println("Enter your choice : ");
            press1=sc.nextInt();

            if(press1 == 1){
                System.out.print("How many patient you want to add ? => ");
                int n= sc.nextInt();

                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("\nEnter details about Patient "+(i+1));
                    System.out.print("\nEnter Name : ");
                    String Tname=sc.nextLine();
                    System.out.print("\nEnter ID : ");
                    //sc.nextLine();
                    int Tid= sc.nextInt();
                    System.out.print("\nEnter Age : ");
                    int Tage=sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nEnter Blood Group : ");
                    String Tbg= sc.nextLine();
                    System.out.print("\nEnter Address : ");
                    String Taddress=sc.nextLine();
                    System.out.print("\nEnter Patient Desies : ");
                    String Tdesies=sc.nextLine();
                    System.out.print("\nEnter Phone Number : ");
                    String Tphnumber=sc.nextLine();
                    //sc.nextLine();
                    System.out.println("++++++++++++++++++++++++++");
                    Patient rugirdol=new Patient(Tname,Tid,Tage,Tbg,Taddress,Tdesies,Tphnumber);
                    patiental.add(rugirdol);
                }
//                Patient obj=new Patient("Asif Akram",14640,21,"B+","Mohammadpur","Heart Problem","01303119376");
//                obj.DisplayPatient();
            }

            if(press1==2){
                System.out.print("How many Donor you want to add ?");
                int n= sc.nextInt();

                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("\nEnter details about Donor "+(i+1));
                    System.out.print("\nEnter Name : ");
                    String Tname=sc.nextLine();
                    //sc.nextLine();
                    System.out.print("\nEnter ID : ");
                    int Tid= sc.nextInt();
                    System.out.print("\nEnter Age : ");
                    int Tage=sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nEnter Blood Group :");
                    String Tbg= sc.nextLine();
                    System.out.print("\nEnter your last donation time :");
                    String Tlastdonation=sc.nextLine();
                    System.out.print("\nEnter Address : ");
                    String Taddress=sc.nextLine();
                    System.out.print("\nMedical Checkup (Yes/No) : ");
                    String Treport=sc.nextLine();
                    System.out.print("\nEnter Phone Number : ");
                    String Tphnumber=sc.nextLine();
                    System.out.println("++++++++++++++++++++++++++");
                    //sc.nextLine();
                    Donor roktodata=new Donor(Tname,Tid,Tage,Tbg,Tlastdonation,Taddress,Treport,Tphnumber);
                    donoral.add(roktodata);
                }
            }

            if(press1==3){
                System.out.println("Patient's List -> ");
                for (Patient patient : patiental) {
                    patient.DisplayPatient();
                }
            }

            if(press1==4){
                System.out.println("Donor's List -> ");
                for(Donor donor : donoral){
                    donor.DisplayDonor();
                }
            }
            if(press1==5){
                System.out.println("1. Search with Blood Group.");
                System.out.println("2. Search with Address.");
                press2=sc.nextInt();
                sc.nextLine();
                if(press2==1) {
                    System.out.println("Which Blood Group you want to search ");
                    //sc.nextLine();
                    String searchbg = sc.nextLine();
                    System.out.println("Patients with "+searchbg+" Blood Group ");
                    System.out.println("................................");
                    System.out.println("");
                    for (Patient p : patiental) {
                        if (Objects.equals(p.getBloodgrp(), searchbg)) {
                            p.DisplayPatient();
                        }
                    }
                }
                if(press2==2){
                    System.out.println("Which Address you want to search ");
                    String searchaddress=sc.nextLine();
                    System.out.println("Patient's by the Address of "+searchaddress);
                    System.out.println(".................................");
                    for(Patient p : patiental){
                        if(Objects.equals(p.getAddress(), searchaddress)){
                            p.DisplayPatient();
                        }
                    }
                }
            }
        }


        while(press1 != 0);

    }
}
