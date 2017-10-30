package com.ygy.con;

import com.ygy.model.User;
import com.ygy.service.service;
import com.ygy.service.serviceIm;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class contro {
    @RequestMapping(value = "/",method = RequestMethod.GET)    //首页
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("test","user", new User());


        return mv;
    }
    /*
    @RequestMapping(value = "/login")//登录
    public String testLogin(HttpServletRequest request){
        String userNumber = request.getParameter("userNumber");
        String passWord = request.getParameter("passWord");

        System.out.println("userNumber:"+userNumber+" passWord:"+passWord);

        String str = "userNumber:"+userNumber+" passWord:"+passWord;

        request.setAttribute("user", str);
        return "success";
    }
    */
    @RequestMapping(value = "/login")//登录
    public String testLogin(User user){
        service service=new serviceIm();
      String ym=  service.select(user);

        return ym;
    }
     @RequestMapping(value = "/zhuce",method = RequestMethod.POST) //注册
    public String zhuce(@ModelAttribute("user1")User user1){
         System.out.println( user1.getPassword());
         ModelAndView mv = new ModelAndView("test","user1", new User());
        return "";
     }
}
