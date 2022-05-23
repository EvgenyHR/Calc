
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class main {
    private JFrame window;

    public main(){
        window = new JFrame("Calculator");
        window.setSize(265, 347);
        window.add(new Panel());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new main();
            }
        });
    }
}
