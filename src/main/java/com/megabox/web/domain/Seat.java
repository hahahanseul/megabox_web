package com.megabox.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Seat {
	private String screeningNumber, seatName, yesNo;
	//private String line,seatno,screeningnumber,seat_name,type,cancel;
}
