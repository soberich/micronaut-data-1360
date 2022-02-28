package com.example;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.TypeDef;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

import static io.micronaut.data.model.DataType.STRING_ARRAY;

@Value
@Builder(toBuilder = true)
@MappedEntity
public class Pojo {

    @Id
    UUID id;

    @TypeDef(type = STRING_ARRAY)
    String[] nickNames;
}
