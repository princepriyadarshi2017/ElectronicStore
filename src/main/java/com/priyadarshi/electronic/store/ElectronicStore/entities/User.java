package com.priyadarshi.electronic.store.ElectronicStore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity // this will create a table against this class by default the name will be of class name
@Table(name = "users") // this give the if we don't want by defualt name
public class User {
    @Id
    private int id;
    @Column(name = "user_name") //this will change the by defualt name
    private String name;
    @Column(name = "email_id",unique = true)
    private String email;
    @Column(name = "pass_wrd",nullable = false)
    private String password;
    @Column(name = "gender_fe")
    private String gender;

}
