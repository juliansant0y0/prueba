package ventana;
import javax.swing.JFrame;
public class Ventana {
    public static void main(String[] args) {
        Ventana2 w2 = new Ventana2();
        w2.setTitle("Ventana principal");
        //w2.setSize(500, 400);
        w2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //w2.setLocationRelativeTo(null);
        w2.setVisible(true);
        w2.setBounds(100, 100, 500, 200);
    }    
}
