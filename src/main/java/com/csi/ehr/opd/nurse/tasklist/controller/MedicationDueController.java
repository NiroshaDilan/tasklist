package com.csi.ehr.opd.nurse.tasklist.controller;

import com.csi.ehr.opd.nurse.tasklist.dto.MedicationDueDTO;
import com.csi.ehr.opd.nurse.tasklist.entity.MedicationDue;
import com.csi.ehr.opd.nurse.tasklist.service.MedicationDueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Project task-list
 * @Author DILAN on 6/2/2018
 */
@Api(basePath = "/medicationDue",
        value = "Nurse's Task List",
        description = "Service related to task list medication due",
        produces = "application/json")
@RestController
@RequestMapping("medicationDue")
public class MedicationDueController {

    private MedicationDueService medicationDueService;

    public MedicationDueController(MedicationDueService medicationDueService) {
        this.medicationDueService = medicationDueService;
    }

    @ApiOperation(value = "getAll", notes = "Get All Medication due")
    @GetMapping
    public ResponseEntity<List<MedicationDueDTO>> getAll() {
        return new ResponseEntity<>(medicationDueService.getAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @ApiOperation(value = "create", notes = "Save medication due")
    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody MedicationDueDTO medicationDueDTO) {
        medicationDueService.add(medicationDueDTO);
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
    }

    @ApiOperation(value = "add All", notes = "Save all medication due")
    @PostMapping("/addAll")
    public ResponseEntity<HttpStatus> create(@RequestBody List<MedicationDueDTO> medicationDueDTOList) {
        medicationDueService.addAll(medicationDueDTOList);
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
    }
}
