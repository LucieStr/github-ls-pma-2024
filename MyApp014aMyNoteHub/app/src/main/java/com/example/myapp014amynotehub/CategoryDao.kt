package com.example.myapp014amynotehub

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {

    // Vloží novou kategorii do databáze
    @Insert
    suspend fun insert(category: Category)

    // Aktualizuje existující kategorii
    @Update
    suspend fun update(category: Category)

    // Smaže zadanou kategorii
    @Delete
    suspend fun delete(category: Category)

    // Načte všechny kategorie a vrátí je jako Flow
    @Query("SELECT * FROM category_table ORDER BY name ASC") // serazeni podle jmena a vzestupne
    fun getAllCategories(): Flow<List<Category>>
}