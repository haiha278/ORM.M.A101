package fa.education.dao;

import java.util.ArrayList;

public abstract class Dao<T> {
    public abstract T getById(int id);
    public abstract ArrayList<T> getAll();
    public abstract boolean updateById(T object);
    public abstract boolean deleteById(T object);
    public abstract boolean insert(T object);

}
