
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Machi extends JFrame {

    public Machi() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(400, 600);

        setTitle("Machi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Machi ex = new Machi();
            ex.setVisible(true);
        });
    }
}
