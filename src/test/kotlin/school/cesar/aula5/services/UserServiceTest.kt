package school.cesar.aula5.services

import io.mockk.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import school.cesar.aula5.entities.User
import school.cesar.aula5.exceptions.RequiredFieldException
import school.cesar.aula5.validetors.UserValidate

class UserServiceTest {

    private val userValidate = mockk<UserValidate>()

    private val userService = UserService(
        userValidate = userValidate
    )

    @Test
    fun `nao deve lancar excecao quando usuario for valido`(){
        val expectedResult = User("123", " silva")
        val user = User("123", "")

        every { userValidate.validate(user) } throws RequiredFieldException("Mensagem veio do mock")

        val obtainedResult = userService.add(user)

        assertEquals(expectedResult, obtainedResult)

        verify { userValidate.validate(user) }
    }

}