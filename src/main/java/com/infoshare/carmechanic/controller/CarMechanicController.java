package com.infoshare.carmechanic.controller;

import com.infoshare.carmechanic.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarMechanicController {

    private final List<Car> carList;

    @Autowired
    public CarMechanicController(List<Car> carList) {
        this.carList = carList;

    }
    @GetMapping("/carList")
    public String getCarList(Model model) {
        model.addAttribute("carList", carList);
        return "carlist";
    }
}
