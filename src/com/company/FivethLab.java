package com.company;

public class FivethLab {

    StringBuffer s = new StringBuffer("Галюк Тарас Васильович 8 лютого 1998 ");
    StringBuffer s1 = new StringBuffer(s);

    public void lol() {

        System.out.println("Завдання 1");
        System.out.println(s);
        System.out.println("");

        System.out.println("Завдання 2");
        s1.delete(22, 36);
        System.out.println(s1);
        System.out.println("");

        System.out.println("Завдання 3");
        s.append("*місце народження*");
        System.out.println(s);
        System.out.println("");

        System.out.println("Завдання 4");
        s.insert(36, " Чол.");
        System.out.println(s);

        System.out.println("Завдання 5");
        System.out.println(s.length());
        System.out.println(s.capacity());
//        System.out.println(s.);


        System.out.println("Завдання 6");
        s.delete(22, 60);
        System.out.println(s);


        String string = new String(s);

// Check length, in characters
        System.out.println(string.length()); // prints "22"

// Check encoded sizes
        try {
            final byte[] utf8Bytes = string.getBytes("UTF-8");
            System.out.println(utf8Bytes.length); // prints "42"

            final byte[] utf16Bytes = string.getBytes("UTF-16");
            System.out.println(utf16Bytes.length); // prints "46"

            final byte[] utf32Bytes = string.getBytes("UTF-32");
            System.out.println(utf32Bytes.length); // prints "88"

            final byte[] isoBytes = string.getBytes("ISO-8859-1");
            System.out.println(isoBytes.length); // prints "22"

            final byte[] winBytes = string.getBytes("CP1252");
            System.out.println(winBytes.length); // prints "22"
        } catch (Exception e) {
            System.out.println("lol");
        }

        System.out.println("Завдання 7");
        s.delete(5,s.length());
        System.out.println(s);
        System.out.println(s.reverse());
    }
}