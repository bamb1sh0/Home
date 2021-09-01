package com.company.itStep;

public class Enums {

    public static void main(String[] args){
        Colors busColor = Colors.Yellow;
        System.out.println("This bus is " +busColor);
        System.out.println("Today is " +Days.WEDNESDAY);
        System.out.println("This wall is " +ColorsNew.White.getTitle());


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
    White ("Белый");

    private String title;
    ColorsNew (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
