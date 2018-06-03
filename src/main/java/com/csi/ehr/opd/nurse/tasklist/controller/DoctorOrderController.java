package com.csi.ehr.opd.nurse.tasklist.controller;

import com.csi.ehr.opd.nurse.tasklist.dto.DoctorOrderDTO;
import com.csi.ehr.opd.nurse.tasklist.service.DoctorOrderService;
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
@Api(basePath = "/doctorOrder",
        value = "Nurse's Task List",
        description = "Service related to task list doctor orders",
        produces = "application/json")
@RestController
@RequestMapping("doctorOrder")
public class DoctorOrderController {

    private DoctorOrderService doctorOrderService;

    public DoctorOrderController(DoctorOrderService doctorOrderService) {
        this.doctorOrderService = doctorOrderService;
    }


    @ApiOperation(value = "getAll", notes = "Get All Doctor Orders")
    @GetMapping
    public ResponseEntity<List<DoctorOrderDTO>> getAll() {
        return new ResponseEntity<>(doctorOrderService.getAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @ApiOperation(value = "create", notes = "Save Doctor Orders")
    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody DoctorOrderDTO doctorOrderDTO) {
        doctorOrderService.add(doctorOrderDTO);
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
    }

    @ApiOperation(value = "add All", notes = "Save all doctor Orders")
    @PostMapping("/addAll")
    public ResponseEntity<HttpStatus> create(@RequestBody List<DoctorOrderDTO> doctorOrderDTOList) {
        doctorOrderService.addAll(doctorOrderDTOList);
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
    }
}
