package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "roles")

public class Roles {
    @Id
    private Integer id;
    @Column(name="Post", nullable=false,length=100)
    private String post;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "roles_users",
            foreignKey = @ForeignKey(name = "FK_roles_rolesID"),
            joinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_users_usersID"),
            inverseJoinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_roles_users_roleIdUserId",
                    columnNames = {"role_id", "user_id"})
    )
    private Collection<User> user;


}