package com.csi.ehr.opd.nurse.tasklist.config;

import com.csi.ehr.opd.nurse.tasklist.audit.AuditAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditConfiguration {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditAwareImpl();
    }
}
