package com.javifast.tema10;

public class StringApp {

    public static void main(String... javifast) {
        StringBuilder sb = new StringBuilder("JavierMS");
        //sb.append("MitoCode").append(" Tutos");

        //System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.setLength(0);
        System.out.println(sb.toString());

    }
}
