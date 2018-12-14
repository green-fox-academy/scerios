package pirates.club.pirates.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pirates.club.pirates.services.PirateRepository;

@Controller
public class MainController {

  @RequestMapping("/")
  public String getInfo(Model model) {
    model.addAttribute("pirate", PirateRepository.getInstance().getPiratesRepo());
    return "index";
  }
}
