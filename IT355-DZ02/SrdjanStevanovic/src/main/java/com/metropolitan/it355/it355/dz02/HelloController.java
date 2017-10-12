package com.metropolitan.it355.it355.dz02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Ovo je drugi domaći iz predmeta IT355");
// hello.jsp
        return "hello";
    }
}
