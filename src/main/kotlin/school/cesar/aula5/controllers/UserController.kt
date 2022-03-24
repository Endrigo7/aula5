package school.cesar.aula5.controllers

import school.cesar.aula5.entities.User
import school.cesar.aula5.services.UserService
import school.cesar.aula5.validetors.UserValidate

class UserController {

    private val userValidate = UserValidate()
    private val userService = UserService(userValidate)

    fun add(){
        val user = User("1212121", "Jair Jose")
        userService.add(user)
    }
}

fun main() {
    val userController = UserController()
    userController.add()
}