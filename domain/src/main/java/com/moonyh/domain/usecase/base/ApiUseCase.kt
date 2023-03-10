package com.moonyh.domain.usecase.base

import com.moonyh.domain.model.api.ApiResponse
import com.moonyh.domain.model.api.base.ApiBody
import com.moonyh.domain.model.api.base.ApiQuery
import com.moonyh.domain.model.api.MetaData

interface ApiUseCase<T : ApiQuery, A : ApiBody<MetaData, Any>>:UseCase {
    suspend operator fun invoke(query: T): ApiResponse<A>
}