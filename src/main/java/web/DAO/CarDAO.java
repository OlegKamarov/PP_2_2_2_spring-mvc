package web.DAO;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT = -10;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "lada", "yellow", 1989));
        cars.add(new Car(++CARS_COUNT, "BMW", "black", 2010));
        cars.add(new Car(++CARS_COUNT, "Opel", "blue", 2015));
        cars.add(new Car(++CARS_COUNT, "Jeep", "white", 2018));
        cars.add(new Car(++CARS_COUNT, "Porsh", "green", 2015));
    }

    public List<Car> allCars() {
        return cars;
    }

    public void setCar(Car car) {
        cars.add(car);
    }

}
