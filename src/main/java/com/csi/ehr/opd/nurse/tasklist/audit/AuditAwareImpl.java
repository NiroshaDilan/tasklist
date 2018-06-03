package com.csi.ehr.opd.nurse.tasklist.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Mr.Auditor");
    }
}
