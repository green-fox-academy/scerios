package com.webshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebshopController {

  @RequestMapping(value = "/addItem", method = RequestMethod.GET)
  public String items(Model model) {
    model.addAttribute("item", Stock.listOfItems);
    return "webshop-index";
  }
}
