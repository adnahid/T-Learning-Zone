package Activity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.squareup.picasso.Picasso;

public class Skill extends AppCompatActivity {

    CardView programing,graphic,digital,app;
    ImageView programingImage,graphicImage,digitalImage,appImage;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skill);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(webViewActivity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        toolbar = findViewById(R.id.toolbar);
        programing = findViewById(R.id.programing);
        graphic = findViewById(R.id.graphic);
        digital = findViewById(R.id.digital);
        app = findViewById(R.id.app);

        programingImage = findViewById(R.id.programingImage);
        graphicImage = findViewById(R.id.graphicImage);
        digitalImage = findViewById(R.id.digitalImage);
        appImage = findViewById(R.id.appImage);


        String image1 = "https://cdn-icons-png.flaticon.com/128/2721/2721593.png";
        String image2 = "https://cdn-icons-png.flaticon.com/128/2779/2779775.png";
        String image3 = "https://cdn-icons-png.flaticon.com/128/8644/8644426.png";
        String image4 = "https://cdn-icons-png.flaticon.com/128/6188/6188094.png";

        Picasso.get().load(image1).placeholder(R.drawable.message).into(programingImage);
        Picasso.get().load(image2).placeholder(R.drawable.message).into(graphicImage);
        Picasso.get().load(image3).placeholder(R.drawable.message).into(digitalImage);
        Picasso.get().load(image4).placeholder(R.drawable.message).into(appImage);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skill.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        if (networkInfo != null && networkInfo.isConnected()) {

            YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
            getLifecycle().addObserver(youTubePlayerView);

            youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "t0vo7LmHrD8";
                    youTubePlayer.loadVideo(videoId, 0);
                }
            });

            YouTubePlayerView youtube_player_view1 = findViewById(R.id.youtube_player_view1);
            getLifecycle().addObserver(youtube_player_view1);

            youtube_player_view1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "mBkvMgBYJ90";
                    youTubePlayer.loadVideo(videoId, 1);
                }
            });


            YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
            getLifecycle().addObserver(youTubePlayerView2);

            youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "uNNcfiqNajg";
                    youTubePlayer.loadVideo(videoId, 2);
                }
            });

            YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
            getLifecycle().addObserver(youTubePlayerView3);

            youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "vomIhMTw8H4";
                    youTubePlayer.loadVideo(videoId, 3);
                }
            });

            YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
            getLifecycle().addObserver(youTubePlayerView4);

            youTubePlayerView4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "ZYvbmVEwX14";
                    youTubePlayer.loadVideo(videoId, 4);
                }
            });

            //2nd

            YouTubePlayerView youTubePlayerView6 = findViewById(R.id.youtube_player_view);
            getLifecycle().addObserver(youTubePlayerView6);

            youTubePlayerView6.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "JH-Yyb50ZvM";
                    youTubePlayer.loadVideo(videoId, 5);
                }
            });

            YouTubePlayerView youtube_player_view7 = findViewById(R.id.youtube_player_view1);
            getLifecycle().addObserver(youtube_player_view7);

            youtube_player_view7.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "e_dv7GBHka8";
                    youTubePlayer.loadVideo(videoId, 6);
                }
            });

            YouTubePlayerView youTubePlayerView8 = findViewById(R.id.youtube_player_view2);
            getLifecycle().addObserver(youTubePlayerView8);

            youTubePlayerView8.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "InigFUSiPl8";
                    youTubePlayer.loadVideo(videoId, 7);
                }
            });

            YouTubePlayerView youTubePlayerView9 = findViewById(R.id.youtube_player_view3);
            getLifecycle().addObserver(youTubePlayerView9);

            youTubePlayerView9.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = "dS0PtshQDls";
                    youTubePlayer.loadVideo(videoId, 8);
                }
            });


        }
            else {
            //Lottie.setVisibility(View.GONE);
            new AlertDialog.Builder(Skill.this)
                    .setTitle("No Internet")
                    .setMessage("Please Connect Your Internet")
                    .setIcon(R.drawable.no_internet)
                    .show();

        }







            app.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    webViewActivity.url = "https://www.mygreatlearning.com/mobile-app-development/free-courses";
                    Intent intent = new Intent(Skill.this, webViewActivity.class);
                    startActivity(intent);
                }
            });


            programing.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    webViewActivity.url = "https://www.coursera.org/articles/what-is-programming";
                    Intent intent = new Intent(Skill.this, webViewActivity.class);
                    startActivity(intent);
                }
            });


            graphic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    webViewActivity.url = "https://www.udemy.com/topic/graphic-design/free/";
                    Intent intent = new Intent(Skill.this, webViewActivity.class);
                    startActivity(intent);
                }
            });


            digital.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    webViewActivity.url = "https://www.simplilearn.com/free-digital-marketing-basics-course-skillup";
                    Intent intent = new Intent(Skill.this, webViewActivity.class);
                    startActivity(intent);
                }
            });

        }
    }