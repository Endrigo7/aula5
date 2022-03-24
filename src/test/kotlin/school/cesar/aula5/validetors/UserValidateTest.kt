package school.cesar.aula5.validetors

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import school.cesar.aula5.entities.User

class UserValidateTest {

    @Test
    fun `deve lancar excecao quando nome for vazio`(){
        val user = User("123", "")

        assertThrows<RuntimeException> {
            UserValidate().validate(user)
        }.also {
            assertEquals("Nome nãoooooooo pode ser vazio", it.message)
        }
    }

}