// import javax.swing.BorderFactory;
// import javax.swing.JPanel;
// import java.awt.Dimension;
// import java.awt.Color;
// import java.awt.event.*;
// import java.awt.GridLayout;
public class App {
    public static void main(String[] args) throws Exception {
       Form form = new Form();
       Label label= new Label();
       Panel panel = new Panel();                           

       label.init();
       panel.init();      
       panel.add(label);
             
       form.add(panel);
       form.init();
     
      
    }
}
