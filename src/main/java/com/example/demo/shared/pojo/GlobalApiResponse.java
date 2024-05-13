package com.example.demo.shared.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GlobalApiResponse<T> {
    private String message;
    private Integer statusCode;
    private T data;
}
