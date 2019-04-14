package com.splitter.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by prateekgupta on 09/09/17.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private String contact;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserGroup> userGroup;

    public User(String nam, String email, String contact) {
        super();
        this.name = nam;
        this.email = email;
        this.contact = contact;
    }

}
