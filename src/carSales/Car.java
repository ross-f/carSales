package carSales;

import java.util.Date;

class Car {
    private String make, reg, colour, model, bodyStyle;
    private double price;
    private double numberOfMiles;
    private Date manufacturingDate;
    private Date soldDate;

    // Constructor to allow new objects to be made quickly
    // A new car that is added to the system is never already sold so the date is set to null
    Car(String bodyStyle, String make, String model, String colour, String reg,
               double price, double numberOfMiles, Date manufacturingDate) {
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
    String getMake() {
        return make;
    }

    String getReg() {
        return reg;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    String getColour() {
        return colour;
    }

    String getModel() {
        return model;
    }

    String getBodyStyle() {
        return bodyStyle;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void setNumberOfMiles(double numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    double getNumberOfMiles() {
        return numberOfMiles;
    }

    Date getManufacturingDate() {
        return manufacturingDate;
    }

    void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    Date isSold() {
        return soldDate;
    }
}
