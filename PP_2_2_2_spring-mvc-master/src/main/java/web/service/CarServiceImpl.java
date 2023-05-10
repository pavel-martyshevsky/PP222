package web.service;

import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();;

    {
        cars.add(new Car("Мерседес", "Синий", 2001));
        cars.add(new Car("Фиат", "Красный", 1999));
        cars.add(new Car("Ауди", "Белая", 2012));
        cars.add(new Car("Москвич", "Чёрный", 1976));
        cars.add(new Car("Лада", "Серая", 2010));
    }

    @Override
    public  List<Car> getCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count < 0 || count > cars.size()) {
            return getCarList();
        } else {
            return getCarList().stream().limit(count).toList();
        }
    }
}
