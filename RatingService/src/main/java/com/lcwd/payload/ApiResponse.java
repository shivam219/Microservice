package com.lcwd.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}

