package com.upc.cargasinestres.Users.model.entity;

import com.upc.cargasinestres.Users.model.enums.ERole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    /**
     * The roleId is the id of the role.
     * The roleId is a Long value.
     * - The roleId is the primary key of the role.
     * - The roleId is generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    /**
     *  The name is the name of the role.
     *  The name is a ERole value.
     *  - The name is not null.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ERole name;
}