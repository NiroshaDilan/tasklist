package com.csi.ehr.opd.nurse.tasklist.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public class DoctorOrderDTO extends BaseDTO {

    @NotEmpty(message = "Doctor Order should not be empty")
    @NotNull(message = "Doctor Order should not be null")
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

    @Override
    public String toString() {
        return "DoctorOrderDTO{" +
                "doctorOrder='" + doctorOrder + '\'' +
                ", status=" + status +
                ", performed=" + performed +
                '}';
    }
}
