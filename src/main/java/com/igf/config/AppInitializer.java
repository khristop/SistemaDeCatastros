package com.igf.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by khris on 11-22-16.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    //@Override
    protected Class[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    //@Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
