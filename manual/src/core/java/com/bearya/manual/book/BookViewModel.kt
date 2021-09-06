package com.bearya.manual.book

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.bearya.component.Api
import com.bearya.data.entity.Book
import com.bearya.data.repository.BookRepository
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import library.Empty
import library.Fail
import library.NoNet
import library.ext.buildPagerFlow
import library.ext.buildPagerLiveData
import java.net.UnknownHostException

class BookViewModel : ViewModel() {

    private val bookRepository: BookRepository by lazy { BookRepository() }

    val books: LiveData<PagingData<Book>> by lazy {
        buildPagerLiveData(viewModelScope) { bookRepository.findBookByAll() }
    }

    fun activateVerify(code: String?): LiveData<Int?> = liveData {
        when {
            code.isNullOrBlank() -> emit(Empty)
            else -> emit(try {
                Api.activateVerify(code)?.data
            } catch (ex: UnknownHostException) {
                NoNet
            } catch (ex: Exception) {
                Fail
            })
        }
    }

    fun unlockBooks() = viewModelScope.launch {
        bookRepository.releaseBooks()
        MMKV.defaultMMKV().encode("lockStatus", false)
    }

}