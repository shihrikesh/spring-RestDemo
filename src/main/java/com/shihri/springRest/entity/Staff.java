package com.shihri.springRest.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * JPA Entity representing a staff member of a department.
 *
 * Created by maryellenbowman
 */
@Entity
@Table(name="staff_member")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private Person member;


}
