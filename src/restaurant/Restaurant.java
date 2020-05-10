package restaurant;

import java.util.ArrayList;


public class Restaurant {

    public static void main(String[] args) {

        //create several items
        MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "Marinated grilled steak", "main", true);
        MenuItem dish2 = new MenuItem("Wedge salad", 7.99, "iceberg lettuce with bleu cheese", "appetizer", true);
        MenuItem dish3 = new MenuItem("Brownie sundae", 7.99, "iceberg lettuce with bleu cheese", "appetizer", true);
        MenuItem dish4 = new MenuItem("Ramen", 12.00, "ramen noodles", "main", false);
        //add them to the menu list
        ArrayList<MenuItem> menuList = new ArrayList<>();
        menuList.add(dish1);
        menuList.add(dish2);
        menuList.add(dish3);
        menuList.add(dish4);

        Menu spring = new Menu("Spring", menuList, "May 21, 2020");

        //print the entire updated menu
//        System.out.println(spring);

        //print an individual menuItem
//        System.out.println(menuList.get(0));

        //delete an item then reprint the menu
//        menuList.remove(dish2);
//        System.out.println(spring);

        //change the price on a menu item and then reprint
        dish1.setPrice(17.99);
        System.out.println(spring);

    }
}
