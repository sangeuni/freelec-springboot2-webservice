package com.buyability.springboot.web.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    @NonNull private String name;
    @NonNull private  int amount;
}
