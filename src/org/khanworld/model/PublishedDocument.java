package org.khanworld.model;

import java.io.Serializable;
import javax.persistence.Id;
import com.google.appengine.api.datastore.Blob;

/**
 * The current file that is used for the exercise, this can be set my
 * administrators or moderators for their language.
 */
public class PublishedDocument implements Serializable{

	private static final long	serialVersionUID	= 1L;

	@Id
	public String				language;
	@Id
	public String				id;
	@Id
	public Integer				version;
	public AppUser				updater;
	public AppUser				publisher;
	public Blob					file;

}
