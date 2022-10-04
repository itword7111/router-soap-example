package com.example.command_web_service;

import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class Report {

    private String nickName;
    private String task;
    private Timestamp timeOfTrack;
}
