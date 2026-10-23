package mediatheque;

public class BooksOnlyVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {
        // On ignore les CD.
    }
}