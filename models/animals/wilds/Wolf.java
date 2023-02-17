package models.animals.wilds;

import java.util.Date;

public class Wolf extends WildAnimal{
    protected boolean leader;
    
    public Wolf(double height, double weight, String eyeColor, String habitat, Date foundDate, boolean leader) {
        super(height, weight, eyeColor, habitat, foundDate);
        this.leader = leader;
    }

    public Wolf(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor, habitat, foundDate);
        this.leader = false;
    }

    public boolean isLeader() {
        return this.leader;
    }

    @Override
    public String sound() {
        return "Owooooo!";        
    }

    @Override
    public String toString() {
        return String.format("Wolf (%s)", super.toString());
    }
}
