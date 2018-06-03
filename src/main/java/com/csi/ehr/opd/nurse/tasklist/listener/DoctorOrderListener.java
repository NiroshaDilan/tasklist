package com.csi.ehr.opd.nurse.tasklist.listener;

import com.csi.ehr.opd.nurse.tasklist.action.Action;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import com.csi.ehr.opd.nurse.tasklist.entity.history.DoctorOrderHistory;
import com.csi.ehr.opd.nurse.tasklist.util.BeanUtil;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import static com.csi.ehr.opd.nurse.tasklist.action.Action.DELETED;
import static com.csi.ehr.opd.nurse.tasklist.action.Action.INSERTED;
import static com.csi.ehr.opd.nurse.tasklist.action.Action.UPDATED;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class DoctorOrderListener {

    @PrePersist
    public void prePersist(DoctorOrder target) {
        perform(target, INSERTED);
    }

    @PreUpdate
    public void preUpdate(DoctorOrder target) {
        perform(target, UPDATED);
    }

    @PreRemove
    public void preRemove(DoctorOrder target) {
        perform(target, DELETED);
    }

    private void perform(DoctorOrder target, Action action) {
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new DoctorOrderHistory(target, action));
    }
}
