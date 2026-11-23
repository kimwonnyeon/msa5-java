package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
        Weeks monday = Weeks.MONDAY;
        System.out.println(monday);
        System.out.println(monday.name());
        System.out.println(monday.getKrDay());

        System.out.println(Weeks.MONDAY);
        System.out.println(Weeks.MONDAY.name());
        System.out.println(Weeks.MONDAY.getKrDay());

        System.out.println(Weeks.MONDAY.ordinal());// 직접적인 연산에 사용금지
    }
}
