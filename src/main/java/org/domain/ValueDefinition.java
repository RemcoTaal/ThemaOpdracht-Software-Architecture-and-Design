package org.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValueDefinition {

    @Id
    @GeneratedValue
    private int valueDefinitionId;

    @Column
    private int minValue;

    @Column
    private int maxValue;

    @Column
    private String literalValue;

    @Column
    private String dataType;
}
