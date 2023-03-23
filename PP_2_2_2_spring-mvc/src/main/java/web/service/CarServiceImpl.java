package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("model1", 11),
            new Car("model2", 22),
            new Car("model3", 33),
            new Car("model4", 44),
            new Car("model5", 55)
    ));
    @Override
    public List<Car> listCars(int count) {
        if (count <= 5 && count >= 1){
            return cars.subList(0, count);
        } else {
            return cars;
        }

    }

}
