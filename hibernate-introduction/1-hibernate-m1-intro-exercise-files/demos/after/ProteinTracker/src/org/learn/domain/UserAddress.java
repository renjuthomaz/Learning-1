package org.learn.domain;

public class UserAddress {
	private String houseNo;
	private String street1;
	private String street2;

	public UserAddress() {

	}

	public UserAddress(String houseNo, String street1, String street2) {
		super();
		this.houseNo = houseNo;
		this.street1 = street1;
		this.street2 = street2;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

}
