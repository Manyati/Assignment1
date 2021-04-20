package az.ac.cput;

/**
 * @author Asanda Mabaso -205049990
 *
 * This is a simple app
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;
    private Account account2;
    private Account account3;


    @BeforeEach
    void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }

    @Test
    void testIdentity () {

        assertSame(account1, account3);

    }

    @Test
    void testEquality () {
        assertEquals(account1,account3);

    }

}
