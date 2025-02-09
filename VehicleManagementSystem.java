// Interface Refuelable
interface Refuelable {
    void refuel();
}

// Superclass Vehicle2
class Vehicle2 {
    String model;
    int maxSpeed;

    public Vehicle2(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Subclass ElectricVehicle2 inheriting from Vehicle2
class ElectricVehicle2 extends Vehicle2 {
    public ElectricVehicle2(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass PetrolVehicle2 inheriting from Vehicle2 and implementing Refuelable
class PetrolVehicle2 extends Vehicle2 implements Refuelable {
    public PetrolVehicle2(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

// Main class to test the functionality
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle2 ev = new ElectricVehicle2("Tesla Model 3", 150);
        PetrolVehicle2 pv = new PetrolVehicle2("Ford Mustang", 200);

        ev.charge();  // Output: Tesla Model 3 is charging.
        pv.refuel();  // Output: Ford Mustang is refueling.
    }
}

