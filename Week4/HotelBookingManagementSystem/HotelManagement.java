package week4.HotelBookingManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagement {

    static ArrayList<Booking> bookings=new ArrayList<>();

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int choice;

        do{

            System.out.println("\n1.Add Booking");
            System.out.println("2.Cancel Booking");
            System.out.println("3.Display Booking");
            System.out.println("4.Total Cost");
            System.out.println("5.Exit");

            System.out.print("Enter Choice: ");
            choice=sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print("Room Number:");
                    int room=sc.nextInt();

                    sc.nextLine();

                    System.out.print("Customer:");
                    String name=sc.nextLine();

                    System.out.print("Days:");
                    int days=sc.nextInt();

                    double cost=days*1000;
                    bookings.add(new Booking(room,name,days,cost));
                    System.out.println("Booking Added");
                    break;

                case 2:

                    System.out.print("Room Number:");
                    int r=sc.nextInt();
                    for(int i=0;i<bookings.size();i++){
                        if(bookings.get(i).roomNo==r){
                            bookings.remove(i);
                            System.out.println("Booking Cancelled");
                            break;
                        }else{
                            System.out.println("please give correct Room Number.");
                        }
                    }
                    break;

                case 3:
                    for(Booking b:bookings){
                        b.display();
                    }
                    break;

                case 4:
                    double total=0;
                    for(Booking b:bookings){
                        total+=b.cost;
                    }
                    System.out.println("Total Cost = "+total);
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

            }

        }while(choice!=5);
        
      sc.close();
    }
}