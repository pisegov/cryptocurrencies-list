package com.myaxa.core.database.coin.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "category",
    indices = [Index(value = ["name"], unique = true)],
)
data class CoinCategoryEntity(
    @ColumnInfo("category_id") @PrimaryKey(autoGenerate = true) val categoryId: Long = 0L,
    @ColumnInfo("name") val name: String,
)

@Entity(
    tableName = "coin_to_category",
    primaryKeys = ["coin_id", "category_id"],
)
data class CoinCategoryCrossRef(
    @ColumnInfo("coin_id") val coinId: String,
    @ColumnInfo("category_id") val categoryId: Long,
)
