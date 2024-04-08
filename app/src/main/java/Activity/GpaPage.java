package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;

public class GpaPage extends AppCompatActivity {

    Toolbar toolbar;

    Button reset,calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gpa_page);
        toolbar = findViewById(R.id.toolbar);
        reset = findViewById(R.id.reset);
        calculate = findViewById(R.id.calculate);



        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GpaPage.this, HomeActivity.class);
                startActivity(intent);
            }
        });

       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(GpaPage.this, "Update Pending", Toast.LENGTH_SHORT).show();
           }
       });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GpaPage.this, "Update Pending", Toast.LENGTH_SHORT).show();
            }
        });









    }
}