package com.example.psbogroup3.entity;

import com.example.psbogroup3.enums.Gender;
import com.example.psbogroup3.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author muhammad.reyhan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("persons")
public class Person {
  @Id
  private String id;
  private String name;
  private Gender gender;
  private String address;
  private String email;
  private Long birthDate;
  private String education;
  private Status status;
  private String photo;
  private String religion;
  private String nationality;
  private String job;
}
