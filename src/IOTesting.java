import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOTesting {
    public static void readCars(String directory, String filename) {
        Path carsPath = Paths.get(directory, filename);
        List<String> carList = new ArrayList<>();
        try {
            carList = Files.readAllLines(carsPath);
            for (int i = 0; i < carList.size(); i += 1) {
                System.out.println((i + 1) + ": " + carList.get(i));
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void addCars(String input, String directory, String filename) {
        try {
            Files.write(
                    Paths.get(directory, filename),
                    Arrays.asList(input),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceCars(String oldCar, String newCar, String directory, String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(directory, filename));
            List<String> newList = new ArrayList<>();
            for (String line : lines) {
                if (line.equals(oldCar)) {
                    newList.add(newCar);
                    continue;
                }
                newList.add(line);
            }
            Files.write(Paths.get("data", "cars.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readCars("data", "cars.txt");
        addCars("Toyota", "data", "cars.txt");
        readCars("data", "cars.txt");
        replaceCars("VW", "Lexus", "data", "cars.txt");
        readCars("data", "cars.txt");
    }
}
