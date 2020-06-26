package App;
import java.util.ArrayList;
import java.util.List;

public interface Repository<T> {

    void save(T t);

   List<T> getAll();


}
