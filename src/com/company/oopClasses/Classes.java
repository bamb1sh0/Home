package oopClasses;

public class Classes {
    public static void main(String[] args) throws IncorrectNominalException {
    Pen penRed = new Pen(Colors.RED);
        System.out.println(penRed.getColor());

        Car car = new Car(Colors.GREEN);
        System.out.println("Car's color is " +car.getColor());
        car.setColor(Colors.RED);
        System.out.println("Car's color is "+car.getColor());

        CoinBY coin = new CoinBY(50);
        System.out.printf("Nominal: %d, weight: %f%n",coin.getNominal(), coin.getWeight());

        Mixer mixer = new Mixer(18, 60);
        mixer.regulate(70, 30);
        System.out.println("Temp: "+mixer.calcTemp());

        Switch switch1 = new Switch();
        System.out.println(switch1.isState());

        Account account = new Account();
        account.addMoney(100);
        System.out.println("Сумма: "+account.getAmount());

        Book book = new Book("name","author",123,Genres.SciFi);
        System.out.println(book.toString());

        Compass compass = new Compass();
        compass.setAzimuth(123);
        System.out.println(compass.getDirect());

    }
}

enum Directions {NORTH, EAST, SOUTH, WEST};

class Compass{
    private int azimuth;


    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }
    public Directions getDirect(){

        if ((azimuth > 315) || (azimuth < 45))
            return Directions.NORTH;
        else if (azimuth < 135) return Directions.EAST;
        else if (azimuth < 225) return Directions.SOUTH;
        else return Directions.WEST;
    }

}




