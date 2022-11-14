package com.spring.zuul.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulGateway extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre"; // pre post error
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest httpServletRequest =
                RequestContext.getCurrentContext().getRequest();
        System.out.println("---> request from " + httpServletRequest.getRequestURI());
        return null;
    }
}
