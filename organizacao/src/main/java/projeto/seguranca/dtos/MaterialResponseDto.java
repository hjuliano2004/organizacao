package projeto.seguranca.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaterialResponseDto{
    private Long id;
    private String name;
    private String description;
}