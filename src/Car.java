import java.util.Date;

public class Car {
    private String make, reg, colour, model, bodyStyle;
    private double price;
    private int numberOfMiles;
    private Date manufacturingDate;
    private Date soldDate;

    // Constructor to allow new objects to be made quickly
    // A new car that is added to the system is never already sold so the date is set to null
    public Car(String make, String reg, String colour, String model, String bodyStyle,
               double price, int numberOfMiles, Date manufacturingDate) {
        this.make = make;
        this.reg = reg;
        this.colour = colour;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.price = price;
        this.numberOfMiles = numberOfMiles;
        this.manufacturingDate = manufacturingDate;
        soldDate = null;
    }

    /*
     Setters are here for things that can be changed while it's in stock
       - Colour
       - Price
       - Number of miles
       - Date soldDate
    */
    public String getMake() {
        return make;
    }

    public String getReg() {
        return reg;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumberOfMiles(int numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public int getNumberOfMiles() {
        return numberOfMiles;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public Date isSold() {
        return soldDate;
    }
}
