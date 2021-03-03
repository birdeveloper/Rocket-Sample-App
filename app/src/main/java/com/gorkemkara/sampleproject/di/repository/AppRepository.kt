package com.gorkemkara.sampleproject.di.repository

import com.gorkemkara.sampleproject.model.Rocket
import com.gorkemkara.sampleproject.di.remote.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AppRepository @Inject constructor(val api: ApiService){

    fun getRocketsData(): Flow<List<Rocket>> {
        return flow {
            val response = api.getRockets()
            emit(response)
        }.flowOn(Dispatchers.IO)
    }
}