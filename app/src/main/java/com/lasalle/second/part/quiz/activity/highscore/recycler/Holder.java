package com.lasalle.second.part.quiz.activity.highscore.recycler;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.lasalle.second.part.quiz.R;
import com.lasalle.second.part.quiz.models.Score;

public class Holder extends RecyclerView.ViewHolder {

    private TextView mItemPosition;
    private TextView mItemText;
    private TextView mItemScore;

    public Holder(View itemView) {
        super(itemView);
        mItemPosition = (TextView) itemView.findViewById(
                R.id.activity_highscore_recycler_view_entry_position);
        mItemText = (TextView) itemView.findViewById(
                R.id.activity_highscore_recycler_view_entry_title);
        mItemScore = (TextView) itemView.findViewById(
                R.id.activity_highscore_recycler_view_entry_score);
    }

    public void setItemText(Score score) {
        mItemPosition.setText(Integer.toString(score.getPosition()));
        mItemText.setText(score.getTitle());
        mItemScore.setText(Integer.toString(score.getScore()));
    }
}
