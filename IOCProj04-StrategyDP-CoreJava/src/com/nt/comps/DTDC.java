package com.nt.comps;

public final class DTDC implements Courier {
	
	@Override
	public String deliver(int oid) {
		
		return "DTDC courier Assigned to deliver the order id::"+oid +"products";
	}

}
