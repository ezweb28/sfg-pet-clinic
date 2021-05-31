package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet", "/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {
        return "vets/index";
    }
}
