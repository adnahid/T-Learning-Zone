package Activity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import org.json.JSONObject;

public class Vedio extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vedio);
        toolbar = findViewById(R.id.toolbar);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(webViewActivity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vedio.this, HomeActivity.class);
                startActivity(intent);
            }
        });


/*
        RequestQueue requestQueue = Volley.newRequestQueue(Vedio.this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, "https://hedgier-oars.000webhostapp.com/hello.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                textView.setText("On Response"+response);
                progressBar.setVisibility(View.GONE);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Server Error");
                progressBar.setVisibility(View.GONE);

            }
        });


        requestQueue.add(stringRequest);

 */



        if (networkInfo!=null && networkInfo.isConnected()){

            YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
            getLifecycle().addObserver(youTubePlayerView);

            youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "WglxKJMBwh0";
                    youTubePlayer.loadVideo(videoId, 0);
                }
            });

            YouTubePlayerView youtube_player_view1 = findViewById(R.id.youtube_player_view1);
            getLifecycle().addObserver(youtube_player_view1);

            youtube_player_view1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "2N0g6kJeYPQ";
                    youTubePlayer.loadVideo(videoId, 1);
                }
            });


            YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
            getLifecycle().addObserver(youTubePlayerView2);

            youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "6XSbBV-ISw0";
                    youTubePlayer.loadVideo(videoId, 2);
                }
            });

            YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
            getLifecycle().addObserver(youTubePlayerView3);

            youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "BBxjhVDQl18";
                    youTubePlayer.loadVideo(videoId, 3);
                }
            });

            YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
            getLifecycle().addObserver(youTubePlayerView4);

            youTubePlayerView4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "gVZj0CHVZK0";
                    youTubePlayer.loadVideo(videoId, 4);
                }
            });

            YouTubePlayerView youTubePlayerView5 = findViewById(R.id.youtube_player_view5);
            getLifecycle().addObserver(youTubePlayerView5);

            youTubePlayerView5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "FmvR8lsbd7o";
                    youTubePlayer.loadVideo(videoId, 5);
                }
            });

            YouTubePlayerView youTubePlayerView6 = findViewById(R.id.youtube_player_view6);
            getLifecycle().addObserver(youTubePlayerView6);

            youTubePlayerView6.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "WglxKJMBwh0";
                    youTubePlayer.loadVideo(videoId, 6);
                }
            });

        }else {
            //Lottie.setVisibility(View.GONE);
            new AlertDialog.Builder(Vedio.this)
                    .setTitle("No Internet")
                    .setMessage("Please Connect Your Internet")
                    .setIcon(R.drawable.no_internet)
                    .show();

        }












    }
}