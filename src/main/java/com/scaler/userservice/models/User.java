package com.scaler.userservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="users")
public class User extends BaseModel{
    private String name;
    private String email;
    private String hashedpassword;
    @ManyToMany
    private List<Role> roles;
    private boolean isEmailVerified;
}
