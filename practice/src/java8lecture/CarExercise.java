package java8lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarExercise {

    private int id;
    private String brand;
    private float price;

    public CarExercise(int id, String brand, float price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<CarExercise> cars = new ArrayList<CarExercise>();
        cars.add(new CarExercise(1, "Brand1", 10000));
        cars.add(new CarExercise(4, "Brand4", 40000));
        cars.add(new CarExercise(5, "Brand5", 50000));
        cars.add(new CarExercise(3, "Brand3", 30000));
        cars.add(new CarExercise(2, "Brand2", 20000));

        List<String> carBrands = cars.stream()
                            .filter((car) -> car.price > 20000)
                            .sorted((car1, car2) -> Integer.compare(car1.id, car2.id))
                            .map((car) -> car.brand)
                            .collect(Collectors.toList());

        carBrands.forEach((carBrand) -> System.out.println(carBrand));

    }
    
}
