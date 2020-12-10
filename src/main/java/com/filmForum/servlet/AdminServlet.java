package com.filmForum.servlet;

import com.filmForum.entity.Admin;
import com.filmForum.service.AdminService;
import com.filmForum.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 作者：wz
 * 日期: 2020/12/10 9:38
 * 描述:
 */
public class AdminServlet extends BaseServlet{
    AdminService adminService=new AdminServiceImpl();
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

        Admin admin =adminService.queryAdminByUsernameAndPassword(new Admin(username,password));
        if (admin!=null){
            SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String lastTime = tempDate.format(new java.util.Date());
            admin.setLogCount(admin.getLogCount()+1);
            admin.setLastTime(lastTime);
            adminService.updateLoginCountAndLastTime(admin);
            HttpSession session=request.getSession();
            session.setAttribute("admin",admin);
            response.getWriter().write("true");
            request.getRequestDispatcher("").forward(request,response);

        }else {
            response.getWriter().write("false");
        }


    }
}
