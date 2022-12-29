public class Car {

    public String  brand;
    public String  model;
    public double engineVolume;
    public String color;
    public int year;
    public String  country;

    public Car (String brand, int year, String color, String model, String country, double engineVolume){
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }



}}
