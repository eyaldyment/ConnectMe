package com.connectme.webservice;

import javax.xml.ws.RespectBinding;

import com.connectme.webservice.jaxws.CreateGroupResponse;
import com.connectme.webservice.jaxws.CreateGroup;
import com.connectme.webservice.jaxws.GetGroup;
import com.connectme.webservice.jaxws.GetGroupResponse;


public class CreateGroupAdapter {

	GroupOperationService groupOps = new GroupOperationService();
	
	public CreateGroupResponse CreateGroup(CreateGroup request)
	{
		int groupID = request.getArg0();
		boolean status = groupOps.CreateGroup(groupID);
		CreateGroupResponse response = new CreateGroupResponse();
		response.setReturn(status);
		return response;				
	}
	
	public GetGroupResponse GetGroup(GetGroup request)
	{
		String name = request.getArg0();
		GroupPojo gp = groupOps.GetGroup(name);
		GetGroupResponse response = new GetGroupResponse();
		response.setReturn(gp);
		return response;	
		
	}
}
