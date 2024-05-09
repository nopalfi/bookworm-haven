package xyz.nopalfi.bookworm_haven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.nopalfi.bookworm_haven.entity.Invoice;

@Repository
public interface OrderRepository extends JpaRepository<Invoice, Integer> {
}
