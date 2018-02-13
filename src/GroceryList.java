import java.util.Arrays;

public class GroceryList
{
    public GroceryItemOrder[] groceryArray;

    private int totalGrocerys = 0;
    private double totalCost;

    public int getTotalGrocerys()
    {
        return totalGrocerys;
    }

    public GroceryList()
    {

        groceryArray = new GroceryItemOrder[10];
    }

    public void add (GroceryItemOrder item) {
        if (totalGrocerys < 10) {
            groceryArray[totalGrocerys] = item;
            totalGrocerys++;
        }
    }
    public void getTotalCost() {
        for (int i = 0; i < this.totalGrocerys ; i++)
        {
            totalCost = totalCost + (groceryArray[i].getPricePerUnit()*groceryArray[i].getQuantity());
        }
        System.out.println(totalCost);
    }

    @Override
    public String toString()
    {
        return "groceryArray=" + Arrays.toString(groceryArray);
    }
}
