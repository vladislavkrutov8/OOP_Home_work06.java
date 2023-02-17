package models.animals.wilds;

import java.util.Date;

public class Tiger extends WildAnimal{

    public Tiger(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor, habitat, foundDate);
    }

    @Override
    public String sound() {
        return "R-O-O-O-O-A-R-R-R-R!";
    }

    @Override
    public String toString() {
        return String.format("Tiger (%s)", super.toString());
    }
}
