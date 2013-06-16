package com.samples.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * <p>
     *     displaying the home page of the admin users
     * </p>
     * @return an instance of {@link ModelAndView} encapsulating the logical view name for admin home page
     */
    @RequestMapping(value = "/admin/welcome",method = RequestMethod.GET)
    public ModelAndView displayAdminWelcomePage(){
        System.out.println(" displaying welcome page for admin users ");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin-home");
        return modelAndView;
    }

    /**
     * <p>
     *     displaying the home page of the all authenticated users upon the successful login
     * </p>
     * @return an instance of {@link ModelAndView} encapsulating the logical view name for admin home page
     */
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public ModelAndView displayUserWelcomePage(){
        System.out.println(" displaying welcome page for all users upon successful login");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("common-welcome");
        return modelAndView;
    }
}
