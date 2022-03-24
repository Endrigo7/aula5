package school.cesar.aula5.services

import school.cesar.aula5.entities.User
import school.cesar.aula5.validetors.UserValidate

class UserService(
    val userValidate: UserValidate
) {

    fun add(user: User): User{
        userValidate.validate(user)
        return user.copy(name = "${user.name} silva")
    }
}
