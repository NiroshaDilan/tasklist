package com.csi.ehr.opd.nurse.tasklist.validator;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.exception.DoctorOrderException;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public interface DoctorOrderValidator {

    void validate(DoctorOrderDTO doctorOrderDTO) throws DoctorOrderException;
}
