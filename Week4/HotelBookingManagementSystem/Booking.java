package week4.HotelBookingManagementSystem;

public class Booking {
    int roomNo;
    String customer;
    int days;
    double cost;

    public Booking(int roomNo,String customer,int days,double cost){
        this.roomNo=roomNo;
        this.customer=customer;
        this.days=days;
        this.cost=cost;
    }

    void display(){
        System.out.println("RoomNo: "+roomNo+" ,Customer: "+customer+" ,Days: "+days+" ,Cost: "+cost);
    }
}
