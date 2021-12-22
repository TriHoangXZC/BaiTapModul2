package MinitestNgay16Thang12.ByMe;

import java.util.ArrayList;

public interface PersonManagerInterface {
    void displayPerson(ArrayList<Person> personArrayList);

    void addPerson(ArrayList<Person> personArrayList,Person person);

    Person searchById(ArrayList<Person> personArrayList, int id);

    Person deletePersonById(ArrayList<Person> personArrayList, int id);


    Person editInformationById(ArrayList<Person> personArrayList, int id);


    void sortByAveragePoint(ArrayList<Person> personArrayList);

    double totalAveragePoint(ArrayList<Person> personArrayList);

    double totalAverage(ArrayList<Person> personArrayList);
}
