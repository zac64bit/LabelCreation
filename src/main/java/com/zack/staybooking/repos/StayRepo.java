package com.zack.staybooking.repos;

import com.zack.staybooking.models.Stay;
import com.zack.staybooking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StayRepo extends JpaRepository<Stay, Long> {
    List<Stay> findByHost(User user);
    Stay findByIdAndHost(Long id, User host);

    List<Stay> findByIdInAndGuestNumberGreaterThanEqual(List<Long> ids, int guestNumber);
}
