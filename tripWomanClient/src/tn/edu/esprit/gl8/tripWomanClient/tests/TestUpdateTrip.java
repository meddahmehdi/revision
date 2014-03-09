package tn.edu.esprit.gl8.tripWomanClient.tests;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.services.interfaces.TripWomanRemote;
import tn.edu.esprit.gl8.tripWoman.domain.Trip;

public class TestUpdateTrip {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			TripWomanRemote tripServicesRemote = (TripWomanRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.tripWoman/TripWoman!tn.edu.esprit.gl8.services.interfaces.TripWomanRemote");

			Trip tripFound = tripServicesRemote.findTripById(1);

			tripFound.setName("jamaica");

			tripServicesRemote.updateTrip(tripFound);

		} catch (NamingException e) {

			e.printStackTrace();
		}
	}
}
