package app;

import java.util.Date;


public class Main {
    public static void main(final String[] args) throws Exception {
        // task1
        System.out.println("\n------------------------------------Task1------------------------------");
        GenericItem first = new GenericItem(1, "java", 199.99f);
        GenericItem second = new GenericItem(10, "python", 199.99999f);
        GenericItem third = new GenericItem(1234, "ruby", 179f);
        first.printAll();
        second.printAll();
        third.printAll();

        // task2
        System.out.println("\n------------------------------------Task2------------------------------");
        Date date = new Date();
        FoodItem food1 = new FoodItem(10, "food1", 123.03f, date, (short) 1);
        FoodItem food2 = new FoodItem(11, "food2", 165.03f, date, (short) 4);
        TechnicalItem tech1 = new TechnicalItem(12, "tech1", 354.1f, (short) 100);
        TechnicalItem tech2 = new TechnicalItem(13, "tech2", 1354.1f, (short) 365);
        GenericItem[] items = {food1, food2, tech1, tech2};

        for (GenericItem genericItem : items) {
            genericItem.printAll();
        }

        // tasks 2-2
        System.out.println("\n------------------------------------Task2.2----------------------------\n");
        System.out.println("Food1 == Food2 - " + food1.equals(food2));
        System.out.println("Food1 == Food1 - " + food1.equals(food1));

        TechnicalItem tech1_clone = tech1.clone();
        System.out.println("Tech1 == Tech1_clone - " + tech1.equals(tech1_clone));

        System.out.println(food1);
//        GenericItem item = new GenericItem(1, "item", 199.99f);
//        Date date = new Date();
//        FoodItem food = new FoodItem(2, "food", 165.03f, date, (short) 4);
//        TechnicalItem tech = new TechnicalItem(3, "tech", 354.1f, (short) 100);
//        item.printAll();
//        food.printAll();
//        tech.printAll();
    }
}
