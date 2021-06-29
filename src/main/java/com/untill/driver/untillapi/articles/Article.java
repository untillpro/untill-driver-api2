package com.untill.driver.untillapi.articles;

public class Article {

	/**
	 * Article internal ID
	 */
	private Long id;
	/**
	 * Article name
	 */
	private String name;
	/**
	 * Article 3rd party ID
	 */
	private String thirdPartyId;
	/**
	 * Article active flag
	 */
	private Boolean active;

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

	public String getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Article{"
				+ "id=" + id
				+ ", name='" + name + '\''
				+ ", thirdPartyId='" + thirdPartyId + '\''
				+ ", active=" + active
				+ '}';
	}
}
