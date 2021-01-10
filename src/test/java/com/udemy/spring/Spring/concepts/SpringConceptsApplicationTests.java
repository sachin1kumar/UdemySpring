package com.udemy.spring.Spring.concepts;

import com.udemy.spring.Spring.concepts.fortesting.CheckPositiveNum;
import com.udemy.spring.Spring.concepts.fortesting.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SpringConceptsApplicationTests {

    @Mock
    DataService dataService;

    @InjectMocks
    CheckPositiveNum checkPositiveNum;

    @Test
    public void testPositiveCase() {
        when(dataService.getData()).thenReturn(new int[] {1, 2, 3});
        assertTrue(checkPositiveNum.isPositive());
    }

    @Test
    public void testNagativeCase() {
        when(dataService.getData()).thenReturn(new int[] {-1, 2, 3});
        assertFalse(checkPositiveNum.isPositive());
    }

}
