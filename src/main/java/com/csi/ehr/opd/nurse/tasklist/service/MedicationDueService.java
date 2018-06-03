package com.csi.ehr.opd.nurse.tasklist.service;

import com.csi.ehr.opd.nurse.tasklist.dto.MedicationDueDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;

import java.util.List;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public interface MedicationDueService {

    MedicationDueDTO findByPrescriptionNo(Integer prescriptionNo);

    List<MedicationDueDTO> getAll();

    void add(MedicationDueDTO medicationDueDTO);

    void addAll(List<MedicationDueDTO> medicationDueDTOList);
}
