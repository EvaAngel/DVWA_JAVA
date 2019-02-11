package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Sql_Injection_Filter_high implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入高级过滤器");
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        String sqltest=request.getParameter("sqltest");
        System.out.println(sqltest);
        if(sqltest.contains("select")||sqltest.contains("union")||sqltest.contains("order")||sqltest.contains("'"))
        {
            System.out.println("符合高级过滤器格式");
            request.setAttribute("result","输入的信息有误");
            request.getRequestDispatcher("/common/error.jsp").forward(servletRequest,servletResponse);
        }
        else
        {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
