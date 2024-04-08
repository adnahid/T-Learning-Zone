package Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Institute extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap = new HashMap<>();

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_institute);
        recyclerView = findViewById(R.id.recyclerView);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Institute.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        islamicTable();



        IslamicAdapter islamicAdapter = new IslamicAdapter();
        recyclerView.setAdapter(islamicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Institute.this));

    }

    private class IslamicAdapter extends RecyclerView.Adapter {

        int Read = 1;

        private class readHolder extends RecyclerView.ViewHolder {
            CardView ItemCard;
            Button tvCat;
            TextView tvTitle, tvDes;
            ImageView itemImage;

            public readHolder(@NonNull View itemView) {
                super(itemView);
                ItemCard = itemView.findViewById(R.id.ItemCard);
                itemImage = itemView.findViewById(R.id.itemImage);
                tvCat = itemView.findViewById(R.id.tvCat);
                tvTitle = itemView.findViewById(R.id.tvTitle);
                tvDes = itemView.findViewById(R.id.tvDes);

            }
        }


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();

            View view = layoutInflater.inflate(R.layout.story_item, parent, false);
            return new readHolder(view);


        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if (getItemViewType(position) == Read) {
                readHolder readHolder = (readHolder) holder;
                hashMap = arrayList.get(position);

                String category = hashMap.get("topCat");
                String name = hashMap.get("name");
                String gmail = hashMap.get("gmail");
                String phone = hashMap.get("phone");
                String location = hashMap.get("location");
                String industry = hashMap.get("industry");
                String about = hashMap.get("about");
                String Image = hashMap.get("image");


                Random rnd = new Random();
                int color = Color.argb(220, rnd.nextInt(220), rnd.nextInt(220), rnd.nextInt(220));
                readHolder.tvCat.setBackgroundColor(color);


                readHolder.tvCat.setText(category);
                readHolder.tvTitle.setText(industry);
                Picasso.get().load(Image).placeholder(R.drawable.baseline_add_home_24).into(readHolder.itemImage);

                readHolder.ItemCard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        InstituteDetails.Name = name;
                        InstituteDetails.Gmail = gmail;
                        InstituteDetails.Phone = phone;
                        InstituteDetails.Location = location;
                        InstituteDetails.Industry = industry;
                        InstituteDetails.About = about;


                        Bitmap bitmap = ((BitmapDrawable) readHolder.itemImage.getDrawable()).getBitmap();
                        InstituteDetails.Bitmap = bitmap;
                        Intent intent = new Intent(Institute.this, InstituteDetails.class);
                        startActivity(intent);

                    }
                });


            }


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


        @Override
        public int getItemViewType(int position) {
            hashMap = arrayList.get(position);
            String itemType = hashMap.get("itemType");
            if (itemType.contains("read")) return Read;

            return position;
        }

    }


    // detailsTable
    private void islamicTable(){

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://polybd.com/wp-content/uploads/2020/03/DPI-campus.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", "Dhaka rampur Road 212 ");
        hashMap.put("industry", "Dhaka poly Technical Institute Dhaka");
        hashMap.put("about", "Dhaka Polytechnic Institute, located in the bustling city of Dhaka, Bangladesh, stands as a beacon of technical education and vocational training in the region. Established with a vision to foster skilled professionals capable of meeting the demands of a rapidly evolving industrial landscape, Dhaka Polytechnic Institute has been a cornerstone of technical education since its inception.");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://polybd.com/wp-content/uploads/2020/03/CMPI-1024x769.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", " Cattagong Road 212,rambag etc");
        hashMap.put("industry", "Cattagong Polytechnic Institute Cattagong");
        hashMap.put("about","At CPI, we believe in nurturing the talents and aspirations of our students, equipping them with the skills and knowledge necessary to thrive in a rapidly evolving world. With state-of-the-art facilities, world-class faculty, and a dynamic learning environment, we are committed to empowering our students to become future leaders, innovators, and problem solvers.");
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://i.ytimg.com/vi/FbOKPFfvsEY/maxresdefault.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", "borisal rampur Road 212 ");
        hashMap.put("industry", "Borisal poly Technical Institute Borisal");
        hashMap.put("about","Borisal Polytechnic Institute, often abbreviated as BPI, is a renowned educational institution located in the city of Barisal, Bangladesh. Established with a commitment to providing quality technical education, the institute has been a prominent contributor to the country's skilled workforce since its inception.");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://polybd.com/wp-content/uploads/2020/03/DPI-campus.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", "Dhaka rampur Road 212 ");
        hashMap.put("industry", "Dhaka poly Technical Institute Dhaka");
        hashMap.put("about", "Dhaka Polytechnic Institute, located in the bustling city of Dhaka, Bangladesh, stands as a beacon of technical education and vocational training in the region. Established with a vision to foster skilled professionals capable of meeting the demands of a rapidly evolving industrial landscape, Dhaka Polytechnic Institute has been a cornerstone of technical education since its inception.");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://polybd.com/wp-content/uploads/2020/03/CMPI-1024x769.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", " Cattagong Road 212,rambag etc");
        hashMap.put("industry", "Cattagong Polytechnic Institute Cattagong");
        hashMap.put("about","At CPI, we believe in nurturing the talents and aspirations of our students, equipping them with the skills and knowledge necessary to thrive in a rapidly evolving world. With state-of-the-art facilities, world-class faculty, and a dynamic learning environment, we are committed to empowering our students to become future leaders, innovators, and problem solvers.");
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("itemType","read");
        hashMap.put("image","https://i.ytimg.com/vi/FbOKPFfvsEY/maxresdefault.jpg");
        hashMap.put("topCat","Dhaka Divition");
        hashMap.put("name","Principle Abdul Halim Khan");
        hashMap.put("gmail","halimkhan@gmail.com");
        hashMap.put("phone", "+880 1689394557");
        hashMap.put("location", "borisal rampur Road 212 ");
        hashMap.put("industry", "Borisal poly Technical Institute Borisal");
        hashMap.put("about","Borisal Polytechnic Institute, often abbreviated as BPI, is a renowned educational institution located in the city of Barisal, Bangladesh. Established with a commitment to providing quality technical education, the institute has been a prominent contributor to the country's skilled workforce since its inception.");
        arrayList.add(hashMap);










    }
}