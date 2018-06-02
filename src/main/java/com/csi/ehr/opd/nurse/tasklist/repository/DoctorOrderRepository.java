package com.csi.ehr.opd.nurse.tasklist.repository;

import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Repository
public interface DoctorOrderRepository extends JpaRepository<DoctorOrder, Long> {
}
