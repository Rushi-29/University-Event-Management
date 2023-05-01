package com.geekster.UniversityEventManagement.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;
    @NotBlank
    @Size(min=1,max = 50)
    private String eventName;
    @NotBlank
    @Size(min = 1, max = 50)
    private String locationOfEvent;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate date;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private Time startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private Time endTime;
}
