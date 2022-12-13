package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implement an interface and extend a panel.
// JPanel is a class not an interface.
// make a special JPanel class
// now we inherit all JPanel code inside the GUIPanel code. (use all variables and functions from JPanel)
// GUIPanel is a JPanel.
// JPanel is the base class
//GUIPanel is the derived class
public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private JButton maxlat;

    private Database db; // the zipcode database
// add panel to frame
    // add text field to the panel.
    public GUIPanel() {
        this.zipcode = new JTextField("zipcode",7);
        this.add(this.zipcode); // add text field to the panel.
        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());
        this.maxlat = new JButton("Northernmost");
        this.add(this.maxlat);
        this.maxlat.addActionListener(new MaxButtonListener());

        this.output = new JTextArea(5,20);
        this.add(this.output);

        this.db = new Database(); // load zipcodes

        // add event handler to the submit button
        // event is an object that represents a mouse click, button press, key press etc

    }
    class SubmitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when user presses submit.
            // get zipcode out of the text field.

            String code = zipcode.getText();
           Zipcode zc = db.search(code);
           WeatherObservation wob = zc.getWeatherData();
           output.setText(wob.toString());


        }

    }
    class MaxButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Zipcode zc = db.getNorthern();
            output.setText(zc.toString());

        }
    }
}
