package com.spring.webapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dinesh on 5/16/17.
 */
@Component
@ConfigurationProperties(prefix = "web")
public class WebConfigurations {
    private String resolverPrefix;
    private String resolverSuffix;
    private String resourceHandler;
    private String resourceLocation;

    public String getResolverPrefix() {
        return resolverPrefix;
    }

    public void setResolverPrefix(String resolverPrefix) {
        this.resolverPrefix = resolverPrefix;
    }

    public String getResolverSuffix() {
        return resolverSuffix;
    }

    public void setResolverSuffix(String resolverSuffix) {
        this.resolverSuffix = resolverSuffix;
    }

    public String getResourceHandler() {
        return resourceHandler;
    }

    public void setResourceHandler(String resourceHandler) {
        this.resourceHandler = resourceHandler;
    }

    public String getResourceLocation() {
        return resourceLocation;
    }

    public void setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
    }
}
