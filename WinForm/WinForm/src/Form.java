import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Form extends JFrame{
    public void init(){
        setTitle("Hello WinForm By Java!!");                
        setSize(600,600);                    
        setVisible(true);
        setResizable(true); 
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
    }
}
