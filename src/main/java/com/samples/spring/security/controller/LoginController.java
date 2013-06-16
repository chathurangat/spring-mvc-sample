package com.samples.spring.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/auth")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    /***
     * <p>
     *     displaying the login  page for the non-authenticated users
     * </p>
     * @return an instance of {@link ModelAndView} encapsulating the logical view name for login page
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView displayLoginPage(@RequestParam(value = "error",required=false)boolean error){
        System.out.println(" displaying login page");
        logger.info(" displaying login page ");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login-page");
        if(error){
            modelAndView.addObject("loginError","Invalid Username or Password");
        }
        return modelAndView;
    }

    /**
     *  <p>
     *     displaying the access denied page for the user
     * </p>
     * @return an instance of {@link ModelAndView} encapsulating the logical view name for access denied page
     */
    @RequestMapping(value = "/denied")
    public ModelAndView displayAccessDeniedPage(){
        System.out.println(" displaying access denied page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("access-denied-page");
        return modelAndView;
    }
}
