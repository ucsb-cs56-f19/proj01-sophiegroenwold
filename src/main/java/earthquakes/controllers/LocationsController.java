package earthquakes.controllers;

import earthquakes.services.EarthquakeQueryService;
import earthquakes.searches.LocSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.HashMap;
import earthquakes.geojson.FeatureCollection;

import com.nimbusds.oauth2.sdk.client.ClientReadRequest;

@Controller
public class LocationsController {

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    @GetMapping("/earthquakes/search")
    public String getLocationsSearch(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
        return "locations/search";
    }

    @GetMapping("/locations/results")
    public String getLocationsResults(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
	// EarthquakeQueryService e = new EarthquakeQueryService();	
	// model.addAttribute("eqSearch", eqSearch);
        // String json = e.getJSON(eqSearch.getDistance(), eqSearch.getMinmag());
        // model.addAttribute("json", json);
	// FeatureCollection featureCollection = FeatureCollection.fromJSON(json);
        // model.addAttribute("featureCollection",featureCollection);
	return "locations/results";
    }
}