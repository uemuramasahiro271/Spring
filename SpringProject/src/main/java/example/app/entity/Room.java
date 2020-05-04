package example.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SpringTest.room")
public class Room implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_id")
	private Integer roomId;

	@Column(name = "room_Name")
	private String roomName;

	@Column(name = "capacity")
	private Integer capacity;

//	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
//	private List<Equipment> equipments;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer id) {
		this.roomId = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

//	public List<Equipment> getEquipments() {
//		return equipments;
//	}
//
//	public void setEquipments(List<Equipment> equipments) {
//		this.equipments = equipments;
//	}
}
