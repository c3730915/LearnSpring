package com.iitcast.web;

import com.iitcast.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrivilegeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user=(User) session.getAttribute("user");
        if (user == null) {
            //not logging in
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return true;

        }
        return true;
    }
}