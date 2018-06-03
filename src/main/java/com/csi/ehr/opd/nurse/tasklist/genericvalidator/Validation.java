package com.csi.ehr.opd.nurse.tasklist.genericvalidator;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
@FunctionalInterface
public interface Validation<K> {

    public GenericValidationResult test(K param);

    default Validation<K> and(Validation<K> other) {
        return (param) -> {
            GenericValidationResult result = this.test(param);
            return !result.isValid() ? result : other.test(param);
        };
    }

    default Validation<K> or(Validation<K> other) {
        return (param) -> {
            GenericValidationResult result = this.test(param);
            return result.isValid() ? result : other.test(param);
        };
    }
}
