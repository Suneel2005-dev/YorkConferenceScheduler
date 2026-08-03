package scheduler.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = scheduler.gui.MainUI.ROOM_BOOKING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOM_BOOKING" + "'", str0, "ROOM_BOOKING");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.database.CsvDatabase.append(path0, "ROOM_BOOKING");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.awt.Component component0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = javax.swing.JComponent.isLightweightComponent(component0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"peer\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.Class<?> wildcardClass1 = faculty0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = scheduler.gui.MainUI.ADMIN_DASHBOARD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ADMIN_DASHBOARD" + "'", str0, "ADMIN_DASHBOARD");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel3.list(printStream7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
        org.junit.Assert.assertArrayEquals(windowArray0, new java.awt.Window[] {});
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        int int3 = myBookingsPanel1.countComponents();
        myBookingsPanel1.setRequestFocusEnabled(false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.enableInputMethods(true);
        java.awt.Point point9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = myBookingsPanel3.contains(point9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        jToolTip4.setEnabled(false);
        boolean boolean7 = jToolTip4.isFocusOwner();
        java.awt.event.ComponentListener componentListener8 = null;
        jToolTip4.removeComponentListener(componentListener8);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = scheduler.gui.MainUI.PAYMENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PAYMENT" + "'", str0, "PAYMENT");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel13 = new scheduler.gui.MyBookingsPanel(mainUI12);
        java.awt.event.InputMethodListener[] inputMethodListenerArray14 = myBookingsPanel13.getInputMethodListeners();
        java.awt.Component component16 = myBookingsPanel11.add((java.awt.Component) myBookingsPanel13, (int) (short) -1);
        myBookingsPanel11.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = myBookingsPanel11.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle20 = null;
        java.awt.Rectangle rectangle21 = myBookingsPanel11.getBounds(rectangle20);
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel3.repaint(rectangle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray14);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray14, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertNotNull(focusTraversalPolicy19);
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        boolean boolean6 = myBookingsPanel1.contains(8, 64);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        javax.swing.InputMap inputMap13 = myBookingsPanel3.getInputMap();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inputMap13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        int int7 = component6.getWidth();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.lang.Object obj7 = component6.getTreeLock();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            occupiedState0.handleRelease(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.lang.String str5 = myBookingsPanel1.getUIClassID();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt(0, (int) (byte) 10);
        java.beans.VetoableChangeListener vetoableChangeListener9 = null;
        myBookingsPanel1.removeVetoableChangeListener(vetoableChangeListener9);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        myBookingsPanel6.removeContainerListener(containerListener7);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel12 = new scheduler.gui.MyBookingsPanel(mainUI11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI13);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = myBookingsPanel14.getInputMethodListeners();
        java.awt.Component component17 = myBookingsPanel12.add((java.awt.Component) myBookingsPanel14, (int) (short) -1);
        myBookingsPanel12.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy20 = myBookingsPanel12.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle21 = null;
        java.awt.Rectangle rectangle22 = myBookingsPanel12.getBounds(rectangle21);
        myBookingsPanel10.scrollRectToVisible(rectangle22);
        java.awt.Rectangle rectangle24 = myBookingsPanel6.getBounds(rectangle22);
        myBookingsPanel1.paintImmediately(rectangle22);
        java.io.PrintStream printStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.list(printStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray15, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNotNull(focusTraversalPolicy20);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier7 = null;
        myBookingsPanel3.setInputVerifier(inputVerifier7);
        javax.swing.JPopupMenu jPopupMenu9 = null;
        myBookingsPanel3.setComponentPopupMenu(jPopupMenu9);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = myBookingsPanel3.getSize(dimension10);
        java.awt.Point point12 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel3.setLocation(point12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = scheduler.gui.MainUI.ROOM_MANAGEMENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOM_MANAGEMENT" + "'", str0, "ROOM_MANAGEMENT");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        scheduler.payment.InstitutionBilling institutionBilling0 = new scheduler.payment.InstitutionBilling();
        boolean boolean2 = institutionBilling0.processTransaction((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.event.FocusEvent.Cause cause3 = null;
        boolean boolean4 = myBookingsPanel1.requestFocusInWindow(cause3);
        boolean boolean5 = myBookingsPanel1.isPaintingTile();
        myBookingsPanel1.firePropertyChange("PAYMENT", (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.Color color3 = null;
        myBookingsPanel1.setForeground(color3);
        myBookingsPanel1.setVisible(true);
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        myBookingsPanel1.removeMouseMotionListener(mouseMotionListener7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.event.FocusEvent.Cause cause3 = null;
        boolean boolean4 = myBookingsPanel1.requestFocusInWindow(cause3);
        java.awt.Graphics graphics5 = null;
        myBookingsPanel1.printAll(graphics5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        myBookingsPanel3.move(8, 4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        java.awt.event.FocusEvent.Cause cause11 = null;
        myBookingsPanel3.requestFocus(cause11);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.nio.file.Path path0 = scheduler.database.CsvDatabase.ACCOUNTS_FILE;
        scheduler.database.CsvDatabase.append(path0, "");
        java.lang.String[] strArray10 = new java.lang.String[] { "PAYMENT", "ToolTipText", "hi!", "ROOM_BOOKING", "ROOM_MANAGEMENT", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        scheduler.database.CsvDatabase.replaceRows(path0, "PAYMENT", (java.util.List<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(path0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "PAYMENT", "ToolTipText", "hi!", "ROOM_BOOKING", "ROOM_MANAGEMENT", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = myBookingsPanel1.getFocusTraversalPolicy();
        java.awt.ComponentOrientation componentOrientation10 = myBookingsPanel1.getComponentOrientation();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(focusTraversalPolicy9);
        org.junit.Assert.assertNotNull(componentOrientation10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        java.lang.Class<?> wildcardClass11 = myBookingsPanel3.getClass();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        java.awt.Component[] componentArray11 = myBookingsPanel3.getComponents();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(componentArray11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        myBookingsPanel1.invalidate();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        myBookingsPanel9.removeNotify();
        float float11 = myBookingsPanel9.getAlignmentX();
        javax.swing.JToolTip jToolTip12 = myBookingsPanel9.createToolTip();
        myBookingsPanel9.enable();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel19 = new scheduler.gui.MyBookingsPanel(mainUI18);
        java.awt.event.InputMethodListener[] inputMethodListenerArray20 = myBookingsPanel19.getInputMethodListeners();
        java.awt.Component component22 = myBookingsPanel17.add((java.awt.Component) myBookingsPanel19, (int) (short) -1);
        myBookingsPanel17.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = myBookingsPanel17.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle26 = null;
        java.awt.Rectangle rectangle27 = myBookingsPanel17.getBounds(rectangle26);
        myBookingsPanel15.scrollRectToVisible(rectangle27);
        myBookingsPanel9.setBounds(rectangle27);
        java.awt.Graphics graphics30 = null;
        myBookingsPanel9.update(graphics30);
        javax.swing.JToolTip jToolTip32 = myBookingsPanel9.createToolTip();
        java.awt.Point point33 = null;
        java.awt.Point point34 = myBookingsPanel9.getLocation(point33);
        java.awt.Point point35 = myBookingsPanel1.getLocation(point34);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip12);
        org.junit.Assert.assertNotNull(inputMethodListenerArray20);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray20, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertNotNull(focusTraversalPolicy25);
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertNotNull(jToolTip32);
        org.junit.Assert.assertNotNull(point34);
        org.junit.Assert.assertNotNull(point35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.RoomManagementPanel roomManagementPanel1 = new scheduler.gui.RoomManagementPanel(mainUI0);
        roomManagementPanel1.setSize(100, 9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        scheduler.room.Room room7 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        java.lang.String str8 = room7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}" + "'", str8, "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        scheduler.pricing.PartnerPricing partnerPricing0 = new scheduler.pricing.PartnerPricing();
        double double1 = partnerPricing0.getHourlyRate();
        double double2 = partnerPricing0.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        int int24 = myBookingsPanel1.getBaseline((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.ContainerListener containerListener7 = null;
        myBookingsPanel3.addContainerListener(containerListener7);
        java.awt.Color color9 = null;
        myBookingsPanel3.setForeground(color9);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.resize((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        myBookingsPanel1.disable();
        java.awt.Image image4 = null;
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel8 = new scheduler.gui.MyBookingsPanel(mainUI7);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel12 = new scheduler.gui.MyBookingsPanel(mainUI11);
        java.awt.event.InputMethodListener[] inputMethodListenerArray13 = myBookingsPanel12.getInputMethodListeners();
        java.awt.Component component15 = myBookingsPanel10.add((java.awt.Component) myBookingsPanel12, (int) (short) -1);
        myBookingsPanel10.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy18 = myBookingsPanel10.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle19 = null;
        java.awt.Rectangle rectangle20 = myBookingsPanel10.getBounds(rectangle19);
        myBookingsPanel8.scrollRectToVisible(rectangle20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        javax.swing.JToolTip jToolTip26 = myBookingsPanel23.createToolTip();
        java.awt.Dimension dimension27 = jToolTip26.size();
        myBookingsPanel8.resize(dimension27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel30 = new scheduler.gui.MyBookingsPanel(mainUI29);
        myBookingsPanel30.removeNotify();
        float float32 = myBookingsPanel30.getAlignmentX();
        myBookingsPanel8.remove((java.awt.Component) myBookingsPanel30);
        boolean boolean34 = myBookingsPanel1.prepareImage(image4, (-1), 10, (java.awt.image.ImageObserver) myBookingsPanel30);
        org.junit.Assert.assertNotNull(inputMethodListenerArray13);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray13, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertNotNull(focusTraversalPolicy18);
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getRoomNumber();
        java.lang.String str11 = room8.getBuilding();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToolTipText" + "'", str11, "ToolTipText");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.show();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        myBookingsPanel1.setName("");
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        int int14 = myBookingsPanel3.countComponents();
        java.awt.event.HierarchyListener[] hierarchyListenerArray15 = myBookingsPanel3.getHierarchyListeners();
        myBookingsPanel3.disable();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(hierarchyListenerArray15);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray15, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        int int3 = myBookingsPanel1.countComponents();
        myBookingsPanel1.enable();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = myBookingsPanel1.handleEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        scheduler.payment.InstitutionBilling institutionBilling0 = new scheduler.payment.InstitutionBilling();
        boolean boolean2 = institutionBilling0.processTransaction(100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = myBookingsPanel3.getSize(dimension10);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        myBookingsPanel3.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        float float5 = myBookingsPanel1.getAlignmentY();
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        scheduler.user.Staff staff0 = new scheduler.user.Staff();
        java.lang.String str1 = staff0.getOrgID();
        java.lang.String str2 = staff0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        scheduler.pricing.StudentPricing studentPricing0 = new scheduler.pricing.StudentPricing();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        myBookingsPanel3.setDebugGraphicsOptions(100);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.event.FocusEvent.Cause cause3 = null;
        boolean boolean4 = myBookingsPanel1.requestFocusInWindow(cause3);
        boolean boolean5 = myBookingsPanel1.isPaintingTile();
        java.awt.Graphics graphics6 = null;
        myBookingsPanel1.printAll(graphics6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        boolean boolean27 = myBookingsPanel1.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        boolean boolean6 = myBookingsPanel1.requestFocusInWindow();
        java.lang.Class<?> wildcardClass7 = myBookingsPanel1.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        scheduler.user.Partner partner5 = new scheduler.user.Partner("PanelUI", "", "ROOM_BOOKING", "hi!", true);
        boolean boolean6 = partner5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.UserDashboardPanel userDashboardPanel1 = new scheduler.gui.UserDashboardPanel(mainUI0);
        userDashboardPanel1.resize(0, 3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        jToolTip4.setFocusTraversalPolicyProvider(false);
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        jToolTip4.removeHierarchyListener(hierarchyListener8);
        javax.swing.KeyStroke keyStroke10 = null;
        int int11 = jToolTip4.getConditionForKeyStroke(keyStroke10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        jToolTip4.removePropertyChangeListener("PAYMENT", propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        java.awt.Font font27 = myBookingsPanel1.getFont();
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = myBookingsPanel1.getToolTipText(mouseEvent28);
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("PanelUI", "ToolTipText", "ToolTipText", "ADMIN_DASHBOARD", true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        javax.swing.JToolTip jToolTip9 = myBookingsPanel3.createToolTip();
        int int10 = jToolTip9.getY();
        javax.swing.event.AncestorListener ancestorListener11 = null;
        jToolTip9.addAncestorListener(ancestorListener11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        jToolTip9.removeHierarchyListener(hierarchyListener13);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        javax.swing.ActionMap actionMap3 = myBookingsPanel1.getActionMap();
        myBookingsPanel1.setAlignmentX(100.0f);
        org.junit.Assert.assertNotNull(actionMap3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        boolean boolean16 = myBookingsPanel1.isEnabled();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getBuilding();
        room8.release();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToolTipText" + "'", str10, "ToolTipText");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Event event6 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.deliverEvent(event6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        java.awt.event.InputMethodListener[] inputMethodListenerArray17 = myBookingsPanel16.getInputMethodListeners();
        java.awt.Component component19 = myBookingsPanel14.add((java.awt.Component) myBookingsPanel16, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        myBookingsPanel16.addMouseWheelListener(mouseWheelListener20);
        boolean boolean22 = myBookingsPanel16.isFocusTraversable();
        java.awt.Dimension dimension23 = null;
        java.awt.Dimension dimension24 = myBookingsPanel16.getSize(dimension23);
        java.awt.Rectangle rectangle25 = myBookingsPanel16.getBounds();
        myBookingsPanel3.computeVisibleRect(rectangle25);
        java.awt.FocusTraversalPolicy focusTraversalPolicy27 = myBookingsPanel3.getFocusTraversalPolicy();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray17);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray17, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertNull(focusTraversalPolicy27);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        int int20 = myBookingsPanel1.getX();
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        javax.swing.JToolTip jToolTip9 = myBookingsPanel3.createToolTip();
        int int10 = jToolTip9.getY();
        javax.swing.event.AncestorListener ancestorListener11 = null;
        jToolTip9.addAncestorListener(ancestorListener11);
        jToolTip9.transferFocusBackward();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        myBookingsPanel1.setOpaque(true);
        java.awt.event.HierarchyListener hierarchyListener18 = null;
        myBookingsPanel1.addHierarchyListener(hierarchyListener18);
        myBookingsPanel1.setAutoscrolls(true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = myBookingsPanel1.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle10 = null;
        java.awt.Rectangle rectangle11 = myBookingsPanel1.getBounds(rectangle10);
        java.io.PrintStream printStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.list(printStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(focusTraversalPolicy9);
        org.junit.Assert.assertNotNull(rectangle11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        myBookingsPanel1.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        javax.swing.KeyStroke keyStroke24 = null;
        int int25 = myBookingsPanel1.getConditionForKeyStroke(keyStroke24);
        java.awt.PopupMenu popupMenu26 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.add(popupMenu26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        java.awt.Insets insets11 = myBookingsPanel3.insets();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(insets11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        boolean boolean16 = myBookingsPanel1.isBackgroundSet();
        java.lang.String str17 = myBookingsPanel1.getUIClassID();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PanelUI" + "'", str17, "PanelUI");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str0 = scheduler.gui.MainUI.LOGIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LOGIN" + "'", str0, "LOGIN");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        int int7 = myBookingsPanel1.getHeight();
        java.awt.event.ComponentListener[] componentListenerArray8 = myBookingsPanel1.getComponentListeners();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(componentListenerArray8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        java.awt.dnd.DropTarget dropTarget14 = myBookingsPanel3.getDropTarget();
        boolean boolean15 = myBookingsPanel3.isPreferredSizeSet();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(dropTarget14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        java.awt.Dimension dimension5 = myBookingsPanel1.preferredSize();
        java.awt.event.KeyListener keyListener6 = null;
        myBookingsPanel1.addKeyListener(keyListener6);
        myBookingsPanel1.setVerifyInputWhenFocusTarget(false);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("", "ROOM_BOOKING", "hi!", "", false);
        java.lang.String str6 = faculty5.getEmail();
        faculty5.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ROOM_BOOKING" + "'", str6, "ROOM_BOOKING");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        java.awt.Dimension dimension5 = myBookingsPanel1.preferredSize();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt((int) (short) 10, (int) (short) 100);
        boolean boolean9 = myBookingsPanel1.isValid();
        javax.swing.event.AncestorListener[] ancestorListenerArray10 = myBookingsPanel1.getAncestorListeners();
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ancestorListenerArray10);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray10, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        myBookingsPanel1.setName("hi!");
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.enableInputMethods(true);
        java.lang.Class<?> wildcardClass9 = myBookingsPanel3.getClass();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        javax.swing.KeyStroke keyStroke22 = null;
        java.awt.event.ActionListener actionListener23 = myBookingsPanel1.getActionForKeyStroke(keyStroke22);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNull(actionListener23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        component6.removeMouseMotionListener(mouseMotionListener7);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = component6.getPropertyChangeListeners("");
        boolean boolean11 = component6.isShowing();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray10, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        myBookingsPanel1.show(false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        scheduler.sensor.HardwareSensor hardwareSensor0 = new scheduler.sensor.HardwareSensor();
        hardwareSensor0.detectOccupancy();
        hardwareSensor0.notifyObservers("ToolTipText");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        jToolTip4.setFocusTraversalPolicyProvider(false);
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        jToolTip4.removeHierarchyListener(hierarchyListener8);
        java.awt.event.FocusEvent.Cause cause10 = null;
        jToolTip4.requestFocus(cause10);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel13 = new scheduler.gui.MyBookingsPanel(mainUI12);
        myBookingsPanel13.removeNotify();
        float float15 = myBookingsPanel13.getAlignmentX();
        javax.swing.JToolTip jToolTip16 = myBookingsPanel13.createToolTip();
        myBookingsPanel13.enable();
        java.awt.Font font18 = myBookingsPanel13.getFont();
        jToolTip4.setFont(font18);
        boolean boolean20 = jToolTip4.getVerifyInputWhenFocusTarget();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.enableInputMethods(true);
        boolean boolean9 = myBookingsPanel3.isEnabled();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel13 = new scheduler.gui.MyBookingsPanel(mainUI12);
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        java.awt.event.InputMethodListener[] inputMethodListenerArray16 = myBookingsPanel15.getInputMethodListeners();
        java.awt.Component component18 = myBookingsPanel13.add((java.awt.Component) myBookingsPanel15, (int) (short) -1);
        myBookingsPanel13.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = myBookingsPanel13.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle22 = null;
        java.awt.Rectangle rectangle23 = myBookingsPanel13.getBounds(rectangle22);
        myBookingsPanel11.scrollRectToVisible(rectangle23);
        myBookingsPanel3.scrollRectToVisible(rectangle23);
        myBookingsPanel3.setVisible(true);
        java.awt.Insets insets28 = null;
        java.awt.Insets insets29 = myBookingsPanel3.getInsets(insets28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.awt.Point point31 = myBookingsPanel3.getToolTipLocation(mouseEvent30);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray16);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray16, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(focusTraversalPolicy21);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertNull(point31);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel8 = new scheduler.gui.MyBookingsPanel(mainUI7);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        java.awt.event.InputMethodListener[] inputMethodListenerArray11 = myBookingsPanel10.getInputMethodListeners();
        java.awt.Component component13 = myBookingsPanel8.add((java.awt.Component) myBookingsPanel10, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        myBookingsPanel10.addMouseWheelListener(mouseWheelListener14);
        boolean boolean16 = myBookingsPanel10.isFocusTraversable();
        java.awt.Dimension dimension17 = null;
        java.awt.Dimension dimension18 = myBookingsPanel10.getSize(dimension17);
        myBookingsPanel1.setPreferredSize(dimension18);
        myBookingsPanel1.doLayout();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(inputMethodListenerArray11);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray11, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dimension18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        component6.removeMouseMotionListener(mouseMotionListener7);
        java.awt.Image image9 = null;
        boolean boolean15 = component6.imageUpdate(image9, 0, (int) (byte) 100, (int) (byte) 1, (int) 'a', 0);
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            component6.list(printWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        java.awt.Dimension dimension27 = myBookingsPanel1.getPreferredSize();
        java.awt.Graphics graphics28 = myBookingsPanel1.getGraphics();
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(graphics28);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        myBookingsPanel1.invalidate();
        java.awt.Dimension dimension8 = myBookingsPanel1.getMinimumSize();
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = myBookingsPanel1.handleEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        room8.reserve();
        java.lang.String str11 = room8.getStatus();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        float float4 = myBookingsPanel1.getAlignmentY();
        myBookingsPanel1.requestFocus();
        java.awt.Graphics graphics6 = null;
        myBookingsPanel1.paintAll(graphics6);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        scheduler.sensor.HardwareSensor hardwareSensor0 = new scheduler.sensor.HardwareSensor();
        java.lang.String str1 = hardwareSensor0.getSensorID();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        boolean boolean14 = myBookingsPanel3.isMaximumSizeSet();
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel3.remove(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        myBookingsPanel24.removeNotify();
        java.awt.ComponentOrientation componentOrientation26 = myBookingsPanel24.getComponentOrientation();
        myBookingsPanel24.addNotify();
        java.awt.Dimension dimension28 = myBookingsPanel24.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension28);
        myBookingsPanel1.firePropertyChange("PAYMENT", (short) (byte) -1, (short) 10);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel35 = new scheduler.gui.MyBookingsPanel(mainUI34);
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel37 = new scheduler.gui.MyBookingsPanel(mainUI36);
        java.awt.event.InputMethodListener[] inputMethodListenerArray38 = myBookingsPanel37.getInputMethodListeners();
        java.awt.Component component40 = myBookingsPanel35.add((java.awt.Component) myBookingsPanel37, (int) (short) -1);
        myBookingsPanel37.enableInputMethods(true);
        boolean boolean43 = myBookingsPanel37.isEnabled();
        float float44 = myBookingsPanel37.getAlignmentX();
        scheduler.user.Faculty faculty45 = new scheduler.user.Faculty();
        faculty45.setVerified(true);
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.add((java.awt.Component) myBookingsPanel37, (java.lang.Object) true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(inputMethodListenerArray38);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray38, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.lang.String str5 = myBookingsPanel1.getUIClassID();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt(0, (int) (byte) 10);
        boolean boolean9 = myBookingsPanel1.isShowing();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        myBookingsPanel11.removeNotify();
        float float13 = myBookingsPanel11.getAlignmentX();
        javax.swing.JToolTip jToolTip14 = myBookingsPanel11.createToolTip();
        myBookingsPanel11.enable();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel19 = new scheduler.gui.MyBookingsPanel(mainUI18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel21 = new scheduler.gui.MyBookingsPanel(mainUI20);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel21.getInputMethodListeners();
        java.awt.Component component24 = myBookingsPanel19.add((java.awt.Component) myBookingsPanel21, (int) (short) -1);
        myBookingsPanel19.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy27 = myBookingsPanel19.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle28 = null;
        java.awt.Rectangle rectangle29 = myBookingsPanel19.getBounds(rectangle28);
        myBookingsPanel17.scrollRectToVisible(rectangle29);
        myBookingsPanel11.setBounds(rectangle29);
        myBookingsPanel1.setBounds(rectangle29);
        myBookingsPanel1.nextFocus();
        java.awt.ImageCapabilities imageCapabilities36 = null;
        java.awt.image.VolatileImage volatileImage37 = myBookingsPanel1.createVolatileImage(3, (int) (short) 0, imageCapabilities36);
        float float38 = myBookingsPanel1.getAlignmentX();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertNotNull(focusTraversalPolicy27);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNull(volatileImage37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        java.awt.Dimension dimension4 = myBookingsPanel1.size();
        java.awt.Point point5 = myBookingsPanel1.getMousePosition();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertNull(point5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.UserDashboardPanel userDashboardPanel1 = new scheduler.gui.UserDashboardPanel(mainUI0);
        boolean boolean2 = userDashboardPanel1.isDoubleBuffered();
        userDashboardPanel1.show();
        boolean boolean4 = userDashboardPanel1.isDisplayable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        scheduler.room.Room room7 = new scheduler.room.Room("ROOM_MANAGEMENT", 1, "ToolTipText", "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}", false, true, "PanelUI");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        myBookingsPanel1.addInputMethodListener(inputMethodListener4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.Graphics graphics22 = null;
        myBookingsPanel1.update(graphics22);
        javax.swing.JToolTip jToolTip24 = myBookingsPanel1.createToolTip();
        java.awt.Point point25 = null;
        java.awt.Point point26 = myBookingsPanel1.getLocation(point25);
        java.awt.Dimension dimension27 = null;
        java.awt.Dimension dimension28 = myBookingsPanel1.getSize(dimension27);
        java.awt.Dimension dimension29 = myBookingsPanel1.size();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(jToolTip24);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(dimension29);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.PopupMenu popupMenu7 = null;
        // The following exception was thrown during execution in test generation
        try {
            component6.add(popupMenu7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        myBookingsPanel6.removeContainerListener(containerListener7);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel12 = new scheduler.gui.MyBookingsPanel(mainUI11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI13);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = myBookingsPanel14.getInputMethodListeners();
        java.awt.Component component17 = myBookingsPanel12.add((java.awt.Component) myBookingsPanel14, (int) (short) -1);
        myBookingsPanel12.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy20 = myBookingsPanel12.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle21 = null;
        java.awt.Rectangle rectangle22 = myBookingsPanel12.getBounds(rectangle21);
        myBookingsPanel10.scrollRectToVisible(rectangle22);
        java.awt.Rectangle rectangle24 = myBookingsPanel6.getBounds(rectangle22);
        myBookingsPanel1.paintImmediately(rectangle22);
        java.awt.Event event26 = null;
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.deliverEvent(event26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray15, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNotNull(focusTraversalPolicy20);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        java.awt.Dimension dimension4 = myBookingsPanel1.size();
        float float5 = myBookingsPanel1.getAlignmentX();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray6 = myBookingsPanel1.getVetoableChangeListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray6);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray6, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        myBookingsPanel1.repaint((long) '#');
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        myBookingsPanel3.setAutoscrolls(true);
        myBookingsPanel3.transferFocus();
        myBookingsPanel3.setVerifyInputWhenFocusTarget(false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("", "ROOM_BOOKING", "hi!", "", false);
        faculty5.setVerified(false);
        java.lang.String str8 = faculty5.getEmail();
        java.lang.String str9 = faculty5.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ROOM_BOOKING" + "'", str8, "ROOM_BOOKING");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = myBookingsPanel3.getSize(dimension10);
        java.awt.Rectangle rectangle12 = myBookingsPanel3.getBounds();
        java.awt.Component[] componentArray13 = myBookingsPanel3.getComponents();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertNotNull(componentArray13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel8 = new scheduler.gui.MyBookingsPanel(mainUI7);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        java.awt.event.InputMethodListener[] inputMethodListenerArray11 = myBookingsPanel10.getInputMethodListeners();
        java.awt.Component component13 = myBookingsPanel8.add((java.awt.Component) myBookingsPanel10, (int) (short) -1);
        myBookingsPanel8.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy16 = myBookingsPanel8.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle17 = null;
        java.awt.Rectangle rectangle18 = myBookingsPanel8.getBounds(rectangle17);
        myBookingsPanel6.scrollRectToVisible(rectangle18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel21 = new scheduler.gui.MyBookingsPanel(mainUI20);
        myBookingsPanel21.removeNotify();
        float float23 = myBookingsPanel21.getAlignmentX();
        javax.swing.JToolTip jToolTip24 = myBookingsPanel21.createToolTip();
        java.awt.Dimension dimension25 = jToolTip24.size();
        myBookingsPanel6.resize(dimension25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel28 = new scheduler.gui.MyBookingsPanel(mainUI27);
        myBookingsPanel28.removeNotify();
        float float30 = myBookingsPanel28.getAlignmentX();
        myBookingsPanel6.remove((java.awt.Component) myBookingsPanel28);
        java.awt.Component component34 = myBookingsPanel28.locate((int) 'a', 2);
        java.awt.Component component35 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel28);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray11);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray11, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(focusTraversalPolicy16);
        org.junit.Assert.assertNotNull(rectangle18);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip24);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNull(component34);
        org.junit.Assert.assertNotNull(component35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        myBookingsPanel3.setAutoscrolls(true);
        java.beans.VetoableChangeListener vetoableChangeListener12 = null;
        myBookingsPanel3.removeVetoableChangeListener(vetoableChangeListener12);
        java.awt.Graphics graphics14 = null;
        myBookingsPanel3.paintAll(graphics14);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isStrongPassword("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.User user5 = userFactory0.createUser("hi!", strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User details are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.Graphics graphics22 = null;
        myBookingsPanel1.update(graphics22);
        javax.swing.JToolTip jToolTip24 = myBookingsPanel1.createToolTip();
        java.awt.Point point25 = null;
        java.awt.Point point26 = myBookingsPanel1.getLocation(point25);
        java.awt.Dimension dimension27 = null;
        java.awt.Dimension dimension28 = myBookingsPanel1.getSize(dimension27);
        boolean boolean29 = myBookingsPanel1.isOpaque();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(jToolTip24);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        myBookingsPanel3.removeHierarchyListener(hierarchyListener10);
        java.awt.Dimension dimension12 = myBookingsPanel3.getMaximumSize();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.Color color3 = null;
        myBookingsPanel1.setForeground(color3);
        boolean boolean5 = myBookingsPanel1.isFocusOwner();
        myBookingsPanel1.firePropertyChange("PAYMENT", (double) (short) -1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        java.awt.LayoutManager layoutManager23 = myBookingsPanel1.getLayout();
        javax.swing.ActionMap actionMap24 = myBookingsPanel1.getActionMap();
        scheduler.gui.MainUI mainUI25 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel26 = new scheduler.gui.MyBookingsPanel(mainUI25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel28 = new scheduler.gui.MyBookingsPanel(mainUI27);
        java.awt.event.InputMethodListener[] inputMethodListenerArray29 = myBookingsPanel28.getInputMethodListeners();
        java.awt.Component component31 = myBookingsPanel26.add((java.awt.Component) myBookingsPanel28, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener32 = null;
        myBookingsPanel28.addMouseWheelListener(mouseWheelListener32);
        boolean boolean34 = myBookingsPanel28.isFocusTraversable();
        boolean boolean35 = myBookingsPanel28.isManagingFocus();
        myBookingsPanel28.setAlignmentY((float) 3);
        java.lang.Object obj38 = myBookingsPanel28.getTreeLock();
        scheduler.gui.MainUI mainUI39 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel40 = new scheduler.gui.MyBookingsPanel(mainUI39);
        myBookingsPanel40.removeNotify();
        float float42 = myBookingsPanel40.getAlignmentX();
        javax.swing.JToolTip jToolTip43 = myBookingsPanel40.createToolTip();
        java.awt.Dimension dimension44 = jToolTip43.size();
        jToolTip43.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension47 = jToolTip43.preferredSize();
        myBookingsPanel28.setPreferredSize(dimension47);
        myBookingsPanel1.setMinimumSize(dimension47);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNotNull(actionMap24);
        org.junit.Assert.assertNotNull(inputMethodListenerArray29);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray29, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip43);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertNotNull(dimension47);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        scheduler.user.User user2 = userFactory0.getUserByID("ROOM_BOOKING");
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("ROOM_BOOKING", "ToolTipText", "ADMIN_DASHBOARD", "LOGIN", false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.Dimension dimension10 = null;
        java.awt.Dimension dimension11 = myBookingsPanel3.getSize(dimension10);
        boolean boolean12 = myBookingsPanel3.isDisplayable();
        java.awt.event.FocusListener[] focusListenerArray13 = myBookingsPanel3.getFocusListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(focusListenerArray13);
        org.junit.Assert.assertArrayEquals(focusListenerArray13, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        myBookingsPanel1.firePropertyChange("hi!", 64, 100);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = myBookingsPanel1.getToolTipText(mouseEvent20);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.User user3 = userFactory0.createUser("", strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        myBookingsPanel15.removeNotify();
        float float17 = myBookingsPanel15.getAlignmentX();
        javax.swing.JToolTip jToolTip18 = myBookingsPanel15.createToolTip();
        java.awt.Dimension dimension19 = jToolTip18.size();
        jToolTip18.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension22 = jToolTip18.preferredSize();
        myBookingsPanel3.setPreferredSize(dimension22);
        myBookingsPanel3.updateUI();
        java.awt.Component component25 = myBookingsPanel3.getNextFocusableComponent();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNull(component25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.RegistrationPanel registrationPanel1 = new scheduler.gui.RegistrationPanel(mainUI0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        jToolTip4.setFocusTraversalPolicyProvider(false);
        boolean boolean8 = jToolTip4.isEnabled();
        boolean boolean9 = jToolTip4.isPaintingTile();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        java.awt.Graphics graphics16 = null;
        myBookingsPanel1.paintAll(graphics16);
        myBookingsPanel1.firePropertyChange("ADMIN_DASHBOARD", (short) -1, (short) (byte) -1);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        int int7 = myBookingsPanel1.getHeight();
        java.awt.event.HierarchyListener[] hierarchyListenerArray8 = myBookingsPanel1.getHierarchyListeners();
        java.awt.event.KeyListener keyListener9 = null;
        myBookingsPanel1.removeKeyListener(keyListener9);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(hierarchyListenerArray8);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray8, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        scheduler.payment.DebitCardPayment debitCardPayment0 = new scheduler.payment.DebitCardPayment();
        boolean boolean2 = debitCardPayment0.processTransaction((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.String str1 = faculty0.getEmail();
        java.lang.String str2 = faculty0.getOrgID();
        java.lang.String str3 = faculty0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        myBookingsPanel1.setOpaque(true);
        java.awt.event.HierarchyListener hierarchyListener18 = null;
        myBookingsPanel1.addHierarchyListener(hierarchyListener18);
        myBookingsPanel1.revalidate();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        myBookingsPanel24.removeNotify();
        java.awt.ComponentOrientation componentOrientation26 = myBookingsPanel24.getComponentOrientation();
        myBookingsPanel24.addNotify();
        java.awt.Dimension dimension28 = myBookingsPanel24.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension28);
        java.awt.Color color30 = myBookingsPanel1.getBackground();
        java.awt.Rectangle rectangle31 = myBookingsPanel1.bounds();
        myBookingsPanel1.repaint();
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(rectangle31);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        myBookingsPanel1.addHierarchyBoundsListener(hierarchyBoundsListener22);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        scheduler.user.Staff staff5 = new scheduler.user.Staff("ROOM_BOOKING", "ROOM_BOOKING", "ROOM_BOOKING", "ADMIN_DASHBOARD", false);
        boolean boolean6 = staff5.isVerified();
        boolean boolean8 = staff5.checkPassword("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.lang.String str5 = myBookingsPanel1.getUIClassID();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt(0, (int) (byte) 10);
        boolean boolean9 = myBookingsPanel1.isShowing();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        myBookingsPanel11.removeNotify();
        float float13 = myBookingsPanel11.getAlignmentX();
        javax.swing.JToolTip jToolTip14 = myBookingsPanel11.createToolTip();
        myBookingsPanel11.enable();
        java.awt.Font font16 = myBookingsPanel11.getFont();
        myBookingsPanel1.setFont(font16);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        myBookingsPanel24.removeNotify();
        java.awt.ComponentOrientation componentOrientation26 = myBookingsPanel24.getComponentOrientation();
        myBookingsPanel24.addNotify();
        java.awt.Dimension dimension28 = myBookingsPanel24.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension28);
        java.awt.Color color30 = myBookingsPanel1.getBackground();
        boolean boolean33 = myBookingsPanel1.contains(100, (-1));
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        myBookingsPanel5.removeNotify();
        float float7 = myBookingsPanel5.getAlignmentX();
        javax.swing.JToolTip jToolTip8 = myBookingsPanel5.createToolTip();
        myBookingsPanel5.enable();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel13 = new scheduler.gui.MyBookingsPanel(mainUI12);
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        java.awt.event.InputMethodListener[] inputMethodListenerArray16 = myBookingsPanel15.getInputMethodListeners();
        java.awt.Component component18 = myBookingsPanel13.add((java.awt.Component) myBookingsPanel15, (int) (short) -1);
        myBookingsPanel13.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = myBookingsPanel13.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle22 = null;
        java.awt.Rectangle rectangle23 = myBookingsPanel13.getBounds(rectangle22);
        myBookingsPanel11.scrollRectToVisible(rectangle23);
        myBookingsPanel5.setBounds(rectangle23);
        java.awt.Graphics graphics26 = null;
        myBookingsPanel5.update(graphics26);
        javax.swing.JToolTip jToolTip28 = myBookingsPanel5.createToolTip();
        java.awt.Point point29 = null;
        java.awt.Point point30 = myBookingsPanel5.getLocation(point29);
        java.awt.Point point31 = myBookingsPanel1.getLocation(point29);
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel33 = new scheduler.gui.MyBookingsPanel(mainUI32);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel35 = new scheduler.gui.MyBookingsPanel(mainUI34);
        java.awt.event.InputMethodListener[] inputMethodListenerArray36 = myBookingsPanel35.getInputMethodListeners();
        java.awt.Component component38 = myBookingsPanel33.add((java.awt.Component) myBookingsPanel35, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener39 = null;
        myBookingsPanel35.addMouseWheelListener(mouseWheelListener39);
        boolean boolean41 = myBookingsPanel35.isFocusTraversable();
        myBookingsPanel35.setAutoscrolls(true);
        myBookingsPanel35.transferFocus();
        java.awt.Color color45 = myBookingsPanel35.getForeground();
        myBookingsPanel1.setForeground(color45);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip8);
        org.junit.Assert.assertNotNull(inputMethodListenerArray16);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray16, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(focusTraversalPolicy21);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(jToolTip28);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertNotNull(inputMethodListenerArray36);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray36, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            scheduler.room.Room room3 = new scheduler.room.Room("", 16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        java.awt.Dimension dimension5 = myBookingsPanel1.preferredSize();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        myBookingsPanel9.addMouseWheelListener(mouseWheelListener13);
        boolean boolean15 = myBookingsPanel9.isFocusTraversable();
        myBookingsPanel9.setAutoscrolls(true);
        java.beans.VetoableChangeListener vetoableChangeListener18 = null;
        myBookingsPanel9.removeVetoableChangeListener(vetoableChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.setComponentZOrder((java.awt.Component) myBookingsPanel9, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        java.awt.Component component6 = jToolTip4.getNextFocusableComponent();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = jToolTip4.getBaselineResizeBehavior();
        boolean boolean8 = jToolTip4.isValid();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(component6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = myBookingsPanel1.getPropertyChangeListeners("");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray3, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        myBookingsPanel15.removeNotify();
        float float17 = myBookingsPanel15.getAlignmentX();
        javax.swing.JToolTip jToolTip18 = myBookingsPanel15.createToolTip();
        java.awt.Dimension dimension19 = jToolTip18.size();
        jToolTip18.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension22 = jToolTip18.preferredSize();
        myBookingsPanel3.setPreferredSize(dimension22);
        boolean boolean24 = myBookingsPanel3.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        myBookingsPanel15.removeNotify();
        float float17 = myBookingsPanel15.getAlignmentX();
        javax.swing.JToolTip jToolTip18 = myBookingsPanel15.createToolTip();
        java.awt.Dimension dimension19 = jToolTip18.size();
        jToolTip18.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension22 = jToolTip18.preferredSize();
        myBookingsPanel3.setPreferredSize(dimension22);
        myBookingsPanel3.setBounds((int) ' ', (int) (byte) 100, 0, 16);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(dimension22);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.enableInputMethods(true);
        boolean boolean9 = myBookingsPanel3.isEnabled();
        float float10 = myBookingsPanel3.getAlignmentX();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener11);
        boolean boolean13 = myBookingsPanel3.isRequestFocusEnabled();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        float float3 = myBookingsPanel1.getAlignmentX();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        myBookingsPanel6.removeNotify();
        java.awt.ComponentOrientation componentOrientation8 = myBookingsPanel6.getComponentOrientation();
        myBookingsPanel1.applyComponentOrientation(componentOrientation8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        myBookingsPanel11.repaint();
        java.awt.Dimension dimension14 = myBookingsPanel11.size();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel18 = new scheduler.gui.MyBookingsPanel(mainUI17);
        java.awt.event.InputMethodListener[] inputMethodListenerArray19 = myBookingsPanel18.getInputMethodListeners();
        java.awt.Component component21 = myBookingsPanel16.add((java.awt.Component) myBookingsPanel18, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        myBookingsPanel18.addMouseWheelListener(mouseWheelListener22);
        boolean boolean24 = myBookingsPanel18.isFocusTraversable();
        java.awt.Dimension dimension25 = null;
        java.awt.Dimension dimension26 = myBookingsPanel18.getSize(dimension25);
        java.awt.Dimension dimension27 = myBookingsPanel11.getSize(dimension26);
        myBookingsPanel1.resize(dimension26);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(componentOrientation8);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNotNull(inputMethodListenerArray19);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray19, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(dimension27);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        java.awt.Insets insets5 = myBookingsPanel1.getInsets();
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(insets5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        boolean boolean6 = myBookingsPanel1.requestFocusInWindow();
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = myBookingsPanel1.getActionForKeyStroke(keyStroke7);
        boolean boolean9 = myBookingsPanel1.isRequestFocusEnabled();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        java.awt.event.ContainerListener[] containerListenerArray15 = myBookingsPanel1.getContainerListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertNotNull(containerListenerArray15);
        org.junit.Assert.assertArrayEquals(containerListenerArray15, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.Dimension dimension9 = myBookingsPanel1.getSize();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        myBookingsPanel11.removeNotify();
        java.awt.ComponentOrientation componentOrientation13 = myBookingsPanel11.getComponentOrientation();
        myBookingsPanel1.applyComponentOrientation(componentOrientation13);
        java.awt.Event event15 = null;
        boolean boolean18 = myBookingsPanel1.mouseUp(event15, 64, 6);
        javax.swing.JToolTip jToolTip19 = myBookingsPanel1.createToolTip();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(componentOrientation13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jToolTip19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        myBookingsPanel24.removeNotify();
        java.awt.ComponentOrientation componentOrientation26 = myBookingsPanel24.getComponentOrientation();
        myBookingsPanel24.addNotify();
        java.awt.Dimension dimension28 = myBookingsPanel24.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension28);
        myBookingsPanel1.setOpaque(true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(dimension28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        float float4 = myBookingsPanel1.getAlignmentY();
        java.awt.Graphics graphics5 = null;
        myBookingsPanel1.printAll(graphics5);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        java.awt.event.InputMethodListener[] inputMethodListenerArray8 = myBookingsPanel7.getInputMethodListeners();
        java.awt.Component component10 = myBookingsPanel5.add((java.awt.Component) myBookingsPanel7, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        myBookingsPanel7.addMouseWheelListener(mouseWheelListener11);
        boolean boolean13 = myBookingsPanel7.isFocusTraversable();
        boolean boolean14 = myBookingsPanel7.isManagingFocus();
        myBookingsPanel7.setAlignmentY((float) 3);
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel18 = new scheduler.gui.MyBookingsPanel(mainUI17);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel20 = new scheduler.gui.MyBookingsPanel(mainUI19);
        java.awt.event.InputMethodListener[] inputMethodListenerArray21 = myBookingsPanel20.getInputMethodListeners();
        java.awt.Component component23 = myBookingsPanel18.add((java.awt.Component) myBookingsPanel20, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        myBookingsPanel20.addMouseWheelListener(mouseWheelListener24);
        boolean boolean26 = myBookingsPanel20.isFocusTraversable();
        java.awt.Dimension dimension27 = null;
        java.awt.Dimension dimension28 = myBookingsPanel20.getSize(dimension27);
        java.awt.Rectangle rectangle29 = myBookingsPanel20.getBounds();
        myBookingsPanel7.computeVisibleRect(rectangle29);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel32 = new scheduler.gui.MyBookingsPanel(mainUI31);
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel34 = new scheduler.gui.MyBookingsPanel(mainUI33);
        scheduler.gui.MainUI mainUI35 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel36 = new scheduler.gui.MyBookingsPanel(mainUI35);
        java.awt.event.InputMethodListener[] inputMethodListenerArray37 = myBookingsPanel36.getInputMethodListeners();
        java.awt.Component component39 = myBookingsPanel34.add((java.awt.Component) myBookingsPanel36, (int) (short) -1);
        myBookingsPanel34.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy42 = myBookingsPanel34.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle43 = null;
        java.awt.Rectangle rectangle44 = myBookingsPanel34.getBounds(rectangle43);
        myBookingsPanel32.scrollRectToVisible(rectangle44);
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel47 = new scheduler.gui.MyBookingsPanel(mainUI46);
        myBookingsPanel47.removeNotify();
        float float49 = myBookingsPanel47.getAlignmentX();
        javax.swing.JToolTip jToolTip50 = myBookingsPanel47.createToolTip();
        java.awt.Dimension dimension51 = jToolTip50.size();
        myBookingsPanel32.resize(dimension51);
        scheduler.gui.MainUI mainUI53 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel54 = new scheduler.gui.MyBookingsPanel(mainUI53);
        myBookingsPanel54.removeNotify();
        float float56 = myBookingsPanel54.getAlignmentX();
        myBookingsPanel32.remove((java.awt.Component) myBookingsPanel54);
        java.awt.Font font58 = myBookingsPanel32.getFont();
        myBookingsPanel7.setFont(font58);
        java.awt.FontMetrics fontMetrics60 = myBookingsPanel1.getFontMetrics(font58);
        javax.swing.plaf.PanelUI panelUI61 = myBookingsPanel1.getUI();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray8);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray8, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray21);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray21, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(inputMethodListenerArray37);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray37, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertNotNull(focusTraversalPolicy42);
        org.junit.Assert.assertNotNull(rectangle44);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip50);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertNotNull(font58);
        org.junit.Assert.assertNotNull(fontMetrics60);
        org.junit.Assert.assertNotNull(panelUI61);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        javax.swing.InputVerifier inputVerifier13 = myBookingsPanel3.getInputVerifier();
        myBookingsPanel3.show(false);
        boolean boolean16 = myBookingsPanel3.isFocusOwner();
        myBookingsPanel3.firePropertyChange("", 1.0f, 0.5f);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputVerifier13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = myBookingsPanel1.getFocusTraversalPolicy();
        myBookingsPanel1.paintImmediately(6, (int) (short) 0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(focusTraversalPolicy9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.ContainerListener containerListener7 = null;
        myBookingsPanel3.addContainerListener(containerListener7);
        myBookingsPanel3.paintImmediately((int) (short) 10, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        javax.swing.KeyStroke keyStroke14 = null;
        myBookingsPanel3.unregisterKeyboardAction(keyStroke14);
        myBookingsPanel3.updateUI();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.lang.String str5 = myBookingsPanel1.getUIClassID();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        myBookingsPanel7.removeNotify();
        java.awt.ComponentOrientation componentOrientation9 = myBookingsPanel7.getComponentOrientation();
        myBookingsPanel7.addNotify();
        java.awt.Dimension dimension11 = myBookingsPanel7.preferredSize();
        java.awt.Component component14 = myBookingsPanel7.findComponentAt((int) (short) 10, (int) (short) 100);
        boolean boolean15 = myBookingsPanel7.isValid();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        myBookingsPanel17.removeNotify();
        float float19 = myBookingsPanel17.getAlignmentX();
        javax.swing.JToolTip jToolTip20 = myBookingsPanel17.createToolTip();
        myBookingsPanel17.enable();
        java.awt.Font font22 = myBookingsPanel17.getFont();
        java.awt.FontMetrics fontMetrics23 = myBookingsPanel7.getFontMetrics(font22);
        java.awt.FontMetrics fontMetrics24 = myBookingsPanel1.getFontMetrics(font22);
        java.awt.Graphics graphics25 = null;
        myBookingsPanel1.print(graphics25);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentOrientation9);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(component14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(fontMetrics23);
        org.junit.Assert.assertNotNull(fontMetrics24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        myBookingsPanel1.doLayout();
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        javax.swing.InputVerifier inputVerifier13 = myBookingsPanel3.getInputVerifier();
        myBookingsPanel3.show(false);
        myBookingsPanel3.firePropertyChange("", '#', 'a');
        myBookingsPanel3.setDebugGraphicsOptions(0);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputVerifier13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.setAlignmentY(10.0f);
        javax.swing.plaf.PanelUI panelUI9 = myBookingsPanel3.getUI();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(panelUI9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        javax.swing.InputVerifier inputVerifier13 = myBookingsPanel3.getInputVerifier();
        myBookingsPanel3.resetKeyboardActions();
        javax.swing.TransferHandler transferHandler15 = myBookingsPanel3.getTransferHandler();
        javax.swing.InputVerifier inputVerifier16 = null;
        myBookingsPanel3.setInputVerifier(inputVerifier16);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputVerifier13);
        org.junit.Assert.assertNull(transferHandler15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        java.awt.Event event4 = null;
        boolean boolean6 = myBookingsPanel1.keyUp(event4, 7);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        scheduler.pricing.StaffPricing staffPricing0 = new scheduler.pricing.StaffPricing();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = myBookingsPanel1.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle10 = null;
        java.awt.Rectangle rectangle11 = myBookingsPanel1.getBounds(rectangle10);
        java.awt.Cursor cursor12 = myBookingsPanel1.getCursor();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(focusTraversalPolicy9);
        org.junit.Assert.assertNotNull(rectangle11);
        org.junit.Assert.assertNotNull(cursor12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        java.awt.LayoutManager layoutManager23 = myBookingsPanel1.getLayout();
        javax.swing.ActionMap actionMap24 = myBookingsPanel1.getActionMap();
        int int25 = myBookingsPanel1.getDebugGraphicsOptions();
        myBookingsPanel1.setLocation(2, 12);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNotNull(actionMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        java.awt.dnd.DropTarget dropTarget14 = myBookingsPanel3.getDropTarget();
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap16 = myBookingsPanel3.getInputMap(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(dropTarget14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getBuilding();
        java.lang.String str11 = room8.toString();
        scheduler.room.RoomState roomState12 = room8.getCurrentState();
        boolean boolean13 = room8.isMaintenance();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToolTipText" + "'", str10, "ToolTipText");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}" + "'", str11, "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}");
        org.junit.Assert.assertNotNull(roomState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getBuilding();
        scheduler.room.OccupiedState occupiedState11 = new scheduler.room.OccupiedState();
        scheduler.room.Room room19 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState11.handleReserve(room19);
        room8.setState((scheduler.room.RoomState) occupiedState11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToolTipText" + "'", str10, "ToolTipText");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        myBookingsPanel1.firePropertyChange("hi!", 64, 100);
        myBookingsPanel1.repaint();
        java.awt.Container container21 = myBookingsPanel1.getFocusCycleRootAncestor();
        java.awt.Event event22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = container21.mouseExit(event22, 5, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(container21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        java.awt.Component component6 = jToolTip4.getNextFocusableComponent();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = jToolTip4.getBaselineResizeBehavior();
        jToolTip4.doLayout();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(component6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isStrongPassword("PAYMENT");
        scheduler.user.User user4 = userFactory0.getUserByEmail("PanelUI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getBuilding();
        java.lang.String str11 = room8.toString();
        java.lang.String str12 = room8.getLocation();
        scheduler.room.OccupiedState occupiedState13 = new scheduler.room.OccupiedState();
        room8.setState((scheduler.room.RoomState) occupiedState13);
        scheduler.room.OccupiedState occupiedState15 = new scheduler.room.OccupiedState();
        scheduler.room.Room room23 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState15.handleReserve(room23);
        java.lang.String str25 = room23.getBuilding();
        java.lang.String str26 = room23.toString();
        java.lang.String str27 = room23.getLocation();
        scheduler.room.OccupiedState occupiedState28 = new scheduler.room.OccupiedState();
        room23.setState((scheduler.room.RoomState) occupiedState28);
        occupiedState13.handleReserve(room23);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToolTipText" + "'", str10, "ToolTipText");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}" + "'", str11, "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToolTipText" + "'", str12, "ToolTipText");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ToolTipText" + "'", str25, "ToolTipText");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}" + "'", str26, "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ToolTipText" + "'", str27, "ToolTipText");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        int int7 = myBookingsPanel1.getHeight();
        myBookingsPanel1.setDoubleBuffered(false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        java.awt.event.InputMethodListener[] inputMethodListenerArray8 = myBookingsPanel7.getInputMethodListeners();
        java.awt.Component component10 = myBookingsPanel5.add((java.awt.Component) myBookingsPanel7, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        myBookingsPanel7.addMouseWheelListener(mouseWheelListener11);
        boolean boolean13 = myBookingsPanel7.isFocusTraversable();
        boolean boolean14 = myBookingsPanel7.isManagingFocus();
        myBookingsPanel7.setAlignmentY((float) 3);
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel18 = new scheduler.gui.MyBookingsPanel(mainUI17);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel20 = new scheduler.gui.MyBookingsPanel(mainUI19);
        java.awt.event.InputMethodListener[] inputMethodListenerArray21 = myBookingsPanel20.getInputMethodListeners();
        java.awt.Component component23 = myBookingsPanel18.add((java.awt.Component) myBookingsPanel20, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        myBookingsPanel20.addMouseWheelListener(mouseWheelListener24);
        boolean boolean26 = myBookingsPanel20.isFocusTraversable();
        java.awt.Dimension dimension27 = null;
        java.awt.Dimension dimension28 = myBookingsPanel20.getSize(dimension27);
        java.awt.Rectangle rectangle29 = myBookingsPanel20.getBounds();
        myBookingsPanel7.computeVisibleRect(rectangle29);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel32 = new scheduler.gui.MyBookingsPanel(mainUI31);
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel34 = new scheduler.gui.MyBookingsPanel(mainUI33);
        scheduler.gui.MainUI mainUI35 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel36 = new scheduler.gui.MyBookingsPanel(mainUI35);
        java.awt.event.InputMethodListener[] inputMethodListenerArray37 = myBookingsPanel36.getInputMethodListeners();
        java.awt.Component component39 = myBookingsPanel34.add((java.awt.Component) myBookingsPanel36, (int) (short) -1);
        myBookingsPanel34.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy42 = myBookingsPanel34.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle43 = null;
        java.awt.Rectangle rectangle44 = myBookingsPanel34.getBounds(rectangle43);
        myBookingsPanel32.scrollRectToVisible(rectangle44);
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel47 = new scheduler.gui.MyBookingsPanel(mainUI46);
        myBookingsPanel47.removeNotify();
        float float49 = myBookingsPanel47.getAlignmentX();
        javax.swing.JToolTip jToolTip50 = myBookingsPanel47.createToolTip();
        java.awt.Dimension dimension51 = jToolTip50.size();
        myBookingsPanel32.resize(dimension51);
        scheduler.gui.MainUI mainUI53 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel54 = new scheduler.gui.MyBookingsPanel(mainUI53);
        myBookingsPanel54.removeNotify();
        float float56 = myBookingsPanel54.getAlignmentX();
        myBookingsPanel32.remove((java.awt.Component) myBookingsPanel54);
        java.awt.Font font58 = myBookingsPanel32.getFont();
        myBookingsPanel7.setFont(font58);
        java.awt.FontMetrics fontMetrics60 = myBookingsPanel1.getFontMetrics(font58);
        java.awt.Container container61 = myBookingsPanel1.getFocusCycleRootAncestor();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray8);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray8, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray21);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray21, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertNotNull(inputMethodListenerArray37);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray37, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertNotNull(focusTraversalPolicy42);
        org.junit.Assert.assertNotNull(rectangle44);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip50);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.5f + "'", float56 == 0.5f);
        org.junit.Assert.assertNotNull(font58);
        org.junit.Assert.assertNotNull(fontMetrics60);
        org.junit.Assert.assertNull(container61);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        myBookingsPanel1.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        java.awt.Dimension dimension24 = null;
        java.awt.Dimension dimension25 = myBookingsPanel1.getSize(dimension24);
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNotNull(dimension25);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.Graphics graphics22 = null;
        myBookingsPanel1.update(graphics22);
        boolean boolean24 = myBookingsPanel1.isMinimumSizeSet();
        myBookingsPanel1.setInheritsPopupMenu(false);
        boolean boolean28 = myBookingsPanel1.areFocusTraversalKeysSet((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.Dimension dimension9 = myBookingsPanel1.getSize();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        myBookingsPanel11.removeNotify();
        java.awt.ComponentOrientation componentOrientation13 = myBookingsPanel11.getComponentOrientation();
        myBookingsPanel1.applyComponentOrientation(componentOrientation13);
        java.awt.Event event15 = null;
        boolean boolean18 = myBookingsPanel1.mouseUp(event15, 64, 6);
        myBookingsPanel1.repaint(32, (int) (short) -1, 32, (int) (short) 10);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(componentOrientation13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.setAlignmentY((float) 3);
        java.lang.Object obj13 = myBookingsPanel3.getTreeLock();
        boolean boolean14 = myBookingsPanel3.isMaximumSizeSet();
        myBookingsPanel3.doLayout();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel19 = new scheduler.gui.MyBookingsPanel(mainUI18);
        java.awt.event.InputMethodListener[] inputMethodListenerArray20 = myBookingsPanel19.getInputMethodListeners();
        java.awt.Component component22 = myBookingsPanel17.add((java.awt.Component) myBookingsPanel19, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener23 = null;
        myBookingsPanel19.addMouseWheelListener(mouseWheelListener23);
        boolean boolean25 = myBookingsPanel19.isFocusTraversable();
        javax.swing.plaf.PanelUI panelUI26 = myBookingsPanel19.getUI();
        myBookingsPanel3.setUI(panelUI26);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray20);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray20, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(panelUI26);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        java.lang.Class<?> wildcardClass6 = dimension5.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        java.lang.String str10 = room8.getRoomNumber();
        scheduler.room.OccupiedState occupiedState11 = new scheduler.room.OccupiedState();
        scheduler.room.Room room19 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState11.handleReserve(room19);
        room8.setState((scheduler.room.RoomState) occupiedState11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isStrongPassword("PAYMENT");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.User user5 = userFactory0.createUser("Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}", strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User details are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        myBookingsPanel1.disable();
        myBookingsPanel1.repaint();
        java.awt.Component component7 = myBookingsPanel1.getComponentAt((int) '4', 8);
        myBookingsPanel1.setVerifyInputWhenFocusTarget(true);
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        myBookingsPanel1.invalidate();
        java.awt.Dimension dimension8 = myBookingsPanel1.getMinimumSize();
        javax.swing.TransferHandler transferHandler9 = myBookingsPanel1.getTransferHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet11 = myBookingsPanel1.getFocusTraversalKeys(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(transferHandler9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        java.awt.LayoutManager layoutManager23 = myBookingsPanel1.getLayout();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel25 = new scheduler.gui.MyBookingsPanel(mainUI24);
        myBookingsPanel25.removeNotify();
        float float27 = myBookingsPanel25.getAlignmentX();
        javax.swing.JToolTip jToolTip28 = myBookingsPanel25.createToolTip();
        myBookingsPanel25.enable();
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel31 = new scheduler.gui.MyBookingsPanel(mainUI30);
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel33 = new scheduler.gui.MyBookingsPanel(mainUI32);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel35 = new scheduler.gui.MyBookingsPanel(mainUI34);
        java.awt.event.InputMethodListener[] inputMethodListenerArray36 = myBookingsPanel35.getInputMethodListeners();
        java.awt.Component component38 = myBookingsPanel33.add((java.awt.Component) myBookingsPanel35, (int) (short) -1);
        myBookingsPanel33.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy41 = myBookingsPanel33.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle42 = null;
        java.awt.Rectangle rectangle43 = myBookingsPanel33.getBounds(rectangle42);
        myBookingsPanel31.scrollRectToVisible(rectangle43);
        myBookingsPanel25.setBounds(rectangle43);
        java.awt.Graphics graphics46 = null;
        myBookingsPanel25.update(graphics46);
        javax.swing.JToolTip jToolTip48 = myBookingsPanel25.createToolTip();
        java.awt.Point point49 = null;
        java.awt.Point point50 = myBookingsPanel25.getLocation(point49);
        java.awt.Component component51 = myBookingsPanel1.getComponentAt(point50);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip28);
        org.junit.Assert.assertNotNull(inputMethodListenerArray36);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray36, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component38);
        org.junit.Assert.assertNotNull(focusTraversalPolicy41);
        org.junit.Assert.assertNotNull(rectangle43);
        org.junit.Assert.assertNotNull(jToolTip48);
        org.junit.Assert.assertNotNull(point50);
        org.junit.Assert.assertNull(component51);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        java.awt.LayoutManager layoutManager23 = myBookingsPanel1.getLayout();
        javax.swing.ActionMap actionMap24 = myBookingsPanel1.getActionMap();
        int int25 = myBookingsPanel1.getDebugGraphicsOptions();
        java.awt.event.FocusEvent.Cause cause26 = null;
        boolean boolean27 = myBookingsPanel1.requestFocusInWindow(cause26);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNotNull(actionMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        scheduler.user.Partner partner5 = new scheduler.user.Partner("ROOM_BOOKING", "ADMIN_DASHBOARD", "LOGIN", "Room{roomID='PAYMENT', capacity=8, location='ToolTipText', currentState=MaintenanceState}", false);
        boolean boolean6 = partner5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        scheduler.user.Staff staff0 = new scheduler.user.Staff();
        java.lang.String str1 = staff0.getOrgID();
        staff0.setVerified(true);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel3.setRequestFocusEnabled(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = myBookingsPanel3.getPropertyChangeListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray9, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel1 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.event.KeyListener[] keyListenerArray2 = chiefCoordinatorDashboardPanel1.getKeyListeners();
        chiefCoordinatorDashboardPanel1.transferFocus();
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        java.beans.VetoableChangeListener vetoableChangeListener4 = null;
        myBookingsPanel1.removeVetoableChangeListener(vetoableChangeListener4);
        boolean boolean6 = myBookingsPanel1.isFocusTraversalPolicySet();
        myBookingsPanel1.doLayout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.repaint();
        float float4 = myBookingsPanel1.getAlignmentY();
        javax.swing.InputMap inputMap5 = myBookingsPanel1.getInputMap();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(inputMap5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI3 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel4 = new scheduler.gui.MyBookingsPanel(mainUI3);
        myBookingsPanel4.removeNotify();
        float float6 = myBookingsPanel4.getAlignmentX();
        javax.swing.JToolTip jToolTip7 = myBookingsPanel4.createToolTip();
        java.awt.Dimension dimension8 = jToolTip7.size();
        jToolTip7.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension11 = jToolTip7.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension11);
        java.awt.event.ComponentListener componentListener13 = null;
        myBookingsPanel1.removeComponentListener(componentListener13);
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        boolean boolean23 = myBookingsPanel1.getVerifyInputWhenFocusTarget();
        javax.swing.TransferHandler transferHandler24 = null;
        myBookingsPanel1.setTransferHandler(transferHandler24);
        boolean boolean26 = myBookingsPanel1.isVisible();
        java.awt.dnd.DropTarget dropTarget27 = myBookingsPanel1.getDropTarget();
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dropTarget27);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        java.awt.Dimension dimension5 = myBookingsPanel1.preferredSize();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt((int) (short) 10, (int) (short) 100);
        boolean boolean9 = myBookingsPanel1.isValid();
        java.awt.Point point10 = myBookingsPanel1.getLocation();
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(point10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        javax.swing.JToolTip jToolTip9 = myBookingsPanel3.createToolTip();
        int int10 = jToolTip9.getY();
        java.util.Locale locale11 = javax.swing.JComponent.getDefaultLocale();
        jToolTip9.setLocale(locale11);
        boolean boolean13 = jToolTip9.isRequestFocusEnabled();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.Color color3 = null;
        myBookingsPanel1.setForeground(color3);
        int int5 = myBookingsPanel1.getDebugGraphicsOptions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.lang.String str5 = myBookingsPanel1.getUIClassID();
        java.awt.Component component8 = myBookingsPanel1.findComponentAt(0, (int) (byte) 10);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = component8.mouseDown(event9, (int) 'a', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = myBookingsPanel1.getFocusTraversalPolicy();
        myBookingsPanel1.setAlignmentX((float) (byte) 0);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(focusTraversalPolicy9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.Graphics graphics22 = null;
        myBookingsPanel1.update(graphics22);
        javax.swing.JToolTip jToolTip24 = myBookingsPanel1.createToolTip();
        java.awt.Event event25 = null;
        boolean boolean28 = myBookingsPanel1.mouseDown(event25, (int) (byte) 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            myBookingsPanel1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertNotNull(jToolTip24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        java.awt.Font font6 = myBookingsPanel1.getFont();
        int int7 = myBookingsPanel1.getHeight();
        java.awt.event.ContainerListener containerListener8 = null;
        myBookingsPanel1.addContainerListener(containerListener8);
        myBookingsPanel1.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        java.awt.ComponentOrientation componentOrientation4 = myBookingsPanel1.getComponentOrientation();
        boolean boolean5 = myBookingsPanel1.isFocusTraversalPolicySet();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        myBookingsPanel7.removeNotify();
        float float9 = myBookingsPanel7.getAlignmentX();
        javax.swing.JToolTip jToolTip10 = myBookingsPanel7.createToolTip();
        myBookingsPanel7.enable();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel13 = new scheduler.gui.MyBookingsPanel(mainUI12);
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel15 = new scheduler.gui.MyBookingsPanel(mainUI14);
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        java.awt.event.InputMethodListener[] inputMethodListenerArray18 = myBookingsPanel17.getInputMethodListeners();
        java.awt.Component component20 = myBookingsPanel15.add((java.awt.Component) myBookingsPanel17, (int) (short) -1);
        myBookingsPanel15.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy23 = myBookingsPanel15.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle24 = null;
        java.awt.Rectangle rectangle25 = myBookingsPanel15.getBounds(rectangle24);
        myBookingsPanel13.scrollRectToVisible(rectangle25);
        myBookingsPanel7.setBounds(rectangle25);
        java.awt.Graphics graphics28 = null;
        myBookingsPanel7.update(graphics28);
        javax.swing.JToolTip jToolTip30 = myBookingsPanel7.createToolTip();
        java.awt.Point point31 = null;
        java.awt.Point point32 = myBookingsPanel7.getLocation(point31);
        java.awt.Dimension dimension33 = null;
        java.awt.Dimension dimension34 = myBookingsPanel7.getSize(dimension33);
        myBookingsPanel1.setMinimumSize(dimension34);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip10);
        org.junit.Assert.assertNotNull(inputMethodListenerArray18);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray18, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertNotNull(focusTraversalPolicy23);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertNotNull(jToolTip30);
        org.junit.Assert.assertNotNull(point32);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        myBookingsPanel3.removeHierarchyListener(hierarchyListener10);
        myBookingsPanel3.setSize(12, 1);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        myBookingsPanel1.setFocusCycleRoot(true);
        java.awt.Dimension dimension9 = myBookingsPanel1.getSize();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        myBookingsPanel11.removeNotify();
        java.awt.ComponentOrientation componentOrientation13 = myBookingsPanel11.getComponentOrientation();
        myBookingsPanel1.applyComponentOrientation(componentOrientation13);
        java.awt.Event event15 = null;
        boolean boolean18 = myBookingsPanel1.mouseUp(event15, 64, 6);
        myBookingsPanel1.removeAll();
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel21 = new scheduler.gui.MyBookingsPanel(mainUI20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        java.awt.event.InputMethodListener[] inputMethodListenerArray24 = myBookingsPanel23.getInputMethodListeners();
        java.awt.Component component26 = myBookingsPanel21.add((java.awt.Component) myBookingsPanel23, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener27 = null;
        myBookingsPanel23.addMouseWheelListener(mouseWheelListener27);
        boolean boolean29 = myBookingsPanel23.isFocusTraversable();
        boolean boolean30 = myBookingsPanel23.isManagingFocus();
        myBookingsPanel23.setAlignmentY((float) 3);
        java.lang.Object obj33 = myBookingsPanel23.getTreeLock();
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel35 = new scheduler.gui.MyBookingsPanel(mainUI34);
        myBookingsPanel35.removeNotify();
        float float37 = myBookingsPanel35.getAlignmentX();
        javax.swing.JToolTip jToolTip38 = myBookingsPanel35.createToolTip();
        java.awt.Dimension dimension39 = jToolTip38.size();
        jToolTip38.setFocusTraversalPolicyProvider(false);
        java.awt.Dimension dimension42 = jToolTip38.preferredSize();
        myBookingsPanel23.setPreferredSize(dimension42);
        myBookingsPanel1.setSize(dimension42);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNotNull(componentOrientation13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray24);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray24, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip38);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertNotNull(dimension42);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        myBookingsPanel3.setAutoscrolls(true);
        myBookingsPanel3.transferFocus();
        javax.swing.KeyStroke keyStroke13 = null;
        int int14 = myBookingsPanel3.getConditionForKeyStroke(keyStroke13);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str0 = scheduler.gui.MainUI.MY_BOOKINGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MY_BOOKINGS" + "'", str0, "MY_BOOKINGS");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        java.awt.Dimension dimension5 = jToolTip4.size();
        jToolTip4.setFocusTraversalPolicyProvider(false);
        boolean boolean8 = jToolTip4.isEnabled();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel10 = new scheduler.gui.MyBookingsPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        myBookingsPanel10.removeContainerListener(containerListener11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel18 = new scheduler.gui.MyBookingsPanel(mainUI17);
        java.awt.event.InputMethodListener[] inputMethodListenerArray19 = myBookingsPanel18.getInputMethodListeners();
        java.awt.Component component21 = myBookingsPanel16.add((java.awt.Component) myBookingsPanel18, (int) (short) -1);
        myBookingsPanel16.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy24 = myBookingsPanel16.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle25 = null;
        java.awt.Rectangle rectangle26 = myBookingsPanel16.getBounds(rectangle25);
        myBookingsPanel14.scrollRectToVisible(rectangle26);
        java.awt.Rectangle rectangle28 = myBookingsPanel10.getBounds(rectangle26);
        boolean boolean30 = myBookingsPanel10.requestFocus(false);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel32 = new scheduler.gui.MyBookingsPanel(mainUI31);
        myBookingsPanel32.removeNotify();
        java.awt.ComponentOrientation componentOrientation34 = myBookingsPanel32.getComponentOrientation();
        myBookingsPanel32.addNotify();
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel37 = new scheduler.gui.MyBookingsPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        myBookingsPanel37.removeContainerListener(containerListener38);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel41 = new scheduler.gui.MyBookingsPanel(mainUI40);
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel43 = new scheduler.gui.MyBookingsPanel(mainUI42);
        scheduler.gui.MainUI mainUI44 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel45 = new scheduler.gui.MyBookingsPanel(mainUI44);
        java.awt.event.InputMethodListener[] inputMethodListenerArray46 = myBookingsPanel45.getInputMethodListeners();
        java.awt.Component component48 = myBookingsPanel43.add((java.awt.Component) myBookingsPanel45, (int) (short) -1);
        myBookingsPanel43.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy51 = myBookingsPanel43.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle52 = null;
        java.awt.Rectangle rectangle53 = myBookingsPanel43.getBounds(rectangle52);
        myBookingsPanel41.scrollRectToVisible(rectangle53);
        java.awt.Rectangle rectangle55 = myBookingsPanel37.getBounds(rectangle53);
        myBookingsPanel32.paintImmediately(rectangle53);
        myBookingsPanel10.setMixingCutoutShape((java.awt.Shape) rectangle53);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel59 = new scheduler.gui.MyBookingsPanel(mainUI58);
        scheduler.gui.MainUI mainUI60 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel61 = new scheduler.gui.MyBookingsPanel(mainUI60);
        java.awt.event.InputMethodListener[] inputMethodListenerArray62 = myBookingsPanel61.getInputMethodListeners();
        java.awt.Component component64 = myBookingsPanel59.add((java.awt.Component) myBookingsPanel61, (int) (short) -1);
        java.awt.event.MouseMotionListener mouseMotionListener65 = null;
        component64.removeMouseMotionListener(mouseMotionListener65);
        component64.repaint(100L);
        java.awt.event.InputMethodListener inputMethodListener69 = null;
        component64.removeInputMethodListener(inputMethodListener69);
        scheduler.gui.MainUI mainUI71 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel72 = new scheduler.gui.MyBookingsPanel(mainUI71);
        myBookingsPanel72.removeNotify();
        java.awt.ComponentOrientation componentOrientation74 = myBookingsPanel72.getComponentOrientation();
        myBookingsPanel72.addNotify();
        java.awt.Dimension dimension76 = myBookingsPanel72.preferredSize();
        component64.resize(dimension76);
        myBookingsPanel10.setMaximumSize(dimension76);
        jToolTip4.setMinimumSize(dimension76);
        scheduler.gui.MainUI mainUI80 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel81 = new scheduler.gui.MyBookingsPanel(mainUI80);
        myBookingsPanel81.removeNotify();
        java.awt.ComponentOrientation componentOrientation83 = myBookingsPanel81.getComponentOrientation();
        java.awt.Image image84 = null;
        scheduler.gui.MainUI mainUI85 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel86 = new scheduler.gui.MyBookingsPanel(mainUI85);
        int int87 = myBookingsPanel81.checkImage(image84, (java.awt.image.ImageObserver) myBookingsPanel86);
        jToolTip4.setNextFocusableComponent((java.awt.Component) myBookingsPanel81);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray19);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray19, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertNotNull(focusTraversalPolicy24);
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(rectangle28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(componentOrientation34);
        org.junit.Assert.assertNotNull(inputMethodListenerArray46);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray46, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component48);
        org.junit.Assert.assertNotNull(focusTraversalPolicy51);
        org.junit.Assert.assertNotNull(rectangle53);
        org.junit.Assert.assertNotNull(rectangle55);
        org.junit.Assert.assertNotNull(inputMethodListenerArray62);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray62, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component64);
        org.junit.Assert.assertNotNull(componentOrientation74);
        org.junit.Assert.assertNotNull(dimension76);
        org.junit.Assert.assertNotNull(componentOrientation83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 32 + "'", int87 == 32);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        myBookingsPanel1.addNotify();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel8 = new scheduler.gui.MyBookingsPanel(mainUI7);
        java.awt.event.InputMethodListener[] inputMethodListenerArray9 = myBookingsPanel8.getInputMethodListeners();
        java.awt.Component component11 = myBookingsPanel6.add((java.awt.Component) myBookingsPanel8, (int) (short) -1);
        myBookingsPanel6.setFocusCycleRoot(true);
        java.awt.Dimension dimension14 = myBookingsPanel6.getSize();
        int int15 = myBookingsPanel6.getY();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel19 = new scheduler.gui.MyBookingsPanel(mainUI18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel21 = new scheduler.gui.MyBookingsPanel(mainUI20);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel21.getInputMethodListeners();
        java.awt.Component component24 = myBookingsPanel19.add((java.awt.Component) myBookingsPanel21, (int) (short) -1);
        myBookingsPanel19.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy27 = myBookingsPanel19.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle28 = null;
        java.awt.Rectangle rectangle29 = myBookingsPanel19.getBounds(rectangle28);
        myBookingsPanel17.scrollRectToVisible(rectangle29);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel32 = new scheduler.gui.MyBookingsPanel(mainUI31);
        myBookingsPanel32.removeNotify();
        float float34 = myBookingsPanel32.getAlignmentX();
        javax.swing.JToolTip jToolTip35 = myBookingsPanel32.createToolTip();
        java.awt.Dimension dimension36 = jToolTip35.size();
        myBookingsPanel17.resize(dimension36);
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel39 = new scheduler.gui.MyBookingsPanel(mainUI38);
        myBookingsPanel39.removeNotify();
        float float41 = myBookingsPanel39.getAlignmentX();
        myBookingsPanel17.remove((java.awt.Component) myBookingsPanel39);
        myBookingsPanel17.reshape((int) ' ', (int) (byte) 0, 3, 4);
        java.awt.Point point48 = myBookingsPanel17.getLocation();
        boolean boolean49 = myBookingsPanel6.contains(point48);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel51 = new scheduler.gui.MyBookingsPanel(mainUI50);
        myBookingsPanel51.removeNotify();
        java.awt.ComponentOrientation componentOrientation53 = myBookingsPanel51.getComponentOrientation();
        java.awt.Image image54 = null;
        scheduler.gui.MainUI mainUI55 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel56 = new scheduler.gui.MyBookingsPanel(mainUI55);
        int int57 = myBookingsPanel51.checkImage(image54, (java.awt.image.ImageObserver) myBookingsPanel56);
        java.awt.ComponentOrientation componentOrientation58 = myBookingsPanel56.getComponentOrientation();
        myBookingsPanel6.setComponentOrientation(componentOrientation58);
        myBookingsPanel1.setComponentOrientation(componentOrientation58);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(inputMethodListenerArray9);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray9, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertNotNull(focusTraversalPolicy27);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.5f + "'", float41 == 0.5f);
        org.junit.Assert.assertNotNull(point48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(componentOrientation53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
        org.junit.Assert.assertNotNull(componentOrientation58);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        java.awt.ComponentOrientation componentOrientation4 = myBookingsPanel1.getComponentOrientation();
        boolean boolean5 = myBookingsPanel1.isFocusTraversalPolicySet();
        myBookingsPanel1.setInheritsPopupMenu(false);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        myBookingsPanel1.enable();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel11 = new scheduler.gui.MyBookingsPanel(mainUI10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = myBookingsPanel11.getInputMethodListeners();
        java.awt.Component component14 = myBookingsPanel9.add((java.awt.Component) myBookingsPanel11, (int) (short) -1);
        myBookingsPanel9.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = myBookingsPanel9.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle18 = null;
        java.awt.Rectangle rectangle19 = myBookingsPanel9.getBounds(rectangle18);
        myBookingsPanel7.scrollRectToVisible(rectangle19);
        myBookingsPanel1.setBounds(rectangle19);
        java.awt.Graphics graphics22 = null;
        myBookingsPanel1.update(graphics22);
        boolean boolean24 = myBookingsPanel1.isMinimumSizeSet();
        javax.swing.InputVerifier inputVerifier25 = myBookingsPanel1.getInputVerifier();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNotNull(focusTraversalPolicy17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(inputVerifier25);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isStrongPassword("LOGIN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        java.beans.VetoableChangeListener vetoableChangeListener4 = null;
        myBookingsPanel1.removeVetoableChangeListener(vetoableChangeListener4);
        boolean boolean6 = myBookingsPanel1.isFocusTraversalPolicySet();
        java.awt.Event event7 = null;
        boolean boolean10 = myBookingsPanel1.mouseDrag(event7, 8, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.FocusListener focusListener7 = null;
        myBookingsPanel1.addFocusListener(focusListener7);
        java.awt.Event event9 = null;
        boolean boolean11 = myBookingsPanel1.gotFocus(event9, (java.lang.Object) "ToolTipText");
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.ComponentOrientation componentOrientation3 = myBookingsPanel1.getComponentOrientation();
        java.awt.Image image4 = null;
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        int int7 = myBookingsPanel1.checkImage(image4, (java.awt.image.ImageObserver) myBookingsPanel6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event15 = null;
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel17 = new scheduler.gui.MyBookingsPanel(mainUI16);
        java.awt.event.InputMethodListener[] inputMethodListenerArray18 = myBookingsPanel17.getInputMethodListeners();
        myBookingsPanel17.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean23 = myBookingsPanel9.lostFocus(event15, (java.lang.Object) "hi!");
        myBookingsPanel9.firePropertyChange("hi!", 64, 100);
        java.awt.event.MouseListener mouseListener28 = null;
        myBookingsPanel9.removeMouseListener(mouseListener28);
        java.awt.Component component30 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel9);
        myBookingsPanel1.setInheritsPopupMenu(true);
        org.junit.Assert.assertNotNull(componentOrientation3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray18);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray18, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(component30);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.event.FocusEvent.Cause cause3 = null;
        boolean boolean4 = myBookingsPanel1.requestFocusInWindow(cause3);
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel6 = new scheduler.gui.MyBookingsPanel(mainUI5);
        java.awt.event.InputMethodListener[] inputMethodListenerArray7 = myBookingsPanel6.getInputMethodListeners();
        myBookingsPanel6.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event12 = null;
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI13);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = myBookingsPanel14.getInputMethodListeners();
        myBookingsPanel14.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean20 = myBookingsPanel6.lostFocus(event12, (java.lang.Object) "hi!");
        java.awt.Graphics graphics21 = null;
        myBookingsPanel6.paintAll(graphics21);
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        java.awt.event.InputMethodListener[] inputMethodListenerArray25 = myBookingsPanel24.getInputMethodListeners();
        myBookingsPanel24.repaint();
        java.awt.Dimension dimension27 = myBookingsPanel24.size();
        myBookingsPanel6.setMinimumSize(dimension27);
        myBookingsPanel1.setMaximumSize(dimension27);
        javax.swing.JRootPane jRootPane30 = myBookingsPanel1.getRootPane();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray7);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray7, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray15, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray25);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray25, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(jRootPane30);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        java.awt.Color color3 = null;
        myBookingsPanel1.setForeground(color3);
        boolean boolean5 = myBookingsPanel1.getIgnoreRepaint();
        myBookingsPanel1.repaint((long) 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        jToolTip4.setEnabled(false);
        boolean boolean7 = jToolTip4.isFocusOwner();
        java.awt.Graphics graphics8 = null;
        jToolTip4.print(graphics8);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        myBookingsPanel1.firePropertyChange("hi!", (-1), (int) (short) 0);
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        myBookingsPanel9.firePropertyChange("hi!", (-1), (int) (short) 0);
        boolean boolean15 = myBookingsPanel1.lostFocus(event7, (java.lang.Object) "hi!");
        boolean boolean16 = myBookingsPanel1.isBackgroundSet();
        javax.swing.event.AncestorListener[] ancestorListenerArray17 = myBookingsPanel1.getAncestorListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ancestorListenerArray17);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray17, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        boolean boolean23 = myBookingsPanel1.getVerifyInputWhenFocusTarget();
        javax.swing.TransferHandler transferHandler24 = null;
        myBookingsPanel1.setTransferHandler(transferHandler24);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray26 = myBookingsPanel1.getHierarchyBoundsListeners();
        java.awt.Graphics graphics27 = null;
        myBookingsPanel1.paintAll(graphics27);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray26);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray26, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        boolean boolean10 = myBookingsPanel3.isManagingFocus();
        myBookingsPanel3.resetKeyboardActions();
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        scheduler.payment.CreditCardPayment creditCardPayment0 = new scheduler.payment.CreditCardPayment();
        boolean boolean2 = creditCardPayment0.processTransaction((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room8 = new scheduler.room.Room("PAYMENT", 8, "ToolTipText", "", false, true, "hi!");
        occupiedState0.handleReserve(room8);
        room8.reserve();
        boolean boolean11 = room8.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        boolean boolean23 = myBookingsPanel1.getVerifyInputWhenFocusTarget();
        javax.swing.TransferHandler transferHandler24 = null;
        myBookingsPanel1.setTransferHandler(transferHandler24);
        boolean boolean26 = myBookingsPanel1.isVisible();
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel28 = new scheduler.gui.MyBookingsPanel(mainUI27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel30 = new scheduler.gui.MyBookingsPanel(mainUI29);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel32 = new scheduler.gui.MyBookingsPanel(mainUI31);
        java.awt.event.InputMethodListener[] inputMethodListenerArray33 = myBookingsPanel32.getInputMethodListeners();
        java.awt.Component component35 = myBookingsPanel30.add((java.awt.Component) myBookingsPanel32, (int) (short) -1);
        myBookingsPanel30.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = myBookingsPanel30.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle39 = null;
        java.awt.Rectangle rectangle40 = myBookingsPanel30.getBounds(rectangle39);
        myBookingsPanel28.scrollRectToVisible(rectangle40);
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel43 = new scheduler.gui.MyBookingsPanel(mainUI42);
        myBookingsPanel43.removeNotify();
        float float45 = myBookingsPanel43.getAlignmentX();
        javax.swing.JToolTip jToolTip46 = myBookingsPanel43.createToolTip();
        java.awt.Dimension dimension47 = jToolTip46.size();
        myBookingsPanel28.resize(dimension47);
        scheduler.gui.MainUI mainUI49 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel50 = new scheduler.gui.MyBookingsPanel(mainUI49);
        myBookingsPanel50.removeNotify();
        float float52 = myBookingsPanel50.getAlignmentX();
        myBookingsPanel28.remove((java.awt.Component) myBookingsPanel50);
        myBookingsPanel28.reshape((int) ' ', (int) (byte) 0, 3, 4);
        java.awt.Point point59 = myBookingsPanel28.getLocation();
        java.awt.Component component60 = myBookingsPanel1.findComponentAt(point59);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray33);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray33, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertNotNull(focusTraversalPolicy38);
        org.junit.Assert.assertNotNull(rectangle40);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip46);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.5f + "'", float52 == 0.5f);
        org.junit.Assert.assertNotNull(point59);
        org.junit.Assert.assertNull(component60);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        myBookingsPanel1.removeContainerListener(containerListener2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel7 = new scheduler.gui.MyBookingsPanel(mainUI6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel9 = new scheduler.gui.MyBookingsPanel(mainUI8);
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = myBookingsPanel9.getInputMethodListeners();
        java.awt.Component component12 = myBookingsPanel7.add((java.awt.Component) myBookingsPanel9, (int) (short) -1);
        myBookingsPanel7.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = myBookingsPanel7.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle16 = null;
        java.awt.Rectangle rectangle17 = myBookingsPanel7.getBounds(rectangle16);
        myBookingsPanel5.scrollRectToVisible(rectangle17);
        java.awt.Rectangle rectangle19 = myBookingsPanel1.getBounds(rectangle17);
        boolean boolean21 = myBookingsPanel1.requestFocus(false);
        java.awt.event.InputMethodListener[] inputMethodListenerArray22 = myBookingsPanel1.getInputMethodListeners();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel24 = new scheduler.gui.MyBookingsPanel(mainUI23);
        myBookingsPanel24.removeNotify();
        java.awt.ComponentOrientation componentOrientation26 = myBookingsPanel24.getComponentOrientation();
        myBookingsPanel24.addNotify();
        java.awt.Dimension dimension28 = myBookingsPanel24.preferredSize();
        myBookingsPanel1.setPreferredSize(dimension28);
        java.awt.Color color30 = myBookingsPanel1.getBackground();
        boolean boolean31 = myBookingsPanel1.isOpaque();
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray10, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy15);
        org.junit.Assert.assertNotNull(rectangle17);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray22);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray22, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        java.awt.Font font27 = myBookingsPanel1.getFont();
        java.awt.image.ColorModel colorModel28 = myBookingsPanel1.getColorModel();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray29 = myBookingsPanel1.getMouseMotionListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(colorModel28);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray29);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray29, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        scheduler.user.Student student5 = new scheduler.user.Student("ToolTipText", "", "MY_BOOKINGS", "MY_BOOKINGS", true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        javax.swing.JToolTip jToolTip9 = myBookingsPanel3.createToolTip();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        jToolTip9.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        java.awt.Graphics graphics12 = null;
        jToolTip9.printAll(graphics12);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNotNull(jToolTip9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        myBookingsPanel1.reshape((int) ' ', (int) (byte) 0, 3, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = myBookingsPanel1.getBaseline((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width and height must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        scheduler.booking.BookingManager bookingManager0 = new scheduler.booking.BookingManager();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = bookingManager0.modifyBooking("ADMIN_DASHBOARD", localDateTime2, localDateTime3);
        java.util.List<scheduler.booking.Booking> bookingList5 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = myBookingsPanel3.getInputMethodListeners();
        java.awt.Component component6 = myBookingsPanel1.add((java.awt.Component) myBookingsPanel3, (int) (short) -1);
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        myBookingsPanel3.addMouseWheelListener(mouseWheelListener7);
        boolean boolean9 = myBookingsPanel3.isFocusTraversable();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        myBookingsPanel3.removeHierarchyListener(hierarchyListener10);
        java.awt.Graphics graphics12 = null;
        myBookingsPanel3.printAll(graphics12);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray4, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        java.awt.event.InputMethodListener[] inputMethodListenerArray2 = myBookingsPanel1.getInputMethodListeners();
        int int3 = myBookingsPanel1.countComponents();
        java.awt.Graphics graphics4 = null;
        myBookingsPanel1.print(graphics4);
        java.awt.LayoutManager layoutManager6 = myBookingsPanel1.getLayout();
        java.awt.Graphics graphics7 = myBookingsPanel1.getGraphics();
        org.junit.Assert.assertNotNull(inputMethodListenerArray2);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray2, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertNull(graphics7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        java.awt.Point point5 = myBookingsPanel1.getMousePosition(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(point5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        myBookingsPanel1.removeNotify();
        float float3 = myBookingsPanel1.getAlignmentX();
        javax.swing.JToolTip jToolTip4 = myBookingsPanel1.createToolTip();
        jToolTip4.setEnabled(false);
        boolean boolean7 = jToolTip4.isFocusOwner();
        int int8 = jToolTip4.getDebugGraphicsOptions();
        java.awt.event.MouseListener mouseListener9 = null;
        jToolTip4.removeMouseListener(mouseListener9);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel1 = new scheduler.gui.MyBookingsPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel3 = new scheduler.gui.MyBookingsPanel(mainUI2);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel5 = new scheduler.gui.MyBookingsPanel(mainUI4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = myBookingsPanel5.getInputMethodListeners();
        java.awt.Component component8 = myBookingsPanel3.add((java.awt.Component) myBookingsPanel5, (int) (short) -1);
        myBookingsPanel3.setFocusCycleRoot(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = myBookingsPanel3.getFocusTraversalPolicy();
        java.awt.Rectangle rectangle12 = null;
        java.awt.Rectangle rectangle13 = myBookingsPanel3.getBounds(rectangle12);
        myBookingsPanel1.scrollRectToVisible(rectangle13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel16 = new scheduler.gui.MyBookingsPanel(mainUI15);
        myBookingsPanel16.removeNotify();
        float float18 = myBookingsPanel16.getAlignmentX();
        javax.swing.JToolTip jToolTip19 = myBookingsPanel16.createToolTip();
        java.awt.Dimension dimension20 = jToolTip19.size();
        myBookingsPanel1.resize(dimension20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.MyBookingsPanel myBookingsPanel23 = new scheduler.gui.MyBookingsPanel(mainUI22);
        myBookingsPanel23.removeNotify();
        float float25 = myBookingsPanel23.getAlignmentX();
        myBookingsPanel1.remove((java.awt.Component) myBookingsPanel23);
        java.awt.Font font27 = myBookingsPanel1.getFont();
        myBookingsPanel1.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jToolTip19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(font27);
    }
}

