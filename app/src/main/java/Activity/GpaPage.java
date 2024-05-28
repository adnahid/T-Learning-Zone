package Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningzone.HomeActivity;
import com.example.learningzone.R;
import com.google.android.material.appbar.AppBarLayout;

public class GpaPage extends AppCompatActivity {

    AppBarLayout appBar;
    Toolbar toolbar;

    Button reset,calculate;

    TextView resultShow;

    EditText first,two,three,four,
    five,six,seven,eight;

   int sum = 100;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gpa_page);
        resultShow = findViewById(R.id.resultShow);
       toolbar = findViewById(R.id.toolbar);
       reset = findViewById(R.id.reset);
       calculate = findViewById(R.id.calculate);
        appBar = findViewById(R.id.appBar);

        first = findViewById(R.id.first);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GpaPage.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId()==R.id.probidan2010){
                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String s1 = first.getText().toString();
                            Float x1 = Float.parseFloat(s1);

                            String s2 = two.getText().toString();
                            Float x2 = Float.parseFloat(s2);

                            String s3 = three.getText().toString();
                            Float x3 = Float.parseFloat(s3);

                            String s4 = four.getText().toString();
                            Float x4 = Float.parseFloat(s4);

                            String s5 = five.getText().toString();
                            Float x5 = Float.parseFloat(s5);

                            String s6 = six.getText().toString();
                            Float x6 = Float.parseFloat(s6);

                            String s7 = seven.getText().toString();
                            Float x7 = Float.parseFloat(s7);

                            String s8 = first.getText().toString();
                            Float x8 = Float.parseFloat(s8);

                            if (first.length()>0 & two.length()>0 & three.length()>0 & four.length()>0 &&
                                five.length()>0 & six.length()>0 &  seven.length()>0 & eight.length()>0){

//                    String one = String.valueOf(5%sum);
//                    String two = String.valueOf(5%sum);
//                    String three = String.valueOf(5%sum);
//                    String four = String.valueOf(10%sum);
//                    String five = String.valueOf(15%sum);
//                    String six = String.valueOf(20%sum);
//                    String seven = String.valueOf(25%sum);
//                    String eight = String.valueOf(15%sum);



                                Float result1st = Float.valueOf(String.valueOf((x1*5)/sum));
                                Float result2nd = Float.valueOf(String.valueOf((x2*5)/sum));
                                Float result3rd = Float.valueOf(String.valueOf((x3*5)/sum));
                                Float result4th = Float.valueOf(String.valueOf((x4*15)/sum));
                                Float result5th = Float.valueOf(String.valueOf((x5*15)/sum));
                                Float result6th = Float.valueOf(String.valueOf((x6*20)/sum));
                                Float result7th = Float.valueOf(String.valueOf((x7*25)/sum));
                                Float result8th = Float.valueOf(String.valueOf((x8*10)/sum));



//                    firstResult = one +"*"+ x1;
//                    seccondResult = two +"*"+ x2;
//                    thirdResult = three +"*"+ x3;
//                    fourResult = four +"*"+ x4;
//                    fiveResult = five +"*"+ x5;
//                    sixResult = six +"*"+ x6;
//                    sevenResult = seven +"*"+ x7;
//                    eightResult = eight +"*"+ x8;

                                Float summation = Float.valueOf(result1st+result2nd+result3rd+result4th
                                        +result5th+result6th+result7th+result8th);

                                String res = summation.toString();

                                resultShow.setText(res);


                                

                            }else {

                                Toast.makeText(GpaPage.this, "Enter your CGPA", Toast.LENGTH_SHORT).show();

                            }

                        }
                    });


                    Toast.makeText(GpaPage.this, "probidan 2010 Result", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId()==R.id.probidan2016) {

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String s1 = first.getText().toString();
                            Float x1 = Float.parseFloat(s1);

                            String s2 = two.getText().toString();
                            Float x2 = Float.parseFloat(s2);

                            String s3 = three.getText().toString();
                            Float x3 = Float.parseFloat(s3);

                            String s4 = four.getText().toString();
                            Float x4 = Float.parseFloat(s4);

                            String s5 = five.getText().toString();
                            Float x5 = Float.parseFloat(s5);

                            String s6 = six.getText().toString();
                            Float x6 = Float.parseFloat(s6);

                            String s7 = seven.getText().toString();
                            Float x7 = Float.parseFloat(s7);

                            String s8 = first.getText().toString();
                            Float x8 = Float.parseFloat(s8);

                            if (first.length()>0 & two.length()>0 & three.length()>0 & four.length()>0 &&
                                    five.length()>0 & six.length()>0 &  seven.length()>0 & eight.length()>0){

//                    String one = String.valueOf(5%sum);
//                    String two = String.valueOf(5%sum);
//                    String three = String.valueOf(5%sum);
//                    String four = String.valueOf(10%sum);
//                    String five = String.valueOf(15%sum);
//                    String six = String.valueOf(20%sum);
//                    String seven = String.valueOf(25%sum);
//                    String eight = String.valueOf(15%sum);



                                Float result1st = Float.valueOf(String.valueOf((x1*5)/sum));
                                Float result2nd = Float.valueOf(String.valueOf((x2*5)/sum));
                                Float result3rd = Float.valueOf(String.valueOf((x3*5)/sum));
                                Float result4th = Float.valueOf(String.valueOf((x4*10)/sum));
                                Float result5th = Float.valueOf(String.valueOf((x5*15)/sum));
                                Float result6th = Float.valueOf(String.valueOf((x6*20)/sum));
                                Float result7th = Float.valueOf(String.valueOf((x7*25)/sum));
                                Float result8th = Float.valueOf(String.valueOf((x8*15)/sum));



//                    firstResult = one +"*"+ x1;
//                    seccondResult = two +"*"+ x2;
//                    thirdResult = three +"*"+ x3;
//                    fourResult = four +"*"+ x4;
//                    fiveResult = five +"*"+ x5;
//                    sixResult = six +"*"+ x6;
//                    sevenResult = seven +"*"+ x7;
//                    eightResult = eight +"*"+ x8;

                                Float summation = Float.valueOf(result1st+result2nd+result3rd+result4th
                                        +result5th+result6th+result7th+result8th);

                                String res = summation.toString();

                                resultShow.setText(res);



                            }else {

                                Toast.makeText(GpaPage.this, "Enter your CGPA", Toast.LENGTH_SHORT).show();

                            }

                        }
                    });
                    Toast.makeText(GpaPage.this, "probidan 2016 Result", Toast.LENGTH_SHORT).show();

                }


                else if (item.getItemId()==R.id.probidan2022) {
                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String s1 = first.getText().toString();
                            Float x1 = Float.parseFloat(s1);

                            String s2 = two.getText().toString();
                            Float x2 = Float.parseFloat(s2);

                            String s3 = three.getText().toString();
                            Float x3 = Float.parseFloat(s3);

                            String s4 = four.getText().toString();
                            Float x4 = Float.parseFloat(s4);

                            String s5 = five.getText().toString();
                            Float x5 = Float.parseFloat(s5);

                            String s6 = six.getText().toString();
                            Float x6 = Float.parseFloat(s6);

                            String s7 = seven.getText().toString();
                            Float x7 = Float.parseFloat(s7);

                            String s8 = first.getText().toString();
                            Float x8 = Float.parseFloat(s8);

                            if (first.length()>0 & two.length()>0 & three.length()>0 & four.length()>0 &&
                                    five.length()>0 & six.length()>0 &  seven.length()>0 & eight.length()>0){

//                    String one = String.valueOf(5%sum);
//                    String two = String.valueOf(5%sum);
//                    String three = String.valueOf(5%sum);
//                    String four = String.valueOf(10%sum);
//                    String five = String.valueOf(15%sum);
//                    String six = String.valueOf(20%sum);
//                    String seven = String.valueOf(25%sum);
//                    String eight = String.valueOf(15%sum);



                                Float result1st = Float.valueOf(String.valueOf((x1*5)/sum));
                                Float result2nd = Float.valueOf(String.valueOf((x2*5)/sum));
                                Float result3rd = Float.valueOf(String.valueOf((x3*10)/sum));
                                Float result4th = Float.valueOf(String.valueOf((x4*10)/sum));
                                Float result5th = Float.valueOf(String.valueOf((x5*20)/sum));
                                Float result6th = Float.valueOf(String.valueOf((x6*20)/sum));
                                Float result7th = Float.valueOf(String.valueOf((x7*20)/sum));
                                Float result8th = Float.valueOf(String.valueOf((x8*10)/sum));



//                    firstResult = one +"*"+ x1;
//                    seccondResult = two +"*"+ x2;
//                    thirdResult = three +"*"+ x3;
//                    fourResult = four +"*"+ x4;
//                    fiveResult = five +"*"+ x5;
//                    sixResult = six +"*"+ x6;
//                    sevenResult = seven +"*"+ x7;
//                    eightResult = eight +"*"+ x8;

                                Float summation = Float.valueOf(result1st+result2nd+result3rd+result4th
                                        +result5th+result6th+result7th+result8th);

                                String res = summation.toString();

                                resultShow.setText(res);



                            }else {

                                Toast.makeText(GpaPage.this, "Enter your CGPA", Toast.LENGTH_SHORT).show();

                            }

                        }
                    });

                    Toast.makeText(GpaPage.this, "probidan 2022 Result", Toast.LENGTH_SHORT).show();

                }

                return true;
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = first.getText().toString();
                Float x1 = Float.parseFloat(s1);

                String s2 = two.getText().toString();
                Float x2 = Float.parseFloat(s2);

                String s3 = three.getText().toString();
                Float x3 = Float.parseFloat(s3);

                String s4 = four.getText().toString();
                Float x4 = Float.parseFloat(s4);

                String s5 = five.getText().toString();
                Float x5 = Float.parseFloat(s5);

                String s6 = six.getText().toString();
                Float x6 = Float.parseFloat(s6);

                String s7 = seven.getText().toString();
                Float x7 = Float.parseFloat(s7);

                String s8 = first.getText().toString();
                Float x8 = Float.parseFloat(s8);

                if (first.length()>0 & two.length()>0 & three.length()>0 & four.length()>0 &&
                        five.length()>0 & six.length()>0 &  seven.length()>0 & eight.length()>0){

//                    String one = String.valueOf(5%sum);
//                    String two = String.valueOf(5%sum);
//                    String three = String.valueOf(5%sum);
//                    String four = String.valueOf(10%sum);
//                    String five = String.valueOf(15%sum);
//                    String six = String.valueOf(20%sum);
//                    String seven = String.valueOf(25%sum);
//                    String eight = String.valueOf(15%sum);



                    Float result1st = Float.valueOf(String.valueOf((x1*5)/sum));
                    Float result2nd = Float.valueOf(String.valueOf((x2*5)/sum));
                    Float result3rd = Float.valueOf(String.valueOf((x3*5)/sum));
                    Float result4th = Float.valueOf(String.valueOf((x4*10)/sum));
                    Float result5th = Float.valueOf(String.valueOf((x5*15)/sum));
                    Float result6th = Float.valueOf(String.valueOf((x6*20)/sum));
                    Float result7th = Float.valueOf(String.valueOf((x7*25)/sum));
                    Float result8th = Float.valueOf(String.valueOf((x8*15)/sum));



//                    firstResult = one +"*"+ x1;
//                    seccondResult = two +"*"+ x2;
//                    thirdResult = three +"*"+ x3;
//                    fourResult = four +"*"+ x4;
//                    fiveResult = five +"*"+ x5;
//                    sixResult = six +"*"+ x6;
//                    sevenResult = seven +"*"+ x7;
//                    eightResult = eight +"*"+ x8;

                    Float summation = Float.valueOf(result1st+result2nd+result3rd+result4th
                            +result5th+result6th+result7th+result8th);

                    String res = summation.toString();

                    resultShow.setText(res);



                }else {

                    Toast.makeText(GpaPage.this, "Enter your CGPA", Toast.LENGTH_SHORT).show();

                }

            }
        });

       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if (first.length()>0 & two.length()>0 & three.length()>0 & four.length()>0 &&
                       five.length()>0 & six.length()>0 &  seven.length()>0 & eight.length()>0) {
                   first.setText("");
                   two.setText("");
                   three.setText("");
                   four.setText("");
                   five.setText("");
                   six.setText("");
                   seven.setText("");
                   eight.setText("");
                   resultShow.setText("");
               }else {

                   Toast.makeText(GpaPage.this, "please input value", Toast.LENGTH_SHORT).show();

               }

           }
       });












    }
}