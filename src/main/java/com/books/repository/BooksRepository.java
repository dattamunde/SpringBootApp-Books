package com.books.repository;
import org.springframework.data.repository.CrudRepository;

import com.books.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
