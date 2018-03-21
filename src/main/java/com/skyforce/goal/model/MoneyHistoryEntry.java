package com.skyforce.goal.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "history")
public class MoneyHistoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private User goal;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "direction")
    private boolean direction;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
}
