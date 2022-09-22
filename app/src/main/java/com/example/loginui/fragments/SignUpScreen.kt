package com.example.loginui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.loginui.R


class SignUpScreen : Fragment() {


    //@SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sign_up_screen, container, false)

       val signupButton = view.findViewById<Button>(R.id.signup)
        signupButton.setOnClickListener {
            findNavController().navigate(R.id.action_signUpScreen_to_menuScreen)
        }

        return view
    }
}