package xyz.nopalfi.bookworm_haven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.bookworm_haven.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
