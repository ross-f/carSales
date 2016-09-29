package carSales;

import javax.lang.model.type.ArrayType;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

class SearchQuery {
    String searchText;
    String carType;
    String make;
}

class CarSearch extends GenericPanel{
    private ArrayList<Car> cars;

    CarSearch(ArrayList<Car> cars) {
        super();

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.cars = cars;

        // TODO - create a search algorithm
        //cars = search();

        buildTable(cars);
    }

    private void buildTable(ArrayList<Car> searchResults) {
        searchResults.forEach(car -> {
            // create panel for each car
            JPanel carPanel = new JPanel();
            carPanel.setLayout(new FlowLayout());

            // Create image label and add to the car panel
//            Image bigImage = getCarImage(car.getMake());
//            ImageIcon littleImage = new ImageIcon(bigImage);
//            JLabel imageLabel = new JLabel(littleImage);
//            carPanel.add(imageLabel);

            // Add car info after image
            carPanel.add(new JLabel(String.format("%s %s %s", car.getColour(), car.getMake(), car.getModel())));

            // Add button to view full car
            carPanel.add(new JButton("View car"));

            add(carPanel);
        });
    }

    private Image getCarImage(String carName){
        // Using bing sorry
        URL bing = null;

        try {
            bing = new URL("https://bingapis.azure-api.net/api/v5/images/search");
        } catch (MalformedURLException e) {
            System.out.print("ugh");
        }

        try {
            URLConnection connection = bing.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO write this

        return null;
    }

    private ArrayList<Car> carSearchApi(SearchQuery query){
        // TODO - wirte config here

        // Grab values out of query object
        if(!query.searchText)

        cars.stream().filter()
    }
}
