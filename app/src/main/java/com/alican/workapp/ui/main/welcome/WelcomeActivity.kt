package com.alican.workapp.ui.main.welcome

import com.alican.workapp.R
import com.alican.workapp.core.BaseActivity
import com.alican.workapp.databinding.ActivityWelcomeBinding
import com.alican.workapp.ui.main.MainActivity
import com.alican.workapp.utils.util.extension.clickWithDebounce
import com.alican.workapp.utils.util.extension.startActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WelcomeActivity :
    BaseActivity<WelcomeViewModel, ActivityWelcomeBinding>(WelcomeViewModel::class.java) {
    override fun getLayoutRes(): Int {
        return R.layout.activity_welcome
    }

    override fun onInit() {
        setListener()
    }

    private fun setListener() {
        binding.btnContinue.clickWithDebounce {
            startActivity<MainActivity>()
        }

    }
}