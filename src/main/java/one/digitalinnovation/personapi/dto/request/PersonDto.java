package one.digitalinnovation.personapi.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String first_Name;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String last_Name;

    @NotEmpty
    @CPF
    private String cpf;

    private String birth_Date;

    @Valid
    @NotEmpty
    private List<PhoneDto> phones;
}
