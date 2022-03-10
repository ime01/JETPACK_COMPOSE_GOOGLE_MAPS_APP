package com.plcoding.mapscomposeguide.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkingSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParking(spot: ParkingSpotEntity)

    @Delete
    suspend fun deleteParking(spot: ParkingSpotEntity)

    @Query("SELECT * FROM parkingspotentity")
    fun getParkingSpots(): Flow<List< ParkingSpotEntity>>



}