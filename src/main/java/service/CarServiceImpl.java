package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import web.DAO.CarDAO;

public class CarServiceImpl implements CarServise {

    @Autowired
    private CarDAO carDAO = new CarDAO();


    @Override
    public List<Car> show() {
        return carDAO.allCars();
    }

    @Override
    public List<Car> show(int id) {
        List<Car> thisCars = new ArrayList<>();

        if ( carDAO.allCars().size() <= id) {
            return show();
        } else {
            for (int i = 0; i < id; i++) {
                thisCars.add(carDAO.allCars().get(i));
            }
        }
        return thisCars;
    }
}
