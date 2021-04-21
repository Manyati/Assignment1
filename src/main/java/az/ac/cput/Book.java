package az.ac.cput;

/**
 * @author anongxa
 * Student No:204513723
 */

public class Book {

    private String id;

    public Book(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return java.util.Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}
