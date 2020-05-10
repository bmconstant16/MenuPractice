package restaurant;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Map;
import java.util.ArrayList;

public class Menu {

    //fields
    private String menuName;
    private ArrayList<MenuItem> menuSelections;
    private String lastUpdated;

    // constructors
    public Menu(String aMenuName, ArrayList<MenuItem> aMenuSelections, String aLastUpdated) {
        this.menuName = aMenuName;
        this.menuSelections = aMenuSelections;
        this.lastUpdated = aLastUpdated;
    }

    //getters

    public String getMenuName() {
        return menuName;
    }

    public ArrayList<MenuItem> getMenuSelections() {
        return menuSelections;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }


    //setters


    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuSelections(ArrayList<MenuItem> menuSelections) {
        this.menuSelections = menuSelections;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //methods

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return this.menuName + " Menu" + "\n " + this.lastUpdated + "\nMeal Selections " + this.menuSelections;
    }


//    // print all the items in the menu
//    public void printAll() {
//        for (MenuItem item: menuSelections) {
//        System.out.println(item);
//        }
//    }

//    print one item in the menu
//        for (int i=0; i< menuSelections; i++) {
//        System.out.println(i);
//    }

//    //instance method to return the menu
//    public String menuDetails() {
//        return this.lastUpdated + "\n" + this.menuItems;
//
//    }



}
