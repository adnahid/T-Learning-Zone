package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

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

import java.util.ArrayList;

public class PdfList extends AppCompatActivity {

    Toolbar toolbar;
    CardView book1,book2,book3,book4,book5,book6,book7,book8;

    ImageView imageBook1,imageBook2,imageBook3,imageBook4,imageBook5,imageBook6,imageBook7,imageBook8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pdf_list);
        toolbar = findViewById(R.id.toolbar);
        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        book3 = findViewById(R.id.book3);
        book4 = findViewById(R.id.book4);
        book5 = findViewById(R.id.book5);
        book6 = findViewById(R.id.book6);
        book7 = findViewById(R.id.book7);
        book8 = findViewById(R.id.book8);

        imageBook1 = findViewById(R.id.imageBook1);
        imageBook2 = findViewById(R.id.imageBook2);
        imageBook3 = findViewById(R.id.imageBook3);
        imageBook4 = findViewById(R.id.imageBook4);
        imageBook5 = findViewById(R.id.imageBook5);
        imageBook6 = findViewById(R.id.imageBook6);
        imageBook7 = findViewById(R.id.imageBook7);
        imageBook8 = findViewById(R.id.imageBook8);

        String image1  = "https://cdn-icons-png.flaticon.com/128/2232/2232688.png";
        String image2  = "https://cdn-icons-png.flaticon.com/128/1164/1164620.png";
        String image3  = "https://cdn-icons-png.flaticon.com/128/5833/5833290.png";
        String image4  = "https://cdn-icons-png.flaticon.com/128/5833/5833290.png";
        String image5  = "https://cdn-icons-png.flaticon.com/128/1164/1164651.png";
        String image6  = "https://cdn-icons-png.flaticon.com/128/3330/3330317.png";
        String image7  = "https://cdn-icons-png.flaticon.com/128/2097/2097068.png";
        String image8  = "https://cdn-icons-png.flaticon.com/128/5766/5766485.png";




        Picasso.get().load(image1).placeholder(R.drawable.message).into(imageBook1);
        Picasso.get().load(image2).placeholder(R.drawable.message).into(imageBook2);
        Picasso.get().load(image3).placeholder(R.drawable.message).into(imageBook3);
        Picasso.get().load(image4).placeholder(R.drawable.message).into(imageBook4);
        Picasso.get().load(image5).placeholder(R.drawable.message).into(imageBook5);
        Picasso.get().load(image6).placeholder(R.drawable.message).into(imageBook6);
        Picasso.get().load(image7).placeholder(R.drawable.message).into(imageBook7);
        Picasso.get().load(image8).placeholder(R.drawable.message).into(imageBook8);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PdfList.this, HomeActivity.class);
                startActivity(intent);
            }
        });




        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file1.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file2.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file1.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file2.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file1.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file2.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });


        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file1.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });

        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PdfViewer.assetsName = "my_file2.pdf";
                Intent intent = new Intent(PdfList.this,PdfViewer.class);
                startActivity(intent);
            }
        });






    }

}