package com.epam.esm.service.service.mapper;

import com.epam.esm.repository.entity.SearchGiftCertificateParameter;
import com.epam.esm.service.entity.SearchGiftCertificateParameterDto;

public interface SearchParamterDtoMapper {

    public SearchGiftCertificateParameter changeDtoToSearchGiftSertificateParametr(
            SearchGiftCertificateParameterDto dto);

}
