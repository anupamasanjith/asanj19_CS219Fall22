package ZipCodeDB;


import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);
        // when the user clicks x on title bar also stop running main program.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();// makes JFrame the size of the internal components

    }
}
