package com.spring.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dinesh on 5/9/17.
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView indexPage() {
        ModelAndView modelAndView = new ModelAndView("/views/index");
        modelAndView.addObject("name", "user");
        return modelAndView;
    }
}
