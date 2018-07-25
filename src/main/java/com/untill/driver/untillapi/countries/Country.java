package com.untill.driver.untillapi.countries;

public class Country {

	private Long id;

	private String name;

	private String code;

	private CountryKind kind;
	
	private Boolean active = true;

	
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CountryKind getKind() {
		return kind;
	}

	public void setKind(CountryKind kind) {
		this.kind = kind;
	}

}
