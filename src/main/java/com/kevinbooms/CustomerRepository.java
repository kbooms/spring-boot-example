package com.kevinbooms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
        // Jpa Repositories implement CrudRepository as well as PagingAndSortingRepository
        // this allows our API to perform CRUD operations, Paging, and Sorting
        // the first Datatype the repository needs is the Entity datatype itself, so "Customer" in this case
        // and it also needs the data type for IDing. Since the datatype for id is Integer, we pass Integer as well
}
