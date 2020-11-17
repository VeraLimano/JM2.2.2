package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String sumCar(@RequestParam(value = "count", defaultValue = "5") int x, Model model){

        Car car1 = new Car("BMW", "black", 178);
        Car car2 = new Car("Audi", "white", 200);
        Car car3 = new Car("Bentli", "pink", 155);
        Car car4 = new Car("Ferrari", "green", 180);
        Car car5 = new Car("Jaguar", "red", 190);

        List <Car> listCar = new ArrayList<>();

        if (x == 1) {
            listCar.add(car1);
        }
        else if (x == 2) {
            listCar.add(car1);
            listCar.add(car2);
        }
        else if (x == 3) {
            listCar.add(car1);
            listCar.add(car2);
            listCar.add(car3);
        }
        else if (x == 4) {
            listCar.add(car1);
            listCar.add(car2);
            listCar.add(car3);
            listCar.add(car4);
        }
        else if (x > 4) {
            listCar.add(car1);
            listCar.add(car2);
            listCar.add(car3);
            listCar.add(car4);
            listCar.add(car5);
        }

        model.addAttribute("result", listCar);
        return "cars";
    }
}

