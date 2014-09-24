
package menu;


import javax.swing.JCheckBox;

/**
 *
 * @author Kelsey O'Keefe and Tabetha Boushey
 */
public class Customer {

    public static String name;
    public static int waterCount;
    public static int cokeCount;
    public static int spriteCount;
    public static int soupCount;
    public static int saladCount;
    public static int friesCount;
    public static int pastaCount;
    public static int burgerCount;
    public static int fishCount;
    public static int cakeCount;
    public static int cookieCount;
    public static int iceCreamCount;

    public Customer (String name, int waterCount, int cokeCount, int spriteCount, int soupCount, int saladCount, int friesCount, int pastaCount,
            int burgerCount, int fishCount, int cakeCount, int cookieCount, int iceCreamCount) {
        this.name = name;
        this.waterCount = waterCount;
        this.cokeCount = cokeCount;
        this.spriteCount = spriteCount; 
        this.soupCount = soupCount;
        this.saladCount = saladCount;
        this.friesCount = friesCount;
        this.pastaCount = pastaCount;
        this.burgerCount = burgerCount;
        this.fishCount = fishCount;
        this.cakeCount = cakeCount;
        this.cookieCount = cookieCount;
        this. iceCreamCount = iceCreamCount;
  
        
    }
    
    public String getName() {
        return name;
    }
    public int getWaterCount() {
        return waterCount;
    }
    public int getCokeCount() {
        return cokeCount;
    }
    public int getSpriteCount() {
        return spriteCount;
    }
    public int getSoupCount() {
        return soupCount;
    }
    public int getSaladCount() {
        return saladCount;
    }
    public int getFriesCount() {
        return friesCount;
    }
    public int getPastaCount() {
        return pastaCount;
    }
    public int getBurgerCount() {
        return burgerCount;
    }
    public int getFishCount() {
        return fishCount;
    }
    public int getCakeCount() {
        return cakeCount;
    }
    public int getCookieCount() {
        return cookieCount;
    }
    public int getIceCreamCount() {
        return iceCreamCount;
    }

    

    public static void print() {
        
        if (MenuFrame.waterCount > 0){
        System.out.println("Number of Waters: " + MenuFrame.waterCount);
        } 
        if (MenuFrame.cokeCount > 0){
        System.out.println("Number of Cokes: " + MenuFrame.cokeCount);
        } 
        if (MenuFrame.spriteCount > 0){
        System.out.println("Number of Sprites: " + MenuFrame.spriteCount);
        } 
        if (MenuFrame.soupCount > 0){
        System.out.println("Number of Soups: " + MenuFrame.soupCount);
        } 
        if (MenuFrame.saladCount > 0){
        System.out.println("Number of Salads: " + MenuFrame.saladCount);
        } 
        if (MenuFrame.friesCount > 0){
        System.out.println("Number of Fries: " + MenuFrame.friesCount);
        } 
        if (MenuFrame.pastaCount > 0){
        System.out.println("Number of Pastas: " + MenuFrame.pastaCount);
        } 
        if (MenuFrame.burgerCount > 0){
        System.out.println("Number of Burgers: " + MenuFrame.burgerCount);
        } 
        if (MenuFrame.fishCount > 0){
        System.out.println("Number of Fish: " + MenuFrame.fishCount);
        } 
        if (MenuFrame.cakeCount > 0){
        System.out.println("Number of Cakes: " + MenuFrame.cakeCount);
        } 
        if (MenuFrame.cookieCount > 0){
        System.out.println("Number of Cookies: " + MenuFrame.cookieCount);
        } 
        if (MenuFrame.iceCreamCount > 0){
        System.out.println("Number of Ice Creams: " + MenuFrame.iceCreamCount);
        }
        
        

    }
}
