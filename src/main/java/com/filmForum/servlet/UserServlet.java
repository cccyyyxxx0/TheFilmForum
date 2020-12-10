package com.filmForum.servlet;

import com.filmForum.entity.User;
import com.filmForum.service.UserService;
import com.filmForum.service.impl.UserServiceImpl;
import com.filmForum.utils.BaseServlet;
import com.filmForum.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：wz
 * 日期: 2020/12/9 10:36
 * 描述:
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("updateupdateupdate");
        FileUtils.singleUpload(request, response);
        response.sendRedirect(request.getContextPath() + "/html/index.jsp");

    }

    public void signup(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        //防止中文乱码
        response.setContentType("text/html;charset=utf-8");

        String username =request.getParameter("username");
        String password=request.getParameter("password");
        String repassword=request.getParameter("repassword");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String regTime = tempDate.format(new java.util.Date());

        User user=new User();
        if (password.equals(repassword)){
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setPhone(phone);
            user.setRegTime(regTime);
            user.setLoginCount(0);
        }
        int result=userService.insert(user);

    }


    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username =request.getParameter("username");
        String password=request.getParameter("password");

            User user =userService.queryUserByUsernameAndPassword(new User(username,password));
            if (user!=null){
                user.setLoginCount(user.getLoginCount()+1);
                userService.updateLoginCount(user);
                HttpSession session=request.getSession();
                session.setAttribute("user",user);
                response.getWriter().write("true");
                request.getRequestDispatcher("html/index.jsp").forward(request,response);
            }else {
                response.getWriter().write("false");
            }


    }

    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect("");
    }
}
