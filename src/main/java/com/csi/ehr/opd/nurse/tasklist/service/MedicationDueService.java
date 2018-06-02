package com.csi.ehr.opd.nurse.tasklist.service;

import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public interface MedicationDueService {

    MedicationDue findByPrescriptionNo(Integer prescriptionNo);
}
