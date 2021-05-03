package com.epam.esm.repository.repository;

import java.util.List;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.repository.entity.SearchGiftCertificateParameter;

public interface GiftCertificateRepository extends CrdOperations<GiftCertificate> {

    public List<GiftCertificate> findAll(SearchGiftCertificateParameter parametr, int offset, int limit);

    public GiftCertificate update(GiftCertificate giftCertificate);

    public long getCountOfEntities(SearchGiftCertificateParameter parameter);
}
