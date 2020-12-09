package com.filmForum.servlet;

import com.filmForum.utils.BaseServlet;
import com.filmForum.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：cyx
 * 日期: 2020/12/9 11:48
 * 描述:
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("updateupdateupdate");
        FileUtils.singleUpload(request, response);
        response.sendRedirect(request.getContextPath() + "/html/index.html");

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
