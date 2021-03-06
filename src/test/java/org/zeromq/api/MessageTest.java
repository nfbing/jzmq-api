package org.zeromq.api;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class MessageTest {

    @Test
    public void testAddFrame() throws Exception {
        Message testClass = new Message();
        testClass.addFrame(new byte[]{5, 6, 7});
        List<Message.Frame> frames = testClass.getFrames();
        assertEquals(1, frames.size());
        assertArrayEquals(new byte[]{5, 6, 7}, frames.get(0).getData());
    }

    @Test
    public void testBlankFrame() throws Exception {
        Message testClass = new Message();
        testClass.addEmptyFrame();
        List<Message.Frame> frames = testClass.getFrames();
        assertEquals(1, frames.size());
        assertArrayEquals(new byte[0], frames.get(0).getData());
    }

    @Test
    public void testMixedFrames() throws Exception {
        Message testClass = new Message();
        testClass.addEmptyFrame();
        testClass.addFrame("Hello".getBytes());
        List<Message.Frame> frames = testClass.getFrames();
        assertEquals(2, frames.size());
        assertArrayEquals(new byte[0], frames.get(0).getData());
        assertArrayEquals("Hello".getBytes(), frames.get(1).getData());
    }

    @Test
    public void testCopyConstructor() throws Exception {
        Message initial = new Message();
        initial.addFrame("hello".getBytes());
        initial.addEmptyFrame();
        initial.addFrame("goodbye".getBytes());

        Message newMessage = new Message(initial);
        assertEquals(initial.getFrames(), newMessage.getFrames());
    }

}
