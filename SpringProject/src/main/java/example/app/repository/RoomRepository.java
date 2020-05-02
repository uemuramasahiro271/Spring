package example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.app.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{

}
