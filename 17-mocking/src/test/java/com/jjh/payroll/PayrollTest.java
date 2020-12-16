package com.jjh.payroll;

import com.jjh.domain.Person;
import com.jjh.processor.Processor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class PayrollTest {

    @Mock
    private Processor processor;

    private Payroll payroll;

    @BeforeEach
    public void setUp() {
        // Set up what should happen when next
        // is called on processor
        Mockito.when(processor.next())
                .thenReturn(new Person("John", 47, "ABC123"))
                .thenReturn(new Person("Denise", 44, "XYZ987"));
        Mockito.when(processor.hasNext())
                .thenReturn(true)
                .thenReturn(true)
                .thenReturn(false);
        payroll = new Payroll(processor);
    }

    @Test
    @DisplayName("Test that the payroll object processes each person to obtain a list of names")
    public void testCanIterateOverPeople() {
        List<String> names = payroll.getPeopleToPay();
        assertNotNull(names, "List of names expected");
        assertEquals(2, names.size(), "There shoudl only be two names returned");
        assertEquals("John", names.get(0));
        assertEquals("Denise", names.get(1));
        // Now verify that the Mock was called as expected
        // That is we verify our mock calls
        // i.e. that next was called twice
        Mockito.verify(processor,
                Mockito.times(2)).next();

    }
}