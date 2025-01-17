package com.example.psbogroup3.web.model.request;

import com.example.psbogroup3.enums.Gender;
import com.example.psbogroup3.enums.Status;
import com.example.psbogroup3.validation.StringEnumeration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author muhammad.reyhan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePersonRequest {
  private String name;

  @StringEnumeration(message = "Must Gender Enum", enumClass = Gender.class)
  private String gender;

  private String address;

  private String email;

  private Long birthDate;

  private String education;

  @StringEnumeration(message = "Must Status Enum", enumClass = Status.class)
  private String status;

  private String photo;

  private String religion;

  private String nationality;

  private String job;
}
