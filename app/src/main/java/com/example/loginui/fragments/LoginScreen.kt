package com.example.loginui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.loginui.R

class LoginScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_screen, container, false)

        //login in
        val loginButton = view.findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginScreen_to_menuScreen)
        }

        return view
    }


}