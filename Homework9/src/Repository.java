import java.util.ArrayList;

public interface Repository<T> {

    void save(T c);

    ArrayList<T> getAll();


}
