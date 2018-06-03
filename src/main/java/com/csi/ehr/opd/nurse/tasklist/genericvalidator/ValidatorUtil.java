package com.csi.ehr.opd.nurse.tasklist.genericvalidator;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public class ValidatorUtil {

    public static final Validation<String> notNullString = GenericValidation.from(s -> s != null);

    public static final Validation<String> notEmptyString = GenericValidation.from(s -> !s.isEmpty());

    public static final Validation<Integer> notNullInteger = GenericValidation.from(s -> s != null);

    public static final Validation<Integer> greaterThanZero = GenericValidation.from(s -> s > 0);

    public static final Validation<String> stringLessThan(int size) {
        return GenericValidation.from(s -> ((String)s).length() > size);
    }

    public static final Validation<String> stringBetween(int moreThan, int lessThan) {
        return stringLessThan(moreThan).and(stringLessThan(lessThan));
    }

    public static final Validation<Integer> integerMoreThan(int limit) {
        return GenericValidation.from(s -> s > limit);
    }

    public static final Validation<Integer> integerLessThan(int size) {
        return GenericValidation.from(s -> s < size);
    }

    public static final Validation<Integer> integerBetween(int moreThan, int lessThan) {
        return integerLessThan(moreThan).and(integerLessThan(lessThan));
    }
}
