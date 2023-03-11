package com.bongoacademy.quiz.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bongoacademy.quiz.CourseModel;
import com.bongoacademy.quiz.QuestionCollection;
import com.bongoacademy.quiz.R;

import java.util.ArrayList;

import question_collection.BangladeshQuestionCollection;

public class BdcourseGvAdapter extends ArrayAdapter<CourseModel> {

    public BdcourseGvAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        CourseModel courseModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);
        courseTV.setText(courseModel.getCourse_name());
        courseIV.setImageResource(courseModel.getImgid());

        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {
                    System.out.println(".............amar bangladesh.........");
                    BangladeshQuestionCollection.SUBJECT_NAME = "বাংলাদেশ";
                    BangladeshQuestionCollection.question_list = BangladeshQuestionCollection.questionBank.get(position);
                    Intent intent = new Intent(parent.getContext(), BangladeshQuestionCollection.class);
                    parent.getContext().startActivity(intent);
                } else if (position==1){
                    System.out.println(".............amar bangladesh.........");
                    BangladeshQuestionCollection.SUBJECT_NAME = "বাংলাদেশ";
                    BangladeshQuestionCollection.question_list = BangladeshQuestionCollection.questionBank.get(position);
                    Intent intent = new Intent(parent.getContext(), BangladeshQuestionCollection.class);
                    parent.getContext().startActivity(intent);

                }
            }
        });
        return listitemView;
    }
}

