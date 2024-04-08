package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.squareup.picasso.Picasso;

public class ImportanceLink extends AppCompatActivity {

    CardView link1,link2,link3,link4,link5,link6,link7,link8;
    ImageView imageLink1,imageLink2,imageLink3,imageLink4,imageLink6,imageLink7,imageLink8;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_importance_link);

        toolbar = findViewById(R.id.toolbar);

        link1 = findViewById(R.id.link1);
        link2 = findViewById(R.id.link2);
        link3 = findViewById(R.id.link3);
        link4 = findViewById(R.id.link4);
        link5 = findViewById(R.id.link5);
        link6 = findViewById(R.id.link6);
        link7 = findViewById(R.id.link7);
        link8 = findViewById(R.id.link8);

        imageLink1 = findViewById(R.id.imageLink1);
        imageLink2 = findViewById(R.id.imageLink2);
        imageLink3 = findViewById(R.id.imageLink3);
        imageLink4 = findViewById(R.id.imageLink4);
        imageLink6 = findViewById(R.id.imageLink6);
        imageLink7 = findViewById(R.id.imageLink7);
        imageLink8 = findViewById(R.id.imageLink8);




        String image1  = "https://en.lekhaporabd.net/wp-content/uploads/2021/12/Technical-Board.jpeg";
        String image2  = "https://th.bing.com/th/id/OIP.P-isqyisPaVSKZATK9ulKAAAAA?rs=1&pid=ImgDetMain";
        String image3  = "https://2.bp.blogspot.com/-cs99Rl0Ek_c/VnjxNqUsA3I/AAAAAAAAAfM/Z3mKkfk_qBY/s1600/Education-Board-Image.jpg";
        String image4  = "https://th.bing.com/th/id/OIP.i3Z9FOx-SOJPqm2n1kaErgHaHW?rs=1&pid=ImgDetMain";
        String image6  = "https://iep.com.pk/wp-content/uploads/2021/05/IE-Bangladesh.png";
        String image7  = "https://en.lekhaporabd.net/wp-content/uploads/2021/12/Technical-Board.jpeg";
        String image8  = "https://th.bing.com/th/id/OIP.Rv1z9V_4AwrS1DDqvTSQkAAAAA?rs=1&pid=ImgDetMain";




        Picasso.get().load(image1).placeholder(R.drawable.message).into(imageLink1);
        Picasso.get().load(image2).placeholder(R.drawable.message).into(imageLink2);
        Picasso.get().load(image3).placeholder(R.drawable.message).into(imageLink3);
        Picasso.get().load(image4).placeholder(R.drawable.message).into(imageLink4);
        Picasso.get().load(image6).placeholder(R.drawable.message).into(imageLink6);
        Picasso.get().load(image7).placeholder(R.drawable.message).into(imageLink7);
        Picasso.get().load(image8).placeholder(R.drawable.message).into(imageLink8);



        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImportanceLink.this, HomeActivity.class);
                startActivity(intent);
            }
        });



        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "http://btebcbt.gov.bd/home/contentLoad/18?top=top";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "http://step-dte.gov.bd/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "https://moedu.gov.bd/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "https://ideb.org.bd/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "http://dte.gov.bd/dte/#/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "https://iebbd.org/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "https://bangladesh.gov.bd/index.php";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });

        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url= "http://www.wzpdcl.org.bd/";
                Intent intent = new Intent(ImportanceLink.this,webViewActivity.class);
                startActivity(intent);
            }
        });




    }
}