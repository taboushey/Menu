
package menu;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Kelsey O'Keefe and Tabetha Boushey
 */
public class RightPanel extends JPanel {

    public static RightPanel inst;
    public static String name;
    public static JTextField nameField, appetizerField, dessertField;
    public static JTextField priceField; // Name and Price
    public JCheckBox water, coke, sprite; // Drinks
    public static JCheckBox soup, salad, fries; // Appetizers
    public JCheckBox pasta, burger, fish; // Entrees
    public static JCheckBox cake, cookie, iceCream; // Desserts
    public JButton orderButton;
    public static int soupCount;
    public static int saladCount;
    public static int friesCount;
    public static int cakeCount;
    public static int cookieCount;
    public static int iceCreamCount;

    RightPanel() {
        this.setLayout(new GridLayout(11, 6));
        nameField = new JTextField(15);
        
//nameField.addActionListener(new ActionListener());
        this.add(nameField);
        this.add(new JLabel("Appetizer:"));
        soup = new JCheckBox("Soup: $4.00"); // Appetizer (1)
        soup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 4;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.soupCount = MenuFrame.soupCount + 1;

            }
        });
        this.add(soup);
        salad = new JCheckBox("Salad: $4.00"); // Appetizer (2)
        salad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 4;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.saladCount = MenuFrame.saladCount + 1;
            }
        });
        this.add(salad);
        fries = new JCheckBox("Fries: $3.00"); // Appetizer (3)
        fries.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 3;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.friesCount = MenuFrame.friesCount + 1;
            }
        });
        this.add(fries);
        this.add(new JLabel("Dessert:"));
        cake = new JCheckBox("Cake: $11.00"); // Dessert (1)
        cake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 11;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.cakeCount = MenuFrame.cakeCount + 1;
            }
        });

        this.add(cake);
        cookie = new JCheckBox("Cookie: $5.00"); // Dessert (2)
        cookie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 5;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.cookieCount = MenuFrame.cookieCount + 1;
            }
        });
        this.add(cookie);
        iceCream = new JCheckBox("Ice Cream: $7.00");// Dessert (3)
        iceCream.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 7;
                priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.iceCreamCount = MenuFrame.iceCreamCount + 1;
            }
        });
        this.add(iceCream);
//this.add(new JLabel("Price:"));
        priceField = new JTextField();
        priceField.setEditable(false);
//priceField.addActionListener(new CustomerPanel.NewTextFieldValue());
        this.add(priceField);
        this.setVisible(true);
        
        orderButton = new JButton("Order");
        orderButton.addActionListener( new OrderPressed());
        add(orderButton);
    }

    public static RightPanel getInstance() {
        if (inst == null) {
            inst = new RightPanel();
        }
        return inst;
    }
    
     private class OrderPressed
            implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Order button was pressed.");
            

            menu.Customer.print();

            menu.RightPanel.clearFields();
            menu.LeftPanel.clearFields();
        }
     }

    public static void clearFields() {
        nameField.setText("");
        soup.setSelected(false);
        salad.setSelected(false);
        fries.setSelected(false);
        cake.setSelected(false);
        cookie.setSelected(false);
        iceCream.setSelected(false);
        priceField.setText("");
    }
}
