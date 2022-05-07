import java.util.ArrayList;

public class Receipt {
    private int iID;
    private String sTitle;
    private int iDiscountPercentage;
    private ArrayList<Item> alItems;

    public Receipt() {
        iID = 0;
        sTitle = null;
        iDiscountPercentage = 0;
        alItems = new ArrayList<>();
    }

    public int getID() {
        return iID;
    }

    public void setID(int iID) {
        this.iID = iID;
    }

    public String getTitle() {
        return sTitle;
    }

    public void setTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public int getDiscountPercentage() {
        return iDiscountPercentage;
    }

    public void setDiscountPercentage(int iDiscountPercentage) {
        this.iDiscountPercentage = iDiscountPercentage;
    }

    public void addItem(Item item) {
        try {
            alItems.add(item);
            System.out.println("Item was added.");
        } catch (Exception e) {
            System.err.println("Item was not added: " + e);
        }
    }

    public void removeItem(Item item) {
        try {
            alItems.remove(item);
            System.out.println("Item was removed.");
        } catch (Exception e) {
            System.err.println("Item was not remover: " + e);
        }
    }

    public void removeItem(int iIndex) {
        try {
            alItems.remove(iIndex);
            System.out.println("Item was removed.");
        } catch (Exception e) {
            System.err.println("Item was not remover: " + e);
        }
    }

    public Item getItem(int iIndex) {
        Item item = null;
        try {
            item = alItems.get(iIndex);
            System.out.println("Item found.");
        } catch (Exception e) {
            System.err.println("Item not found: " + e);
        }
        return item;
    }

    public double getSubtotalValue() {
        double dSubtotal = 0;
        for (Item item : alItems) {
            dSubtotal += item.getTotal();
        }
        return dSubtotal;
    }

    public double getDiscountValue() {
        float fDiscountMultiplier = 1 - ((float) iDiscountPercentage / 100);
        return getSubtotalValue() * fDiscountMultiplier;
    }

    public double getTotal() {
        return getSubtotalValue() - getDiscountValue();
    }
}
