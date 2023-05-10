package web.model;

public class Car {
    private String model;
    private String color;
    private int releaseYear;

    public Car(String model, String color, int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Автомобили {" +
                "модель = '" + model + '\'' +
                ", цвет = '" + color + '\'' +
                ", год выпуска = '" + releaseYear + "'}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
