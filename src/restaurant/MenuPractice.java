package restaurant;

import java.util.ArrayList;


public class MenuPractice {

    public static void main(String[] args) {
//        MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "grilled steak", "main", true);
//        Menu menuList = new Menu("MenuItem", "1-5-2020");
//        //System.out.println(dish1.getName());

        MenuItem dish1 = new MenuItem("Grilled Steak", 15.99, "Marinated grilled steak", "main", true);
        MenuItem dish2 = new MenuItem("Wedge salad", 7.99, "iceberg lettuce with bleu cheese", "appetizer", true);
        MenuItem dish3 = new MenuItem("Brownie sundae", 7.99, "brownie with coffee ice cream", "dessert", false);

        // a way to add and remove items (use .remove)
        ArrayList<MenuItem> menuList = new ArrayList<>();
        menuList.add(dish1);
        menuList.add(dish2);
        menuList.add(dish3);

        //print all the items in the menu
        for (MenuItem item: menuList) {
            System.out.println(item);
        }



        //System.out.println(menuList.menuDetails());
        System.out.println(dish1.MenuItemDetails());

        dish1.setPrice(17.99);
        System.out.println(dish1.MenuItemDetails());


    }
}
