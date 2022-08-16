package service;

import model.Car;
import java.util.List;

public interface CarServise {

        public List<Car> show();

        public List<Car> show(int id);
}
