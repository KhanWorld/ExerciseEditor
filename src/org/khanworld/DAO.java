package org.khanworld;

import org.khanworld.model.AppUser;
import com.google.appengine.api.users.User;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;

/**
 * Data Access Object
 * 
 * http://code.google.com/p/objectify-appengine/wiki/BestPractices#Use_a_DAO
 */
public class DAO extends DAOBase{

	static{
		ObjectifyService.register(AppUser.class);
		//ObjectifyService.register(Document.class);
		//ObjectifyService.register(Language.class);
		//ObjectifyService.register(PublishedDocument.class);
	}

	/**
	 * Loads an AppUser, or creates an AppUser if the openId has no AppUser
	 * associated with it.
	 * 
	 * @return the AppUser associated with the given openId
	 */
	public AppUser loginAppUser(User gaeuser){
		AppUser user = ofy().find(AppUser.class, gaeuser.getUserId());
		if(user == null){
			user = new AppUser(gaeuser.getUserId(), gaeuser.getEmail());
			ofy().put(user);
		}
		return user;
	}

}
