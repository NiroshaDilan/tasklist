package com.csi.ehr.opd.nurse.tasklist.service.impl;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.DoctorOrder;
import com.csi.ehr.opd.nurse.tasklist.exception.DoctorOrderException;
import com.csi.ehr.opd.nurse.tasklist.genericvalidator.ValidatorUtil;
import com.csi.ehr.opd.nurse.tasklist.repository.DoctorOrderRepository;
import com.csi.ehr.opd.nurse.tasklist.service.DoctorOrderService;
import com.csi.ehr.opd.nurse.tasklist.util.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.ValidationUtils;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<DoctorOrderDTO> getAll() {
        List<DoctorOrder> doctorOrderList = doctorOrderRepository.findAll();
        List<DoctorOrderDTO> doctorOrderDTOList = new ArrayList<>();
        doctorOrderList.forEach(doctorOrder -> doctorOrderDTOList
                .add(Mapper.doctorOrderToDtoMap(doctorOrder)));
        return doctorOrderDTOList;
    }

    @Override
    public void add(DoctorOrderDTO doctorOrderDTO){
        StringBuilder errorFields = new StringBuilder();

        errorFields.append(ValidatorUtil.notNullString.and(ValidatorUtil.notEmptyString)
                .test(doctorOrderDTO.getDoctorOrder())
                .getFieldNameIfInvalid("Please Doctor Order Cannot be empty").orElse(""));

        doctorOrderRepository.save(Mapper.dtoToDoctorOrderMap(doctorOrderDTO));
    }

    @Override
    public void addAll(List<DoctorOrderDTO> doctorOrderDTOList) {
        List<DoctorOrder> doctorOrderList = new ArrayList<>();
        doctorOrderDTOList.forEach(doctorOrderDTO -> doctorOrderList
                .add(Mapper.dtoToDoctorOrderMap(doctorOrderDTO)));
        doctorOrderRepository.saveAll(doctorOrderList);
    }
}
