package com.megabox.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class ScreeningDate {
	private String screeningNumber, movieTitle,times,day,timeSeq;
}
