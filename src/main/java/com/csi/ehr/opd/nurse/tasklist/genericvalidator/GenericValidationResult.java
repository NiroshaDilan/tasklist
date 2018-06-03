package com.csi.ehr.opd.nurse.tasklist.genericvalidator;

import java.util.Optional;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class GenericValidationResult {

    private boolean valid;

    public boolean isValid() {
        return valid;
    }

    public static GenericValidationResult ok() {
        return new GenericValidationResult(true);
    }

    private GenericValidationResult(boolean valid) {
        this.valid = valid;
    }

    public static GenericValidationResult fail() {
        return new GenericValidationResult(false);
    }

    public Optional<String> getFieldNameIfInvalid(String field) {
        return this.valid ? Optional.empty() : Optional.of(field);
    }
}
