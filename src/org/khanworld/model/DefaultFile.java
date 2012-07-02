package org.khanworld.model;

import javax.persistence.Id;
import com.google.appengine.api.datastore.Blob;

/**
 * The current file that is used for the exercise, this can be set my
 * administrators or moderators for their language.
 */
public class DefaultFile{

	public AppUser	updater;
	public AppUser	approver;
	@Id
	public Language	language;
	@Id
	public String	exercise;
	@Id
	public Integer	version;
	public Blob		file;

}
