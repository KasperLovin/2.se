public class Test
{
    public static void main(String[] args)
    {
    GroceryList2 test = new GroceryList2();

    GroceryItemOrder milk = new GroceryItemOrder("Milk", 2, 9.95);
    GroceryItemOrder coffee = new GroceryItemOrder("Coffee",1, 14.95);
    GroceryItemOrder bacon = new GroceryItemOrder("Bacon",3, 17.50);
    GroceryItemOrder babyFood = new GroceryItemOrder("Baby food",8, 8.95);
    GroceryItemOrder sugar = new GroceryItemOrder("Sugar",1, 19.95);
    GroceryItemOrder bread = new GroceryItemOrder("Bread", 4, 4.95);
    GroceryItemOrder beer = new GroceryItemOrder("Beer",30, 3.25);
    GroceryItemOrder wine = new GroceryItemOrder("Wine",2, 75.50);
    GroceryItemOrder soda = new GroceryItemOrder("Soda",1, 17.95);
    GroceryItemOrder icecream = new GroceryItemOrder("Icecream",2, 59.95);
    GroceryItemOrder newLife = new GroceryItemOrder("A new life",1, .95);

    test.add(milk);
    test.add(coffee);
    test.add(bacon);
    test.add(babyFood);
    test.add(sugar);
    test.add(bread);
    test.add(beer);
    test.add(wine);
    test.add(soda);
    test.add(icecream);

    try
    {
            new FileHandler().writerList1(test);
    }
    catch (Exception e)
    {
        e.getMessage();
    }
        System.out.println(test);
    test.getTotalCost();

    try
        {
        new FileHandler().readerList();
        }
        catch (Exception e)
        {
       e.getMessage();
        }
    }
}
