package com.moonyh.domain.usecase

import com.moonyh.domain.algorithm.BoyerMooreTextSearch
import com.moonyh.domain.model.info.CityInfo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlin.coroutines.coroutineContext

abstract class SearchCitiesUseCase {
    abstract suspend fun invokeAsync(
        text: String,
        cityList: ArrayList<out CityInfo>
    ): Deferred<ArrayList<out CityInfo>>
}

class SearchCitiesUseCaseImpl : SearchCitiesUseCase() {
    override suspend fun invokeAsync(
        text: String,
        cityList: ArrayList<out CityInfo>
    ): Deferred<ArrayList<out CityInfo>> = CoroutineScope(coroutineContext).async {
        if(text=="")
            return@async cityList
        val result = arrayListOf<CityInfo>()
        cityList.forEach {
            val temp = BoyerMooreTextSearch.search(it.cityName, text)
            if(temp)
                result.add(it)
        }
        result
    }
}
