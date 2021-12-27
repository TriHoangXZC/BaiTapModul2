package Demo.io_text_csv;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String pathName = "src/Demo/io_text_csv/textAnimal.csv";
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(1, "Dog", 2));
        animalArrayList.add(new Animal(2, "Cat", 1));

        writeFile(animalArrayList, pathName);
        readFile(pathName);
    }

    public static void writeFile(ArrayList<Animal> animalArrayList, String pathName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
            for (Animal animal : animalArrayList) {
                bufferedWriter.write(animal.getId() + ", " + animal.getName() + ", " + animal.getAge() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String pathName) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(pathName));

            while ((line = br.readLine()) != null) {
                String[] strings = line.split(", ");
                System.out.println(strings[0] + ", " + '"' + strings[1] + '"' + ", " + '"' + strings[2] + '"');
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
