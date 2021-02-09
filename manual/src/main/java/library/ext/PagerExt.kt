package library.ext

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.cachedIn
import androidx.paging.liveData
import kotlinx.coroutines.CoroutineScope

fun <Key : Any, Value : Any> buildPagerFlow(scope: CoroutineScope, source: () -> PagingSource<Key, Value>) =
        Pager(config = PagingConfig(pageSize = 5, prefetchDistance = 2, initialLoadSize = 5, enablePlaceholders = false),
                pagingSourceFactory = source).flow.cachedIn(scope)

fun <Key : Any, Value : Any> buildPagerLiveData(scope: CoroutineScope, source: () -> PagingSource<Key, Value>) =
        Pager(config = PagingConfig(pageSize = 5, prefetchDistance = 2, initialLoadSize = 5, enablePlaceholders = false),
                pagingSourceFactory = source).liveData.cachedIn(scope)