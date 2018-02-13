public class GroceryItemOrder
{
    private String itemName;
    private int quantity = 1;
    private double pricePerUnit;

    public GroceryItemOrder(String itemName, int quantity, double pricePerUnit)
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public void getCost(GroceryItemOrder item) {
        System.out.println("quantity: " + (item.getQuantity()) + "Price: " + (item.pricePerUnit));
}

    @Override
    public String toString() {
        return /*"\nitemName = " + */itemName + "\n"/*+
                "\n quantity = " + quantity +
                "\n totalCost = " + (pricePerUnit*quantity)+ "\n"*/;
    }
}
