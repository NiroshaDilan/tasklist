package com.csi.ehr.opd.nurse.tasklist.repository;

import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Repository
public interface MedicationDueRepository extends JpaRepository<MedicationDue, Long> {

    MedicationDue findByPrescriptionNo(Integer prescriptionNo);
}
