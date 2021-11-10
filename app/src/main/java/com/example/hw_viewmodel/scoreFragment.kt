package com.example.hw_viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.*
import androidx.fragment.app.viewModels
import com.example.hw_viewmodel.databinding.FragmentScoreBinding



class scoreFragment : Fragment() {

    /*
    * create a reference object with ScoreViewModel type
    * the reference object from viewModels
     */
    private val viewModel: ScoreViewModel by viewModels()

    private var score = 0


    // Binding object instance with access to the views in the scoreFragment.xml layout
    private lateinit var binding: FragmentScoreBinding


    // the first fun onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // the second one is onCreateView()
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentScoreBinding.inflate(inflater, container, false)
        return binding.root
    }


    // the third and it's last one is onViewCreated()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            // Setup a click listener for the buttons.
            binding.PlusOne.setOnClickListener { }
            binding.MinusTwo.setOnClickListener {  }
            binding.PlusFour.setOnClickListener { }

            // UI updated
            binding.score.text = getString(R.string.score, 0)
        }

//    /**
//     * Frees the binding object when the Fragment is destroyed.
//     */
//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
}