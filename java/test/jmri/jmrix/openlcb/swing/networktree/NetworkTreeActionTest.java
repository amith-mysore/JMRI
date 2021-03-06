package jmri.jmrix.openlcb.swing.networktree;

import java.awt.GraphicsEnvironment;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import jmri.jmrix.can.TestTrafficController;
/**
 * @author Bob Jacobsen Copyright 2013
 * @author Paul Bender Copyright(C) 2016
 */
public class NetworkTreeActionTest {

    jmri.jmrix.can.CanSystemConnectionMemo memo;
    jmri.jmrix.can.TrafficController tc;

    @Test
    public void testCtor() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        NetworkTreeAction h = new NetworkTreeAction();
        Assert.assertNotNull("Action object non-null", h);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();

        memo  = new jmri.jmrix.openlcb.OlcbSystemConnectionMemo();
        TestTrafficController tc = new TestTrafficController();
        memo.setTrafficController(tc);

    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }
}
