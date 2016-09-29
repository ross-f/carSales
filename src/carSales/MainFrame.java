package carSales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.System.out;

public class MainFrame {
    // Create a stoic main fram to be used by the whioe app
    private static JFrame frame;
    private static String title;
    private static ActionListener[] listeners;

    private static void updateFrame(GenericPanel panel){
        frame.getContentPane().setVisible(false);
        frame.getContentPane().removeAll();

        // Header label is created based on the title passed through
        JLabel header = new JLabel(title,JLabel.CENTER);
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(header);

        frame.add(panel);

        frame.getContentPane().setVisible(true);

        // Add the action listeners
        for (int i = 0; i < listeners.length; i++) panel.buttons[i].addActionListener(listeners[i]);
    }

    // TODO - fix pars exception
    public static void main(String[] args) throws ParseException /** Required to parse dates  **/ {
        /** Begin creating example data */

        // Create date parser to pass through dates here
        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("User", "Name", "Sales", 1, 10000.00));
        employees.add(new Employee("Admin", "Account", "Admin", 1, 10000.00, true));

        ArrayList<Car> cars = new ArrayList<>();
        // String bodyStyle, String make, String model, String colour, String reg, double price, int numberOfMiles, Date manufacturingDate
        cars.add(new Car("Hatchback","Ford","Fusion","Red","RD15 TVC",5000,50000,sf.parse("10/10/2010")));
        cars.add(new Car("Hatchback","Vauxhaul","Corsa","Silver","TS92 GHB",2000,200000,new Date(1)));

        /** End creation of example data */


        title = "Car Sales";
        // Construct the frame that holds the app
        frame = new JFrame(title);
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        // Construct starting menu
        Menu menu = new Menu(title, new String[] {
                "Car search",
                "some other page",
                "some other page",
                "some other page"
        });

        // These lambda functions link the whole app together and define what pages link to other pages
        listeners = new ActionListener[]{
                actionEvent -> {
                    out.print("search");
                    CarSearch search = new CarSearch(cars);
                    listeners = new ActionListener[]{
                            actionEvent1 -> {
                                out.print("view car");
                            }
                    };
                    // Always update the frame after redefining links
                    updateFrame(search);
                },
                actionEvent -> {
                    out.print("thing");
                },
                actionEvent -> {
                    out.print("yesg");
                },
                actionEvent -> {
                    out.print("4");
                }
        };
        // Always update the frame after redefining links
        updateFrame(menu);

    }
}
