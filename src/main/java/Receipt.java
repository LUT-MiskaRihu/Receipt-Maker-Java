import java.util.ArrayList;

public class Receipt {
    private int iID;
    private String sTitle;
    private double dDiscountPercentage;
    private ArrayList<Item> alItems;

    public Receipt() {
        iID = 0;
        sTitle = null;
        dDiscountPercentage = 0;
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

    public double getDiscountPercentage() {
        return dDiscountPercentage;
    }

    public void setDiscountPercentage(double dDiscountPercentage) {
        this.dDiscountPercentage = dDiscountPercentage;
    }
}
