package com.epam.esm.service.service.mapper;

import java.util.List;

import com.epam.esm.repository.entity.Tag;
import com.epam.esm.service.entity.GiftCertificateDto;
import com.epam.esm.service.entity.TagDto;

public interface TagDtoMapper {

    public Tag changeTagDtoToTag(TagDto tagDto);

    public TagDto changeTagToTagDto(Tag tag);

    public List<Tag> changeCertificateDtoToTagList(GiftCertificateDto dto);

}
