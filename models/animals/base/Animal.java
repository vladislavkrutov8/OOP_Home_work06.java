package models.animals.base;

public abstract class Animal {
    private double height;
    private double weight;
    private String eyeColor;

    protected Animal(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public abstract String sound();

    @Override
    public String toString() {
        return String.format("Height: %.1f, Height: %.1f, Eye color: %s", this.getHeight(), this.getWeight(), this.getEyeColor());
    }
}
