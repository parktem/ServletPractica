package es.salesianos.service;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Owner;
import es.salesianos.model.assembler.OwnerAssembler;
import es.salesianos.repository.Repository;

public class OwnerService {

	private Repository repository = new Repository();
	
	
	public Owner assembleOwnerFromRequest(HttpServletRequest req) {
		return OwnerAssembler.assembleOwnerFrom(req);
	}
	
	public void addOwner(Owner owner) {
		repository.insert(owner);
	}
	
	
}
