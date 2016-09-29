package carSales;

import javax.swing.*;
import java.awt.*;

import static javax.swing.Box.*;

class Menu extends GenericPanel{
    private String[] pageNames;
    JButton[] buttons;

    // Constructs the components for the menu
    // Pass through the page names to make it more dynamic
    Menu(String title, String[] pageNames) {
        super();

        // Add a box layout to organise all the components
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        // Construct the object
        this.pageNames = pageNames;

        // Loop though each of the page names and add a button for each
        addComponents();
    }

    // Creates the buttons for each page and adds them to the menuButtonPanel
    private void addComponents(){
        buttons = new JButton[pageNames.length];
        JPanel pane = new JPanel();

        for (int i = 0; i < pageNames.length; i++) {
            // if the index of the button is odd then place it on the right
            switch (i % 2) {
                case 0:
                    pane = new JPanel();
                    pane.setLayout(new BoxLayout(pane, BoxLayout.LINE_AXIS));
                    add(pane);
                case 1:
                    pane.add(createRigidArea(new Dimension(10, 0)));

                default:
                    buttons[i] = new JButton(pageNames[i]);
                    pane.add(buttons[i]);
                    break;
            }
            // this creates a 2 column layout
        }
    }
}
