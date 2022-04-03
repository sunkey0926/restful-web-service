package com.example.demo.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor		
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
@Entity
public class User {

	public User(int id, String name, Date joinDate, String password, String ssn) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
		this.password = password;
		this.ssn = ssn;
	}


	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
	private String name;
	
	@Past
	private Date joinDate;
	
	
//  @JsonIgnore
	private String password;
//	@JsonIgnore
	private String ssn;
	
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;
	
	 
}
