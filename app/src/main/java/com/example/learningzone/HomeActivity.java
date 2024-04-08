package com.example.learningzone;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import Activity.webViewActivity;

public class HomeActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    NavigationView navigationView;
    public static final String Url = "https://play.google.com/store/apps/details?id=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        navigationView = findViewById(R.id.navigationView);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                HomeActivity.this,drawerLayout,materialToolbar,R.string.drawerClose,R.string.drawerOPen);
        drawerLayout.addDrawerListener(toggle);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new demoFragment());
        fragmentTransaction.commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){
                    Toast.makeText(HomeActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId()==R.id.share){
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Share Other");
                    intent.putExtra(Intent.EXTRA_TEXT,"This is an Nicely apps for android user........."+Url+getPackageName());
                    startActivity(Intent.createChooser(intent,"Share App Vai "));
                    //Toast.makeText(HomeActivity.this, "Offer", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                }else if (item.getItemId()==R.id.rate){
                    //Toast.makeText(HomeActivity.this, "Offer", Toast.LENGTH_SHORT).show();

                    try {

                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(Url+getPackageName()));
                        intent.setPackage(getPackageName());
                        startActivity(intent);

                    }catch (ActivityNotFoundException e){

                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(Url+getPackageName()));
                        startActivity(intent);
                    }


                    drawerLayout.closeDrawer(GravityCompat.START);
                }else if (item.getItemId()==R.id.policy){

                    webViewActivity.url = "https://bdnews24.com/";
                    Intent intent = new Intent(HomeActivity.this, webViewActivity.class);
                    startActivity(intent);

                    //Toast.makeText(HomeActivity.this, "Offer", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });


    }
}