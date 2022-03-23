package com.todo.config;

import com.todo.resource.FolderResource;
import com.todo.resource.ItemResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ProjectBeans extends ResourceConfig {

    public ProjectBeans() {

            register(FolderResource.class);
            register(ItemResource.class);
        }
}

