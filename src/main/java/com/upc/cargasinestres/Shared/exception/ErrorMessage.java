package com.upc.cargasinestres.Shared.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    /**
     * statusCode is the status code of the error
     */
    private int statusCode;

    /**
     * message is the message of the error
     */
    private String message;

    /**
     * description is the description of the error
     */
    private String description;

    /**
     * timestamp is the timestamp of the error (date and time)
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;


}
