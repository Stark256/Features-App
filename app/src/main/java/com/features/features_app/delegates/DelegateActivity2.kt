package com.features.features_app.delegates

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.features.features_app.R
import kotlinx.android.synthetic.main.activity_delegate2.*
import kotlin.properties.ReadWriteProperty

class DelegateActivity2 : AppCompatActivity() {

    private var param1: Int? by extrasNullable()
    private var param2: String? by extrasNullable()

    companion object {


        fun newInstance(context: Context, param1: Int, param2: String) : DelegateActivity2 {
            return DelegateActivity2()
                .apply {
                    this.param1 = param1
                    this.param2 = param2
                }

        }

    }

    fun <T: Any> extrasNullable() : ReadWriteProperty<Activity, T?> = ActivityExtrasDelegate()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate2)

        tv_extra_number
        tv_extra_string
    }
}