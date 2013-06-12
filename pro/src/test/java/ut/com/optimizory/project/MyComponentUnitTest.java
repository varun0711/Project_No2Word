package ut.com.optimizory.project;

import org.junit.Test;
import com.optimizory.project.MyPluginComponent;
import com.optimizory.project.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}