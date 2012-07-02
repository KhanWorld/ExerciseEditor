package org.khanworld.model;

import javax.persistence.Id;
import com.google.appengine.api.datastore.Blob;
import com.googlecode.objectify.annotation.Parent;

/**
 * Exercise file, stored as Blob. With owner, language and exercise file name.
 */
public class File{

	public enum Status{
		EDITING, TESTED, APPROVED
	}

	@Parent
	public AppUser	owner;
	@Id
	public String		language;
	@Id
	public String		exercise;
	public Blob			file;
	public Status		status;

}
