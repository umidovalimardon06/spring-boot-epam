package com.epam.springboot.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private int number;
    private String name;
    private String info;
}
