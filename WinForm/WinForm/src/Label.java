
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Label extends JLabel{
    public void init(){
        setText("Hello World!! ");                        
        setForeground(Color.white);        
        setFont(new Font("Console", Font.PLAIN,25));        
        Dimension size = getPreferredSize();
        setBounds(200, 250, size.width, size.height);                
    }
}
