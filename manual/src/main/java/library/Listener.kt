package library

import android.view.View

typealias OnItemClickListener<T> = (view: View, item: T?, position: Int) -> Unit

typealias OnItemSelectedListener<T> = (view: View, item: T?, position: Int) -> Unit

typealias OnActivateClickListener<T> = (data: T?) -> Unit