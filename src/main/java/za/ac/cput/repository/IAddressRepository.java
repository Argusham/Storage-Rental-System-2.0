package za.ac.cput.repository;
/*
This is a Customer Class
Author @Ndumiso Nkululeko Ngcobo
Date: 07-04-2023
Student Number: 220094861
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Address;

import java.util.List;
import java.util.Set;
@Repository
public interface IAddressRepository extends JpaRepository<Address, String> {

    //public List<Address> getAll();
}
