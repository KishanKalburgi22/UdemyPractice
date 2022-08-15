package codingchallengesec7;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String name, double price) {
        if (name != null) {
            this.price += price;
            System.out.println("Added " + name + " for an extra " + price);
        }
    }

    public void addHamburgerAddition2(String name, double price) {
        if (name != null) {
            this.price += price;
            System.out.println("Added " + name + " for an extra " + price);
        }
    }

    public void addHamburgerAddition3(String name, double price) {
        if (name != null) {
            this.price += price;
            System.out.println("Added " + name + " for an extra " + price);
        }
    }

    public void addHamburgerAddition4(String name, double price) {
        if (name != null) {
            this.price += price;
            System.out.println("Added " + name + " for an extra " + price);
        }
    }

    public double itemizeHamburger() {
        return this.price;
    }


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1 ("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Delux", "Sausage", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}

class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        super.addHamburgerAddition1(name,price);
    }

    public void addHealthyAddition2(String name, double price) {
        super.addHamburgerAddition2(name,price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}