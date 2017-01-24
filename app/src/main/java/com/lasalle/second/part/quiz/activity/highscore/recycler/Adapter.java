package com.lasalle.second.part.quiz.activity.highscore.recycler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.lasalle.second.part.quiz.R;
import com.lasalle.second.part.quiz.manager.HighscoreManager;
import com.lasalle.second.part.quiz.models.Score;

public class Adapter extends RecyclerView.Adapter<Holder> {

    private Activity mActivity;
    private HighscoreManager mManager;

    public Adapter(Activity activity)
    {
        mActivity = activity;
        mManager = new HighscoreManager();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mActivity.getLayoutInflater().inflate(
                R.layout.highscore_recycler_entry,
                parent,
                false);

        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Score score = mManager.getItemInPosition(position);
        holder.setItemText(score);
    }

    @Override
    public int getItemCount() {
        return mManager.getItemCount();
    }

}
