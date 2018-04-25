package edu.ntut.user.myhw3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class letterGradeTest {
    private letterGrade ms;

    @Before public void setUp(){
        ms = new letterGrade();
    }

    @After
    public void tearDown(){
        ms = null;
    }

    @Test
    public void testletterGrade() {
        assertEquals("Grade： A", ms.doGrade(100));
        assertEquals("Grade： B", ms.doGrade(80));
        assertEquals("Grade： C", ms.doGrade(70));
        assertEquals("Grade： D", ms.doGrade(60));
        assertEquals("Grade： F", ms.doGrade(20));
        assertEquals("Grade： Input score must be from 0 to 100", ms.doGrade(-1));
        assertEquals("Grade：" +
                "" +
                " Input score must be from 0 to 100", ms.doGrade(55555));
    }
}