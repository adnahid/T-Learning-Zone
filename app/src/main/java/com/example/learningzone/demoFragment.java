package com.example.learningzone;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import Activity.AboutPage;
import Activity.Admission;
import Activity.GpaPage;
import Activity.ImportanceLink;
import Activity.Institute;
import Activity.PdfList;
import Activity.PdfViewer;
import Activity.Probidhan;
import Activity.Skill;
import Activity.Vedio;
import Activity.webViewActivity;


public class demoFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        ImageSlider image_slider = view.findViewById(R.id.image_slider);

        CardView tutorial = view.findViewById(R.id.tutorial);
        CardView newsFeed = view.findViewById(R.id.newsFeed);
        CardView noteBook = view.findViewById(R.id.noteBook);
        CardView probidhan = view.findViewById(R.id.probidhan);
        CardView gpa = view.findViewById(R.id.gpa);
        CardView institute = view.findViewById(R.id.institute);
        CardView bookList = view.findViewById(R.id.bookList);
        CardView bteb = view.findViewById(R.id.bteb);
        CardView tmed = view.findViewById(R.id.tmed);
        CardView link = view.findViewById(R.id.link);
        CardView skill = view.findViewById(R.id.skill);
        CardView admission = view.findViewById(R.id.admission);
        CardView update = view.findViewById(R.id.update);
        CardView about = view.findViewById(R.id.about);


        ImageView tutorialImage = view.findViewById(R.id.tutorialImage);
        ImageView newsFeedImage = view.findViewById(R.id.newsFeedImage);
        ImageView noteBookImage = view.findViewById(R.id.noteBookImage);
        ImageView probidhanImage = view.findViewById(R.id.probidhanImage);
        ImageView gpaImage = view.findViewById(R.id.gpaImage);
        ImageView instituteImage = view.findViewById(R.id.instituteImage);
        ImageView bookListImage = view.findViewById(R.id.bookListImage);
        ImageView btebImage = view.findViewById(R.id.btebImage);
        ImageView tmedImage = view.findViewById(R.id.tmedImage);
        ImageView linkImage = view.findViewById(R.id.linkImage);
        ImageView skillImage = view.findViewById(R.id.skillImage);
        ImageView admissionImage = view.findViewById(R.id.admissionImage);
        ImageView updateImage = view.findViewById(R.id.updateImage);
        ImageView aboutImage = view.findViewById(R.id.aboutImage);


        String Tutorial  = "https://cdn-icons-png.flaticon.com/128/11647/11647142.png";
        String NewsFeedImage =  "https://cdn-icons-png.flaticon.com/128/7553/7553800.png";
        String NoteBookImage = "https://cdn-icons-png.flaticon.com/128/2015/2015630.png";
        String ProbidhanImage = "https://cdn-icons-png.flaticon.com/128/2875/2875226.png";
        String GpaImage = "https://cdn-icons-png.flaticon.com/128/2247/2247890.png";
        String InstituteImage = "https://cdn-icons-png.flaticon.com/128/7878/7878399.png";
        String BookList = "https://cdn-icons-png.flaticon.com/128/3161/3161588.png";
        String BtebImage = "https://cdn-icons-png.flaticon.com/128/10047/10047940.png";
        String TmedImage = "https://cdn-icons-png.flaticon.com/128/3000/3000428.png";
        String LinkImage =  "https://cdn-icons-png.flaticon.com/128/15397/15397512.png";
        String SkillImage = "https://cdn-icons-png.flaticon.com/128/4727/4727496.png";
        String AdmissionImage = "https://cdn-icons-png.flaticon.com/128/998/998376.png";
        String UpdateImage = "https://cdn-icons-png.flaticon.com/128/11282/11282660.png";
        String AboutImage =  "https://cdn-icons-png.flaticon.com/128/9967/9967632.png";


        Picasso.get().load(Tutorial).placeholder(R.drawable.message).into(tutorialImage);
        Picasso.get().load(NewsFeedImage).placeholder(R.drawable.message).into(newsFeedImage);
        Picasso.get().load(NoteBookImage).placeholder(R.drawable.message).into(noteBookImage);
        Picasso.get().load(ProbidhanImage).placeholder(R.drawable.message).into(probidhanImage);
        Picasso.get().load(GpaImage).placeholder(R.drawable.message).into(gpaImage);
        Picasso.get().load(InstituteImage).placeholder(R.drawable.message).into(instituteImage);
        Picasso.get().load(BookList).placeholder(R.drawable.message).into(bookListImage);
        Picasso.get().load(BtebImage).placeholder(R.drawable.message).into(btebImage);
        Picasso.get().load(TmedImage).placeholder(R.drawable.message).into(tmedImage);
        Picasso.get().load(LinkImage).placeholder(R.drawable.message).into(linkImage);
        Picasso.get().load(SkillImage).placeholder(R.drawable.message).into(skillImage);
        Picasso.get().load(AdmissionImage).placeholder(R.drawable.message).into(admissionImage);
        Picasso.get().load(UpdateImage).placeholder(R.drawable.message).into(updateImage);
        Picasso.get().load(AboutImage).placeholder(R.drawable.message).into(aboutImage);




        //Image Slider

        List<SlideModel> list = new ArrayList<>();
        list.add(new SlideModel(""+NoteBookImage, ScaleTypes.FIT));
        list.add(new SlideModel(""+GpaImage, ScaleTypes.FIT));
        list.add(new SlideModel(""+SkillImage, ScaleTypes.FIT));
        list.add(new SlideModel(""+BtebImage, ScaleTypes.FIT));
        image_slider.setImageList(list);


        noteBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PdfList.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutPage.class);
                startActivity(intent);
            }
        });

        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GpaPage.class);
                startActivity(intent);
            }
        });

        bteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url = "https://bteb.gov.bd/";
                Intent intent = new Intent(getActivity(), webViewActivity.class);
                startActivity(intent);
            }
        });

        tmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url = "https://tmed.gov.bd/";
                //webViewActivity.url = " https://www.w3newspapers.com/bangladesh/";
                Intent intent = new Intent(getActivity(), webViewActivity.class);
                startActivity(intent);
            }
        });

        newsFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewActivity.url = "https://www.facebook.com/groups/1709996362727731";
                //webViewActivity.url = " https://www.w3newspapers.com/bangladesh/";
                Intent intent = new Intent(getActivity(), webViewActivity.class);
                startActivity(intent);
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ImportanceLink.class);
                startActivity(intent);
            }
        });

        institute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Institute.class);
                startActivity(intent);
            }
        });

        probidhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Probidhan.class);
                startActivity(intent);
            }
        });


        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Vedio.class);
                startActivity(intent);
            }
        });

        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Admission.class);
                startActivity(intent);
            }
        });

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Skill.class);
                startActivity(intent);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });

        bookList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }
}