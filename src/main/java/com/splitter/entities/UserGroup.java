package com.splitter.entities;

import lombok.*;

import javax.persistence.*;

/**
 * Created by prateekgupta on 09/09/17.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user_gang")
@Entity
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gang_id", referencedColumnName = "id")
    private Group gang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public UserGroup(User user) {
        this.user = user;
    }

    public UserGroup(Group gang, User user) {
        this.gang = gang;
        this.user = user;
    }

}
