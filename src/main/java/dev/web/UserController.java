package dev.web;

import dev.entity.User;
import dev.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger Log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, Integer offset, Integer limit) {
        Log.info("invoke----------/user/list");
        offset = offset == null ? 0 : offset;
        limit = limit == null ? 50 : limit;
        List<User> list = userService.getUserList(offset, limit);
        model.addAttribute("userlist", list);
        return "userlist";
    }

}
