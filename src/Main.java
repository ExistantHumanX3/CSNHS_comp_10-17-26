import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main {

    public static final JFrame frame = new JFrame("Shopping Aplication");

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        Sets up the window
        setup();

//        Updates variables
        update();

//        Draws the screen
        draw();

    }

    private static void update() {

    }

    private static void draw() {

    }

    private static void setup() {
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // TEMPORARY
        list.add("Sword");
        list.add("Plate armor");
        list.add("Chain Mail");
        list.add("Cooking Pot");

        JMenuBar menuBar = new JMenuBar();
        JMenu todo = new JMenu("TODO:");
        for (var s : list.toArray()) {
            JMenuItem temp = new JMenuItem((String)s);
            todo.add(temp);
        }

        menuBar.add(todo);
        frame.setJMenuBar(menuBar);



        frame.setVisible(true);
    }
}