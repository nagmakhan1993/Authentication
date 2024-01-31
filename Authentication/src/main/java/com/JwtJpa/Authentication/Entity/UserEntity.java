package com.JwtJpa.Authentication.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "UserLogin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@DynamicUpdate
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "LastName", nullable = false)
    private String lastName;
    @Column(name = "Address", nullable = false)
    private String address;
    @Column(name = "Pincode", nullable = false)
    private String pincode;
    @Column(name = "ContactNumber", nullable = false)
    private String c_number;
    @Column(name = "RefferenceNumber", nullable = false)
    private String ref_number;
}
