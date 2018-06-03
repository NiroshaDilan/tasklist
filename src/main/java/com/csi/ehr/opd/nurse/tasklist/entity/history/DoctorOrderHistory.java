package com.csi.ehr.opd.nurse.tasklist.entity.history;

import com.csi.ehr.opd.nurse.tasklist.action.Action;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.EnumType.STRING;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class DoctorOrderHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctorOrder_id", foreignKey = @ForeignKey(name = "FK_doctorOrder_history_file"))
    private DoctorOrder doctorOrder;

    private String doctorOrderContent;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", updatable = false)
    @CreatedDate
    private Date createdOn;

    @LastModifiedDate
    @Column(nullable = false)
    private Date modified;

    @Enumerated(STRING)
    private Action action;

    public DoctorOrderHistory() {
    }

    public DoctorOrderHistory(DoctorOrder doctorOrder, Action action) {
        this.doctorOrder = doctorOrder;
        this.doctorOrderContent = doctorOrder.toString();
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DoctorOrder getDoctorOrder() {
        return doctorOrder;
    }

    public void setDoctorOrder(DoctorOrder doctorOrder) {
        this.doctorOrder = doctorOrder;
    }

    public String getDoctorOrderContent() {
        return doctorOrderContent;
    }

    public void setDoctorOrderContent(String doctorOrderContent) {
        this.doctorOrderContent = doctorOrderContent;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
