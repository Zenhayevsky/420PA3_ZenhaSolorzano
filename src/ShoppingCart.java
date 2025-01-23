import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    public boolean removeItem(String name) {
        for (Item i : items) {
            if (i.getName().equals(name)) {
                items.remove(i);
                return true;
            }
        }
        System.out.println("Item not found in the shopping cart.");
        return false;
    }

    public double totalPrice() {
        double sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }

}
