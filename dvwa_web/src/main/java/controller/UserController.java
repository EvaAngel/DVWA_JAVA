package controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("sqlinjection.do")
    public ModelAndView sqlmapTest(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView modelAndView=new ModelAndView();
        try {
            String id = request.getParameter("sqltest");
            User user = userService.queryUserById(id);
            if(user!=null)
            {
                modelAndView.addObject("user",user);
                System.out.println(userService.queryUserList().get(0).getAge() + " " + user.getSex());
                modelAndView.setViewName(request.getContextPath()+"common/success.jsp");
                return modelAndView;
            }
            modelAndView.addObject("result","输入的信息有误");
            modelAndView.setViewName("common/error.jsp");
            return modelAndView;
        }catch(Exception e)
        {
            modelAndView.addObject("result","输入的信息有误");
            modelAndView.setViewName("common/error.jsp");
            return modelAndView;
        }
    }
}
