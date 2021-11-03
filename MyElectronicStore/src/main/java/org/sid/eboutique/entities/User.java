package org.sid.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="users")
public class User  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
private Long idUser;
	@Column(name="user_name")
private  String userName;
private String password;
private boolean activated;
@OneToMany
@JoinColumn(name="user_id")
private Collection<Role> roles;
public Long getIdUser() {
	return idUser;
}
public void setIdUser(Long idUser) {
	this.idUser = idUser;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isActivated() {
	return activated;
}
public void setActivated(boolean activated) {
	this.activated = activated;
}
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String userName, String password, boolean activated) {
	super();
	this.userName = userName;
	this.password = password;
	this.activated = activated;
}

}
