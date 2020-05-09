package example.app.form;

import java.io.Serializable;
import java.util.List;

import example.app.entity.Room;

public class CrudForm implements Serializable{

	private static final long serialVersionUID = 1;

	private List<Room> roomList;
	private int id;
	private String roomName;

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
}
