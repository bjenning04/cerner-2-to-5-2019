// cerner_2^5_2019

package com.cerner.kotlinjsonclasswithparcelize

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

enum class Gender {
    MALE,
    FEMALE
}

@JsonClass(generateAdapter = true)
@Parcelize
data class Kitty(
    val name: String?,
    val gender: Gender?,
    val soft: Boolean? = true,
    val warm: Boolean? = true,
    val happy: Boolean? = true,
    val sleepy: Boolean? = true
) : Parcelable