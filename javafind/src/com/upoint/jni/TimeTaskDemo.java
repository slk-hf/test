package com.upoint.jni;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskDemo {

	public void showDate() {
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				String date = new Date(System.currentTimeMillis()).toString();
				System.out.println(date);
			}
		};
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 1000, 1000*10);
	}
	
	public static void main(String[] args) {
		new TimeTaskDemo().showDate();
	}
}
