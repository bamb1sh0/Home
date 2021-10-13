package Methods;

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
    }
}



