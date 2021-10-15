package QuanLyNhanVien;

public class Staff extends PeoPle {
    private String position ;

    public Staff(String name, int id, int age, String position) {
        super(name, id, age);
        this.position = position;
    }

    public Staff(String position) {
        this.position = position;
    }

    public Staff() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "position='" + position + '\'' +
                '}';
    }
}
