package com.example.hw_viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    /*
    * create a objects with private type
    * the objects are private, so you can edit only in this claas
    * we will return it in other object to be visible
    * to know a new object it's better to wite it like _objectName
     */
    // private var _score = 0 cgange to:
    private val _score = MutableLiveData(0)


    /*
    *  a new objects for return the base a private objects
     */
    //val score: Int cgange to:
    val score: LiveData<Int>
        get() = _score


    /*
     * The score will be increase +1
     */
     fun increaseScoreByOne() {
      //  _score = _score+1 change to:
        _score.value = _score.value?.plus(1)  // Or we can use directly [ _score.value?.inc() ]

    }

    /*
     * The score will be decrease -2
     * but score should be more than 2
     */
     fun decreaseScoreByTwo() {
        if (_score.value!! >= 2 && _score.value != 0)
      //  _score = _score-2 change to:
        _score.value = _score.value?.minus(2)
    }

    /*
     * The score will be increase +4
     */
     fun increaseScoreByFour() {
        //_score += 4 change to:
        _score.value = _score.value?.plus(4)
    }
}