package com.csi.ehr.opd.nurse.tasklist.entity;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long appointmentId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", updatable = false)
    @CreatedDate
    private Date createdOn;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime modified;

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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Integer getRowActiveStatus() {
        return rowActiveStatus;
    }

    public void setRowActiveStatus(Integer rowActiveStatus) {
        this.rowActiveStatus = rowActiveStatus;
    }
}
