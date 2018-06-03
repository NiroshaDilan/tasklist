package com.csi.ehr.opd.nurse.tasklist.util;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.dto.MedicationDueDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;
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

    public static DoctorOrder dtoToDoctorOrderMap(DoctorOrderDTO doctorOrderDTO) {
        DoctorOrder doctorOrder = new DoctorOrder();
        BeanUtils.copyProperties(doctorOrderDTO, doctorOrder);
        return doctorOrder;
    }

    public static MedicationDueDTO medicationDueToDtoMap(MedicationDue medicationDue) {
        MedicationDueDTO medicationDueDTO = new MedicationDueDTO();
        BeanUtils.copyProperties(medicationDue, medicationDueDTO);
        return medicationDueDTO;
    }

    public static MedicationDue dtoToMedicationDueMap(MedicationDueDTO medicationDueDTO) {
        MedicationDue medicationDue = new MedicationDue();
        BeanUtils.copyProperties(medicationDueDTO, medicationDue);
        return medicationDue;
    }
}
