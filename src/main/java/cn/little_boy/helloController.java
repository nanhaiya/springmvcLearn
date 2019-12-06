package cn.little_boy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器
/*1.开启注解扫描器 2.@Controller把类交给IOC容器处理*/
@Controller
@RequestMapping(path = "/user")
public class helloController {
    /*@RequestMapping 请求映射+ path:请求路径*/
    @RequestMapping(path ="/hello" )
    public String sayHello(){
        System.out.println("hello StringMVC");
        return "success";
        /*跳转success路径*/
    }

    @RequestMapping(value = "/resquestMapping" ,headers = {"Accept"})
    public String resquestMapping(){
        System.out.println("success RequestMapping");
        return "success";
    }
}
