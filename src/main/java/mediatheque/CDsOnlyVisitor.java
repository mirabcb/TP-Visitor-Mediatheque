package mediatheque;

public class CDsOnlyVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        // On ignore les livres.
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}