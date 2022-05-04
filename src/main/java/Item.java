public class Item extends Product {
    private int iCount;
    private int iDiscountPercentage;

    public Item() {
        super();
        iCount = 0;
        iDiscountPercentage = 0;
    }

    public Item(String sName, double dPrice, int iCount, int iDiscountPercentage) {
        super(sName, dPrice);
        this.iCount = iCount;
        this.iDiscountPercentage = iDiscountPercentage;
    }

    public int getCount() {
        return iCount;
    }

    public void setCount(int iCount) {
        this.iCount = iCount;
    }

    public int getDiscountPercentage() {
        return iDiscountPercentage;
    }

    public void setDiscountPercentage(int iDiscountPercentage) {
        this.iDiscountPercentage = iDiscountPercentage;
    }

    /**
     * Calculates the discount in units of currency for one piece.
     * @return discount in units of currency for one piece
     */
    public double getDiscountValue() {
        float fDiscountMultiplier = 1 - ((float) iDiscountPercentage / 100);
        return dPrice * fDiscountMultiplier;
    }

    /**
     * Calculates the total price before discount.
     * @return total price before discount
     */
    public double getTotalPrice() {
        return iCount * dPrice;
    }

    /**
     * Calculates the total discount in units of currency.
     * @return total discount in units of currency
     */
    public double getTotalDiscountValue() {
        double dDiscountValue = getDiscountValue();
        return dDiscountValue * iCount;
    }

    /**
     * Calculates the final value of this set of items.
     * @return final price = total price - total discount
     */
    public double getTotal() {
        double dTotalPrice = getTotalPrice();
        double dTotalDiscount = getTotalDiscountValue();
        return dTotalPrice - dTotalDiscount;
    }
}
