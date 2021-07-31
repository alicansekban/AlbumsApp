package com.alican.workapp.ui.main

import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.db.AppDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val db: AppDatabase
) : BaseViewModel() {

}