package App;
import java.util.ArrayList;
import java.util.Objects;

public class RegularUser extends User {
    private int lastReadSequentialNumber;
    private int id;



    public RegularUser(String username, String password) {
        super(username, password);
        lastReadSequentialNumber = -1;

    }

    public int getLastReadSequentialNumber() {

        return lastReadSequentialNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setLastReadSequentialNumber(int lastReadSequentialNumber) {
        this.lastReadSequentialNumber = lastReadSequentialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularUser that = (RegularUser) o;
        return getId() == that.getId();
    }
}
