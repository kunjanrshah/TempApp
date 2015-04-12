package com.drc.scroll;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video_Act extends Activity {

	private String mPath = null;
	private VideoView mVideoView = null;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dynamic);

		// Media_Player_();
		getVideo_Assets();
		Toast.makeText(this, "This is simple toast", Toast.LENGTH_SHORT);
		Toast aToast = Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT);
		ToastExpander.showFor(aToast, 30000);
	}

	private void Media_Player_() {
		MediaPlayer mp = MediaPlayer.create(Video_Act.this, R.raw.one);
		mp.start();
	}

	private void getVideo_Assets() {
		mVideoView = (VideoView) findViewById(R.id.vv_myVideoview);
		// mPath = "file:///android_asset/one.png";
		// mPath = "/mnt/sdcard/one.mp4";
		mPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/one.mp4";
		Toast.makeText(this, "" + mPath, Toast.LENGTH_SHORT).show();
		Log.i("Path ", "FILE :" + mPath);
		if (mPath == "") {
			// Tell the user to provide a media file URL/path.
			Toast.makeText(Video_Act.this, "Please edit VideoViewDemo Activity, and set path" + " variable to your media file URL/path", Toast.LENGTH_LONG).show();

		} else {

			/*
			 * Alternatively,for streaming media you can use
			 * mVideoView.setVideoURI(Uri.parse(URLstring));
			 */
			// player.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),
			// afd.getLength());
			// String uriPath = "android.resource://com.drc.scroll/raw/one";
			String uriPath = "android.resource://com.drc.scroll/raw/jainish";
			Uri uri = Uri.parse(uriPath);
			mVideoView.setVideoURI(uri);

			// mVideoView.setVideoPath(mPath);
			mVideoView.setMediaController(new MediaController(this));
			mVideoView.requestFocus();

		}
	}
}
