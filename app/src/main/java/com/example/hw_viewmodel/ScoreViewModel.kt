package com.example.hw_viewmodel

import android.widget.Toast
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    /*
    * create a objects with private type
    * the objects are private, so you can edit only in this claas
    * we will return it in other object to be visible
    * to know a new object it's better to wite it like _objectName
     */
    private var _score = 0


    /*
    *  a new objects for return the base a private objects
     */
    val score: Int
        get() = _score


    /*
     * The score will be increase +1
     */
    private fun increaseScoreByOne() {

        _score = _score+1
    }

    /*
     * The score will be decrease -2
     * but score should be more than 2
     */
    private fun decreaseScoreByTwo() {
        if (_score >= 2 && _score != 0)
        _score = _score-2
      //  Toast.makeText(this, "Sorry, the product is not available right now", Toast.LENGTH_LONG).show()
    }

    /*
     * The score will be increase +4
     */
    private fun increaseScoreByFour() {
        _score = _score+4
    }
}