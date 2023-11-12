package br.com.projeto.dimotociclo.infraestructure.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ErroNegocioException extends RuntimeException {

    private Long codigoErro;
    private String message;
    private LocalDateTime horaErro;
    private List<String> erros;
    private HttpStatus httpStatus;

    public ErroNegocioException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
