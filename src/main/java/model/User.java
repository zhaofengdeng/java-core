package model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.annotation.ChangeLog;
import io.ebean.annotation.DbComment;
import io.ebean.annotation.Index;


@Entity
@Table(name = "tbl_user",catalog="star")
@DbComment("用户表")
//使用star这个库,mysql可行，sqlserver不行
public class User  {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name",length=500)
	private String name;
	
	@Column(name = "phone")
	@Index
	private String phone;
	
	@Column(name = "deleted")
	private Boolean deleted;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}




}
