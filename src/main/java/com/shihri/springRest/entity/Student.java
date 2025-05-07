package com.shihri.springRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JPA Entity representing a student at the University.
 *
 * Created by maryellenbowman
 */
@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer studentId;

    @Embedded
    private Person attendee;

    @Column(name="full_time")
    private boolean fullTime;

    @Column(name="age")
    private Integer age;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinTable(name="course_student", joinColumns = {@JoinColumn(name="student_id")}, inverseJoinColumns = {@JoinColumn(name = "id")})
    private List<Course> courses = new ArrayList<>();


}
