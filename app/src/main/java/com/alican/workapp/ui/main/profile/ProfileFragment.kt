package com.alican.workapp.ui.main.profile

import com.alican.workapp.R
import com.alican.workapp.core.BaseFragment
import com.alican.workapp.databinding.FragmentProfileBinding
import com.alican.workapp.ui.main.MainActivity
import com.alican.workapp.utils.util.AppUtils
import com.alican.workapp.utils.util.extension.clickWithDebounce
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment :
    BaseFragment<ProfileViewModel, FragmentProfileBinding>(ProfileViewModel::class.java) {
    override fun onInit() {

        setListener()
    }

    private fun setListener() {
        binding?.btnFacebook?.clickWithDebounce {
            AppUtils.getOpenFacebookIntent(
                activity as MainActivity,
                "https://www.facebook.com/"
            )
        }
        binding?.btnTwitter?.clickWithDebounce {

        }
    }

    override fun getLayoutRes(): Int {
        return R.layout.fragment_profile
    }
}