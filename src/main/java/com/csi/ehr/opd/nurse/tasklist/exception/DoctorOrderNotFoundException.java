package com.csi.ehr.opd.nurse.tasklist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class DoctorOrderNotFoundException extends RuntimeException {

    public DoctorOrderNotFoundException(String exception) {
        super(exception);
    }
}
