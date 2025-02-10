import java.util.*;

// Abstract class Vehicle3
abstract class Vehicle3 {
    private String Vehicle3Id;
    private String driverName;
    private double ratePerKm;

    public Vehicle3(String Vehicle3Id, String driverName, double ratePerKm) {
        this.Vehicle3Id = Vehicle3Id;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicle3Id() {
        return Vehicle3Id;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicle3Details() {
        return "Vehicle3 ID: " + Vehicle3Id + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

// Interface for GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car3 subclass
class Car3 extends Vehicle3 implements GPS {
    private String location;

    public Car3(String Vehicle3Id, String driverName, double ratePerKm) {
        super(Vehicle3Id, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Bike3 subclass
class Bike3 extends Vehicle3 implements GPS {
    private String location;

    public Bike3(String Vehicle3Id, String driverName, double ratePerKm) {
        super(Vehicle3Id, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // 10% discount for Bike3s
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Auto subclass
class Auto extends Vehicle3 implements GPS {
    private String location;

    public Auto(String Vehicle3Id, String driverName, double ratePerKm) {
        super(Vehicle3Id, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; // 10% surcharge for autos
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Main class to handle ride fares
public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle3> rides = new ArrayList<>();

        Car3 ride1 = new Car3("C101", "John Doe", 10);
        Bike3 ride2 = new Bike3("B202", "Jane Doe", 5);
        Auto ride3 = new Auto("A303", "Mark Smith", 7);

        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);

        double distance = 15.0; // Example distance

        for (Vehicle3 ride : rides) {
            System.out.println(ride.getVehicle3Details());
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));

            if (ride instanceof GPS) {
                ((GPS) ride).updateLocation("Downtown");
                System.out.println("Updated Location: " + ((GPS) ride).getCurrentLocation());
            }

            System.out.println("----------------");
        }
    }
}

