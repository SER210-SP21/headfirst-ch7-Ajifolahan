package edu.quinnipiac.ser210.secretmessageapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {

//This method is called when Android needs access to the fragment.
    override fun onCreateView(
    //LayoutInflater turns its XML views into objects.
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    //reference to the root view
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
    //uses the root view to get a reference to the fragment's start button
        val startButton = view.findViewById<Button>(R.id.start)
    //on click, do this.
         startButton.setOnClickListener {
             val navController = view.findNavController()
             //navigates to the action ID
             navController.navigate(R.id.action_welcomeFragment_to_messageFragment)
         }
    return view
    }

}