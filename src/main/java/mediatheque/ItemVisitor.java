
package mediatheque;

public interface ItemVisitor {
    void visit(Book book);
    void visit(CD cd);
}
