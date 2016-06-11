import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Welcome msg
     * show menu
     * ask for input
     * switch input
     *  case 1:
     *    cars
     *  case 2:
     *    employees
     *  case 3;
     *    customers? --- should i manage customers
     */

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("User","Name","Sales",1,10000.00));
        employees.add(new Employee("Admin","Account","Admin",1,10000.00,true));

        Menu gooey = new Menu(
                "Car Sales",
                new String[]{
                        "Button 1",
                        "button 2",
                        "Button 3",
                        "Button 4"
                }
        );

        Car[] cars = new Car[3];
    }
}
