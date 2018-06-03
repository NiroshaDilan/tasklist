package com.csi.ehr.opd.nurse.tasklist.service;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import com.csi.ehr.opd.nurse.tasklist.exception.DoctorOrderException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public interface DoctorOrderService {

    List<DoctorOrderDTO> getAll();

    void add(DoctorOrderDTO doctorOrderDTO);

    void addAll(List<DoctorOrderDTO> doctorOrderDTOList);
}
