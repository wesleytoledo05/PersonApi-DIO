package one.digitalinnovation.personapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import one.digitalinnovation.personapi.dto.request.PersonDto;
import one.digitalinnovation.personapi.entities.Person;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDto personDTO);

    PersonDto toDto(Person person);
}