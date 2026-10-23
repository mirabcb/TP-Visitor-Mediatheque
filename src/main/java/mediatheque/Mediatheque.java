package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    private void applyVisitor(ItemVisitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }

    public void printCatalog() {
        applyVisitor(new CatalogVisitor());
    }

    public void printOnlyBooks() {
        applyVisitor(new BooksOnlyVisitor());
    }

    public void printOnlyCDs() {
        applyVisitor(new CDsOnlyVisitor());
    }
}
