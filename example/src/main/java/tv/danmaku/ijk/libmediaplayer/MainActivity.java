package tv.danmaku.ijk.libmediaplayer;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tv.danmaku.ijk.mediaplayer.PlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlayerActivity.intentTo(this,
                "YOUR_MEDIA_URI",
                "YOUR_TITLE",
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}
