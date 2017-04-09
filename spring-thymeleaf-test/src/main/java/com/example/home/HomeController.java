package com.example.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @author 乔克叔叔
 *
 */
@Controller
class HomeController {

    @GetMapping("/")
    String index(Model model) {
        return "index";
    }

    @GetMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }
}
