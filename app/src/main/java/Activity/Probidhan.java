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

public class Probidhan extends AppCompatActivity {

    CardView probidhan10,probidhan16,probidhan22;
    ImageView probidhan10Image,probidhan16Image,probidhan22Image;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_probidhan);

        probidhan10 = findViewById(R.id.probidhan10);
        probidhan16 = findViewById(R.id.probidhan16);
        probidhan22 = findViewById(R.id.probidhan22);
        toolbar = findViewById(R.id.toolbar);


        probidhan10Image = findViewById(R.id.probidhan10Image);
        probidhan16Image = findViewById(R.id.probidhan16Image);
        probidhan22Image = findViewById(R.id.probidhan22Image);


        String image1  = "https://cdn-icons-png.flaticon.com/128/5622/5622686.png";
        String image2  = "https://cdn-icons-png.flaticon.com/128/5622/5622624.png";
        String image3  = "https://cdn-icons-png.flaticon.com/128/2875/2875228.png";

        Picasso.get().load(image1).placeholder(R.drawable.message).into(probidhan10Image);
        Picasso.get().load(image2).placeholder(R.drawable.message).into(probidhan16Image);
        Picasso.get().load(image3).placeholder(R.drawable.message).into(probidhan22Image);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Probidhan.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        probidhan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file3.pdf";
                Intent intent = new Intent(Probidhan.this,PdfViewer.class);
                startActivity(intent);
            }
        });

        probidhan16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file3.pdf";
                Intent intent = new Intent(Probidhan.this,PdfViewer.class);
                startActivity(intent);
            }
        });

        probidhan22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file3.pdf";
                Intent intent = new Intent(Probidhan.this,PdfViewer.class);
                startActivity(intent);
            }
        });



    }
}