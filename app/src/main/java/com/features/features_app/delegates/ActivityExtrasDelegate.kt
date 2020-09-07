package com.features.features_app.delegates

import android.app.Activity
import android.content.Intent
import com.features.features_app.putExtrass
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class ActivityExtrasDelegate<T : Any?> : ReadWriteProperty<Activity, T?> {

    @Suppress("UNCHECKED_CAST")
    override fun getValue(thisRef: Activity, property: KProperty<*>): T? {
        val key = property.name
        return thisRef.intent.extras?.get(key) as? T //?: throw  IllegalStateException("Property ${property.name} could not be read")
    }

    override fun setValue(thisRef: Activity, property: KProperty<*>, value: T?) {
        val key = property.name
        val intent: Intent = thisRef.intent ?: Intent().also { thisRef.intent }
        value?.let { intent.putExtrass(key, value) } ?: intent.removeExtra(key)
    }

}