package ru.billing.client;

import ru.billing.stocklist.*;
import ru.WorkArray;

import java.util.Date;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------------------------Task1------------------------------------\n");
        GenericItem first = new GenericItem("java", 199.99f, GenericItem.Category.GENERAL);
        GenericItem second = new GenericItem("python", 199.99999f, first);
        GenericItem third = new GenericItem();
        first.printAll();
        second.printAll();
        third.printAll();

        Date date = new Date();
        FoodItem food1 = new FoodItem("java", 199.99f, (short) 1);
        FoodItem food2 = new FoodItem("python", 199.99999f, (short) 2, food1, date);
        FoodItem food3 = new FoodItem("ruby");
        food1.printAll();
        food2.printAll();
        food3.printAll();

        System.out.println("\n------------------------------------Task2------------------------------------\n");
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[5];
        Random r = new Random();
        float fMin = 10;
        float fMax = 20;
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = fMin + r.nextFloat() * (fMax - fMin);
        }

        WorkArray<Integer> integerWorkArray = new WorkArray<>(intArr);
        WorkArray<Float> floatWorkArray = new WorkArray<>(floatArr);

        integerWorkArray.printAll();
        floatWorkArray.printAll();
        System.out.println(integerWorkArray.sum());
        System.out.println(floatWorkArray.sum());

        System.out.println("\n------------------------------------Task3------------------------------------\n");
        String line = "Конфеты 'Маска';45;120";
        String[] lineFields = line.split(";");

        String name = lineFields[0];
        float price = Float.parseFloat(lineFields[1]);
        short expires = Short.parseShort(lineFields[2]);
        FoodItem foodItem = new FoodItem(name, price, expires);
        foodItem.printAll();

        System.out.println("\n------------------------------------Task4------------------------------------\n");
        ItemCatalog itemCatalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);

        for (int i = 0; i < 8; i++) {
            itemCatalog.addItem(new GenericItem("phone", 5000.0f, GenericItem.Category.GENERAL));
            itemCatalog.addItem(new FoodItem("milk", 10.0f, (short) 10));
        }

        itemCatalog.printItems();

        long begin = new Date().getTime();
        for (int i = 0; i < 1000000; i++)
            itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));

        begin = new Date().getTime();
        for (int i = 0; i < 1000000; i++)
            itemCatalog.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
    }
}