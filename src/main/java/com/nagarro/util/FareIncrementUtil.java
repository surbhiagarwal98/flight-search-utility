package com.nagarro.util;

import static com.nagarro.util.CommonConstants.*;

/**
 * increments fare by given percentage
 * 
 * @author surbhiagarwal
 *
 */
public class FareIncrementUtil {

	public static double incrementFare(double fare) {
		fare = fare + (FARE_INCREMENT_PERCENT * fare) / 100;
		return fare;
	}
}
