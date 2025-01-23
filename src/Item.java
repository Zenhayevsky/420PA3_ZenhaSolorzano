public class Item {
    private String iName;
    private double iPrice;

    public String getName() {
        return iName;
    }

    public void setName(String iName) {
        this.iName = iName;
    }

    public double getPrice() {
        return iPrice;
    }

    public void setPrice(double iPrice) {
        this.iPrice = iPrice;
    }

    public Item() {
        this.iName = "Not defined";
        this.iPrice = 0;
    }

    public Item(String name, double price) {
        this.iName = name;
        this.iPrice = price;
    }
}
