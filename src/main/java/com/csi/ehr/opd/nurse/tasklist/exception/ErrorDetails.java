package com.csi.ehr.opd.nurse.tasklist.exception;

import java.util.Date;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }
    public String getMessage() {
        return message;
    }
    public String getDetails() {
        return details;
    }
}
