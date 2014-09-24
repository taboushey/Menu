
package menu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Kelsey O'Keefe and Tabetha Boushey
 */
public class MenuFrame extends JFrame {

    public static MenuFrame instance;
    public static int totalPrice = 0;
    public static int waterCount = 0;
    public static int cokeCount = 0;
    public static int spriteCount = 0;
    public static int soupCount = 0;
    public static int saladCount = 0;
    public static int friesCount = 0;
    public static int pastaCount = 0;
    public static int burgerCount = 0;
    public static int fishCount = 0;
    public static int cakeCount = 0;
    public static int cookieCount = 0;
    public static int iceCreamCount = 0;
    
    public static final int MAX_CUSTOMERS = 100;
    public static Customer[] myCustomers;
    public static int numCustomers;

    MenuFrame() {
        super("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w + 70) / 5;
        int y = (dim.height - h) / 6;
        this.setLocation(x, y);
        Container c = getContentPane();
        c.add(LeftPanel.getInstance(), BorderLayout.WEST);
        c.add(RightPanel.getInstance(), BorderLayout.EAST);
        setSize(400, 600);
        setResizable(true);
        setVisible(true);
        myCustomers = new Customer[MAX_CUSTOMERS];
        numCustomers = 0;
    }

    public static MenuFrame getInstance() {
        if (instance == null) {
            instance = new MenuFrame();
        }
        return instance;
    }
    
    }
    
  
