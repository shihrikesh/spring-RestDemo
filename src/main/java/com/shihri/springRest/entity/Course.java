package com.shihri.springRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * JPA Entity for a Course offered at the University.
 *
 * Created by maryellenbowman.
 */
@Entity
@Table(name="course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="credits")
    private Integer credits;

    @ManyToOne
    @JoinColumn(name="instructor_id")
    private Staff instructor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "course_prerequisites",
        joinColumns = @JoinColumn(name = "id_of_course"),
        inverseJoinColumns = @JoinColumn(name = "id_prerequisite_course"))
    private List<Course> prerequisites = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

}
