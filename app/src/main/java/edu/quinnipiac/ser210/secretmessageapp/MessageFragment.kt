package edu.quinnipiac.ser210.secretmessageapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController


class MessageFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        //uses the root view to get a reference to the fragment's start button
        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)
        //on click, do this.
        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
            view.findNavController().navigate(action)
        }

        return view
    }

}