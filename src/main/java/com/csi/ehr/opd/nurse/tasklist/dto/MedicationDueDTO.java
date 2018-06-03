package com.csi.ehr.opd.nurse.tasklist.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public class MedicationDueDTO extends BaseDTO {

    @ApiModelProperty(value = "Prescription No")
    private Integer prescriptionNo;
    @ApiModelProperty(value = "Medication")
    private String medication;
    @ApiModelProperty(value = "Dosage Details")
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

    @Override
    public String toString() {
        return "MedicationDueDTO{" +
                "prescriptionNo=" + prescriptionNo +
                ", medication='" + medication + '\'' +
                ", dosageDetail='" + dosageDetail + '\'' +
                '}';
    }
}
