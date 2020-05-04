package example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.app.entity.Room;
import example.app.form.CrudForm;
import example.app.service.RoomServiceImpl;

@Controller
@RequestMapping("crud")
public class CrudController {

	@Autowired
	RoomServiceImpl roomService;

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		CrudForm form = new CrudForm();
		UpdateRoomList(form);
		model.addAttribute("crudForm", form);

		return "crud/input";
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public String echo(CrudForm form) {
//		UpdateRoomList(form);
//
//		return "crud/input";
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String jpaAdd(CrudForm form, Model model) {

		roomService.createRoom(form.getRoomName(), 10);

		return "redirect:/crud";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String jpaEdit(CrudForm form, Model model) {

		roomService.updateRoomName(form.getId(), form.getRoomName());

		return "redirect:/crud";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String jpaDelete(CrudForm form, Model model) {

		roomService.deleteRoom(form.getId());

		return "redirect:/crud";
	}

	private void UpdateRoomList(CrudForm form) {

		List<Room> roomList = roomService.getRoomAll();
		form.setRoomList(roomList);
	}
}
