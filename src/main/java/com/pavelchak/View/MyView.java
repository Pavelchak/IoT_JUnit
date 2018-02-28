package com.pavelchak.View;

import java.util.*;

public class MyView {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);

    public MyView() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        menu.put("1", "  1 - Test ...");
        menu.put("Q", "  Q - exit");
        methodsMenu.put("1", this::testReader);
    }

    private void testReader() {
        System.out.println("Test ...");
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values())
            System.out.println(str);
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }
}
