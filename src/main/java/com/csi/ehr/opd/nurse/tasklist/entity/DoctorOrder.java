package com.csi.ehr.opd.nurse.tasklist.entity;

import com.csi.ehr.opd.nurse.tasklist.listener.DoctorOrderListener;

import javax.persistence.*;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Entity
@EntityListeners(DoctorOrderListener.class)
public class DoctorOrder extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String doctorOrder;
    private Integer status;
    private Integer performed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "DoctorOrder{" +
                "id=" + id +
                ", doctorOrder='" + doctorOrder + '\'' +
                ", status=" + status +
                ", performed=" + performed +
                '}';
    }
}
