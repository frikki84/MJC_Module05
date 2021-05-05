package com.epam.esm.service.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class OrderCreationParameter {

    private long userId = 0;
    private List<Integer> certificates;
}
