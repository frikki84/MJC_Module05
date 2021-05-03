package com.epam.esm.service.service.mapper;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.service.entity.GiftCertificateDto;

public interface CertificateDtoMapper {

    public GiftCertificate changeDtoToCertificate(GiftCertificateDto dto);

    public GiftCertificateDto changeCertificateToDto(GiftCertificate certificate);

}
