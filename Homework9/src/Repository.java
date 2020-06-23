import java.util.ArrayList;

public interface Repository<T> {

    void save(T t);

    ArrayList<T> getAll();


}
