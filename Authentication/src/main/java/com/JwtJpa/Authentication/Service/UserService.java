package com.JwtJpa.Authentication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JwtJpa.Authentication.Entity.UserEntity;
import com.JwtJpa.Authentication.Model.UserModel;
import com.JwtJpa.Authentication.Repository.UserModelRepositry;
import com.JwtJpa.Authentication.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserModelRepositry userModelRepositry;

	public List<UserModel> getUserModelList() {
		return this.userModelRepositry.findAll();
	}

	public UserEntity addUser(UserEntity user) {
		return this.userRepository.save(user);
	}

	public List<UserEntity> getAllUser() {
		return this.userRepository.findAll();
	}

	public UserEntity getUserById(Integer id) {
		return this.userRepository.findById(id).orElse(null);
	}

	public String updateUser(Integer id, String firstName, String lastName, String address, String pincode,
			String c_number, String ref_number) {
		UserEntity userEntity = this.userRepository.findById(id).orElse(null);

		if (userEntity != null) {
			if (firstName != "") {
				userEntity.setFirstName(firstName);
			}
			if (lastName != "") {
				userEntity.setLastName(lastName);
			}
			if (address != "") {
				userEntity.setAddress(address);
			}
			if (pincode != "") {
				userEntity.setPincode(pincode);
			}
			if (c_number != "") {
				userEntity.setC_number(c_number);
			}
			if (ref_number != "") {
				userEntity.setRef_number(ref_number);
			}

			this.userRepository.save(userEntity);
			return "Record update Successfully!!!";
		}
		return "Record Not Found";
	}

	public String deleteUserById(Integer id) {
		UserEntity userEntity = this.userRepository.findById(id).orElse(null);
		if (userEntity != null) {
			this.userRepository.findById(id);
			return "Record Delete Successfully!!";
		}
		return "Record Not found!!! kindly check ID.";
	}

	public UserModel createUser(UserModel userModel) {

		UserModel model = new UserModel(userModel.getUserId(), userModel.getUsername(), userModel.getPassword());
		UserModel save = this.userModelRepositry.save(userModel);
		return model;
	}
}
