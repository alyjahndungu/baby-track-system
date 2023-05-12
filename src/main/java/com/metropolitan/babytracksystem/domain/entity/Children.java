package com.metropolitan.babytracksystem.domain.entity;

import com.metropolitan.babytracksystem.utils.MaskData;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Builder
@Entity
@Table(name = "children")
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String placeOfBirth;

    @MaskData
    private  String registrationNumber;
    private  String dateOfBirth;
    private  String gender;
    private  Double  weight;
    private  String mothersName;
    private Integer mothersAge;
    private  String mothersOccupation;
    private  String  mothersMaritalStatus;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;

}
