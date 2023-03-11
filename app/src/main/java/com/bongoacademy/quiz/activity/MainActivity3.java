package com.bongoacademy.quiz.activity;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

import com.bongoacademy.quiz.CourseGVAdapter;
import com.bongoacademy.quiz.CourseModel;
import com.bongoacademy.quiz.R;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main3);
        super.onCreate(savedInstanceState);

        coursesGV = findViewById(R.id.idGVcourses3);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("DSA", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.category_icon1));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}
