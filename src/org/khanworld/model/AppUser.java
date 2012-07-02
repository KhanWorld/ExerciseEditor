package org.khanworld.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Id;

/**
 * User of the application
 */
public class AppUser implements Serializable{

	private static final long	serialVersionUID	= 1L;

	public enum Role{
		ADMIN, MODERATOR, TRANSLATOR
	};

	@Id
	public String		id;
	public String		email;
	public Set<String>	languages;
	public String		defaultLanguage;
	public Role			role;

	@SuppressWarnings("unused")
	private AppUser(){}

	public AppUser(String id, String email){
		this.id = id;
		this.email = email;
		this.role = Role.TRANSLATOR;
		this.languages = new HashSet<String>();
		this.defaultLanguage = Language.ENGLISH;
	}

}
