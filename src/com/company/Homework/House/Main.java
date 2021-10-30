package com.company.Homework.House;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        House house = new House(2, 35.5, 2, 3, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(5, 50, 3, 2, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(12, 43.3, 5, 4, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(25, 55.55, 4, 3, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(50, 70.43, 3, 4, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(69, 44, 3, 3, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(33, 66, 3, 2, "Чкалова 19/1", "Пятиэтажное здание", 30);
        houses.add(house);
        house = new House(76,33,1,5);
        houses.add(house);
        house = new House(99,35,3,3);
        houses.add(house);


        /** список квартир, имеющих заданное число комнат */

        for (House houseTemp : houses){
            if (houseTemp.getNumRoom().equals(3))
            System.out.println("Квартиры с тремя комнатами: "+houseTemp.toString());

        }

        /**список квартир, имеющих заданное число комнат и расположенных на этаже,
         который находится в заданном промежутке */

        for (int i = 2; i<5;i++)
            for (int j = 2; j<5;j++)
        for (House houseTemp : houses){
        if (houseTemp.getFloor() == i && houseTemp.getFloor() == j)
            if (houseTemp.getNumRoom().equals(3))
            System.out.println("Квартиры с тремя комнатами c 2-го по 4-ый этаж: "+houseTemp.toString());

        }

        /** список квартир, имеющих площадь, превосходящую заданную */

        int squareApart = 45;
        for (House houseTemp : houses) {
            if (houseTemp.getSquare() > squareApart )
                System.out.println("Квартиры с площадью больше 45: "+houseTemp.toString());


        }
        }


    static class House {
        public House(int apartmentNumber, double square, int floor, int nRoom) {
            this.setApartmentNumber(apartmentNumber);
            this.setSquare(square);
            this.setFloor(floor);
            this.setnRoom(nRoom);
        }

        public House(int apartmentNumber, double square, int floor, int numRoom, String street, String typeBuilding, int lifeTime) {
            this.setApartmentNumber(apartmentNumber);
            this.setSquare(square);
            this.setFloor(floor);
            this.setnRoom(numRoom);
            this.setStreet(street);
            this.setTypeBuilding(typeBuilding);
            this.setLifeTime(lifeTime);
        }

        private int apartmentNumber;
        private double square;
        private int floor;
        private int numRoom;
        private String street = "";
        private String typeBuilding = "";
        private int lifeTime;

        public String toString() {

            String result = String.format("Номер квартиры: %s, Площадь: %s, Этаж: %s, Количество комнат: %s, Улица:%s",
                    apartmentNumber, square, floor, numRoom, street);
            return result;
        }

        public Integer getApartmentNumber() {
            return apartmentNumber;
        }

        public Double getSquare() {
            return square;
        }

        public Integer getFloor() {
            return floor;
        }

        public Integer getNumRoom() {
            return numRoom;
        }

        public String getStreet() {
            return street;
        }

        public String getTypeBuilding() {
            return typeBuilding;
        }

        public int getLifeTime() {
            return lifeTime;
        }

        public void setApartmentNumber(int apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }

        public void setSquare(double square) {
            this.square = square;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public void setnRoom(int nRoom) {
            this.numRoom = nRoom;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setTypeBuilding(String typeBuilding) {
            this.typeBuilding = typeBuilding;
        }

        public void setLifeTime(int lifeTime) {
            this.lifeTime = lifeTime;
        }
    }
}




