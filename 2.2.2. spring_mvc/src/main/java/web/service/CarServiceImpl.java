package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Camaro", 66));
        carList.add(new Car(2, "Lada", 123));
        carList.add(new Car(3, "Audi", 99));
        return carList;
    }
}
