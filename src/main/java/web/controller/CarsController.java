package web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;
import web.DAO.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    private CarDAO carDAO = new CarDAO();
    private CarServiceImpl carService = new CarServiceImpl();

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String listCar(@RequestParam(value = "count", required = false) String id,
                          ModelMap model) {
        if (id != null) {
            model.addAttribute("car", carService.show(Integer.parseInt(id)));
        } else {
            model.addAttribute("car", carService.show());
        }
        return "cars";
    }

}
