package com.tin.demo.activiti.configuration.activiti;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.stereotype.Component;

/**
 * Created by Tin on 2019/04/14.
 */
@Component
public class ActivitiConfig implements ProcessEngineConfigurationConfigurer {

    @Override
    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        processEngineConfiguration.setActivityFontName("宋体");
        processEngineConfiguration.setLabelFontName("宋体");
        processEngineConfiguration.setAnnotationFontName("宋体");

        // 是否使用activiti自带用户组织表
        // processEngineConfiguration.setDbIdentityUsed(false);
        processEngineConfiguration.setDatabaseSchemaUpdate("true");
    }
}
