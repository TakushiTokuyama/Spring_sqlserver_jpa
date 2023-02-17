package com.example.spring_sqlserver_jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department", schema="Humanresources")
public class Department {
	@Id
	private Short departmentID;

	private String name;

	@Column(name = "groupname")
	private String groupName;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	public Short getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Short departmentID) {
        this.departmentID = departmentID;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

	public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
