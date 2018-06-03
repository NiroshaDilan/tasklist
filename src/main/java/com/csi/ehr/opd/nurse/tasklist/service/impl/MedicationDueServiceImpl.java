package com.csi.ehr.opd.nurse.tasklist.service.impl;

import com.csi.ehr.opd.nurse.tasklist.dto.MedicationDueDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;
import com.csi.ehr.opd.nurse.tasklist.repository.MedicationDueRepository;
import com.csi.ehr.opd.nurse.tasklist.service.MedicationDueService;
import com.csi.ehr.opd.nurse.tasklist.util.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Service
public class MedicationDueServiceImpl implements MedicationDueService {

    private MedicationDueRepository medicationDueRepository;

    public MedicationDueServiceImpl(MedicationDueRepository medicationDueRepository) {
        this.medicationDueRepository = medicationDueRepository;
    }

    @Override
    public MedicationDueDTO findByPrescriptionNo(Integer prescriptionNo) {
        return Mapper.medicationDueToDtoMap(medicationDueRepository.findByPrescriptionNo(prescriptionNo));
    }

    @Override
    public List<MedicationDueDTO> getAll() {
        List<MedicationDue> medicationDueList = medicationDueRepository.findAll();
        List<MedicationDueDTO> medicationDueDTOList = new ArrayList<>();
        medicationDueList.forEach(medicationDue -> medicationDueDTOList
                .add(Mapper.medicationDueToDtoMap(medicationDue)));
        return medicationDueDTOList;
    }

    @Override
    public void add(MedicationDueDTO medicationDueDTO) {
        medicationDueRepository.save(Mapper.dtoToMedicationDueMap(medicationDueDTO));
    }

    @Override
    public void addAll(List<MedicationDueDTO> medicationDueDTOList) {
        List<MedicationDue> medicationDueList = new ArrayList<>();
        medicationDueDTOList.forEach(medicationDueDTO -> medicationDueList
                .add(Mapper.dtoToMedicationDueMap(medicationDueDTO)));
        medicationDueRepository.saveAll(medicationDueList);
    }
}
