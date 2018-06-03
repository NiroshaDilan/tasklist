package com.csi.ehr.opd.nurse.tasklist.genericvalidator;

import java.util.function.Predicate;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class GenericValidation<K> implements Validation<K> {

    private Predicate<K> predicate;

    public static<K> GenericValidation<K> from(Predicate<K> predicate) {
        return new GenericValidation<K>(predicate);
    }

    private GenericValidation(Predicate<K> predicate) {
        this.predicate = predicate;
    }

    @Override
    public GenericValidationResult test(K param) {
        return predicate.test(param) ? GenericValidationResult.ok() : GenericValidationResult.fail();
    }
}
