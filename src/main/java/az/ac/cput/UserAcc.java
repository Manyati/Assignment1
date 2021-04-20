package az.ac.cput;


/**
 * Author: Sanele Ngwenya
 * No.: 216019699
 * Group: PT
 */
public class UserAcc {
    private String id;

    public UserAcc(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        UserAcc userAcc = (UserAcc) object;
        return java.util.Objects.equals(id, userAcc.id);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}
