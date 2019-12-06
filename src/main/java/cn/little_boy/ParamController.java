package cn.little_boy;

import cn.domain.Account;

import cn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 请求参数绑定
*
* */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(value = "/testParam",params = "username")
    public String testParam(String username){
        System.out.println("执行了");
        System.out.println("用户名："+username);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
/*自定义类型转换器*/
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }
}
