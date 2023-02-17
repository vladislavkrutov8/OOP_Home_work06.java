package models.animals.pets;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    private boolean woolly;

    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate, boolean woolly) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = woolly;
    }
    
    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = false;
    }

    public boolean isWoolly() {
        return this.woolly;
    }

    @Override
    public String sound() {
        return "Meow-meow!";
    }

    @Override
    public String toString() {
        return String.format("Cat (%s, is woolly: %b)", super.toString(), this.isWoolly());
    }
}
