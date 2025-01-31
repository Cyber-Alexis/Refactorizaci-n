package Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	@Test
    void testDepositAmount() {
        Account myAccount1 = new Account("Alexis Buza", "1234-5678-90-123456789", 6000);
        Account myAccount2 = new Account("Simeon Makenzo", "12345-67890", 5000);
        
        try {
            myAccount1.depositAmount(1460);
            myAccount2.depositAmount(4630);
        } catch (Exception e) {
            fail("Error en el ingreso: " + e.getMessage());
        }
        
        assertEquals(7460.0, myAccount1.getBalance(), 0.001);
        assertEquals(9630.0, myAccount2.getBalance(), 0.001);
    }

    @Test
    void testWithdrawAmount() {
        Account myAccount1 = new Account("Alexis Buza", "1234-5678-90-123456789", 6000);
        Account myAccount2 = new Account("Simeon Makenzo", "12345-67890", 5000);
        
        try {
            myAccount1.withdrawAmount(1460);
            myAccount2.withdrawAmount(4630);
        } catch (Exception e) {
            fail("Error en la retirada: " + e.getMessage());
        }
        
        assertEquals(4540.0, myAccount1.getBalance(), 0.001);
        assertEquals(370.0, myAccount2.getBalance(), 0.001);
    }

}
