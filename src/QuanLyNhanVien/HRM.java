package QuanLyNhanVien;

public class HRM implements Manage<Staff>{
    private Staff[] staff1 = new Staff[10];
    private int size = 0;

    @Override
    public void add(Staff staff) {
        staff1[size]= staff;
        size++;

    }

    @Override
    public Staff search() {
        return null;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(staff1[i]);
        }

    }

    @Override
    public void update(String name, Staff staff) {

    }

    @Override
    public void delete(String name) {

    }
}
