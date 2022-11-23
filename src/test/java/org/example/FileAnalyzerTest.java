package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FileAnalyzerTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    FileAnalyzer test1 = new FileAnalyzer(50, 12);
    FileAnalyzer testNull = new FileAnalyzer(0, 0);
    FileAnalyzer testNullNotNull = new FileAnalyzer(0, 14);
    FileAnalyzer testNotNullNull = new FileAnalyzer(35, 0);

    @Test
    public void createReport() {
        test1.createReport("D:\\repository\\maxima-java-03", "testLog.txt");
        assertTrue(true);
    }

    @Test
    public void createReportNull() {
        testNull.createReport("D:\\repository\\maxima-java-03", "testLogNull.txt");
        assertTrue(true);
    }

    @Test
    public void createReportNullNotNull() {
        testNullNotNull.createReport("D:\\repository\\maxima-java-03", "testLogNullNotNull.txt");
        assertTrue(true);
    }
    @Test
    public void createReportNotNullNull() {
        testNotNullNull.createReport("D:\\repository\\maxima-java-03", "testLogNotNullNull.txt");
        assertTrue(true);
    }
}
