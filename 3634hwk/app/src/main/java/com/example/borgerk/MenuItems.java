package com.example.borgerk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuItems {

    public static Item getMenuItemById(int itemID) {
        return items.get(itemID);
    }

    public static ArrayList<Item> getAllMenuItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    private static final HashMap<Integer, Item> items = new HashMap<>();

    static {
        items.put(1, new Item(
                1,
                "Bopper",
                "The good ol Bopper, perfect night snack at 2am while completing an coding assignment that you left way too late",
                2.95,
                R.drawable.bopper_image
        ));

        items.put(2, new Item(
                2,
                "Bopper Jnr Meal",
                "Can't go wrong with a Bopper Jnr + Drink, the classic combination for when you are not hungry but you are. ",
                3.95,
                R.drawable.bopper_jnr_meal_image
        ));

        items.put(3, new Item(
                3,
                "Fries",
                "More well known as Chips in straya. Please don't ask for 'no salt' as we honestly don't want to make another batch.",
                1.95,
                R.drawable.chips_image
        ));

        items.put(4, new Item(
                4,
                "Bacon & Egg",
                "For the times you are hangover and are just craving some instant cholesterol to fix all problems.",
                2.25,
                R.drawable.bacon_egg_image
        ));

        items.put(5, new Item(
                5,
                "Sandwich",
                "Who needs a buger when you have sandwiches? Make sandwiches great again!",
                2.45,
                R.drawable.sandwich_image
        ));

        items.put(6, new Item(
                6,
                "Drumstick",
                "Not to be confused with the ice cream or the percussion stick used to play the drums.",
                0.95,
                R.drawable.chicken_drumstick_image
        ));

        items.put(7, new Item(
                7,
                "Pizza",
                "Pinapple options available for all pizzas for the humans with superior taste buds",
                5.95,
                R.drawable.pizza_image
        ));

        items.put(8, new Item(
                8,
                "Lamb Skewer",
                "There is nothing more precious than a lamb skewer… or is there?",
                1.45,
                R.drawable.skewer_image
        ));

        items.put(9, new Item(
                9,
                "Cake",
                "The Cake is a lie!!!!! (Yes I am really using 2007 memes in a product page)",
                1.45,
                R.drawable.cake_image
        ));

        items.put(10, new Item(
                10,
                "Macaroon",
                "A sweet small powder puff with a soft centre, not to be confused with French President Macron",
                1.95,
                R.drawable.macaron_image
        ));

        items.put(11, new Item(
                11,
                "Kruspy Krame Donut",
                "Lets share an original glazed dozen? Haha just kidding… Unless?",
                2.45,
                R.drawable.kruspy_krame_doughnut_image
        ));


        items.put(12, new Item(
                12,
                "Coffee",
                "One of the five necessities of student life made by the best Baristas in the fast food business.",
                1.95,
                R.drawable.coffee_image
        ));



        items.put(13, new Item(
                13,
                "Soda",
                "Sugar and Caffeine to inject some Dopamine!! Oh right diet options are also available",
                0.95,
                R.drawable.soda_image
        ));

        items.put(14, new Item(
                14,
                "Spider",
                "Named that way because the carbonation and ice cream forms a spider web-like reaction (Fun Facts!)",
                0.75,
                R.drawable.spider_image
        ));

        items.put(15, new Item(
                15,
                "Strawberry Moooove",
                "I like to moooove it moooove it, we like to… mooooove it!!!",
                1.15,
                R.drawable.strawberry_moooove_image
        ));


    }
}
