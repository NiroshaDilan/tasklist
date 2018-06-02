package com.csi.ehr.opd.nurse.tasklist.entity;

import javax.persistence.Entity;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Entity
public class MedicationDue extends BaseEntity {

    private Integer prescriptionNo;
    private String medication;
    private String dosageDetail;

    public Integer getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(Integer prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosageDetail() {
        return dosageDetail;
    }

    public void setDosageDetail(String dosageDetail) {
        this.dosageDetail = dosageDetail;
    }
}
