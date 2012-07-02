package org.khanworld.model;

import java.io.Serializable;
import javax.persistence.Id;

public class Language implements Serializable{

	private static final long	serialVersionUID	= 1L;

	public static final String	ENGLISH				= "en_US";

	@Id
	public String				code;
	public String				name;
	/**
	 * If true the language is Left-to-right
	 */
	public Boolean				ltr;

}
