package com.online.shopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserData {

	@Column
//	TODO: @Schema(description="FirstName of the user",required=true,example="John")
	@NotNull(message = "Firstname is mandatory")
	@NotBlank(message = "FirstName should not be empty")
	private String firstName;

	@Column
//    TODO: @Schema(description="LastName of the User",required=true,example="doe")
	@NotNull(message = "Lasttname is mandatory")
	@NotBlank(message = "LastName should not be empty")
	private String lastName;

	@Email
	@Column(unique = true, nullable = false)
	@NotBlank(message = "Email should not be empty")
//	TODO: @Schema(description = "Email of the User", required = true, example = "johndoe524@gmail.com")
	private String email;

	@Id
	@NotBlank(message = "LoginId should not be empty")
	@NotNull(message = "LoginId is mandatory")
	@Pattern(regexp = "[a-zA-Z0-9@.]*$", message = "LoginId should contain only Alphabets and Numbers")
//    TODO: @Schema(description="UserName of the User",required=true,example="Sriram2")
	private String loginId;

	@Column
	@NotNull(message = "Password is mandatory")
	@NotBlank(message = "Password should not be empty")
	@Size(min = 8, message = "minimum 8 Characters required")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	TODO: @Schema(description="Password of the User",required=true,example="Qwerty123")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&()])(?=\\S+$).{8,}$", message = "password must alteast 8 characters,one Lowercase letter,one Uppercase letter,one numeric value,one special character")
	private String password;

	@Transient
	@NotNull(message = "Password is mandatory")
	@NotBlank(message = "Password should not be empty")
	@Size(min = 8, message = "minimum 8 Characters required")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	TODO: @Schema(description="Password of the User",required=true,example="Qwerty123")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&()])(?=\\S+$).{8,}$", message = "password must alteast 8 characters,one Lowercase letter,one Uppercase letter,one numeric value,one special character")
	private String confirmPassword;

	@Column
	@NotNull(message = "ContactNumber is mandatory")
	// TODO
	// @Schema(description="Contact Number of the
	// User",required=true,example="9999999999")
	private String contactNumber;
	
	@Column
	private String role = "ROLE_CUSTOMER"; 
}
