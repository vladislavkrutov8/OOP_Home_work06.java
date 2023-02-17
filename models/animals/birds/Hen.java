package models.animals.birds;

public class Hen extends NonFlyingBird{

    public Hen(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return String.format("Cluck-cluck!");
    }

    @Override
    public String toString() {
        return String.format("Hen (%s)", super.toString());
    }
}
