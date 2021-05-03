package com.epam.esm.service.service.validation;

import org.springframework.stereotype.Component;

import com.epam.esm.repository.configuration.IntParameterValues;
import com.epam.esm.repository.repository.CrdOperations;
import com.epam.esm.service.service.exception.CustomErrorCode;
import com.epam.esm.service.service.exception.LocalizationExceptionMessageValues;
import com.epam.esm.service.service.exception.PageException;

@Component
public class PageInfoValidation {

    private CrdOperations crdOperations;

    public void setCrdOperations(CrdOperations crdOperations) {
        this.crdOperations = crdOperations;
    }

    public void checkPageInfo(int offset, int limit, CustomErrorCode errorCode) {
        if (offset < IntParameterValues.MIN_PAGE_VALUE.getValue()) {
            throw new PageException(LocalizationExceptionMessageValues.INVALID_PAGE_NUMBER.getMessage(), errorCode);
        }
        if (limit < IntParameterValues.MIN_PAGE_VALUE.getValue()) {
            throw new PageException(LocalizationExceptionMessageValues.NONEXISTENT_PAGE_SIZE.getMessage(), errorCode);
        }
        if ((offset - IntParameterValues.VALUE_TO_CHANGE_FIRST_INDEX_FROM_ONE_TO_ZERO.getValue()) * limit
                > crdOperations.findNumberOfEntities()) {
            throw new PageException(LocalizationExceptionMessageValues.NONEXISTENT_PAGE_NUMBER.getMessage(), errorCode);
        }

    }
}
