package com.spring.webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by dinesh on 5/9/17.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfigurator extends WebMvcConfigurerAdapter {

    private final WebConfigurations webConfigurations;

    @Autowired
    public WebMvcConfigurator(WebConfigurations webConfigurations) {
        this.webConfigurations = webConfigurations;
    }

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(webConfigurations.getResolverPrefix());
        resolver.setSuffix(webConfigurations.getResolverSuffix());
        return resolver;
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler(webConfigurations.getResourceHandler()).addResourceLocations(webConfigurations.getResourceLocation());
    }
}
