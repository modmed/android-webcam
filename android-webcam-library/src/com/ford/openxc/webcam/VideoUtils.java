/**
 *	Copyright (c) 2013-2014, Modernizing Medicine Inc. All rights reserved.
 *	
 *	http://www.modernizingmedicine.com
 *	
 *	@author Alex Rocha 
 * 
 */
package com.ford.openxc.webcam;

import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class VideoUtils {
	
	public final static String PREFERENCES_VIDEO_RES = "video_resolution";
	public final static String PREFERENCES_VIDEO_RES_DEFAULT = "1024x600";
	
	public static final int getVideoWidth(Context context) {
		return Integer.parseInt(getCurrentVideoResolution(context).get(0));
	}
	
	public static final int getVideoHeight(Context context) {
		return Integer.parseInt(getCurrentVideoResolution(context).get(1));
	}
	
	private static List<String> getCurrentVideoResolution(Context context) {
		
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
		String resolution = prefs.getString(PREFERENCES_VIDEO_RES, PREFERENCES_VIDEO_RES_DEFAULT);
		List<String> items = Arrays.asList(resolution.split("x"));
		
		return items;
	}
}
