public class GuitarinventorySystem {
    public static Guitar[] inventory = new Guitar[10];

    public static void main(String[] args) {
        String[] defaultNames = {
                "Fender Stratocaster", "Gibson Les Paul", "Ibanez RG",
                "PRS Custom 24", "Yamaha Pacifica", "Jackson Dinky",
                "ESP Eclipse", "Schecter Hellraiser", "Gretsch White Falcon",
                "Music Man Majesty"
        };

        // Insert guitars
        for (int i = 0; i < inventory.length; i++) {
            inventory[i] = new Guitar(defaultNames[i], 100);
        }

        // Display the inventory
        System.out.println("\nGuitar Inventory:");
        for (Guitar guitar : inventory) {
            System.out.println("Name: " + guitar.getName() + ", Price: $" + guitar.getPrice());
        }
    }
}

class Guitar {
    private String name;
    private int price;

    // Constructor
    public Guitar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;}
}
