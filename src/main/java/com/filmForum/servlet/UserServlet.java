package com.filmForum.servlet;

import com.filmForum.entity.User;
import com.filmForum.service.UserService;
import com.filmForum.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：wz
 * 日期: 2020/12/9 10:36
 * 描述:
 */
public class UserServlet extends BaseServlet{
    UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username =request.getParameter("username");
        String password=request.getParameter("password");
//        String code=request.getParameter("code");
//        String token=(String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
//        if (token!=null&&token.equalsIgnoreCase(code)){
            User user =userService.queryUserByUsernameAndPassword(new User(username,password));
            if (user!=null){
                HttpSession session=request.getSession();
                session.setAttribute("user",user);
                response.getWriter().write("true");
                request.getRequestDispatcher("").forward(request,response);

                //System.out.println(request.getRequestDispatcher("/message.do?action=queryList"));
            }else {
                response.getWriter().write("false");
            }
//        }else {
//
//        }

    }
}
