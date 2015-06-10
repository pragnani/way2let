package com.mobjax.way2let.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer userId;

	private String email;
	private String password;
	private String fullname;
	private String profession;
	private String occupation;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String area;
	private String mobile;
	private String referrer;
	private String company;
	private String dealings;
	private Integer roleId;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getDealings() {
		return dealings;
	}
	public void setDealings(String dealings) {
		this.dealings = dealings;
	}
	public String getStrCompany() {
		return company;
	}
	public void setStrCompany(String strCompany) {
		this.company = strCompany;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getStrEmail() {
		return email;
	}
	public void setStrEmail(String strEmail) {
		this.email = strEmail;
	}
	public String getStrPassword() {
		return password;
	}
	public void setStrPassword(String strPassword) {
		this.password = strPassword;
	}
	public String getStrFullName() {
		return fullname;
	}
	public void setStrFullName(String strFullName) {
		this.fullname = strFullName;
	}
	public String getStrProfession() {
		return profession;
	}
	public void setStrProfession(String strProfession) {
		this.profession = strProfession;
	}
	public String getStrOccupation() {
		return occupation;
	}
	public void setStrOccupation(String strOccupation) {
		this.occupation = strOccupation;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getStrArea() {
		return area;
	}
	public void setStrArea(String strArea) {
		this.area = strArea;
	}
	public String getStrMobileNo() {
		return mobile;
	}
	public void setStrMobileNo(String strMobileNo) {
		this.mobile = strMobileNo;
	}
	public String getStrReferrer() {
		return referrer;
	}
	public void setStrReferrer(String strReferrer) {
		this.referrer = strReferrer;
	}

}
