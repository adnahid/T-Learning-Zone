package Activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.R;

public class InstituteDetails extends AppCompatActivity {

    public static String Toptex = "";
    public static String Gmail = "";
    public static String Phone = "";
    public static String Industry = "";
    public static String Location = "";
    public static String Name = "";

    public static String About = "";
    public static Bitmap Bitmap = null;




    TextView gmail,phone,location,indurstry,topText,name,about;
    ImageView topImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_institute_details);
        topText = findViewById(R.id.topText);
        topImage = findViewById(R.id.topImage);
        gmail = findViewById(R.id.gmail);
        phone = findViewById(R.id.phone);
        location = findViewById(R.id.location);
        indurstry = findViewById(R.id.indurstry);
        name = findViewById(R.id.name);
        about = findViewById(R.id.about);

        name.setText(Name);
        topText.setText(Toptex);
        gmail.setText(Gmail);
        phone.setText(Phone);
        location.setText(Location);
        indurstry.setText(Industry);
        about.setText(About);




        if (Bitmap!=null){
            topImage.setImageBitmap(Bitmap);
        }






    }
}