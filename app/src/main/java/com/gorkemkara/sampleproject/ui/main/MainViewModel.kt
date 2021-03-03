package com.gorkemkara.sampleproject.ui.main

import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import com.gorkemkara.sampleproject.model.Rocket
import com.gorkemkara.sampleproject.di.repository.AppRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onStart

class MainViewModel @ViewModelInject constructor(application: Application, private val repository: AppRepository) : AndroidViewModel(application) {

   val rocketsLiveData = liveData<List<Rocket>> {
        repository.getRocketsData()
            .onStart {
                //yüklenirken loading
            }
            .catch {
                //hata
            }
            .collect {
               emit(it)
            }
    }
}