package QuanLyNhanVien;

public interface Manage<T> {
    void add(T t);
    T search();
    void print();
    void update(String name ,T t);
    void delete(String name);
}
