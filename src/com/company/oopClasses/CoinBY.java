package oopClasses;

public class CoinBY{
    private int nominal;
    private double weight;

    CoinBY(int nominal) throws IncorrectNominalException {
        this.nominal = nominal;
        switch (nominal){
            case 1: weight = 1; break;
            case 2, 10: weight = 2; break;  //case 10: weight = 2;
            case 5: weight = 5; break;
            case 20: weight = 4; break;
            case 50: weight = 7; break;
            default: IncorrectNominalException exception =
                    new IncorrectNominalException("Такой монеты не существует");
                throw exception;
        }
    }

    public int getNominal() {
        return nominal;
    }

    public double getWeight() {
        return weight;
    }
}
class IncorrectNominalException extends Exception {
    public IncorrectNominalException(String errorMessage) {
        super(errorMessage);
    }
}