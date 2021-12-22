package MinitestNgay16Thang12.ByCoachQuanLe;

public interface Manager {
    void displayAll();

    void addHuman(Human human);

    Human searchById(int id);

    Human deleteById(int id);

    Human updateById(int id);

    void sortByAveragePoint();

    double totalAveragePoint();
}
