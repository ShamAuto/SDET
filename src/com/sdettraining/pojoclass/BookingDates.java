package com.sdettraining.pojoclass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDates {
    @JsonProperty
	String checkin;
    @JsonProperty
	String checkout;

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}
