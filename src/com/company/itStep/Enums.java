package com.company.itStep;

public class Enums {

    public static void main(String[] args){
        Colors busColor = Colors.Yellow;
        System.out.println("This bus is " +busColor);
        System.out.println("Today is " +Days.WEDNESDAY);


    }
}
enum Colors {
    Black, White, Gray, Red, Orange, Yellow, Green, Blue, Indigo, Violet

}
enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
enum ColorsNew{
    Black ("Черный"),
    White ("белый");

    private String title;
    ColorsNew (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
