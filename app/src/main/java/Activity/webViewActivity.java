package Activity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.example.learningzone.R;

public class webViewActivity extends AppCompatActivity {
    WebView webView;

    LottieAnimationView Lottie;

    ProgressBar progressBar;
    public static String url = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_web_view);
        webView = findViewById(R.id.webView);
       // progressBar = findViewById(R.id.progressBar);
        Lottie = findViewById(R.id.Lottie);


        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(webViewActivity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        webView.setVisibility(View.GONE);
        Lottie.setVisibility(View.VISIBLE);



        if (networkInfo!=null && networkInfo.isConnected()){
            webView.setVisibility(View.VISIBLE);
            Lottie.setVisibility(View.GONE);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }else {
            //Lottie.setVisibility(View.GONE);
            new AlertDialog.Builder(webViewActivity.this)
                    .setTitle("No Internet")
                    .setMessage("Please Connect Your Internet")
                    .setIcon(R.drawable.no_internet)
                    .show();


        }






    }
}