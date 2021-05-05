package com.epam.esm.service.impl;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.repository.entity.Tag;
import com.epam.esm.service.entity.GiftCertificateDto;
import com.epam.esm.service.entity.TagDto;
import com.epam.esm.service.service.mapper.TagDtoMapper;
import com.epam.esm.service.service.mapper.impl.CertificateDtoMapperImpl;

@ExtendWith(MockitoExtension.class)
class CertificateDtoMapperImplTest {

    @Mock
    private TagDtoMapper tagDtoMapper;
    @InjectMocks
    private CertificateDtoMapperImpl mapper;

    private GiftCertificate certificate = new GiftCertificate();
    private GiftCertificateDto dto = new GiftCertificateDto();
    private Tag tag = new Tag();
    private TagDto tagDto = new TagDto();

    @BeforeEach
    void setUp() {
        certificate.setTags(Arrays.asList(tag));
        dto.setTagList(Arrays.asList(tagDto));
    }

    @Test
    void changeDtoToCertificate() {
        Mockito.when(tagDtoMapper.changeTagDtoToTag(tagDto)).thenReturn(tag);
        Assertions.assertEquals(certificate, mapper.changeDtoToCertificate(dto));
    }

    @Test
    void changeCertificateToDto() {
        Mockito.when(tagDtoMapper.changeTagToTagDto(tag)).thenReturn(tagDto);
        Assertions.assertEquals(dto, mapper.changeCertificateToDto(certificate));
    }
}