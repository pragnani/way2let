package com.mobjax.way2let.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer userId;

	private String strEmail;
	private String strPassword;
	private String strFullName;
	private String strProfession;
	private String strOccupation;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String strArea;
	private String strMobileNo;
	private String strReferrer;
	private String strCompany;
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
		return strCompany;
	}
	public void setStrCompany(String strCompany) {
		this.strCompany = strCompany;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public String getStrFullName() {
		return strFullName;
	}
	public void setStrFullName(String strFullName) {
		this.strFullName = strFullName;
	}
	public String getStrProfession() {
		return strProfession;
	}
	public void setStrProfession(String strProfession) {
		this.strProfession = strProfession;
	}
	public String getStrOccupation() {
		return strOccupation;
	}
	public void setStrOccupation(String strOccupation) {
		this.strOccupation = strOccupation;
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
		return strArea;
	}
	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}
	public String getStrMobileNo() {
		return strMobileNo;
	}
	public void setStrMobileNo(String strMobileNo) {
		this.strMobileNo = strMobileNo;
	}
	public String getStrReferrer() {
		return strReferrer;
	}
	public void setStrReferrer(String strReferrer) {
		this.strReferrer = strReferrer;
	}

}
