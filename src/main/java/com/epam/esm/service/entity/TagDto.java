package com.epam.esm.service.entity;

import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Relation(itemRelation = "tag", collectionRelation = "tags")
public class TagDto extends RepresentationModel<TagDto> {

    private long id;

    @NotBlank
    private String nameTag;

}
