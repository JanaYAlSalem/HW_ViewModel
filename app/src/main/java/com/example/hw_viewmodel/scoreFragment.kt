package com.example.hw_viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.hw_viewmodel.databinding.FragmentScoreBinding


class scoreFragment : Fragment() {

    // Binding object instance with access to the views in the scoreFragment.xml layout
    private lateinit var binding: FragmentScoreBinding


    /*
    * create a reference object with ScoreViewModel type
    * the reference object from viewModels
     */
    private val viewModel: ScoreViewModel by viewModels()


    // the first fun onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // the second one is onCreateView()
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        //_binding = FragmentScoreBinding.inflate(inflater, container, false)
        //Change to
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_score, container, false)
        // add
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }


    // the third and it's last one is onViewCreated()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // add binding.variableNAME = viewModel reference object
        binding.scoreViewModel = viewModel
        // add Life cycle Owner
        binding.lifecycleOwner = viewLifecycleOwner


        // Setup a click listener for the buttons.
            binding.PlusOne.setOnClickListener {  viewModel.increaseScoreByOne() }
            binding.MinusTwo.setOnClickListener { viewModel.decreaseScoreByTwo() }
            binding.PlusFour.setOnClickListener {  viewModel.increaseScoreByFour() }
        // delete the UI updated [binding.score.text = getString(R.string.score, viewModel.score)]
    }

}

// val playerWord = binding.textInputEditText.text.toString() -> input text