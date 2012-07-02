package org.khanworld.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Id;

/**
 * User of the application
 */
public class AppUser{

	public enum Rank{
		ADMIN, MODERATOR, APPRENTICE
	};

	@Id
	public String		openId;
	public Set<String>	languages;
	public Rank			rank;

	public AppUser(String openId){
		this.openId = openId;
		this.languages = new HashSet<String>();
		this.rank = Rank.APPRENTICE;
	}

}
