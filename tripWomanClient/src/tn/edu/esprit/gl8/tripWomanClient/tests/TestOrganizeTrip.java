package tn.edu.esprit.gl8.tripWomanClient.tests;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.services.interfaces.TripWomanRemote;
import tn.edu.esprit.gl8.tripWoman.domain.Organizer;
import tn.edu.esprit.gl8.tripWoman.domain.Trip;

public class TestOrganizeTrip {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			TripWomanRemote tripServicesRemote = (TripWomanRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.tripWoman/TripWoman!tn.edu.esprit.gl8.services.interfaces.TripWomanRemote");

			Trip trip = new Trip();
			trip.setName("casa");

			Organizer organizer = new Organizer();
			organizer.setName("wass");

			tripServicesRemote.organizeTrip(organizer, trip);

		} catch (NamingException e) {

			e.printStackTrace();
		}
	}

}
