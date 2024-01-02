package com.zm.ams.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class AmcSearchCriteria implements SearchCriteria {
	private String amcName;
	private String state;
	private String city;
	
	
	
	
	
	
}