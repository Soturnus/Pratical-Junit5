package com.healthycoderapp;

public class ActivityCalculator {
	
	private static final int WORKOUT_DURATION_MIN = 45;
	
	public static String rateActivityLevel(int weeklyCardionMin, int weeklyWorkoutSessions) {
		
		if (weeklyCardionMin < 0 || weeklyWorkoutSessions < 0) {
			throw new RuntimeException("Input below 0");
		}
		
		int totalMinutes = weeklyCardionMin + weeklyWorkoutSessions * WORKOUT_DURATION_MIN;
		double avgDailyActivityMins = totalMinutes / 7.0;
		
		if (avgDailyActivityMins < 20) {
			return "bad";
		} else if (avgDailyActivityMins < 40) {
			return "average";
		}
		return "good";
	}

}
