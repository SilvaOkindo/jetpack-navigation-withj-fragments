package com.example.loginui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.loginui.R

class HomeScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home_screen, container, false)

        // signing up

        val signupButton = view.findViewById<Button>(R.id.button_signup)
        signupButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreen_to_signUpScreen)
        }

        // login in
        val loginButton = view.findViewById<Button>(R.id.button_login)
        loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreen_to_loginScreen)
        }

        return view
    }


}