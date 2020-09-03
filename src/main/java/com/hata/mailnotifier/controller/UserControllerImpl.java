package com.hata.mailnotifier.controller;

import com.hata.mailnotifier.model.User;
import com.hata.mailnotifier.model.UserDTO;
import com.hata.mailnotifier.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserControllerImpl {

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    public String getUserList(Model model) {
        model.addAttribute("users", userService.getAll());
        return "users";
    }

    //отрисовка данных
    @GetMapping(path = "/user-form")
    public String createUserForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user-create";
    }

    //получение данных и перенаправление
    @PostMapping(path = "/user-form/add")
    public String createUser(@ModelAttribute("user") UserDTO userDTO) {
        userService.saveUser(userDTO);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Integer id, Model model) {
        UserDTO userDTO = userService.getById(id);
        model.addAttribute("user", userDTO);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(@ModelAttribute("user") UserDTO userDTO) {
        userService.saveUser(userDTO);
        return "redirect:/users";
    }

    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    /*asdassaassasa*/
    /*sdsffdsdsf*/



//
//    @PostMapping(path = "/user/{email}")
//    public void createUser(@PathVariable(name = "email") String email) {
//        userService.createUser(email);
//    }
//
//    @PostMapping(path = "/user/names/{name}/emails/{email}/statuses/{status}")
//    public void createUser3(@PathVariable(name = "name") String name,
//                            @PathVariable(name = "email") String email,
//                            @PathVariable(name = "status") String status) {
//        userService.createUser(name, email, status);
//    }

    // @RequestParam("name") - метод ожидает входящий параметр "name"

}


