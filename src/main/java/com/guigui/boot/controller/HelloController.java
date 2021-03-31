package com.guigui.boot.controller;

import com.guigui.boot.util.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
    @RequestMapping("/404")
    public String error() throws Exception {
        throw new Exception("gg");
    }
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生自定义的错误");
    }
}
