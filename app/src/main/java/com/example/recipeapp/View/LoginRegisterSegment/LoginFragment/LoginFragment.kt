package com.example.recipeapp.View.LoginRegisterSegment.LoginFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.LoginFragmentLayoutBinding

class LoginFragment : Fragment() {
    private lateinit var binding: LoginFragmentLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=LoginFragmentLayoutBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Listener
        binding.loginButton.setOnClickListener {
            if (loginPossible()) {
                //TODO perform login
            } else {
                Toast.makeText(
                    requireContext(),
                    "Wrong mail or password,do you have account?",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun loginPossible(): Boolean {
        if (binding.emailEditText.text.toString() == ""
            && binding.passwordEditText.text.toString() == "") {
            return true
            // TODO perform login

        } else {
            return false
            Toast.makeText(requireContext(),"Password and email don't match", Toast.LENGTH_SHORT).show()
        }
    }
}