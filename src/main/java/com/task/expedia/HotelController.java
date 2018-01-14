package com.task.expedia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.task.expedia.model.HotelDeals;


/**
 * @author masadeh
 *
 */
@Controller
public class HotelController {

	private String expediaURI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHotels(Model model, @RequestParam(value = "destinationName", required = false) String destinationName,
			@RequestParam(value = "maxTotalRate", required = false) String maxTotalRate,
			@RequestParam(value = "maxTripStartDate", required = false) String maxTripStartDate) {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder url = new StringBuilder();
		url.append(expediaURI);
		if (destinationName != null && !destinationName.equals("")) {
			url.append("&destinationName=" + destinationName);
		}

		if (maxTotalRate != null && !maxTotalRate.equals("")) {
			url.append("&maxTotalRate=" + maxTotalRate);
		}

		if (maxTripStartDate != null && !maxTripStartDate.equals("")) {
			url.append("&maxTripStartDate=" + maxTripStartDate);
		}
		HotelDeals hotels = restTemplate.getForObject(url.toString(), HotelDeals.class);
		model.addAttribute("hotels", hotels);
		return "/index";
	}

}