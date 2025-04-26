package projeto.seguranca.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaterialRequestDto{
    private String name;
    private String description;
} 