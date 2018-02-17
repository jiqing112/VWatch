package dev.web;

import dev.dto.LoginResult;
import dev.dto.RegisterResult;
import dev.entity.User;
import dev.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger Log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        Log.info("web:register");
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String checkRegister(
            @Validated User user,
            BindingResult br){

        Log.info("web:check register");
        if (br.hasErrors()){
            return "register";
        }

        boolean isUserNameExist = this.userService.checkUserNameIsExist(user.getUserName());
        // 如果用户名已存在，返回添加用户的页面
        if (isUserNameExist) {
            // 向BindingResult添加用户已存在的校验错误
            br.rejectValue("userName", "该用户名已存在", "该用户名已存在");
            return "register";
        }

        this.userService.register(user);
        return "welcome";
    }
    



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new User());
        return mav;
    }
    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
                                     @ModelAttribute("user") User user) {
        ModelAndView mav = null;
        LoginResult loginResult = userService.login(user);
        if (loginResult.getSuccess()) {
            mav = new ModelAndView("welcome");
            mav.addObject("userName", user.getUserName());
        } else {
            mav = new ModelAndView("login");
            mav.addObject("message", loginResult.getMsg());
        }
        return mav;
    }


}






