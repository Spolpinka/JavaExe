package JavaExe;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader("Анализ ответов приставов");
        r.setLocation(450, 150);
        r.setVisible (true);
        r.setFocusableWindowState(true);
        r.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        r.setSize(400, 500);

    }
}