import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Menu extends JFrame {
    private JPanel panel;
    private String[] pageNames;

    // Constructs the components for the menu
    // Pass through the page names to make it more dynamic
    Menu(String title, String[] pageNames) {
        // Construct the main JFrame with the title
        super(title);
        // TODO - Make sizes variable
        setSize(500,500);
        // Create a grid layout for the title and the content
        setLayout(new BorderLayout());
        // Kill the app when the user closes it
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        /*
            The menu buttons will be created in a grid inside a
            JPanel, the following statements defines layout of that
            grid.

            The number of rows in that panel is half the number of
            buttons as there is two columns.

            The number of rows will be rounded up if there is an odd
            number of rows
        */

        panel = new JPanel();
        int numberOfRows = Math.round(pageNames.length / 2);
        panel.setLayout(new GridLayout(numberOfRows, 2));

        // Add the page names to the object so they can be used by createPageButtons
        this.pageNames = pageNames;

        createPageButtons();

        // Header label is created based on the title passed through
        JLabel header = new JLabel(title,JLabel.CENTER);

        // Set size of header to push panel down
        header.setPreferredSize(new Dimension(10,100));

        // Add the header to the outer JFrame
        add(header, BorderLayout.PAGE_START);

        // Add the panel (now with menu buttons) to the JFrame
        add(panel, BorderLayout.CENTER);

        // Finally make the menu visible
        setVisible(true);
    }

    // Creates the buttons for each page and adds them to the panel
    private void createPageButtons(){
        // Creates an array of the buttons so they can be added to panel later
        JButton[] pageButtons = new JButton[pageNames.length];

        // Loop though the names, makes buttons for each, add them to the panel
        for (int i = 0; i < pageNames.length; i++) {
            pageButtons[i] = new JButton(pageNames[i]);
            pageButtons[i].setPreferredSize(new Dimension(10,5));
            panel.add(pageButtons[i]);
        }
    }
}
