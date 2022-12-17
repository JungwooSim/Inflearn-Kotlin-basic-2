package com.group.libraryapp.dto.book.request

import com.group.libraryapp.domain.book.BookType

class BookStatResponse(
  val type: BookType,
  var count: Int,
) {
  fun plusOne() {
    count++
  }
}