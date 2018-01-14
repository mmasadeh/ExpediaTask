package com.task.expedia;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
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
	public String index(Model model, @RequestParam(value = "destinationName", required = false) String destinationName,
			@RequestParam(value = "minTripStartDate", required = false) String minTripStartDate,
			@RequestParam(value = "maxTripStartDate", required = false) String maxTripStartDate) {
		LocalDate min = null;
		LocalDate max = null;
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder url = new StringBuilder();
		url.append(expediaURI);
		final DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/mm/yyyy");

		if (destinationName != null && !destinationName.equals("")) {
			url.append("&destinationName=" + destinationName);
		}

		if (minTripStartDate != null && !minTripStartDate.equals("")) {
			min = dtf.parseLocalDate(minTripStartDate);
			url.append("&minTripStartDate=" + minTripStartDate);
		}

		if (maxTripStartDate != null && !maxTripStartDate.equals("")) {
			max = dtf.parseLocalDate(maxTripStartDate);
			url.append("&maxTripStartDate=" + maxTripStartDate);
		}
		HotelDeals hotels = restTemplate.getForObject(url.toString(), HotelDeals.class);
		model.addAttribute("hotels", hotels);
		return "/index";
	}

}