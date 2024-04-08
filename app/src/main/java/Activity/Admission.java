package Activity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Admission extends AppCompatActivity {

    FloatingActionButton fab;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admission);
        fab = findViewById(R.id.fab);
        toolbar = findViewById(R.id.toolbar);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admission.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url = "https://international.collegeboard.org/students/studying-abroad/prepare";
                Intent intent = new Intent(Admission.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(webViewActivity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        if (networkInfo!=null && networkInfo.isConnected()){

            YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
            getLifecycle().addObserver(youTubePlayerView);

            youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "khXntOyVFJQ";
                    youTubePlayer.loadVideo(videoId, 0);
                }
            });

            YouTubePlayerView youtube_player_view1 = findViewById(R.id.youtube_player_view1);
            getLifecycle().addObserver(youtube_player_view1);

            youtube_player_view1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "-AicAgQw-Kg";
                    youTubePlayer.loadVideo(videoId, 1);
                }
            });


            YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
            getLifecycle().addObserver(youTubePlayerView2);

            youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "3I3KaVg7Z8c";
                    youTubePlayer.loadVideo(videoId, 2);
                }
            });

            YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
            getLifecycle().addObserver(youTubePlayerView3);

            youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "PjH5nKFc29Q";
                    youTubePlayer.loadVideo(videoId, 3);
                }
            });

            YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
            getLifecycle().addObserver(youTubePlayerView4);

            youTubePlayerView4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "dW7gwHejEh8";
                    youTubePlayer.loadVideo(videoId, 4);
                }
            });

            YouTubePlayerView youTubePlayerView5 = findViewById(R.id.youtube_player_view5);
            getLifecycle().addObserver(youTubePlayerView5);

            youTubePlayerView5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "g9sE2L1d-rk";
                    youTubePlayer.loadVideo(videoId, 5);
                }
            });


        }else {
            //Lottie.setVisibility(View.GONE);
            new AlertDialog.Builder(Admission.this)
                    .setTitle("No Internet")
                    .setMessage("Please Connect Your Internet")
                    .setIcon(R.drawable.no_internet)
                    .show();

        }

    }
}