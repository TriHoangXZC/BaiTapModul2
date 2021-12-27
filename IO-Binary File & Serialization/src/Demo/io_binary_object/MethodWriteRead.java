package Demo.io_binary_object;

import java.io.*;
import java.util.ArrayList;

public class MethodWriteRead {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\PC\\Desktop\\Modul2\\IO-Binary File & Serialization\\src\\Demo\\io_binary_object\\testFile";

        try {
            ArrayList<Animal> animalArrayList = readFile(pathName);
            animalArrayList.add(new Animal("abc", 12));
            animalArrayList.add(new Animal("xyz", 15));

            writeFile(animalArrayList, pathName);
            ArrayList<Animal> animalArrayList1 = readFile(pathName);
            animalArrayList1.forEach(System.out::println);
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    public static void writeFile(ArrayList<Animal> animalArrayList, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(animalArrayList);
        objectOutputStream.close();
    }

    public static ArrayList<Animal> readFile(String pathName) {
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
            animalArrayList = (ArrayList<Animal>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
        return animalArrayList;
    }
}
