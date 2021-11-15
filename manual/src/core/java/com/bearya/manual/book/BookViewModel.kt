package com.bearya.manual.book

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.bearya.component.Api
import com.bearya.data.entity.Book
import com.bearya.data.repository.BookRepository
import library.Empty
import library.Fail
import library.NoNet
import java.net.UnknownHostException

class BookViewModel : ViewModel() {

    private val bookRepository: BookRepository by lazy { BookRepository() }

    val books: LiveData<PagingData<Book>> by lazy { bookRepository.findBookByAll(viewModelScope) }

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

    fun unlockBooks() {
        bookRepository.releaseBooks(viewModelScope)
    }

}