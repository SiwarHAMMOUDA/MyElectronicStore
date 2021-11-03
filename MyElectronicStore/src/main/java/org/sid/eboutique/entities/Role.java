package org.sid.eboutique.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity

public class Role  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long idRole;
private String roleName;
@ManyToOne
@JoinColumn(name="user_id")
private User users;
public User getUsers() {
	return users;
}
public void setUsers(User users) {
	this.users = users;
}
public Long getIdRole() {
	return idRole;
}
public Role(String roleName) {
	super();
	this.roleName = roleName;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public void setIdRole(Long idRole) {
	this.idRole = idRole;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}

}
