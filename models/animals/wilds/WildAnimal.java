package models.animals.wilds;

import java.util.Date;

import models.animals.base.Animal;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private Date foundDate;

    protected WildAnimal(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public Date getFoundDate() {
        return this.foundDate;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Habitat: %s, Found date: %s",
            super.toString(), this.getHabitat(), this.getFoundDate()
        );
    }
}
