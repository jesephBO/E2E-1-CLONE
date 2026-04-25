package org.e2e.labe2e01.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.e2e.labe2e01.coordinate.domain.Coordinate;
import org.springframework.data.annotation.Id;
import java.time.ZonedDateTime;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@RequiredArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double avg_rating=0.0;


    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Role role;


    private Integer trips=0;

    @Column(nullable = false)
    private ZonedDateTime created_at;
    private ZonedDateTime updated_at;

    @Column(unique = true,nullable = false, columnDefinition = "VARCHAR(255)")
    private String email;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String first_name;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String last_name;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String password;

    @Column(nullable = false,unique=true, columnDefinition = "VARCHAR(255)")
    private String phone_number;

    @ManyToOne
    @JoinColumn(name="coordinate_id")
    private Coordinate coordinate;
}