package com.bongoacademy.quiz.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

import com.bongoacademy.quiz.CourseGVAdapter;
import com.bongoacademy.quiz.CourseModel;
import com.bongoacademy.quiz.R;
import com.bongoacademy.quiz.adapter.BdcourseGvAdapter;

import java.util.ArrayList;

public class BanladeshCourseActivity extends AppCompatActivity {

    GridView bdcoursesGV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banladesh_course);

        bdcoursesGV = findViewById(R.id.idGVcourses_bdcourse);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("1st Quiz ", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("2nd Quiz", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("3rd Quiz", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("4th Quiz ", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("5th Quiz", R.drawable.category_icon1));
        courseModelArrayList.add(new CourseModel("6th Quiz", R.drawable.category_icon1));

        BdcourseGvAdapter adapter = new BdcourseGvAdapter(this, courseModelArrayList);
        bdcoursesGV.setAdapter(adapter);
    }
}