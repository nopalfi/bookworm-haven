package xyz.nopalfi.bookworm_haven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.bookworm_haven.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
