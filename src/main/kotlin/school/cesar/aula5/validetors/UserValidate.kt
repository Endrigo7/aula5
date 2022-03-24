package school.cesar.aula5.validetors

import school.cesar.aula5.entities.User
import java.lang.RuntimeException

class UserValidate {

    fun validate(user: User){
        validateRequiredFields(user)
        validateSizeFields(user)
    }

    private fun validateRequiredFields(user: User){
        if(user.name.isBlank()){
            throw RuntimeException("Nome não pode ser vazio")
        }
    }

    private fun validateSizeFields(user: User){
        if(user.cpf.length > 14){
            throw RuntimeException("Tamanho invalido para o CPF")
        }

        if(user.name.length > 80){
            throw RuntimeException("Tamanho invalido para o Nome")
        }
    }
}