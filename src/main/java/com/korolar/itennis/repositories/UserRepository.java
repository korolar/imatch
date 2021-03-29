package com.korolar.itennis.repositories;

import com.korolar.itennis.entity.BusinessRole;
import com.korolar.itennis.entity.Club;
import com.korolar.itennis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String email);

	List<User> findByBusinessRolesIsContainingAndClub(BusinessRole businessRole, Club club);

}