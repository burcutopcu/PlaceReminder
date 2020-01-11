package com.burcutopcu.placereminder

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    fun getRepository() = (application as ReminderApp).getRepository()
}