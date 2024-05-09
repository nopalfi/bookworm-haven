package xyz.nopalfi.bookworm_haven.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.bookworm_haven.entity.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
}
