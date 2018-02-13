import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHandler
{
    public void writerList1(GroceryList2 newOrder) throws FileNotFoundException
    {
        try
        {
            PrintWriter writer = new PrintWriter("GroceryList.txt", "iso-8859-1");
            writer.write(newOrder.toString());
            writer.close();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void readerList() throws Exception
    {
        FileReader fr = new FileReader("GroceryList.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}


