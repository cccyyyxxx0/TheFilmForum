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
}
