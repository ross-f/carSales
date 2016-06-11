import javax.swing.*;
import java.awt.*;

class Menu extends JFrame {
    private JPanel mainPanel;
    private JPanel menuButtonPanel;
    private String[] pageNames;

    // Constructs the components for the menu
    // Pass through the page names to make it more dynamic
    Menu(String title, String[] pageNames) {
        // Construct the main JFrame with the title
        super(title);
        // TODO - Make sizes variable
        setSize(500,500);
        // Create a grid layout for the title and the content
        // Kill the app when the user closes it
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Create a menuButtonPanel to hold everything because box layout requires an object to target
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        /*
            The menu buttons will be created in a grid inside a
            JPanel, the following statements defines layout of that
            grid.

            The number of rows in that menuButtonPanel is half the number of
            buttons as there is two columns.

            The number of rows will be rounded up if there is an odd
            number of rows
        */
        add(new JSeparator());
        // crate menuButtonPanel
        menuButtonPanel = new JPanel();
        // calculate the number of rows in grid layout
        double a = (double) pageNames.length / 2;
        int numberOfRows = (int) Math.round(a);

        // set the layout of the menuButtonPanel to the new layout
        menuButtonPanel.setLayout(new GridLayout(numberOfRows, 2, 10, 20));

        // Add the page names to the object so they can be used by createPageButtons
        this.pageNames = pageNames;

        createPageButtons();

        // Header label is created based on the title passed through
        JLabel header = new JLabel(title,JLabel.CENTER);

        // Set size of header to push menuButtonPanel down
        header.setPreferredSize(new Dimension(10,100));

        // Add the header to the outer JFrame
        add(header, BorderLayout.PAGE_START);

        add(new JSeparator());
        add(new JSeparator());

        // Add the menuButtonPanel (now with menu buttons) to the JFrame
        add(menuButtonPanel, BorderLayout.CENTER);

        add(new JSeparator());

        // Finally make the menu visible
        setVisible(true);
    }

    // Creates the buttons for each page and adds them to the menuButtonPanel
    private void createPageButtons(){
        // Creates an array of the buttons so they can be added to menuButtonPanel later
        JButton[] pageButtons = new JButton[pageNames.length];

        // Loop though the names, makes buttons for each, add them to the menuButtonPanel
        for (int i = 0; i < pageNames.length; i++) {
            pageButtons[i] = new JButton(pageNames[i]);
            pageButtons[i].setPreferredSize(new Dimension(10,5));
            menuButtonPanel.add(pageButtons[i]);
        }
    }
}
