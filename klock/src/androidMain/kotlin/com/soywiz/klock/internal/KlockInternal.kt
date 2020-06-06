package com.soywiz.klock.internal

import com.soywiz.klock.*
import java.util.*

internal actual object KlockInternal {
    actual val currentTime: Double get() = (System.currentTimeMillis()).toDouble()
    actual val hrNow: HRTimeSpan get() = HRTimeSpan.fromNanoseconds(System.nanoTime().toDouble())
    actual fun localTimezoneOffsetMinutes(time: DateTime): TimeSpan = TimeZone.getDefault().getOffset(time.unixMillisLong).milliseconds
}

actual typealias Serializable = java.io.Serializable
