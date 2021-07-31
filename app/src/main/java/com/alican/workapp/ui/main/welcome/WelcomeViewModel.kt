package com.alican.workapp.ui.main.welcome

import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.db.AppDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val db: AppDatabase
) : BaseViewModel() {
}