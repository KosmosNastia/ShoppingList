package com.example.shoppinglist.activiteis

import android.app.Application
import db.MainDataBase

class MainApp : Application (){
    val database by lazy { MainDataBase.getDataBase(this) }

}