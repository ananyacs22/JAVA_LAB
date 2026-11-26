interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}
class VehicleParking implements ParkingCharge {
     String vehicleNumber;
     String vehicleType;
     int parkingHours;
    public VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
    public double calculateCharge() {
        return 0.0;
    }
    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Parking Hours  : " + parkingHours + " hrs");
        System.out.println("Total Charge   : Rs. " + calculateCharge()); 
    }
}
class TwoWheeler extends VehicleParking {
    
    public TwoWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }
    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2 * 20) + ((parkingHours - 2) * 10);
        }
    }
}
class FourWheeler extends VehicleParking {

    public FourWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }
    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2 * 50) + ((parkingHours - 2) * 30);
        }
    }
}
public class Vehicle {
    public static void main(String[] args) {
        ParkingCharge parkingRef;
        parkingRef = new TwoWheeler("KA-01-HE-1234", 8);
        parkingRef.displayParkingDetails();
        parkingRef = new FourWheeler("DL-03-CC-5678", 15);
        parkingRef.displayParkingDetails();
        System.out.println("ANANYA");
        System.out.println("1WA25CS033");
    }
}
