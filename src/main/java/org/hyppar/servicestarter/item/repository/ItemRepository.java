package org.hyppar.servicestarter.item.repository;

import org.hyppar.servicestarter.item.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
