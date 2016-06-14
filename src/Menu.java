import javax.swing.*;
import java.awt.*;

class Menu {
    private String title;
    private JFrame mainFrame;
    private String[] pageNames;

    // Constructs the components for the menu
    // Pass through the page names to make it more dynamic
    Menu(String title, String[] pageNames) {
        // Construct the object
        this.title = title;
        this.pageNames = pageNames;

        // Create the base elements of the GUI: JFrame and panel
        createBaseGui();

        // Loop though each of the page names and add a button for each
        addComponents(mainFrame.getContentPane());

        // Finally make the menu visible
        // mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void createBaseGui(){
        // Give the app the tile that's in the object
        mainFrame = new JFrame(title);
        // Set the size of the app
        mainFrame.setSize(500,500);
        // Kill the app when the user closes it
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addAButton(String text, float alignment, Container pane){
        // Creates an array of the buttons so they can be added to menuButtonPanel later
        JButton newButton = new JButton(text);
        newButton.setAlignmentX(alignment);
        pane.add(newButton);
    }

    // Creates the buttons for each page and adds them to the menuButtonPanel
    private void addComponents(Container pane){
        // Add a box layout to organise all the components
        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
        // Header label is created based on the title passed through
        JLabel header = new JLabel(title,JLabel.CENTER);
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        pane.add(header);

        for (int i = 0; i < pageNames.length; i++) {
            // if the index of the button is even then place it on the left
            if (i % 2 == 1) {
                addAButton(pageNames[i], Component.LEFT_ALIGNMENT, pane);
            }
            // if the index is odd then place it on the right
            else addAButton(pageNames[i], Component.RIGHT_ALIGNMENT, pane);
            // this creates a 2 column layout
        }
    }
}
