package com.lasalle.second.part.quiz.manager;

import com.lasalle.second.part.quiz.activity.highscore.recycler.Holder;
import com.lasalle.second.part.quiz.models.Score;

/**
 * Created by albert.denova on 19/01/17.
 */

public class HighscoreManager {

    public Score getItemInPosition(int position) {
        //TODO: this should absolutely go into a data specific class, ok Ian?
        int score =100000 - position;
        if(position %2 == 0)
        {
            return new Score(position, "Hola", score);
        }
        else
        {
            return new Score(position, "Adeu", score);
        }

    }

    public int getItemCount() {
        return 100;
    }

}
