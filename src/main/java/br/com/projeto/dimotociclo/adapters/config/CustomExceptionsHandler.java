package br.com.projeto.dimotociclo.adapters.config;

import br.com.projeto.dimotociclo.infraestructure.exceptions.ErroNegocioException;
import br.com.projeto.dimotociclo.infraestructure.exceptions.dto.ErroNegocioDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice
public class CustomExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ErroNegocioException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
            ErroNegocioException ex, WebRequest request) {

        return new ResponseEntity<>(
                ErroNegocioDTO.builder()
                        .time(LocalDateTime.now())
                        .codigoHttp(ex.getHttpStatus().value())
                        .mensagem(ex.getMessage())
                        .build(),
                ex.getHttpStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        List<String> errors =
                ex.getBindingResult().getFieldErrors().stream()
                        .map(DefaultMessageSourceResolvable::getDefaultMessage)
                        .collect(Collectors.toList());

        return new ResponseEntity<>(
                ErroNegocioDTO.builder()
                        .time(LocalDateTime.now())
                        .codigoHttp(status.value())
                        .mensagem(ex.getMessage())
                        .errosList(errors)
                        .build(),
                status);
    }
}
