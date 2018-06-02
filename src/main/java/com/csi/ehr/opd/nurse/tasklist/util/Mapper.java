package com.csi.ehr.opd.nurse.tasklist.util;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import org.springframework.beans.BeanUtils;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
public class Mapper {

    private Mapper(){}

    public static DoctorOrderDTO doctorOrderToDtoMap(DoctorOrder doctorOrder) {
        DoctorOrderDTO doctorOrderDTO = new DoctorOrderDTO();
        BeanUtils.copyProperties(doctorOrder, doctorOrderDTO);
        return doctorOrderDTO;
    }
}
