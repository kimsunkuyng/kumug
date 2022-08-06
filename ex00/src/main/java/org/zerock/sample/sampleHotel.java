package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NonNull;
import lombok.ToString;

//@Component
//@ToString
//@Getter
//public class sampleHotel {
//	private Chef chef;
//	public sampleHotel(Chef chef) {
//		this.chef = chef;
//	}
//}
	@Component
	@ToString
	@Getter
	@AllArgsConstructor
	public class sampleHotel{
		
//		@NonNull
		private Chef chef;
	}
