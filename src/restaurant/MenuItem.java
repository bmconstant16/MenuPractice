package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean recentAdd;

    //constructors
//    public MenuItem() {};

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory, boolean aRecentAdd) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.recentAdd = aRecentAdd;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isRecentAdd() {
        return recentAdd;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRecentAdd(boolean recentAdd) {
        this.recentAdd = recentAdd;
    }

    //instance method to return all the info from the object
    public String MenuItemDetails() {
        return this.name + "\n" + this.price + "\n" + this.category + "\n" + this.description + "\n" + this.recentAdd;
    }

    //print out the things in the menu

    public String toString() {
        return "name: " + this.name + "\n price: " + this.price;
    }

    // a way to add and remove items

    //a way to tell if it is new
    public String newlyAdded() {
        if (this.recentAdd == true) {
            return "New item!";
        }

        return null;
    }


        //if true, then set aRecent Add to "New!"

    // a way to tell when the menu was last updated

    //a way to print out both a single menu item as well as the entire menu

    //a way to determine if two menuItems are the same

    public boolean equals(Object menuItem){
        //check to see if it equals itself
        if (menuItem == this) {
            return true;
        }

        //check not null
        if (menuItem == null) {
            return false;
        }

        //ensure completed from the same class. can the object be cast?
        if (menuItem.getClass() != getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) menuItem;
        return theMenuItem.getName() == getName();
        }
}
