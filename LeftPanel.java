
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
public class LeftPanel extends JPanel {

    public static LeftPanel inst;
    public static JTextField nameField, drinkField, entreeField; // Name and Price
    public static JCheckBox water, coke, sprite; // Drinks
    public JCheckBox soup, salad, fries; // Appetizers
    public static JCheckBox pasta, burger, fish; // Entrees
    public JCheckBox cake, cookie, iceCream; // Desserts
    public JButton doneButton;
    public static int waterCount;
    public static int cokeCount;
    public static int spriteCount;
    public static int pastaCount;
    public static int burgerCount;
    public static int fishCount;

    LeftPanel() {
        this.setLayout(new GridLayout(11, 6));
        this.add(new JLabel("Name:"));
        this.add(new JLabel("Drink:"));
        water = new JCheckBox("Water"); // Drink (1)
        water.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 0;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.waterCount = MenuFrame.waterCount + 1;
            }
        });
        this.add(water);
        coke = new JCheckBox("Coke: $3.00"); // Drink (2)
        coke.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 3;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.cokeCount = MenuFrame.cokeCount + 1;
            }
        });
        this.add(coke);
        sprite = new JCheckBox("Sprite: $3.00"); // Drink (3)
        sprite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 3;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.spriteCount = MenuFrame.spriteCount + 1;
            }
        });
        this.add(sprite);
        this.add(new JLabel("Entree:"));
        pasta = new JCheckBox("Pasta: $10.00"); // Entree (1)
        pasta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 10;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.pastaCount = MenuFrame.pastaCount + 1;
            }
        });
        this.add(pasta);
        burger = new JCheckBox("Burger: $7.00"); // Entree (2)
        burger.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 7;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.burgerCount = MenuFrame.burgerCount + 1;
            }
        });
        this.add(burger);
        fish = new JCheckBox("Fish: $12.00"); // Entree (3)
        fish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.totalPrice = MenuFrame.totalPrice + 12;
                RightPanel.priceField.setText(MenuFrame.totalPrice + "");
                MenuFrame.fishCount = MenuFrame.fishCount + 1;
            }
        });
        this.add(fish);
        this.add(new JLabel("Price:"));
//priceField.addActionListener(new CustomerPanel.NewTextFieldValue()); 
        this.setVisible(true);

        doneButton = new JButton("Done");
        doneButton.addActionListener(new DonePressed());
        add(doneButton);

    }

    public static LeftPanel getInstance() {
        if (inst == null) {
            inst = new LeftPanel();
        }
        return inst;
    }

    private class DonePressed
            implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Done button was pressed by " + menu.RightPanel.nameField.getText() +  ", your total price is $" + MenuFrame.totalPrice + ".00");
            Customer newCustomer = new Customer(menu.RightPanel.name,
                    menu.LeftPanel.waterCount,
                    menu.LeftPanel.cokeCount,
                    menu.LeftPanel.spriteCount,
                    menu.RightPanel.soupCount,
                    menu.RightPanel.saladCount,
                    menu.RightPanel.friesCount,
                    menu.LeftPanel.pastaCount,
                    menu.LeftPanel.burgerCount,
                    menu.LeftPanel.fishCount,
                    menu.RightPanel.cakeCount,
                    menu.RightPanel.cookieCount,
                    menu.RightPanel.iceCreamCount);
            MenuFrame.myCustomers[MenuFrame.numCustomers] = newCustomer;
            MenuFrame.totalPrice = MenuFrame.totalPrice = 0;

            menu.RightPanel.clearFields();
            menu.LeftPanel.clearFields();
            
        }
    }

    public static void clearFields() {
        water.setSelected(false);
        coke.setSelected(false);
        sprite.setSelected(false);
        pasta.setSelected(false);
        burger.setSelected(false);
        fish.setSelected(false);
    }
}
