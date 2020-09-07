package com.features.features_app

import android.content.Intent
import android.os.Bundle

fun <T> Intent.putExtrass(key: String, value: T) {
    when(value) {
        is Boolean -> putExtra(key, value)
        is Int -> putExtra(key, value)
        is Byte -> putExtra(key, value)
        is Char -> putExtra(key, value)
        is Short -> putExtra(key, value)
        is Long -> putExtra(key, value)
        is Float -> putExtra(key, value)
        is Double -> putExtra(key, value)
        is Bundle -> putExtra(key, value)
        else -> throw IllegalStateException("Type of property $key is not supported")
    }

}