package com.JwtJpa.Authentication.Entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getC_number() {
		return c_number;
	}

	public void setC_number(String c_number) {
		this.c_number = c_number;
	}

	public String getRef_number() {
		return ref_number;
	}

	public void setRef_number(String ref_number) {
		this.ref_number = ref_number;
	}

}
