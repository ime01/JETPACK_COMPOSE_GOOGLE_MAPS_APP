package com.plcoding.mapscomposeguide.presentation

import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties
import com.plcoding.mapscomposeguide.domain.model.ParkingSpot

data class MapState(

    val properties: MapProperties = MapProperties(),
    val isFalloutMap: Boolean = false,
    val parkingSpots: List<ParkingSpot> = emptyList()


)
