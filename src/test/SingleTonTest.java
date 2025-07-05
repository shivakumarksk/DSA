package test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;



import patterns.Singleton;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SingleTonTest {

    @Mock
    private Singleton singleton;
    @Test
    public void testSingleton() {
        when(singleton.getData()).thenReturn("Singleton data");
        String data= singleton.getData();
assertEquals(data,"Singleton data");
    }
}
