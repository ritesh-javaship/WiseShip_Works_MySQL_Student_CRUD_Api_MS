package com.wise.ship.mysql.student.crud.api.microservice.response.error;

import com.wise.ship.mysql.student.crud.api.microservice.exceptions.ResourceNotFoundException;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;
import java.time.LocalDateTime;

@Data
public class ErrorResponseDTO {

    private Throwable exception;
    private String webRequestDescription;
    private HttpStatus httpStatus;
    private String exceptionMessage;
    private LocalDateTime createdDate;

    public ErrorResponseDTO(Throwable exception, String webRequestDescription, HttpStatus httpStatus, String exceptionMessage, LocalDateTime createdDate) {
        this.exception = exception;
        this.webRequestDescription = webRequestDescription;
        this.httpStatus = httpStatus;
        this.exceptionMessage = exceptionMessage;
        this.createdDate = createdDate;
    }
}
