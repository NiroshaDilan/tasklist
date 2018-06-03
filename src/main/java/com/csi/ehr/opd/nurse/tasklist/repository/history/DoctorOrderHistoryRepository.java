package com.csi.ehr.opd.nurse.tasklist.repository.history;

import com.csi.ehr.opd.nurse.tasklist.entity.history.DoctorOrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public interface DoctorOrderHistoryRepository extends JpaRepository<DoctorOrderHistory, Long> {
}
