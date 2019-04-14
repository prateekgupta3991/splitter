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
@Table(name = "bill_user_gang")
@Entity
public class BillUserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "amount")
    private Double share;

    public BillUserGroup(User user, Double share) {
        this.user = user;
        this.share = share;
    }

    public BillUserGroup(Bill bill, User user, Double share) {
        this.bill = bill;
        this.user = user;
        this.share = share;
    }

}
