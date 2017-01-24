package com.lasalle.second.part.quiz.activity.highscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lasalle.second.part.quiz.R;
import com.lasalle.second.part.quiz.activity.highscore.recycler.Adapter;

public class HighscoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_highscore_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(this));
     }
}
