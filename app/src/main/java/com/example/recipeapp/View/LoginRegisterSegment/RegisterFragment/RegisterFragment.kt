package com.example.recipeapp.View.LoginRegisterSegment.RegisterFragment

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.RegisterFragmentLayoutBinding


class RegisterFragment : Fragment() {
    private lateinit var binding: RegisterFragmentLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=RegisterFragmentLayoutBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.registerButton.setOnClickListener {
            check()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun check() {
        val email=binding.emailEditText
        val password=binding.passwordEditText
        val confirmPassword=binding.confirmPasswordEditText

        if ((password.text == confirmPassword.text
                    && password.text != null) && isValidEmail(email.text)
        ) {
            //TODO firebase register and move to main screen
        } else {
            Toast.makeText(requireContext(), "Passwords don't match", Toast.LENGTH_SHORT).show()
        }
    }
   private fun isValidEmail(target: CharSequence?): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target!!).matches()
        }
    }
}