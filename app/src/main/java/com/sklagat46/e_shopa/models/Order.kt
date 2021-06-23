package com.sklagat46.e_shopa.models

import android.os.Parcelable
import com.sklagat46.e_shopa.models.Address
import com.sklagat46.e_shopa.models.Cart
import kotlinx.android.parcel.Parcelize

/**
 * A data model class for Order item with required fields.
 */
@Parcelize
data class Order(
    val user_id: String = "",
    val items: ArrayList<Cart> = ArrayList(),
    val address: Address = Address(),
    val title: String = "",
    val image: String = "",
    val sub_total_amount: String = "",
    val shipping_charge: String = "",
    val total_amount: String = "",
    val order_datetime: Long = 0L,
    var id: String = ""
) : Parcelable