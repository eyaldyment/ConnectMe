package com.connectme.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@WebService 
public class GroupOperationService {
	@WebMethod
	public boolean CreateGroup (int groupID)
	{
		Entity group = new Entity("Group",groupID);
		group.setProperty("ID", groupID);
		group.setProperty("Name", "test");
		
		DBUtils.UpdateEntity(group);	
		
		
		return true;
		
	}
	@WebMethod
	public GroupPojo GetGroup(String name)
	{
		Key key = KeyFactory.createKey("Group", name);
		GroupPojo gp = DBUtils.GetEntity(key);
		

		return gp;
	}

}
