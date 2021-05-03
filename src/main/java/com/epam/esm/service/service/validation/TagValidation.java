package com.epam.esm.service.service.validation;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.epam.esm.repository.configuration.IntParameterValues;
import com.epam.esm.service.entity.TagDto;
import com.epam.esm.service.service.exception.LocalizationExceptionMessageValues;
import com.epam.esm.service.service.exception.TagValidationException;

@Component
public class TagValidation {

    public void chechTagDtoFormat(TagDto dto) {
        if (Objects.isNull(dto.getNameTag()) || dto.getNameTag().isBlank()
                || dto.getNameTag().length() < IntParameterValues.MIN_TAG_LENGTH.getValue()
                || dto.getNameTag().length() > IntParameterValues.MAX_TAG_LENGTH.getValue()) {
            throw new TagValidationException(LocalizationExceptionMessageValues.INVALID_TAG_NAME.getMessage());
        }

    }

}
