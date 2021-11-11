package com.example.hw_viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.*
import androidx.fragment.app.viewModels
import com.example.hw_viewmodel.databinding.FragmentScoreBinding
import  com.example.hw_viewmodel.ScoreViewModel


class scoreFragment : Fragment() {

    // Binding object instance with access to the views in the scoreFragment.xml layout
    private var _binding: FragmentScoreBinding? = null
    private val binding get() = _binding

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
                              savedInstanceState: Bundle?): View? {

        _binding = FragmentScoreBinding.inflate(inflater, container, false)
        return _binding?.root
    }


    // the third and it's last one is onViewCreated()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            // Setup a click listener for the buttons.
            binding?.PlusOne?.setOnClickListener {  viewModel.increaseScoreByOne()
                // UI updated
                binding?.score?.text = getString(R.string.score, viewModel.score)
            }
            binding?.MinusTwo?.setOnClickListener { viewModel.decreaseScoreByTwo()
                // UI updated
                binding?.score?.text = getString(R.string.score, viewModel.score)
            }
            binding?.PlusFour?.setOnClickListener {  viewModel.increaseScoreByFour()
                // UI updated
                binding?.score?.text = getString(R.string.score, viewModel.score)
            }

        }

}