package com.kyriba.school.scheduleservice.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class TeacherDTO {

	@ApiModelProperty("A teacher's name")
	@NotBlank
	private String name;

}
