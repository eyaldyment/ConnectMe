package com.connectme.webservice;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;

public class DBUtils {
	
	private static DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
	public static void UpdateEntity(Entity entity)
	{
		ds.put(entity);
	}
	
	public static GroupPojo GetEntity(Key id)
	{
		GroupPojo gp = new GroupPojo();
		try {
			
			Entity entity = ds.get(id);			
			gp.setGroupId(entity.getProperty("ID").toString());
			gp.setGroupName(entity.getProperty("Name").toString());
			
			
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gp;
		
	}

}
