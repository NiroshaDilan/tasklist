package com.csi.ehr.opd.nurse.tasklist.service.impl;

import com.csi.ehr.opd.nurse.tasklist.repository.DoctorOrderRepository;
import com.csi.ehr.opd.nurse.tasklist.service.DoctorOrderService;
import org.springframework.stereotype.Service;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Service
public class DoctorOrderServiceImpl implements DoctorOrderService {

    private DoctorOrderRepository doctorOrderRepository;

    public DoctorOrderServiceImpl(DoctorOrderRepository doctorOrderRepository) {
        this.doctorOrderRepository = doctorOrderRepository;
    }

}
