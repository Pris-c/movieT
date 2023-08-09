package com.priscila.movieT.repository;

import com.priscila.movieT.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface RoomRepository extends JpaRepository<Room, UUID> {

    List<Room> findByName(String name);

}
