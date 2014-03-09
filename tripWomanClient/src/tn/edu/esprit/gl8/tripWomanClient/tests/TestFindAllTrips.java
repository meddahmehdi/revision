package tn.edu.esprit.gl8.tripWomanClient.tests;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import tn.edu.esprit.gl8.services.interfaces.TripWomanRemote;
import tn.edu.esprit.gl8.tripWoman.domain.Trip;

public class TestFindAllTrips {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			TripWomanRemote tripServicesRemote = (TripWomanRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.tripWoman/TripWoman!tn.edu.esprit.gl8.services.interfaces.TripWomanRemote");

			List<Trip> tripsFound = tripServicesRemote.findAllTrips();
			System.out.println(tripsFound.size());
		} catch (NamingException e) {

			e.printStackTrace();
		}
	}

}
