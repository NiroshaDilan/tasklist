package com.csi.ehr.opd.nurse.tasklist.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public abstract class BaseDTO implements Serializable {

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "Appointment Id")
    private Long appointmentId;
//    @ApiModelProperty(value = "Created On")
//    private Date createdOn;
    @ApiModelProperty(value = "Last Modified Date")
    private Date lastModifiedDate;
    @ApiModelProperty(value = "Active Row Status")
    private Integer rowActiveStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

//    public Date getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(Date createdOn) {
//        this.createdOn = createdOn;
//    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getRowActiveStatus() {
        return rowActiveStatus;
    }

    public void setRowActiveStatus(Integer rowActiveStatus) {
        this.rowActiveStatus = rowActiveStatus;
    }

    @Override
    public String toString() {
        return "BaseDTO{" +
                "id=" + id +
                ", appointmentId=" + appointmentId +
                ", rowActiveStatus=" + rowActiveStatus +
                '}';
    }
}
