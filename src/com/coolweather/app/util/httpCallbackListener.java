package com.coolweather.app.util;

public interface httpCallbackListener {
	void onFinish(String response);

	void onError(Exception e);
}
