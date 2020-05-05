package restaurant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Menu {

//    MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "Marinated grilled steak", "main", true);
//    MenuItem dish2 = new MenuItem("Wedge salad", 7.99, "iceberg lettuce with bleu cheese", "appetizer", true);
//    MenuItem dish3 = new MenuItem("Brownie sundae", 7.99, "iceberg lettuce with bleu cheese", "appetizer", true);
//
//    ArrayList<MenuItem> menulist = new ArrayList<>;
//    menuList.add(dish1);
//    menuList.add(dish2);
//
//    for (MenuItem item: menuList) {
//        System.out.println(item);
//    }


    //fields
        private String menuItems;
        private String lastUpdated;

    // constructors
    public Menu(String aMenuItems, String aLastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = aLastUpdated;
    }

    //getters

    public String getMenuItems() {
        return menuItems;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }


    //setters


    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //instance method to return the menu
    public String menuDetails() {
        return this.lastUpdated + "\n" + this.menuItems;

    }

    //instance method is it new?
    //public boolean

}
