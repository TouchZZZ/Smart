package org.smart.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/5.
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat df=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String currentTime=df.format(new Date());
        req.setAttribute("currentTime",currentTime);
        int min=1;
        String s=String.format("%03d",min++);
        System.out.println(s);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);

    }
}
