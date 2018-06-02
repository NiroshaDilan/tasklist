package com.csi.ehr.opd.nurse.tasklist.service.impl;

import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;
import com.csi.ehr.opd.nurse.tasklist.service.MedicationDueService;
import org.springframework.stereotype.Service;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Service
public class MedicationDueServiceImpl implements MedicationDueService {

    @Override
    public MedicationDue findByPrescriptionNo(Integer prescriptionNo) {
        return null;
    }
}
