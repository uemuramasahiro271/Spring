package example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.app.entity.Room;
import example.app.repository.RoomRepository;

@Service
public class RoomServiceImpl {
	@Autowired
	RoomRepository roomRepository;

	@Transactional(readOnly = true)
	public Room getRoom(Integer id) {
		Room room = roomRepository.findOne(id);
		if(room == null) {
			return null;
		}
		return room;
	}

	@Transactional(readOnly = true)
	public List<Room> getRoomAll(){
		return roomRepository.findAll(new  Sort(Direction.ASC, "roomId"));
	}

	@Transactional
	public Room createRoom(String roomName, Integer capacity) {
		Room room = new Room();
		room.setRoomName(roomName);
		room.setCapacity(capacity);
		return roomRepository.save(room);
	}

	@Transactional
	public Room updateRoomName(Integer id, String roomName) {
		Room room = getRoom(id);
		room.setRoomName(roomName);
		return room;
	}

	public void deleteRoom(Integer id) {
		roomRepository.delete(id);
	}

}
