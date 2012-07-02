package org.khanworld.model;

import java.io.Serializable;
import javax.persistence.Id;
import com.google.appengine.api.datastore.Blob;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Parent;

/**
 * Exercise file, stored as Blob. With owner, language and exercise file name.
 */
public class Document implements Serializable{

	private static final long	serialVersionUID	= 1L;

	public enum Status{
		DRAFT, PENDING_REVIEW, PENDING_PUBLISHING
	}

	@Parent
	public Key<AppUser>	owner;
	@Id
	public String		language;
	@Id
	public String		id;
	public Blob			file;
	public Status		status;

}
