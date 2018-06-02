package com.csi.ehr.opd.nurse.tasklist.entity;

import javax.persistence.Entity;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Entity
public class DoctorOrder extends BaseEntity {

    private String doctorOrder;
    private Integer status;
    private Integer performed;

    public String getDoctorOrder() {
        return doctorOrder;
    }

    public void setDoctorOrder(String doctorOrder) {
        this.doctorOrder = doctorOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPerformed() {
        return performed;
    }

    public void setPerformed(Integer performed) {
        this.performed = performed;
    }
}
