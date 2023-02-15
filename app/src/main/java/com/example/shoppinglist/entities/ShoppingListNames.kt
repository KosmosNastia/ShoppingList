package com.example.shoppinglist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chopping_list_names")
data class ShoppingListNames(
    @PrimaryKey (autoGenerate = true)
    val id: Int?,

    @ColumnInfo (name = "name")
    val name: String,

    @ColumnInfo (name = "time")
    val time: String,

    @ColumnInfo (name = "allIemCount")
    val allItemCounter: Int,

    @ColumnInfo (name = "checkItemsCounter")
    val checkedItemsCounter: Int,

    @ColumnInfo (name = "itemsIds")
    val itemsIds: String,

): java.io.Serializable
