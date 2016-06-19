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

    private static void updateFrame(JPanel panel){
        frame.getContentPane().setVisible(false);
        frame.getContentPane().removeAll();

        // Header label is created based on the title passed through
        JLabel header = new JLabel(title,JLabel.CENTER);
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(header);

        frame.add(panel);

        frame.getContentPane().setVisible(true);
    }

    public static void main(String[] args) throws ParseException /** Required to parse dates **/ {
        // Create date parser to pass through dates here
        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");

        ArrayList<Car> cars = new ArrayList<>();
        // String bodyStyle, String make, String model, String colour, String reg, double price, int numberOfMiles, Date manufacturingDate
        cars.add(new Car("Hatchback","Ford","Fusion","Red","RD15 TVC",5000,50000,sf.parse("10/10/2010")));
        cars.add(new Car("Hatchback","Vauxhaul","Corsa","Silver","TS92 GHB",2000,200000,new Date(1)));


        title = "Car Sales";
        // Construct the frame that holds the app
        frame = new JFrame(title);
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.PAGE_AXIS));
        frame.setVisible(true);

        Menu menu = new Menu(title, new String[] {
                "Car search",
                "some other page",
                "some other page",
                "some other page"
        });

        listeners = new ActionListener[]{
                actionEvent -> {
                    out.print("search");
                    CarSearch search = new CarSearch(cars);
                    listeners = new ActionListener[]{
                            actionEvent1 -> {
                                out.print("view car");
                            }
                    };
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

        menu.buttons[0].addActionListener(actionEvent -> {
        });
        menu.buttons[1].addActionListener(actionEvent -> {
            out.print("yeh");
        });
        menu.buttons[2].addActionListener(actionEvent -> out.print("yeh"));
        menu.buttons[3].addActionListener(actionEvent -> out.print("yeh"));

        updateFrame(menu);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("User", "Name", "Sales", 1, 10000.00));
        employees.add(new Employee("Admin", "Account", "Admin", 1, 10000.00, true));
    }
}
