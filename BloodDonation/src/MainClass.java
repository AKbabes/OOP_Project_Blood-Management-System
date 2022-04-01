import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void password(){
        Scanner sc=new Scanner(System.in);
        final String passcode="wrongpass";
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
        System.out.println("******Welcome to the Blood Management System*****");
        System.out.println("[------------------------------------------]");
        System.out.println("Enter your choice : ");
        System.out.println("1. Add Patient.");
        System.out.println("2. Add Doner.");
        System.out.println("3. See Patient List.");
        System.out.println("4. See Doner List.");
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
                System.out.println("How many patient you want to add ?");
                int n= sc.nextInt();
                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("Enter details about Patient "+i+1);
                    System.out.println("Enter Name : ");
                    String Tname=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter ID : ");
                    int Tid= sc.nextInt();
                    System.out.println("Enter Age : ");
                    int Tage=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Blood Group");
                    String Tbg= sc.nextLine();
                    System.out.println("Enter Address : ");
                    String Taddress=sc.nextLine();
                    System.out.println("Enter Patient Desies : ");
                    String Tdesies=sc.nextLine();
                    System.out.println("Enter Phone Number : ");
                    String Tphnumber=sc.nextLine();
                    sc.nextLine();
                    Patient rugirdol=new Patient(Tname,Tid,Tage,Tbg,Taddress,Tdesies,Tphnumber);
                    patiental.add(rugirdol);
                }
//                Patient obj=new Patient("Asif Akram",14640,21,"B+","Mohammadpur","Heart Problem","01303119376");
//                obj.DisplayPatient();
            }
            if(press1==2){
                System.out.println("How many Donor you want to add ?");
                int n= sc.nextInt();
                sc.nextLine();
                for(int i=0;i<n;i++){
                    System.out.println("Enter details about Donor "+(i+1));
                    System.out.println("Enter Name : ");
                    String Tname=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter ID : ");
                    int Tid= sc.nextInt();
                    System.out.println("Enter Age : ");
                    int Tage=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Blood Group :");
                    String Tbg= sc.nextLine();
                    System.out.println("Enter your last donation time :");
                    String Tlastdonation=sc.nextLine();
                    System.out.println("Enter Address : ");
                    String Taddress=sc.nextLine();
                    System.out.println("Medical Checkup (Yes/No) : ");
                    String Treport=sc.nextLine();
                    System.out.println("Enter Phone Number : ");
                    String Tphnumber=sc.nextLine();
                    sc.nextLine();
                    Donor roktodata=new Donor(Tname,Tid,Tage,Tbg,Tlastdonation,Taddress,Treport,Tphnumber);
                    donoral.add(roktodata);
                }
            }
            if(press1==3){
                for (Patient patient : patiental) {
                    System.out.println("Patient's List -> ");
                    patient.DisplayPatient();
                }
            }
            if(press1==4){
                for(Donor donor : donoral){
                    System.out.println("Donor's List -> ");
                    donor.DisplayDonor();
                }
            }
        }while(press1 != 0);

    }
}
