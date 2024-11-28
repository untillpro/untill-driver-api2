package com.untill.driver.untillapi.courses;

public class Course {
	/**
	 * Represents a unique identifier for the course.
	 */
	private Long id;
	/**
	 * The name of the course.
	 */
	private String name;
	/**
	 * The number associated with the course.
	 */
	private Integer number;
	/**
	 * Indicates whether the course is active or not.
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
