// Interface Worker
interface Worker {
    void performDuties();
}

// Superclass Person2
class Person2 {
    String name;
    int id;

    public Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Subclass Chef inheriting from Person2 and implementing Worker
class Chef extends Person2 implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + ".");
    }
}

// Subclass Waiter inheriting from Person2 and implementing Worker
class Waiter extends Person2 implements Worker {
    String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food in section " + section + ".");
    }
}

// Main class to test the functionality
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101, "Pasta");
        Waiter waiter = new Waiter("Alice", 102, "A1");

        chef.performDuties();   // Output: John is cooking Pasta.
        waiter.performDuties(); // Output: Alice is serving food in section A1.
    }
}

