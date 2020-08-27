package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }


    //@RequestParam(value = "locale", required = false) String locale
    @GetMapping("/cars")
    public String getCar(HttpServletRequest request,
                         Model model){

        String title;

        switch (request.getParameter("locale")){
            case "en":
                title = "CARS";
                break;
            case "ru":
                title = "МАШИНЫ";
                break;
            default:
                title = "CARS";
                break;
        }

        model.addAttribute("title", title);
        model.addAttribute("messagecars", carService.listCars());
        return "cars";
    }

}
