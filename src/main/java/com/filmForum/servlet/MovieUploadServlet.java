package com.filmForum.servlet;

import com.filmForum.entity.Movie;
import com.filmForum.service.MovieService;
import com.filmForum.service.impl.MovieServiceImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/9 15:01
 * 描述:
 */
@WebServlet("/movieUpload")
public class MovieUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder fileName = new StringBuilder();
        Movie movie=new Movie();
        //金句：防止中文乱码

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String imagePath = null;
        // 创建FileItemFactory 工厂实现类
        FileItemFactory fileItemFactory = new DiskFileItemFactory();
        //创建用于解析上传数据的工具类
        ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
        try {
            //解析上传的数据 得到每一个表单项FileItem
            List<FileItem> list = servletFileUpload.parseRequest(request);
            //循环判断，每一个表单项 是普通类型 还是上传的文件
            for (FileItem fileItem :
                    list) {
                //上传的文件
                if (fileItem.isFormField()) {
//                        //普通表单项
                    String str = fileItem.getFieldName();
                    String str1 = fileItem.getString();
                    System.out.println("普通表单项 name = " + str);
                    //                        //参数UTF-8解决乱码
                    System.out.println("value = " + str1);
                    str1 = new String(str1.getBytes("ISO8859_1"), "utf-8");
                    if (!str1.equals("")) {
                        switch (str) {
                            case "name":
                                movie.setName(str1);
                                break;
                            case "typeId":
                                movie.setTypeId(Integer.parseInt(str1));
                                break;
                            case "showTime":
                                movie.setShowTime(str1);
                                break;
                            case "director":
                                movie.setDirector(str1);
                                break;
                            case "toStar":
                                movie.setToStar(str1);
                                break;
                            case "content":
                                movie.setContent(str1);
                                break;
                        }
                    }
                }else{
                    System.out.println("表单项的name = " + fileItem.getFieldName());
                    System.out.println("上传的文件名:" + fileItem.getName());
                    StringBuilder sb = new StringBuilder("D:\\upload\\");
                    fileName.append(new Date().getTime());
                    fileName.append(fileItem.getName());
                    sb.append(fileName);
                    imagePath = sb.toString();
                    System.out.println(imagePath);
                    fileItem.write(new File(imagePath));
                    movie.setPicAddress(imagePath);
                }

            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MovieService movieService=new MovieServiceImpl();

        int result = movieService.insert(movie);
        System.out.println(result);

    }
}
