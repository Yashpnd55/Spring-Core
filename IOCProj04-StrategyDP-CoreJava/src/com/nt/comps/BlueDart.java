package com.nt.comps;

public final class BlueDart implements Courier {
	
	@Override
	public String deliver(int oid) {
		
		return "BlueDart courier is Assigned to deliver the order id::"+oid +"products";
	}

}
