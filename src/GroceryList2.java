import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList2
{
        public ArrayList<GroceryItemOrder> groceryArraylist;

        private int totalGrocerys = 0;
        private double totalCost;

        public int getTotalGrocerys()
        {
            return totalGrocerys;
        }

        public GroceryList2()
        {

            groceryArraylist = new ArrayList<GroceryItemOrder>();
        }

        public void add (GroceryItemOrder item) {
            if (totalGrocerys < 10) {
                groceryArraylist.add(item);
                totalGrocerys++;
            }
        }
        public void getTotalCost() {
            for (int i = 0; i < this.totalGrocerys ; i++)
            {
                totalCost = totalCost + (groceryArraylist.get(i).getPricePerUnit()*groceryArraylist.get(i).getQuantity());
            }
            System.out.println(totalCost);
        }

        @Override
        public String toString()
        {
            return groceryArraylist +"";
        }
}
