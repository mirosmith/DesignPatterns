package factory;

abstract class Clothes {

    private String brand;
    private String color;

    public Clothes(String brand, String color) {
	this.brand = brand;
	this.color = color;
    }

    public String getBrand() {
	return brand;
    }

    public String getColor() {
	return color;
    }

}
