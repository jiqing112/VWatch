package dev.web;

import dev.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/testerror")
    public String testError() throws Exception{

        if(true) {
            throw new CustomException("自定义异常");
        }

        return "";
    }
}
