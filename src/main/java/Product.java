public class Product {
    protected String sName;
    protected double dPrice;

    public Product() {
        sName = null;
        dPrice = 0.00;
    }

    public Product(String sName, double dPrice) {
        this.sName = sName;
        this.dPrice = dPrice;
    }

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public double getPrice() {
        return dPrice;
    }

    public void setPrice(double dPrice) {
        this.dPrice = dPrice;
    }
}
