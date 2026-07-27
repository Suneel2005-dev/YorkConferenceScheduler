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
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            scheduler.room.Room room3 = new scheduler.room.Room("hi!", (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = scheduler.database.CsvDatabase.clean("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = scheduler.gui.MainUI.REGISTRATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "REGISTRATION" + "'", str0, "REGISTRATION");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.nio.file.Path path0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            scheduler.database.CsvDatabase.replaceRows(path0, "", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.file.Path.getFileSystem()\" because \"path\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        scheduler.user.Administrator administrator2 = scheduler.user.Administrator.authenticate("REGISTRATION", "");
        org.junit.Assert.assertNull(administrator2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Rectangle rectangle7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.paintImmediately(rectangle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
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
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        scheduler.user.Administrator administrator2 = null; // flaky "1) test010(RegressionTest0)": scheduler.user.Administrator.authenticate("REGISTRATION", "hi!");
        org.junit.Assert.assertNull(administrator2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        scheduler.user.Student student5 = new scheduler.user.Student("REGISTRATION", "hi!", "", "", false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.util.ResourceBundle resourceBundle6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle(resourceBundle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.setBookingID("REGISTRATION");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        java.awt.Event event3 = null;
        boolean boolean6 = paymentPanel1.mouseDrag(event3, 8, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            scheduler.room.Room room7 = new scheduler.room.Room("hi!", (int) '#', "", "REGISTRATION", false, true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension7 = jPopupMenu6.getMaximumSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.Rectangle rectangle29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel19.paintImmediately(rectangle29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String[]> strArrayList1 = scheduler.database.CsvDatabase.read(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.file.Path.getFileSystem()\" because \"path\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.awt.event.InputMethodListener[] inputMethodListenerArray26 = sensorPanel19.getInputMethodListeners();
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap28 = sensorPanel19.getInputMap(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray26);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray26, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.Dimension dimension14 = sensorPanel9.minimumSize();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel16.getToolTipText(mouseEvent19);
        sensorPanel16.transferFocus();
        java.awt.image.ImageProducer imageProducer22 = null;
        java.awt.Image image23 = sensorPanel16.createImage(imageProducer22);
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.Insets insets32 = sensorPanel27.getInsets();
        int int33 = sensorPanel9.checkImage(image23, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel27);
        scheduler.gui.MainUI mainUI34 = new scheduler.gui.MainUI();
        mainUI34.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener37 = null;
        mainUI34.addWindowFocusListener(windowFocusListener37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = sensorPanel1.prepareImage(image23, (java.awt.image.ImageObserver) mainUI34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(insets32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        boolean boolean5 = mainUI0.isLocationByPlatform();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printWriter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = sensorPanel1.createImage(imageProducer7);
        java.awt.image.VolatileImage volatileImage11 = sensorPanel1.createVolatileImage((-1), (int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNull(volatileImage11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Component[] componentArray14 = sensorPanel1.getComponents();
        java.awt.event.MouseListener mouseListener15 = null;
        sensorPanel1.addMouseListener(mouseListener15);
        java.awt.Rectangle rectangle17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setBounds(rectangle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(componentArray14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        boolean boolean11 = paymentPanel1.isManagingFocus();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.setPendingBooking("", localDateTime13, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str0 = scheduler.gui.MainUI.LOGIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LOGIN" + "'", str0, "LOGIN");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        paymentPanel1.addContainerListener(containerListener2);
        java.awt.Event event4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = paymentPanel1.handleEvent(event4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Font font5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics6 = paymentPanel1.getFontMetrics(font5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Font.hashCode()\" because \"font\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        boolean boolean4 = booking0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        scheduler.user.Staff staff1 = new scheduler.user.Staff();
        scheduler.room.Room room2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        scheduler.pricing.PricingStrategy pricingStrategy5 = null;
        scheduler.payment.PaymentStrategy paymentStrategy6 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking11 = new scheduler.booking.Booking("REGISTRATION", (scheduler.user.User) staff1, room2, localDateTime3, localDateTime4, pricingStrategy5, paymentStrategy6, false, true, false, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        mainUI0.show();
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        java.awt.Point point8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.setLocation(point8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = sensorPanel1.getPropertyChangeListeners();
        float float9 = sensorPanel1.getAlignmentY();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray8, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        sensorPanel1.setFocusTraversalPolicyProvider(false);
        boolean boolean10 = sensorPanel1.isForegroundSet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        javax.swing.JToolTip jToolTip11 = sensorPanel1.createToolTip();
        java.awt.Dimension dimension12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.resize(dimension12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"width\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(jToolTip11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Window.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.MainUI mainUI3 = null;
        scheduler.gui.SensorPanel sensorPanel4 = new scheduler.gui.SensorPanel(mainUI3);
        java.awt.event.ContainerListener containerListener5 = null;
        sensorPanel4.removeContainerListener(containerListener5);
        java.lang.String str7 = sensorPanel4.toString();
        java.awt.MenuComponent menuComponent8 = null;
        sensorPanel4.remove(menuComponent8);
        java.awt.Component[] componentArray10 = sensorPanel4.getComponents();
        java.awt.LayoutManager layoutManager11 = sensorPanel4.getLayout();
        mainUI0.setLayout(layoutManager11);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: wrong parent for CardLayout");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(componentArray10);
        org.junit.Assert.assertNotNull(layoutManager11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.setPendingBooking("REGISTRATION", localDateTime12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI3 = null;
        scheduler.gui.SensorPanel sensorPanel4 = new scheduler.gui.SensorPanel(mainUI3);
        java.awt.event.ContainerListener containerListener5 = null;
        sensorPanel4.removeContainerListener(containerListener5);
        java.awt.event.MouseEvent mouseEvent7 = null;
        java.lang.String str8 = sensorPanel4.getToolTipText(mouseEvent7);
        java.awt.Dimension dimension9 = sensorPanel4.minimumSize();
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = sensorPanel4.createVolatileImage(8, (-1), imageCapabilities12);
        javax.swing.InputMap inputMap14 = sensorPanel4.getInputMap();
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.setInputMap(12, inputMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage13);
        org.junit.Assert.assertNotNull(inputMap14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.awt.Component component9 = mainUI8.getGlassPane();
        javax.swing.JMenuBar jMenuBar10 = mainUI8.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI8);
        mainUI0.setLocationRelativeTo((java.awt.Component) mainUI8);
        java.awt.Container container13 = mainUI0.getParent();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNull(jMenuBar10);
        org.junit.Assert.assertNull(container13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation4 = paymentPanel1.getComponentOrientation();
        java.awt.event.MouseListener[] mouseListenerArray5 = paymentPanel1.getMouseListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertNotNull(mouseListenerArray5);
        org.junit.Assert.assertArrayEquals(mouseListenerArray5, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        boolean boolean8 = paymentPanel1.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        java.awt.ImageCapabilities imageCapabilities18 = null;
        java.awt.image.VolatileImage volatileImage19 = sensorPanel10.createVolatileImage(8, (-1), imageCapabilities18);
        java.awt.Image image22 = sensorPanel10.createImage(3, 1);
        java.awt.Rectangle rectangle23 = null;
        java.awt.Rectangle rectangle24 = sensorPanel10.getBounds(rectangle23);
        sensorPanel1.paintImmediately(rectangle24);
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.list(printWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(volatileImage19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(rectangle24);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        boolean boolean8 = paymentPanel1.isBackgroundSet();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.setPendingBooking("REGISTRATION", localDateTime10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = scheduler.gui.MainUI.ADMIN_DASHBOARD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ADMIN_DASHBOARD" + "'", str0, "ADMIN_DASHBOARD");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.reshape(10, (int) (short) 100, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        boolean boolean11 = paymentPanel1.isManagingFocus();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.PaymentPanel paymentPanel13 = new scheduler.gui.PaymentPanel(mainUI12);
        boolean boolean14 = paymentPanel13.isEnabled();
        boolean boolean15 = paymentPanel13.isFocusTraversalPolicyProvider();
        boolean boolean16 = paymentPanel13.isFocusCycleRoot();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setTitle("REGISTRATION");
        int int20 = mainUI17.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        mainUI17.addPropertyChangeListener("REGISTRATION", propertyChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.add((java.awt.Component) paymentPanel13, (java.lang.Object) mainUI17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        java.awt.Image image17 = paymentPanel1.createImage((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        java.awt.Event event12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.deliverEvent(event12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        scheduler.gui.MainUI mainUI12 = new scheduler.gui.MainUI();
        java.awt.Component component13 = mainUI12.getGlassPane();
        javax.swing.JMenuBar jMenuBar14 = mainUI12.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.Component component16 = null;
        boolean boolean17 = mainUI12.isAncestorOf(component16);
        mainUI12.show(true);
        java.awt.Event event20 = null;
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        sensorPanel22.removeInputMethodListener(inputMethodListener27);
        sensorPanel22.enable();
        boolean boolean30 = mainUI12.lostFocus(event20, (java.lang.Object) sensorPanel22);
        java.awt.Cursor cursor31 = null;
        mainUI12.setCursor(cursor31);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setGlassPane((java.awt.Component) mainUI12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jMenuBar14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        boolean boolean10 = sensorPanel1.isFocusOwner();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.invalidate();
        int int7 = sensorPanel1.getComponentCount();
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseDown(event8, 10, (int) (short) 0);
        boolean boolean12 = sensorPanel1.isValidateRoot();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.removeAll();
        paymentPanel1.addNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = paymentPanel1.getComponent((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        java.awt.Shape shape5 = mainUI0.getShape();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            booking0.modifyTimes(localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Start and end times are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.addNotify();
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.Event event14 = null;
        boolean boolean17 = mainUI0.mouseDown(event14, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Dimension dimension16 = sensorPanel11.minimumSize();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        sensorPanel18.transferFocus();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = sensorPanel18.createImage(imageProducer24);
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        java.awt.Insets insets34 = sensorPanel29.getInsets();
        int int35 = sensorPanel11.checkImage(image25, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel29);
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        java.awt.Insets insets42 = sensorPanel37.getInsets();
        boolean boolean43 = sensorPanel37.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener44 = null;
        sensorPanel37.addContainerListener(containerListener44);
        sensorPanel37.setVisible(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = sensorPanel1.prepareImage(image25, (java.awt.image.ImageObserver) sensorPanel37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(insets42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        java.awt.Dimension dimension19 = mainUI0.getSize();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        mainUI0.removePropertyChangeListener("ADMIN_DASHBOARD", propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str0 = scheduler.gui.MainUI.SENSOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SENSOR" + "'", str0, "SENSOR");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        paymentPanel1.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = paymentPanel1.isDisplayable();
        java.awt.Event event8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.deliverEvent(event8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        javax.swing.KeyStroke keyStroke11 = null;
        sensorPanel1.unregisterKeyboardAction(keyStroke11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Color color6 = sensorPanel1.getForeground();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
        mainUI0.setLocationByPlatform(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.enable();
        sensorPanel1.transferFocusUpCycle();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        java.awt.Component component3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.remove(component3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        paymentPanel1.removeMouseWheelListener(mouseWheelListener5);
        paymentPanel1.resetKeyboardActions();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Dimension dimension18 = sensorPanel13.minimumSize();
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        sensorPanel20.transferFocus();
        java.awt.image.ImageProducer imageProducer26 = null;
        java.awt.Image image27 = sensorPanel20.createImage(imageProducer26);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        java.awt.Insets insets36 = sensorPanel31.getInsets();
        int int37 = sensorPanel13.checkImage(image27, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel31);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        sensorPanel31.addPropertyChangeListener("hi!", propertyChangeListener39);
        java.awt.Color color41 = sensorPanel31.getForeground();
        paymentPanel9.setForeground(color41);
        paymentPanel1.setForeground(color41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(image27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(insets36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Graphics graphics6 = null;
        sensorPanel1.paintAll(graphics6);
        java.awt.event.MouseListener mouseListener8 = null;
        sensorPanel1.addMouseListener(mouseListener8);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        sensorPanel1.removePropertyChangeListener("ADMIN_DASHBOARD", propertyChangeListener11);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = sensorPanel1.getPropertyChangeListeners();
        java.awt.Dimension dimension9 = sensorPanel1.getMinimumSize();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray8, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        scheduler.sensor.HardwareSensor hardwareSensor0 = new scheduler.sensor.HardwareSensor();
        hardwareSensor0.notifyObservers("LOGIN");
        java.lang.Class<?> wildcardClass3 = hardwareSensor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        java.awt.Insets insets17 = sensorPanel1.getInsets();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertNotNull(insets17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray30 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet31 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet31, aWTKeyStrokeArray30);
        sensorPanel19.setFocusTraversalKeys(0, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet31);
        sensorPanel19.enableInputMethods(true);
        javax.swing.border.Border border36 = null;
        sensorPanel19.setBorder(border36);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray30);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray30, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = sensorPanel1.getBaselineResizeBehavior();
        java.awt.Container container8 = sensorPanel1.getFocusCycleRootAncestor();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.awt.Event event8 = null;
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        sensorPanel10.removeInputMethodListener(inputMethodListener15);
        sensorPanel10.enable();
        boolean boolean18 = mainUI0.lostFocus(event8, (java.lang.Object) sensorPanel10);
        java.awt.event.MouseWheelListener mouseWheelListener19 = null;
        mainUI0.addMouseWheelListener(mouseWheelListener19);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        mainUI0.transferFocusUpCycle();
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        javax.swing.TransferHandler transferHandler6 = null;
        mainUI0.setTransferHandler(transferHandler6);
        java.awt.Event event8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = mainUI0.handleEvent(event8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = scheduler.database.CsvDatabase.clean("SENSOR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SENSOR" + "'", str1, "SENSOR");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Shape shape4 = mainUI0.getShape();
        mainUI0.setFocusCycleRoot(false);
        boolean boolean7 = mainUI0.isValidateRoot();
        java.awt.Color color8 = mainUI0.getBackground();
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        scheduler.sensor.HardwareSensor hardwareSensor0 = new scheduler.sensor.HardwareSensor();
        hardwareSensor0.notifyObservers("LOGIN");
        hardwareSensor0.badgeScan("SENSOR");
        scheduler.sensor.SensorObserver sensorObserver5 = null;
        hardwareSensor0.detach(sensorObserver5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.FocusListener[] focusListenerArray12 = paymentPanel1.getFocusListeners();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        paymentPanel1.removePropertyChangeListener(propertyChangeListener13);
        java.awt.event.MouseMotionListener mouseMotionListener15 = null;
        paymentPanel1.removeMouseMotionListener(mouseMotionListener15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(focusListenerArray12);
        org.junit.Assert.assertArrayEquals(focusListenerArray12, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        sensorPanel14.transferFocus();
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = sensorPanel14.createImage(imageProducer20);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        java.awt.Event event32 = null;
        boolean boolean35 = sensorPanel25.mouseEnter(event32, 3, (int) (short) 100);
        java.awt.Color color36 = sensorPanel25.getBackground();
        int int37 = sensorPanel1.checkImage(image21, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel25);
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.PaymentPanel paymentPanel39 = new scheduler.gui.PaymentPanel(mainUI38);
        boolean boolean40 = paymentPanel39.isEnabled();
        boolean boolean41 = paymentPanel39.isFocusTraversalPolicyProvider();
        boolean boolean42 = paymentPanel39.isFocusCycleRoot();
        scheduler.gui.MainUI mainUI43 = new scheduler.gui.MainUI();
        java.awt.Component component44 = mainUI43.getGlassPane();
        mainUI43.setSize(16, (int) (byte) 100);
        java.awt.Event event48 = null;
        boolean boolean51 = mainUI43.mouseUp(event48, (int) (byte) 10, 2);
        sensorPanel1.putClientProperty((java.lang.Object) boolean42, (java.lang.Object) (byte) 10);
        sensorPanel1.removeNotify();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel1.addContainerListener(containerListener8);
        sensorPanel1.reshape((int) (short) -1, (int) (byte) 0, 100, 128);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Graphics graphics14 = sensorPanel1.getGraphics();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component20 = sensorPanel1.add((java.awt.Component) sensorPanel16, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = adminDashboardPanel5.areFocusTraversalKeysSet(83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        java.awt.Event event8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = mainUI0.postEvent(event8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.Color color29 = sensorPanel19.getForeground();
        java.awt.event.MouseWheelListener mouseWheelListener30 = null;
        sensorPanel19.addMouseWheelListener(mouseWheelListener30);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.lang.String str15 = sensorPanel12.toString();
        java.awt.MenuComponent menuComponent16 = null;
        sensorPanel12.remove(menuComponent16);
        java.awt.Component[] componentArray18 = sensorPanel12.getComponents();
        javax.swing.TransferHandler transferHandler19 = null;
        sensorPanel12.setTransferHandler(transferHandler19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Graphics graphics27 = null;
        sensorPanel22.paintAll(graphics27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.PaymentPanel paymentPanel30 = new scheduler.gui.PaymentPanel(mainUI29);
        boolean boolean31 = paymentPanel30.isEnabled();
        boolean boolean32 = paymentPanel30.isPaintingForPrint();
        paymentPanel30.hide();
        java.awt.Dimension dimension34 = paymentPanel30.getMaximumSize();
        sensorPanel22.setMaximumSize(dimension34);
        sensorPanel12.setMaximumSize(dimension34);
        sensorPanel1.resize(dimension34);
        java.io.PrintStream printStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.list(printStream38, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(componentArray18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double2 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            booking0.modifyTimes(localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Start and end times are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        java.time.LocalDateTime localDateTime4 = booking0.getStartTime();
        boolean boolean6 = booking0.executePayment((double) 128);
        boolean boolean7 = booking0.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        javax.swing.JRootPane jRootPane14 = mainUI0.getRootPane();
        jRootPane14.firePropertyChange("REGISTRATION", 'a', ' ');
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        boolean boolean14 = mainUI0.contains((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = sensorPanel1.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        java.lang.String str13 = sensorPanel1.getToolTipText();
        java.awt.event.ComponentListener componentListener14 = null;
        sensorPanel1.removeComponentListener(componentListener14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray4 = adminDashboardPanel3.getPropertyChangeListeners();
        org.junit.Assert.assertNotNull(propertyChangeListenerArray4);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray4, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        boolean boolean5 = mainUI0.isLocationByPlatform();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel6 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        mainUI0.setMinimumSize(dimension19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        scheduler.gui.MainUI mainUI23 = new scheduler.gui.MainUI();
        java.awt.Component component24 = mainUI23.getGlassPane();
        mainUI23.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
        mainUI23.removeHierarchyBoundsListener(hierarchyBoundsListener28);
        mainUI23.show();
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.lang.String str35 = sensorPanel32.toString();
        java.awt.MenuComponent menuComponent36 = null;
        sensorPanel32.remove(menuComponent36);
        java.awt.Component[] componentArray38 = sensorPanel32.getComponents();
        scheduler.gui.MainUI mainUI39 = new scheduler.gui.MainUI();
        mainUI39.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener42 = null;
        mainUI39.addWindowFocusListener(windowFocusListener42);
        boolean boolean44 = mainUI39.isFocusableWindow();
        scheduler.gui.MainUI mainUI45 = null;
        scheduler.gui.SensorPanel sensorPanel46 = new scheduler.gui.SensorPanel(mainUI45);
        java.awt.event.ContainerListener containerListener47 = null;
        sensorPanel46.removeContainerListener(containerListener47);
        java.awt.event.MouseEvent mouseEvent49 = null;
        java.lang.String str50 = sensorPanel46.getToolTipText(mouseEvent49);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        sensorPanel46.removeInputMethodListener(inputMethodListener51);
        sensorPanel46.enable();
        java.awt.Point point54 = sensorPanel46.location();
        mainUI39.setLocation(point54);
        mainUI39.setFocusableWindowState(false);
        java.awt.Dimension dimension58 = mainUI39.getSize();
        sensorPanel32.resize(dimension58);
        paymentPanel22.putClientProperty((java.lang.Object) mainUI23, (java.lang.Object) sensorPanel32);
        scheduler.gui.MainUI mainUI61 = null;
        scheduler.gui.SensorPanel sensorPanel62 = new scheduler.gui.SensorPanel(mainUI61);
        java.awt.event.ContainerListener containerListener63 = null;
        sensorPanel62.removeContainerListener(containerListener63);
        java.awt.event.MouseEvent mouseEvent65 = null;
        java.lang.String str66 = sensorPanel62.getToolTipText(mouseEvent65);
        java.awt.Dimension dimension67 = sensorPanel62.minimumSize();
        java.awt.ImageCapabilities imageCapabilities70 = null;
        java.awt.image.VolatileImage volatileImage71 = sensorPanel62.createVolatileImage(8, (-1), imageCapabilities70);
        java.awt.Image image74 = sensorPanel62.createImage(3, 1);
        java.awt.Rectangle rectangle75 = null;
        java.awt.Rectangle rectangle76 = sensorPanel62.getBounds(rectangle75);
        sensorPanel32.setBounds(rectangle76);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setShape((java.awt.Shape) rectangle76);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertNotNull(componentArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(dimension67);
        org.junit.Assert.assertNull(volatileImage71);
        org.junit.Assert.assertNull(image74);
        org.junit.Assert.assertNotNull(rectangle76);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.String str1 = faculty0.getOrgID();
        scheduler.room.Room room2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        scheduler.pricing.StaffPricing staffPricing5 = new scheduler.pricing.StaffPricing();
        double double6 = staffPricing5.getHourlyRate();
        scheduler.payment.DebitCardPayment debitCardPayment7 = new scheduler.payment.DebitCardPayment();
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking8 = new scheduler.booking.Booking((scheduler.user.User) faculty0, room2, localDateTime3, localDateTime4, (scheduler.pricing.PricingStrategy) staffPricing5, (scheduler.payment.PaymentStrategy) debitCardPayment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.PaymentPanel paymentPanel7 = new scheduler.gui.PaymentPanel(mainUI6);
        boolean boolean8 = paymentPanel7.isEnabled();
        boolean boolean9 = paymentPanel7.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation10 = paymentPanel7.getComponentOrientation();
        mainUI0.setComponentOrientation(componentOrientation10);
        boolean boolean12 = mainUI0.isFocused();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        java.awt.im.InputContext inputContext7 = mainUI0.getInputContext();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(inputContext7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        scheduler.room.MaintenanceState maintenanceState0 = new scheduler.room.MaintenanceState();
        scheduler.room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.handleRelease(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.PaymentPanel paymentPanel7 = new scheduler.gui.PaymentPanel(mainUI6);
        boolean boolean8 = paymentPanel7.isEnabled();
        boolean boolean9 = paymentPanel7.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation10 = paymentPanel7.getComponentOrientation();
        mainUI0.setComponentOrientation(componentOrientation10);
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel12 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        boolean boolean13 = mainUI0.isOpaque();
        java.awt.Component component14 = mainUI0.getMostRecentFocusOwner();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(component14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        paymentPanel1.removePropertyChangeListener("hi!", propertyChangeListener10);
        paymentPanel1.disable();
        boolean boolean13 = paymentPanel1.isDisplayable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        boolean boolean7 = sensorPanel1.isPreferredSizeSet();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        sensorPanel17.transferFocus();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = sensorPanel17.createImage(imageProducer23);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.awt.event.MouseEvent mouseEvent31 = null;
        java.lang.String str32 = sensorPanel28.getToolTipText(mouseEvent31);
        java.awt.Insets insets33 = sensorPanel28.getInsets();
        int int34 = sensorPanel10.checkImage(image24, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel28);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        sensorPanel28.addPropertyChangeListener("hi!", propertyChangeListener36);
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray39 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet40 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40, aWTKeyStrokeArray39);
        sensorPanel28.setFocusTraversalKeys(0, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setFocusTraversalKeys(650, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(insets33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray39);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray39, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.setLocationByPlatform(true);
        scheduler.gui.MainUI mainUI12 = new scheduler.gui.MainUI();
        java.awt.Component component13 = mainUI12.getGlassPane();
        mainUI12.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar17 = null;
        mainUI12.setJMenuBar(jMenuBar17);
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        mainUI19.addPropertyChangeListener("hi!", propertyChangeListener21);
        java.awt.Insets insets23 = mainUI19.getInsets();
        int int24 = mainUI12.getComponentZOrder((java.awt.Component) mainUI19);
        java.awt.Color color25 = mainUI12.getBackground();
        mainUI0.setForeground(color25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(insets23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        java.awt.MenuComponent menuComponent25 = null;
        mainUI0.remove(menuComponent25);
        java.awt.event.WindowStateListener windowStateListener27 = null;
        mainUI0.removeWindowStateListener(windowStateListener27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet30 = mainUI0.getFocusTraversalKeys(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.awt.event.WindowStateListener windowStateListener14 = null;
        mainUI0.removeWindowStateListener(windowStateListener14);
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.awt.Component component17 = mainUI16.getGlassPane();
        javax.swing.JMenuBar jMenuBar18 = mainUI16.getJMenuBar();
        mainUI16.setState((int) (short) 0);
        mainUI16.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel24 = new scheduler.gui.LoginPanel(mainUI16);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component25 = mainUI0.add((java.awt.Component) mainUI16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(jMenuBar18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.awt.Point point5 = sensorPanel3.getPopupLocation(mouseEvent4);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(point5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        sensorPanel1.resetKeyboardActions();
        sensorPanel1.setRequestFocusEnabled(false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.Dimension dimension25 = sensorPanel20.minimumSize();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = sensorPanel20.createVolatileImage(8, (-1), imageCapabilities28);
        javax.swing.InputMap inputMap30 = sensorPanel20.getInputMap();
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setInputMap(83, inputMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNotNull(inputMap30);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        mainUI0.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.WindowListener windowListener8 = null;
        mainUI0.addWindowListener(windowListener8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        java.awt.event.ContainerListener[] containerListenerArray11 = paymentPanel1.getContainerListeners();
        java.awt.Event event12 = null;
        boolean boolean15 = paymentPanel1.mouseExit(event12, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertArrayEquals(containerListenerArray11, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        scheduler.room.MaintenanceState maintenanceState0 = new scheduler.room.MaintenanceState();
        scheduler.room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.handleReserve(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        mainUI0.dispose();
        mainUI0.setEnabled(false);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        java.awt.Dimension dimension19 = mainUI0.getSize();
        scheduler.gui.RoomManagementPanel roomManagementPanel20 = new scheduler.gui.RoomManagementPanel(mainUI0);
        java.awt.event.FocusEvent.Cause cause21 = null;
        mainUI0.requestFocus(cause21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        mainUI13.addPropertyChangeListener("hi!", propertyChangeListener15);
        java.awt.Insets insets17 = mainUI13.getInsets();
        java.awt.Rectangle rectangle18 = null;
        mainUI13.setMaximizedBounds(rectangle18);
        java.awt.Event event20 = null;
        boolean boolean23 = mainUI13.mouseDrag(event20, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension24 = mainUI13.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
        mainUI13.addHierarchyBoundsListener(hierarchyBoundsListener25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.awt.event.MouseEvent mouseEvent31 = null;
        java.lang.String str32 = sensorPanel28.getToolTipText(mouseEvent31);
        java.awt.Dimension dimension33 = sensorPanel28.minimumSize();
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.SensorPanel sensorPanel35 = new scheduler.gui.SensorPanel(mainUI34);
        java.awt.event.ContainerListener containerListener36 = null;
        sensorPanel35.removeContainerListener(containerListener36);
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.lang.String str39 = sensorPanel35.getToolTipText(mouseEvent38);
        sensorPanel35.transferFocus();
        java.awt.image.ImageProducer imageProducer41 = null;
        java.awt.Image image42 = sensorPanel35.createImage(imageProducer41);
        scheduler.gui.MainUI mainUI45 = null;
        scheduler.gui.SensorPanel sensorPanel46 = new scheduler.gui.SensorPanel(mainUI45);
        java.awt.event.ContainerListener containerListener47 = null;
        sensorPanel46.removeContainerListener(containerListener47);
        java.awt.event.MouseEvent mouseEvent49 = null;
        java.lang.String str50 = sensorPanel46.getToolTipText(mouseEvent49);
        java.awt.Insets insets51 = sensorPanel46.getInsets();
        int int52 = sensorPanel28.checkImage(image42, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel46);
        scheduler.gui.MainUI mainUI55 = null;
        scheduler.gui.SensorPanel sensorPanel56 = new scheduler.gui.SensorPanel(mainUI55);
        java.awt.event.ContainerListener containerListener57 = null;
        sensorPanel56.removeContainerListener(containerListener57);
        java.awt.event.MouseEvent mouseEvent59 = null;
        java.lang.String str60 = sensorPanel56.getToolTipText(mouseEvent59);
        java.awt.Insets insets61 = sensorPanel56.getInsets();
        boolean boolean62 = sensorPanel56.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener63 = null;
        sensorPanel56.addContainerListener(containerListener63);
        int int65 = mainUI13.checkImage(image42, 32, 1, (java.awt.image.ImageObserver) sensorPanel56);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setComponentZOrder((java.awt.Component) mainUI13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(image42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(insets51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(insets61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        java.lang.String str13 = mainUI0.toString();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "2) test146(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str13, "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        java.awt.event.KeyListener[] keyListenerArray18 = sensorPanel1.getKeyListeners();
        int int19 = sensorPanel1.getDebugGraphicsOptions();
        java.awt.Component component22 = sensorPanel1.findComponentAt(4, 1);
        float float23 = sensorPanel1.getAlignmentX();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(component22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        int int7 = mainUI0.getExtendedState();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        scheduler.user.Administrator administrator2 = scheduler.user.Administrator.authenticate("", "SENSOR");
        org.junit.Assert.assertNull(administrator2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        javax.swing.TransferHandler transferHandler11 = mainUI0.getTransferHandler();
        mainUI0.setState((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(transferHandler11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        sensorPanel1.resetKeyboardActions();
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseExit(event8, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        boolean boolean4 = mainUI0.getFocusableWindowState();
        boolean boolean5 = mainUI0.isAlwaysOnTopSupported();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        sensorPanel7.transferFocus();
        java.awt.image.ImageProducer imageProducer13 = null;
        java.awt.Image image14 = sensorPanel7.createImage(imageProducer13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel16.getToolTipText(mouseEvent19);
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        sensorPanel16.removeInputMethodListener(inputMethodListener21);
        java.awt.Component component25 = sensorPanel16.getComponentAt((int) (byte) -1, (int) ' ');
        javax.swing.JToolTip jToolTip26 = sensorPanel16.createToolTip();
        boolean boolean27 = jToolTip26.getInheritsPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = mainUI0.prepareImage(image14, (java.awt.image.ImageObserver) jToolTip26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(image14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(component25);
        org.junit.Assert.assertNotNull(jToolTip26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        scheduler.payment.DebitCardPayment debitCardPayment0 = new scheduler.payment.DebitCardPayment();
        boolean boolean2 = debitCardPayment0.processTransaction((double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        sensorPanel1.removeAll();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        sensorPanel17.transferFocus();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = sensorPanel17.createImage(imageProducer23);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.awt.event.MouseEvent mouseEvent31 = null;
        java.lang.String str32 = sensorPanel28.getToolTipText(mouseEvent31);
        java.awt.Insets insets33 = sensorPanel28.getInsets();
        int int34 = sensorPanel10.checkImage(image24, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel28);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        sensorPanel28.addPropertyChangeListener("hi!", propertyChangeListener36);
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray39 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet40 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40, aWTKeyStrokeArray39);
        sensorPanel28.setFocusTraversalKeys(0, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setFocusTraversalKeys((int) (byte) -1, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(insets33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray39);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray39, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        int int27 = mainUI0.countComponents();
        java.awt.Container container28 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setContentPane(container28);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: contentPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        scheduler.gui.RegistrationPanel registrationPanel12 = new scheduler.gui.RegistrationPanel(mainUI0);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.lang.String str17 = sensorPanel14.toString();
        java.awt.MenuComponent menuComponent18 = null;
        sensorPanel14.remove(menuComponent18);
        java.awt.Component[] componentArray20 = sensorPanel14.getComponents();
        scheduler.gui.MainUI mainUI21 = new scheduler.gui.MainUI();
        mainUI21.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener24 = null;
        mainUI21.addWindowFocusListener(windowFocusListener24);
        boolean boolean26 = mainUI21.isFocusableWindow();
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.awt.event.MouseEvent mouseEvent31 = null;
        java.lang.String str32 = sensorPanel28.getToolTipText(mouseEvent31);
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        sensorPanel28.removeInputMethodListener(inputMethodListener33);
        sensorPanel28.enable();
        java.awt.Point point36 = sensorPanel28.location();
        mainUI21.setLocation(point36);
        mainUI21.setFocusableWindowState(false);
        java.awt.Dimension dimension40 = mainUI21.getSize();
        sensorPanel14.resize(dimension40);
        java.awt.Dimension dimension42 = registrationPanel12.getSize(dimension40);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(componentArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(point36);
        org.junit.Assert.assertNotNull(dimension40);
        org.junit.Assert.assertNotNull(dimension42);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.awt.Event event8 = null;
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        sensorPanel10.removeInputMethodListener(inputMethodListener15);
        sensorPanel10.enable();
        boolean boolean18 = mainUI0.lostFocus(event8, (java.lang.Object) sensorPanel10);
        java.awt.Cursor cursor19 = null;
        mainUI0.setCursor(cursor19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.lang.String str25 = sensorPanel22.toString();
        java.awt.MenuComponent menuComponent26 = null;
        sensorPanel22.remove(menuComponent26);
        java.awt.Component[] componentArray28 = sensorPanel22.getComponents();
        javax.swing.TransferHandler transferHandler29 = null;
        sensorPanel22.setTransferHandler(transferHandler29);
        mainUI0.setContentPane((java.awt.Container) sensorPanel22);
        scheduler.gui.MainUI mainUI32 = new scheduler.gui.MainUI();
        mainUI32.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener35 = null;
        mainUI32.addWindowFocusListener(windowFocusListener35);
        boolean boolean37 = mainUI32.isFocusableWindow();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        sensorPanel39.removeInputMethodListener(inputMethodListener44);
        sensorPanel39.enable();
        java.awt.Point point47 = sensorPanel39.location();
        mainUI32.setLocation(point47);
        mainUI32.setFocusableWindowState(false);
        java.awt.Dimension dimension51 = mainUI32.getSize();
        scheduler.gui.RoomManagementPanel roomManagementPanel52 = new scheduler.gui.RoomManagementPanel(mainUI32);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel22.setComponentZOrder((java.awt.Component) roomManagementPanel52, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(componentArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(point47);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        sensorPanel1.removeAll();
        java.lang.Class<?> wildcardClass8 = sensorPanel1.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        boolean boolean6 = adminDashboardPanel5.isPaintingTile();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        mainUI7.layout();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        java.awt.event.ComponentListener componentListener10 = null;
        mainUI0.addComponentListener(componentListener10);
        mainUI0.dispose();
        java.awt.event.WindowStateListener windowStateListener13 = null;
        mainUI0.removeWindowStateListener(windowStateListener13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = sensorPanel1.getBounds(rectangle14);
        boolean boolean16 = sensorPanel1.isShowing();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        java.awt.Component component18 = mainUI17.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray19 = mainUI17.getKeyListeners();
        int int20 = mainUI17.getCursorType();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        boolean boolean23 = paymentPanel22.isEnabled();
        boolean boolean24 = paymentPanel22.isPaintingForPrint();
        boolean boolean25 = paymentPanel22.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI26 = new scheduler.gui.MainUI();
        mainUI26.setTitle("REGISTRATION");
        int int29 = mainUI26.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener30 = null;
        mainUI26.removeWindowFocusListener(windowFocusListener30);
        javax.swing.TransferHandler transferHandler32 = null;
        mainUI26.setTransferHandler(transferHandler32);
        java.awt.im.InputContext inputContext34 = mainUI26.getInputContext();
        paymentPanel22.setNextFocusableComponent((java.awt.Component) mainUI26);
        java.awt.Dialog.ModalExclusionType modalExclusionType36 = mainUI26.getModalExclusionType();
        mainUI17.setModalExclusionType(modalExclusionType36);
        scheduler.gui.MainUI mainUI38 = new scheduler.gui.MainUI();
        mainUI38.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel41 = new scheduler.gui.AdminDashboardPanel(mainUI38);
        java.awt.event.FocusListener[] focusListenerArray42 = mainUI38.getFocusListeners();
        boolean boolean43 = mainUI38.isActive();
        mainUI38.setName("LOGIN");
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel46 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI38);
        sensorPanel1.putClientProperty((java.lang.Object) modalExclusionType36, (java.lang.Object) mainUI38);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener48);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(keyListenerArray19);
        org.junit.Assert.assertArrayEquals(keyListenerArray19, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(inputContext34);
        org.junit.Assert.assertTrue("'" + modalExclusionType36 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType36.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(focusListenerArray42);
        org.junit.Assert.assertArrayEquals(focusListenerArray42, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        scheduler.gui.MainUI mainUI4 = new scheduler.gui.MainUI();
        mainUI4.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener7 = null;
        mainUI4.addWindowFocusListener(windowFocusListener7);
        boolean boolean9 = mainUI4.isFocusableWindow();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        sensorPanel11.removeInputMethodListener(inputMethodListener16);
        sensorPanel11.enable();
        java.awt.Point point19 = sensorPanel11.location();
        mainUI4.setLocation(point19);
        java.awt.Point point21 = mainUI0.getLocation(point19);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(point21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        float float8 = sensorPanel1.getAlignmentY();
        sensorPanel1.setSize(1047, 128);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        java.lang.String str5 = hardwareSensor2.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADMIN_DASHBOARD" + "'", str5, "ADMIN_DASHBOARD");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Container container11 = sensorPanel1.getTopLevelAncestor();
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            container11.addHierarchyListener(hierarchyListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(container11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.awt.Component component8 = mainUI7.getGlassPane();
        mainUI7.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar12 = null;
        mainUI7.setJMenuBar(jMenuBar12);
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        mainUI14.addPropertyChangeListener("hi!", propertyChangeListener16);
        java.awt.Insets insets18 = mainUI14.getInsets();
        int int19 = mainUI7.getComponentZOrder((java.awt.Component) mainUI14);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.PaymentPanel paymentPanel21 = new scheduler.gui.PaymentPanel(mainUI20);
        boolean boolean22 = paymentPanel21.isEnabled();
        boolean boolean23 = paymentPanel21.isPaintingForPrint();
        boolean boolean24 = paymentPanel21.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI25 = null;
        scheduler.gui.SensorPanel sensorPanel26 = new scheduler.gui.SensorPanel(mainUI25);
        java.awt.event.ContainerListener containerListener27 = null;
        sensorPanel26.removeContainerListener(containerListener27);
        java.awt.event.MouseEvent mouseEvent29 = null;
        java.lang.String str30 = sensorPanel26.getToolTipText(mouseEvent29);
        java.awt.Dimension dimension31 = sensorPanel26.minimumSize();
        paymentPanel21.setSize(dimension31);
        boolean boolean33 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel21);
        scheduler.gui.MainUI mainUI34 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        mainUI34.addPropertyChangeListener("hi!", propertyChangeListener36);
        java.awt.Insets insets38 = mainUI34.getInsets();
        java.awt.Rectangle rectangle39 = null;
        mainUI34.setMaximizedBounds(rectangle39);
        java.awt.Event event41 = null;
        boolean boolean44 = mainUI34.mouseDrag(event41, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension45 = mainUI34.getPreferredSize();
        java.awt.Dimension dimension46 = paymentPanel21.getSize(dimension45);
        // The following exception was thrown during execution in test generation
        try {
            jPopupMenu6.add((java.awt.Component) mainUI7, (java.lang.Object) dimension45, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(insets38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNotNull(dimension46);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (long) 1, (long) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        sensorPanel1.addPropertyChangeListener(propertyChangeListener13);
        sensorPanel1.show();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        int int8 = paymentPanel1.getY();
        paymentPanel1.resetKeyboardActions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.event.InputMethodListener[] inputMethodListenerArray5 = paymentPanel1.getInputMethodListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray5);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray5, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        scheduler.user.Staff staff5 = new scheduler.user.Staff("", "REGISTRATION", "hi!", "", false);
        staff5.setVerified(true);
        scheduler.room.Room room8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        scheduler.pricing.StaffPricing staffPricing11 = new scheduler.pricing.StaffPricing();
        double double12 = staffPricing11.getHourlyRate();
        scheduler.payment.CreditCardPayment creditCardPayment13 = new scheduler.payment.CreditCardPayment();
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking14 = new scheduler.booking.Booking((scheduler.user.User) staff5, room8, localDateTime9, localDateTime10, (scheduler.pricing.PricingStrategy) staffPricing11, (scheduler.payment.PaymentStrategy) creditCardPayment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        org.junit.Assert.assertNotNull(frameArray0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        boolean boolean6 = mainUI0.isFocused();
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Component component7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setGlassPane(component7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: glassPane cannot be set to null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        java.awt.Event event7 = null;
        java.lang.Object obj8 = null;
        boolean boolean9 = sensorPanel1.lostFocus(event7, obj8);
        sensorPanel1.setInheritsPopupMenu(false);
        sensorPanel1.updateUI();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = paymentPanel1.getPropertyChangeListeners("");
        paymentPanel1.firePropertyChange("LOGIN", (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray6, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        boolean boolean2 = faculty0.checkPassword("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (double) (short) 1, (double) 16);
        javax.swing.border.Border border14 = sensorPanel1.getBorder();
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = sensorPanel1.postEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertNotNull(border14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI0.getModalExclusionType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.createBufferStrategy((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.InternalError; message: Could not create a buffer strategy");
        } catch (java.lang.InternalError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        sensorPanel14.transferFocus();
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = sensorPanel14.createImage(imageProducer20);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        java.awt.Event event32 = null;
        boolean boolean35 = sensorPanel25.mouseEnter(event32, 3, (int) (short) 100);
        java.awt.Color color36 = sensorPanel25.getBackground();
        int int37 = sensorPanel1.checkImage(image21, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel25);
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.PaymentPanel paymentPanel39 = new scheduler.gui.PaymentPanel(mainUI38);
        boolean boolean40 = paymentPanel39.isEnabled();
        boolean boolean41 = paymentPanel39.isFocusTraversalPolicyProvider();
        boolean boolean42 = paymentPanel39.isFocusCycleRoot();
        scheduler.gui.MainUI mainUI43 = new scheduler.gui.MainUI();
        java.awt.Component component44 = mainUI43.getGlassPane();
        mainUI43.setSize(16, (int) (byte) 100);
        java.awt.Event event48 = null;
        boolean boolean51 = mainUI43.mouseUp(event48, (int) (byte) 10, 2);
        sensorPanel1.putClientProperty((java.lang.Object) boolean42, (java.lang.Object) (byte) 10);
        javax.swing.JRootPane jRootPane53 = sensorPanel1.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = jRootPane53.requestDefaultFocus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jRootPane53);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        mainUI0.addNotify();
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        int int13 = mainUI7.getY();
        java.awt.MenuComponent menuComponent14 = null;
        mainUI7.remove(menuComponent14);
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        java.awt.Dimension dimension22 = sensorPanel17.minimumSize();
        java.awt.ImageCapabilities imageCapabilities25 = null;
        java.awt.image.VolatileImage volatileImage26 = sensorPanel17.createVolatileImage(8, (-1), imageCapabilities25);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray28 = sensorPanel17.getPropertyChangeListeners("");
        java.awt.image.ColorModel colorModel29 = sensorPanel17.getColorModel();
        int int30 = sensorPanel17.getComponentCount();
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.awt.event.MouseEvent mouseEvent35 = null;
        java.lang.String str36 = sensorPanel32.getToolTipText(mouseEvent35);
        java.awt.Dimension dimension37 = sensorPanel32.minimumSize();
        java.awt.ImageCapabilities imageCapabilities40 = null;
        java.awt.image.VolatileImage volatileImage41 = sensorPanel32.createVolatileImage(8, (-1), imageCapabilities40);
        java.awt.Image image44 = sensorPanel32.createImage(3, 1);
        java.awt.Component[] componentArray45 = sensorPanel32.getComponents();
        boolean boolean46 = sensorPanel32.isCursorSet();
        java.awt.Dimension dimension47 = sensorPanel32.size();
        // The following exception was thrown during execution in test generation
        try {
            mainUI7.add((java.awt.Component) sensorPanel17, (java.lang.Object) sensorPanel32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 83 + "'", int13 == 83);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNull(volatileImage26);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray28);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray28, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(colorModel29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNull(volatileImage41);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(componentArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dimension47);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        sensorPanel13.transferFocus();
        java.awt.image.ImageProducer imageProducer19 = null;
        java.awt.Image image20 = sensorPanel13.createImage(imageProducer19);
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = sensorPanel24.getToolTipText(mouseEvent27);
        java.awt.Insets insets29 = sensorPanel24.getInsets();
        int int30 = sensorPanel6.checkImage(image20, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel24);
        java.awt.im.InputContext inputContext31 = sensorPanel6.getInputContext();
        java.awt.LayoutManager layoutManager32 = sensorPanel6.getLayout();
        mainUI0.setLayout(layoutManager32);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNull(inputContext31);
        org.junit.Assert.assertNotNull(layoutManager32);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.invalidate();
        int int7 = sensorPanel1.getComponentCount();
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseDown(event8, 10, (int) (short) 0);
        scheduler.gui.MainUI mainUI12 = new scheduler.gui.MainUI();
        java.awt.Component component13 = mainUI12.getGlassPane();
        javax.swing.JMenuBar jMenuBar14 = mainUI12.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.Component component16 = null;
        boolean boolean17 = mainUI12.isAncestorOf(component16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.PaymentPanel paymentPanel19 = new scheduler.gui.PaymentPanel(mainUI18);
        boolean boolean20 = paymentPanel19.isEnabled();
        boolean boolean21 = paymentPanel19.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation22 = paymentPanel19.getComponentOrientation();
        mainUI12.setComponentOrientation(componentOrientation22);
        java.awt.Dimension dimension24 = mainUI12.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component26 = sensorPanel1.add((java.awt.Component) mainUI12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jMenuBar14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(componentOrientation22);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle("Room Booking System");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name Room Booking System, locale en_US");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        scheduler.sensor.SensorObserver sensorObserver5 = null;
        hardwareSensor2.attach(sensorObserver5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.SensorPanel sensorPanel5 = new scheduler.gui.SensorPanel(mainUI4);
        java.awt.event.ContainerListener containerListener6 = null;
        sensorPanel5.removeContainerListener(containerListener6);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = sensorPanel5.getToolTipText(mouseEvent8);
        java.awt.Dimension dimension10 = sensorPanel5.minimumSize();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        sensorPanel12.transferFocus();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = sensorPanel12.createImage(imageProducer18);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Insets insets28 = sensorPanel23.getInsets();
        int int29 = sensorPanel5.checkImage(image19, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel23);
        java.awt.im.InputContext inputContext30 = sensorPanel5.getInputContext();
        java.awt.LayoutManager layoutManager31 = sensorPanel5.getLayout();
        mainUI0.setLayout(layoutManager31);
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.PaymentPanel paymentPanel34 = new scheduler.gui.PaymentPanel(mainUI33);
        java.awt.Rectangle rectangle35 = null;
        paymentPanel34.scrollRectToVisible(rectangle35);
        java.awt.Event event37 = null;
        boolean boolean40 = paymentPanel34.mouseUp(event37, (int) (byte) 10, 3);
        paymentPanel34.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.awt.Point point46 = paymentPanel34.getPopupLocation(mouseEvent45);
        boolean boolean47 = mainUI0.isFocusCycleRoot((java.awt.Container) paymentPanel34);
        paymentPanel34.enable();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNull(inputContext30);
        org.junit.Assert.assertNotNull(layoutManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.awt.event.InputMethodListener[] inputMethodListenerArray26 = sensorPanel19.getInputMethodListeners();
        java.awt.Rectangle rectangle27 = sensorPanel19.getBounds();
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.awt.Point point29 = sensorPanel19.getToolTipLocation(mouseEvent28);
        sensorPanel19.revalidate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray26);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray26, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertNull(point29);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        sensorPanel30.removeInputMethodListener(inputMethodListener35);
        java.awt.Component component39 = sensorPanel30.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.lang.String str44 = sensorPanel41.toString();
        java.awt.MenuComponent menuComponent45 = null;
        sensorPanel41.remove(menuComponent45);
        java.awt.Component[] componentArray47 = sensorPanel41.getComponents();
        javax.swing.TransferHandler transferHandler48 = null;
        sensorPanel41.setTransferHandler(transferHandler48);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Graphics graphics56 = null;
        sensorPanel51.paintAll(graphics56);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.PaymentPanel paymentPanel59 = new scheduler.gui.PaymentPanel(mainUI58);
        boolean boolean60 = paymentPanel59.isEnabled();
        boolean boolean61 = paymentPanel59.isPaintingForPrint();
        paymentPanel59.hide();
        java.awt.Dimension dimension63 = paymentPanel59.getMaximumSize();
        sensorPanel51.setMaximumSize(dimension63);
        sensorPanel41.setMaximumSize(dimension63);
        sensorPanel30.resize(dimension63);
        sensorPanel19.setMinimumSize(dimension63);
        sensorPanel19.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(component39);
        org.junit.Assert.assertNotNull(componentArray47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dimension63);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        boolean boolean12 = mainUI0.isUndecorated();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel1);
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        mainUI14.addPropertyChangeListener("hi!", propertyChangeListener16);
        java.awt.Insets insets18 = mainUI14.getInsets();
        java.awt.Rectangle rectangle19 = null;
        mainUI14.setMaximizedBounds(rectangle19);
        java.awt.Event event21 = null;
        boolean boolean24 = mainUI14.mouseDrag(event21, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension25 = mainUI14.getPreferredSize();
        java.awt.Dimension dimension26 = paymentPanel1.getSize(dimension25);
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.remove(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        boolean boolean14 = sensorPanel1.getFocusTraversalKeysEnabled();
        java.awt.Rectangle rectangle15 = sensorPanel1.bounds();
        java.awt.Event event16 = null;
        boolean boolean19 = sensorPanel1.mouseUp(event16, 3, 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        boolean boolean11 = paymentPanel1.isManagingFocus();
        int int12 = paymentPanel1.getHeight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        mainUI0.setState((int) (byte) 0);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.lang.String str33 = sensorPanel30.toString();
        java.awt.MenuComponent menuComponent34 = null;
        sensorPanel30.remove(menuComponent34);
        java.awt.Component[] componentArray36 = sensorPanel30.getComponents();
        java.awt.LayoutManager layoutManager37 = sensorPanel30.getLayout();
        sensorPanel30.firePropertyChange("REGISTRATION", (long) 1, (long) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        sensorPanel30.addPropertyChangeListener(propertyChangeListener42);
        int int44 = sensorPanel30.getY();
        int int45 = sensorPanel30.getX();
        mainUI0.setGlassPane((java.awt.Component) sensorPanel30);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertNotNull(componentArray36);
        org.junit.Assert.assertNotNull(layoutManager37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        mainUI0.setState((int) (byte) 0);
        mainUI0.transferFocus();
        java.awt.Event event30 = null;
        boolean boolean32 = mainUI0.keyUp(event30, 128);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        scheduler.user.Staff staff0 = new scheduler.user.Staff();
        boolean boolean2 = staff0.checkPassword("");
        boolean boolean4 = staff0.checkPassword("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        mainUI0.show(true);
        boolean boolean16 = mainUI0.isFocusable();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        mainUI0.showUserBookings();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        boolean boolean4 = mainUI0.getFocusableWindowState();
        java.awt.Point point5 = mainUI0.getLocation();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(point5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        paymentPanel1.removeMouseWheelListener(mouseWheelListener5);
        boolean boolean7 = paymentPanel1.isDisplayable();
        paymentPanel1.invalidate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentPanel1.areFocusTraversalKeysSet(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.showPaymentPanel("", localDateTime10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        scheduler.gui.MainUI mainUI61 = new scheduler.gui.MainUI();
        java.awt.Component component62 = mainUI61.getGlassPane();
        mainUI61.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener66 = null;
        mainUI61.removeHierarchyBoundsListener(hierarchyBoundsListener66);
        int int68 = mainUI0.checkImage(image37, (java.awt.image.ImageObserver) mainUI61);
        java.lang.String str69 = mainUI61.getTitle();
        java.awt.Container container70 = mainUI61.getContentPane();
        java.awt.event.KeyListener keyListener71 = null;
        mainUI61.addKeyListener(keyListener71);
        java.awt.Event event73 = null;
        boolean boolean76 = mainUI61.mouseEnter(event73, 6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Room Booking System" + "'", str69, "Room Booking System");
        org.junit.Assert.assertNotNull(container70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        mainUI0.setLocationByPlatform(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.lang.String str11 = sensorPanel1.getToolTipText();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        mainUI11.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        mainUI11.addWindowFocusListener(windowFocusListener14);
        boolean boolean16 = mainUI11.isFocusableWindow();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        sensorPanel18.removeInputMethodListener(inputMethodListener23);
        sensorPanel18.enable();
        java.awt.Point point26 = sensorPanel18.location();
        mainUI11.setLocation(point26);
        mainUI0.setLocation(point26);
        boolean boolean29 = mainUI0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Graphics graphics6 = null;
        sensorPanel1.paintAll(graphics6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.Dimension dimension14 = sensorPanel9.minimumSize();
        java.awt.ImageCapabilities imageCapabilities17 = null;
        java.awt.image.VolatileImage volatileImage18 = sensorPanel9.createVolatileImage(8, (-1), imageCapabilities17);
        java.awt.Image image21 = sensorPanel9.createImage(3, 1);
        java.awt.Graphics graphics22 = sensorPanel9.getGraphics();
        java.awt.Font font23 = sensorPanel9.getFont();
        java.awt.FontMetrics fontMetrics24 = sensorPanel1.getFontMetrics(font23);
        sensorPanel1.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(volatileImage18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(graphics22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(fontMetrics24);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        javax.swing.JMenuBar jMenuBar6 = mainUI0.getJMenuBar();
        int int7 = mainUI0.getExtendedState();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str0 = scheduler.gui.MainUI.MY_BOOKINGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MY_BOOKINGS" + "'", str0, "MY_BOOKINGS");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.nio.file.Path path0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "MY_BOOKINGS", "LOGIN", "", "", "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            scheduler.database.CsvDatabase.replaceRows(path0, "Room Booking System", (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.file.Path.getFileSystem()\" because \"path\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "MY_BOOKINGS", "LOGIN", "", "", "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        boolean boolean3 = booking0.isDepositForfeited();
        java.time.LocalDateTime localDateTime4 = booking0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        sensorPanel9.removeInputMethodListener(inputMethodListener14);
        sensorPanel9.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color22 = null;
        sensorPanel9.setBackground(color22);
        java.awt.event.ComponentListener[] componentListenerArray24 = sensorPanel9.getComponentListeners();
        boolean boolean25 = sensorPanel9.isDoubleBuffered();
        java.util.Locale locale26 = null;
        sensorPanel9.setLocale(locale26);
        boolean boolean28 = paymentPanel1.isAncestorOf((java.awt.Component) sensorPanel9);
        sensorPanel9.firePropertyChange("SENSOR", '#', '4');
        java.awt.Dimension dimension33 = null;
        sensorPanel9.setMinimumSize(dimension33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.lang.String str6 = sensorPanel1.getToolTipText();
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        java.awt.Rectangle rectangle12 = null;
        mainUI7.setMaximizedBounds(rectangle12);
        java.awt.Event event14 = null;
        boolean boolean17 = mainUI7.mouseDrag(event14, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension18 = mainUI7.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        mainUI7.addHierarchyBoundsListener(hierarchyBoundsListener19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Dimension dimension27 = sensorPanel22.minimumSize();
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        sensorPanel29.transferFocus();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = sensorPanel29.createImage(imageProducer35);
        scheduler.gui.MainUI mainUI39 = null;
        scheduler.gui.SensorPanel sensorPanel40 = new scheduler.gui.SensorPanel(mainUI39);
        java.awt.event.ContainerListener containerListener41 = null;
        sensorPanel40.removeContainerListener(containerListener41);
        java.awt.event.MouseEvent mouseEvent43 = null;
        java.lang.String str44 = sensorPanel40.getToolTipText(mouseEvent43);
        java.awt.Insets insets45 = sensorPanel40.getInsets();
        int int46 = sensorPanel22.checkImage(image36, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel40);
        scheduler.gui.MainUI mainUI49 = null;
        scheduler.gui.SensorPanel sensorPanel50 = new scheduler.gui.SensorPanel(mainUI49);
        java.awt.event.ContainerListener containerListener51 = null;
        sensorPanel50.removeContainerListener(containerListener51);
        java.awt.event.MouseEvent mouseEvent53 = null;
        java.lang.String str54 = sensorPanel50.getToolTipText(mouseEvent53);
        java.awt.Insets insets55 = sensorPanel50.getInsets();
        boolean boolean56 = sensorPanel50.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener57 = null;
        sensorPanel50.addContainerListener(containerListener57);
        int int59 = mainUI7.checkImage(image36, 32, 1, (java.awt.image.ImageObserver) sensorPanel50);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component60 = sensorPanel1.add((java.awt.Component) mainUI7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(insets55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        scheduler.gui.MainUI mainUI4 = new scheduler.gui.MainUI();
        mainUI4.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel7 = new scheduler.gui.AdminDashboardPanel(mainUI4);
        java.awt.Graphics graphics8 = mainUI4.getGraphics();
        int int9 = mainUI4.getHeight();
        mainUI4.setAutoRequestFocus(true);
        java.awt.Point point12 = mainUI4.location();
        mainUI4.setFocusCycleRoot(false);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setComponentZOrder((java.awt.Component) mainUI4, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphics8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 650 + "'", int9 == 650);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        mainUI8.addWindowFocusListener(windowFocusListener11);
        boolean boolean13 = mainUI8.isFocusableWindow();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        sensorPanel15.removeInputMethodListener(inputMethodListener20);
        sensorPanel15.enable();
        java.awt.Point point23 = sensorPanel15.location();
        mainUI8.setLocation(point23);
        mainUI8.setFocusableWindowState(false);
        java.awt.Dimension dimension27 = mainUI8.getSize();
        sensorPanel1.resize(dimension27);
        boolean boolean29 = sensorPanel1.isFontSet();
        sensorPanel1.setVerifyInputWhenFocusTarget(true);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.awt.event.WindowStateListener windowStateListener14 = null;
        mainUI0.removeWindowStateListener(windowStateListener14);
        boolean boolean16 = mainUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        sensorPanel9.removeInputMethodListener(inputMethodListener14);
        sensorPanel9.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color22 = null;
        sensorPanel9.setBackground(color22);
        java.awt.event.ComponentListener[] componentListenerArray24 = sensorPanel9.getComponentListeners();
        boolean boolean25 = sensorPanel9.isDoubleBuffered();
        java.util.Locale locale26 = null;
        sensorPanel9.setLocale(locale26);
        boolean boolean28 = paymentPanel1.isAncestorOf((java.awt.Component) sensorPanel9);
        java.awt.Insets insets29 = sensorPanel9.insets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(insets29);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str0 = scheduler.gui.MainUI.ROOM_BOOKING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOM_BOOKING" + "'", str0, "ROOM_BOOKING");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        mainUI0.invalidate();
        java.awt.Event event28 = null;
        boolean boolean31 = mainUI0.mouseUp(event28, 1047, 4);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.image.VolatileImage volatileImage18 = sensorPanel1.createVolatileImage(6, (int) 'a');
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.Graphics graphics25 = null;
        sensorPanel20.paintAll(graphics25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.awt.event.MouseEvent mouseEvent31 = null;
        java.lang.String str32 = sensorPanel28.getToolTipText(mouseEvent31);
        java.awt.Dimension dimension33 = sensorPanel28.minimumSize();
        java.awt.ImageCapabilities imageCapabilities36 = null;
        java.awt.image.VolatileImage volatileImage37 = sensorPanel28.createVolatileImage(8, (-1), imageCapabilities36);
        java.awt.Image image40 = sensorPanel28.createImage(3, 1);
        java.awt.Graphics graphics41 = sensorPanel28.getGraphics();
        java.awt.Font font42 = sensorPanel28.getFont();
        java.awt.FontMetrics fontMetrics43 = sensorPanel20.getFontMetrics(font42);
        java.awt.FontMetrics fontMetrics44 = sensorPanel1.getFontMetrics(font42);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(volatileImage18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertNull(volatileImage37);
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertNull(graphics41);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNotNull(fontMetrics43);
        org.junit.Assert.assertNotNull(fontMetrics44);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = new scheduler.gui.MainUI();
        java.awt.Component component3 = mainUI2.getGlassPane();
        mainUI2.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mainUI2.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        mainUI2.show();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.lang.String str14 = sensorPanel11.toString();
        java.awt.MenuComponent menuComponent15 = null;
        sensorPanel11.remove(menuComponent15);
        java.awt.Component[] componentArray17 = sensorPanel11.getComponents();
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        mainUI18.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI18.addWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI18.isFocusableWindow();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        sensorPanel25.enable();
        java.awt.Point point33 = sensorPanel25.location();
        mainUI18.setLocation(point33);
        mainUI18.setFocusableWindowState(false);
        java.awt.Dimension dimension37 = mainUI18.getSize();
        sensorPanel11.resize(dimension37);
        paymentPanel1.putClientProperty((java.lang.Object) mainUI2, (java.lang.Object) sensorPanel11);
        java.awt.LayoutManager layoutManager40 = sensorPanel11.getLayout();
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNotNull(layoutManager40);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        boolean boolean10 = mainUI0.inside(100, 32);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = new scheduler.gui.MainUI();
        java.awt.Component component3 = mainUI2.getGlassPane();
        mainUI2.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mainUI2.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        mainUI2.show();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.lang.String str14 = sensorPanel11.toString();
        java.awt.MenuComponent menuComponent15 = null;
        sensorPanel11.remove(menuComponent15);
        java.awt.Component[] componentArray17 = sensorPanel11.getComponents();
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        mainUI18.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI18.addWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI18.isFocusableWindow();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        sensorPanel25.enable();
        java.awt.Point point33 = sensorPanel25.location();
        mainUI18.setLocation(point33);
        mainUI18.setFocusableWindowState(false);
        java.awt.Dimension dimension37 = mainUI18.getSize();
        sensorPanel11.resize(dimension37);
        paymentPanel1.putClientProperty((java.lang.Object) mainUI2, (java.lang.Object) sensorPanel11);
        mainUI2.setTitle("ToolTipText");
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.awt.Component component10 = mainUI9.getGlassPane();
        mainUI9.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        mainUI9.removeHierarchyBoundsListener(hierarchyBoundsListener14);
        mainUI9.show();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        mainUI17.addPropertyChangeListener("hi!", propertyChangeListener19);
        java.awt.Insets insets21 = mainUI17.getInsets();
        java.awt.Rectangle rectangle22 = null;
        mainUI17.setMaximizedBounds(rectangle22);
        java.awt.Event event24 = null;
        boolean boolean27 = mainUI17.mouseDrag(event24, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension28 = mainUI17.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
        mainUI17.addHierarchyBoundsListener(hierarchyBoundsListener29);
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.awt.event.MouseEvent mouseEvent35 = null;
        java.lang.String str36 = sensorPanel32.getToolTipText(mouseEvent35);
        java.awt.Dimension dimension37 = sensorPanel32.minimumSize();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        sensorPanel39.transferFocus();
        java.awt.image.ImageProducer imageProducer45 = null;
        java.awt.Image image46 = sensorPanel39.createImage(imageProducer45);
        scheduler.gui.MainUI mainUI49 = null;
        scheduler.gui.SensorPanel sensorPanel50 = new scheduler.gui.SensorPanel(mainUI49);
        java.awt.event.ContainerListener containerListener51 = null;
        sensorPanel50.removeContainerListener(containerListener51);
        java.awt.event.MouseEvent mouseEvent53 = null;
        java.lang.String str54 = sensorPanel50.getToolTipText(mouseEvent53);
        java.awt.Insets insets55 = sensorPanel50.getInsets();
        int int56 = sensorPanel32.checkImage(image46, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel50);
        scheduler.gui.MainUI mainUI59 = null;
        scheduler.gui.SensorPanel sensorPanel60 = new scheduler.gui.SensorPanel(mainUI59);
        java.awt.event.ContainerListener containerListener61 = null;
        sensorPanel60.removeContainerListener(containerListener61);
        java.awt.event.MouseEvent mouseEvent63 = null;
        java.lang.String str64 = sensorPanel60.getToolTipText(mouseEvent63);
        java.awt.Insets insets65 = sensorPanel60.getInsets();
        boolean boolean66 = sensorPanel60.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener67 = null;
        sensorPanel60.addContainerListener(containerListener67);
        int int69 = mainUI17.checkImage(image46, 32, 1, (java.awt.image.ImageObserver) sensorPanel60);
        scheduler.gui.MainUI mainUI70 = new scheduler.gui.MainUI();
        java.awt.Component component71 = mainUI70.getGlassPane();
        mainUI70.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener75 = null;
        mainUI70.removeHierarchyBoundsListener(hierarchyBoundsListener75);
        int int77 = mainUI9.checkImage(image46, (java.awt.image.ImageObserver) mainUI70);
        boolean boolean83 = mainUI0.imageUpdate(image46, (int) (short) 1, 1, (int) (short) -1, 6, 100);
        mainUI0.setState((int) (byte) 100);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(image46);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(insets55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(insets65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(component71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseEnter(event8, 3, (int) (short) 100);
        java.awt.Color color12 = sensorPanel1.getBackground();
        sensorPanel1.nextFocus();
        sensorPanel1.transferFocusBackward();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray15 = sensorPanel1.getMouseMotionListeners();
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel1.getToolTipText(mouseEvent16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray15);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray15, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        java.awt.Container container5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setContentPane(container5);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: contentPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            occupiedState0.handleReserve(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        sensorPanel14.transferFocus();
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = sensorPanel14.createImage(imageProducer20);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        java.awt.Event event32 = null;
        boolean boolean35 = sensorPanel25.mouseEnter(event32, 3, (int) (short) 100);
        java.awt.Color color36 = sensorPanel25.getBackground();
        int int37 = sensorPanel1.checkImage(image21, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel25);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray38 = sensorPanel25.getVetoableChangeListeners();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray38);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray38, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("");
        hardwareSensor2.notifyObservers("ADMIN_DASHBOARD");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        scheduler.user.Staff staff17 = new scheduler.user.Staff("", "REGISTRATION", "hi!", "", false);
        mainUI0.setCurrentUser((scheduler.user.User) staff17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Graphics graphics6 = null;
        sensorPanel1.paintAll(graphics6);
        java.awt.Color color8 = null;
        sensorPanel1.setForeground(color8);
        javax.swing.KeyStroke keyStroke10 = null;
        sensorPanel1.unregisterKeyboardAction(keyStroke10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.awt.event.WindowStateListener windowStateListener14 = null;
        mainUI0.removeWindowStateListener(windowStateListener14);
        java.awt.Image image16 = mainUI0.getIconImage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.repaint(10L, (int) '4', 3, (int) '4', (-1));
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Component[] componentArray14 = sensorPanel1.getComponents();
        java.beans.VetoableChangeListener vetoableChangeListener15 = null;
        sensorPanel1.removeVetoableChangeListener(vetoableChangeListener15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(componentArray14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.invalidate();
        scheduler.gui.MainUI mainUI3 = null;
        scheduler.gui.SensorPanel sensorPanel4 = new scheduler.gui.SensorPanel(mainUI3);
        java.awt.event.ContainerListener containerListener5 = null;
        sensorPanel4.removeContainerListener(containerListener5);
        java.awt.event.MouseEvent mouseEvent7 = null;
        java.lang.String str8 = sensorPanel4.getToolTipText(mouseEvent7);
        java.awt.Dimension dimension9 = sensorPanel4.minimumSize();
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = sensorPanel4.createVolatileImage(8, (-1), imageCapabilities12);
        java.awt.Image image16 = sensorPanel4.createImage(3, 1);
        java.awt.Rectangle rectangle17 = null;
        java.awt.Rectangle rectangle18 = sensorPanel4.getBounds(rectangle17);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setBounds(rectangle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(rectangle18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        boolean boolean6 = paymentPanel5.isEnabled();
        boolean boolean7 = paymentPanel5.isPaintingForPrint();
        boolean boolean8 = paymentPanel5.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        paymentPanel5.setSize(dimension15);
        boolean boolean17 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel5);
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        mainUI18.addPropertyChangeListener("hi!", propertyChangeListener20);
        java.awt.Insets insets22 = mainUI18.getInsets();
        java.awt.Rectangle rectangle23 = null;
        mainUI18.setMaximizedBounds(rectangle23);
        java.awt.Event event25 = null;
        boolean boolean28 = mainUI18.mouseDrag(event25, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension29 = mainUI18.getPreferredSize();
        java.awt.Dimension dimension30 = paymentPanel5.getSize(dimension29);
        sensorPanel3.setSize(dimension30);
        boolean boolean32 = sensorPanel3.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.PaymentPanel paymentPanel34 = new scheduler.gui.PaymentPanel(mainUI33);
        boolean boolean35 = paymentPanel34.isEnabled();
        boolean boolean36 = paymentPanel34.isPaintingForPrint();
        boolean boolean37 = paymentPanel34.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.Dimension dimension44 = sensorPanel39.minimumSize();
        paymentPanel34.setSize(dimension44);
        boolean boolean46 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel34);
        scheduler.gui.MainUI mainUI47 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        mainUI47.addPropertyChangeListener("hi!", propertyChangeListener49);
        java.awt.Insets insets51 = mainUI47.getInsets();
        java.awt.Rectangle rectangle52 = null;
        mainUI47.setMaximizedBounds(rectangle52);
        java.awt.Event event54 = null;
        boolean boolean57 = mainUI47.mouseDrag(event54, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension58 = mainUI47.getPreferredSize();
        java.awt.Dimension dimension59 = paymentPanel34.getSize(dimension58);
        sensorPanel3.setMinimumSize(dimension59);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(insets22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(insets51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertNotNull(dimension59);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        scheduler.gui.RoomManagementPanel roomManagementPanel8 = new scheduler.gui.RoomManagementPanel(mainUI0);
        java.awt.PopupMenu popupMenu9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.add(popupMenu9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        sensorPanel30.removeInputMethodListener(inputMethodListener35);
        java.awt.Component component39 = sensorPanel30.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.lang.String str44 = sensorPanel41.toString();
        java.awt.MenuComponent menuComponent45 = null;
        sensorPanel41.remove(menuComponent45);
        java.awt.Component[] componentArray47 = sensorPanel41.getComponents();
        javax.swing.TransferHandler transferHandler48 = null;
        sensorPanel41.setTransferHandler(transferHandler48);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Graphics graphics56 = null;
        sensorPanel51.paintAll(graphics56);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.PaymentPanel paymentPanel59 = new scheduler.gui.PaymentPanel(mainUI58);
        boolean boolean60 = paymentPanel59.isEnabled();
        boolean boolean61 = paymentPanel59.isPaintingForPrint();
        paymentPanel59.hide();
        java.awt.Dimension dimension63 = paymentPanel59.getMaximumSize();
        sensorPanel51.setMaximumSize(dimension63);
        sensorPanel41.setMaximumSize(dimension63);
        sensorPanel30.resize(dimension63);
        sensorPanel19.setMinimumSize(dimension63);
        sensorPanel19.enable(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(component39);
        org.junit.Assert.assertNotNull(componentArray47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dimension63);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.Dimension dimension20 = sensorPanel15.minimumSize();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        sensorPanel22.transferFocus();
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = sensorPanel22.createImage(imageProducer28);
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.lang.String str37 = sensorPanel33.getToolTipText(mouseEvent36);
        java.awt.Insets insets38 = sensorPanel33.getInsets();
        int int39 = sensorPanel15.checkImage(image29, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel33);
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.SensorPanel sensorPanel43 = new scheduler.gui.SensorPanel(mainUI42);
        java.awt.event.ContainerListener containerListener44 = null;
        sensorPanel43.removeContainerListener(containerListener44);
        java.awt.event.MouseEvent mouseEvent46 = null;
        java.lang.String str47 = sensorPanel43.getToolTipText(mouseEvent46);
        java.awt.Insets insets48 = sensorPanel43.getInsets();
        boolean boolean49 = sensorPanel43.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener50 = null;
        sensorPanel43.addContainerListener(containerListener50);
        int int52 = mainUI0.checkImage(image29, 32, 1, (java.awt.image.ImageObserver) sensorPanel43);
        mainUI0.removeNotify();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(insets38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(insets48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.updateUI();
        sensorPanel1.resetKeyboardActions();
        org.junit.Assert.assertNotNull(componentArray7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.list(printWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        java.awt.im.InputMethodRequests inputMethodRequests18 = sensorPanel1.getInputMethodRequests();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(inputMethodRequests18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str0 = scheduler.gui.MainUI.PAYMENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PAYMENT" + "'", str0, "PAYMENT");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        java.awt.event.KeyListener[] keyListenerArray18 = sensorPanel1.getKeyListeners();
        int int19 = sensorPanel1.getDebugGraphicsOptions();
        javax.swing.ActionMap actionMap20 = null;
        sensorPanel1.setActionMap(actionMap20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.nio.file.Path path0 = scheduler.database.CsvDatabase.BOOKINGS_FILE;
        java.util.List<java.lang.String[]> strArrayList1 = scheduler.database.CsvDatabase.read(path0);
        scheduler.database.CsvDatabase.append(path0, "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        scheduler.database.CsvDatabase.append(path0, "LOGIN");
        org.junit.Assert.assertNotNull(path0);
        org.junit.Assert.assertNotNull(strArrayList1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        java.awt.Cursor cursor6 = null;
        mainUI0.setCursor(cursor6);
        mainUI0.setFocusTraversalKeysEnabled(true);
        java.awt.Event event10 = null;
        boolean boolean13 = mainUI0.mouseDrag(event10, (int) ' ', 8);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.remove(128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 128");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        boolean boolean6 = mainUI0.isFocusCycleRoot();
        mainUI0.removeNotify();
        boolean boolean8 = mainUI0.isUndecorated();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color14 = null;
        sensorPanel1.setBackground(color14);
        java.awt.event.ComponentListener[] componentListenerArray16 = sensorPanel1.getComponentListeners();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        java.awt.event.KeyListener[] keyListenerArray18 = sensorPanel1.getKeyListeners();
        int int19 = sensorPanel1.getDebugGraphicsOptions();
        java.awt.Component component22 = sensorPanel1.findComponentAt(4, 1);
        boolean boolean23 = sensorPanel1.isFocusTraversalPolicySet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(component22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        java.awt.Graphics graphics9 = null;
        chiefCoordinatorDashboardPanel2.paintAll(graphics9);
        chiefCoordinatorDashboardPanel2.updateUI();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("");
        java.lang.String str7 = hardwareSensor2.getSensorID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SENSOR" + "'", str7, "SENSOR");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.cancel();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking0.checkIn();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: A cancelled booking cannot be checked in.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.nio.file.Path path0 = scheduler.database.CsvDatabase.ACCOUNTS_FILE;
        scheduler.database.CsvDatabase.append(path0, "SENSOR");
        org.junit.Assert.assertNotNull(path0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        mainUI0.show(true);
        java.awt.event.InputMethodListener[] inputMethodListenerArray16 = mainUI0.getInputMethodListeners();
        boolean boolean17 = mainUI0.isAlwaysOnTop();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setOpacity((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(inputMethodListenerArray16);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray16, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        mainUI0.setLocation((int) ' ', 0);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        java.awt.MenuComponent menuComponent25 = null;
        mainUI0.remove(menuComponent25);
        java.awt.event.WindowStateListener windowStateListener27 = null;
        mainUI0.removeWindowStateListener(windowStateListener27);
        mainUI0.setResizable(false);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Shape shape8 = mainUI0.getShape();
        boolean boolean9 = mainUI0.isFocused();
        java.awt.Event event10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mainUI0.postEvent(event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.showPaymentPanel("ADMIN_DASHBOARD", localDateTime11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        boolean boolean6 = mainUI0.isResizable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager5 = new scheduler.booking.BookingManager();
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager5);
        bookingManager5.update("Room Booking System");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        java.awt.Color color12 = mainUI0.getBackground();
        java.util.List<java.awt.Image> imageList13 = mainUI0.getIconImages();
        boolean boolean14 = mainUI0.isFocusCycleRoot();
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(imageList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        java.awt.Component component15 = mainUI5.getMostRecentFocusOwner();
        java.awt.Event event16 = null;
        boolean boolean18 = component15.keyUp(event16, 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        javax.swing.JLayeredPane jLayeredPane61 = mainUI8.getLayeredPane();
        mainUI0.setLayeredPane(jLayeredPane61);
        java.awt.event.MouseEvent mouseEvent63 = null;
        java.awt.Point point64 = jLayeredPane61.getPopupLocation(mouseEvent63);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane61);
        org.junit.Assert.assertNull(point64);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        mainUI8.addWindowFocusListener(windowFocusListener11);
        boolean boolean13 = mainUI8.isFocusableWindow();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        sensorPanel15.removeInputMethodListener(inputMethodListener20);
        sensorPanel15.enable();
        java.awt.Point point23 = sensorPanel15.location();
        mainUI8.setLocation(point23);
        mainUI8.setFocusableWindowState(false);
        java.awt.Dimension dimension27 = mainUI8.getSize();
        sensorPanel1.resize(dimension27);
        boolean boolean29 = sensorPanel1.isFontSet();
        int int30 = sensorPanel1.getHeight();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 650 + "'", int30 == 650);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Shape shape4 = mainUI0.getShape();
        java.awt.event.ContainerListener[] containerListenerArray5 = mainUI0.getContainerListeners();
        java.awt.BufferCapabilities bufferCapabilities7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.createBufferStrategy(1047, bufferCapabilities7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(containerListenerArray5);
        org.junit.Assert.assertArrayEquals(containerListenerArray5, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        javax.swing.TransferHandler transferHandler8 = null;
        sensorPanel1.setTransferHandler(transferHandler8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Dimension dimension16 = sensorPanel11.minimumSize();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        sensorPanel18.transferFocus();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = sensorPanel18.createImage(imageProducer24);
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        java.awt.Insets insets34 = sensorPanel29.getInsets();
        int int35 = sensorPanel11.checkImage(image25, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel29);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        sensorPanel29.addPropertyChangeListener("hi!", propertyChangeListener37);
        java.awt.Color color39 = sensorPanel29.getForeground();
        sensorPanel1.setForeground(color39);
        sensorPanel1.resetKeyboardActions();
        sensorPanel1.enableInputMethods(true);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        java.awt.Event event25 = null;
        boolean boolean28 = mainUI0.mouseDown(event25, 8, 83);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        java.awt.Dimension dimension17 = sensorPanel12.minimumSize();
        java.awt.ImageCapabilities imageCapabilities20 = null;
        java.awt.image.VolatileImage volatileImage21 = sensorPanel12.createVolatileImage(8, (-1), imageCapabilities20);
        java.awt.Image image24 = sensorPanel12.createImage(3, 1);
        javax.swing.KeyStroke keyStroke25 = null;
        int int26 = sensorPanel12.getConditionForKeyStroke(keyStroke25);
        javax.swing.border.Border border27 = sensorPanel12.getBorder();
        sensorPanel1.setBorder(border27);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNull(volatileImage21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(border27);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        java.lang.Object obj9 = loginPanel8.getTreeLock();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            loginPanel8.list(printWriter10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        java.lang.Class<?> wildcardClass5 = focusListenerArray4.getClass();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel1);
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        mainUI14.addPropertyChangeListener("hi!", propertyChangeListener16);
        java.awt.Insets insets18 = mainUI14.getInsets();
        java.awt.Rectangle rectangle19 = null;
        mainUI14.setMaximizedBounds(rectangle19);
        java.awt.Event event21 = null;
        boolean boolean24 = mainUI14.mouseDrag(event21, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension25 = mainUI14.getPreferredSize();
        java.awt.Dimension dimension26 = paymentPanel1.getSize(dimension25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.lang.String str31 = sensorPanel28.toString();
        java.awt.MenuComponent menuComponent32 = null;
        sensorPanel28.remove(menuComponent32);
        java.awt.Component[] componentArray34 = sensorPanel28.getComponents();
        java.awt.LayoutManager layoutManager35 = sensorPanel28.getLayout();
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        java.awt.Dimension dimension42 = sensorPanel37.minimumSize();
        java.awt.ImageCapabilities imageCapabilities45 = null;
        java.awt.image.VolatileImage volatileImage46 = sensorPanel37.createVolatileImage(8, (-1), imageCapabilities45);
        java.awt.Image image49 = sensorPanel37.createImage(3, 1);
        java.awt.Rectangle rectangle50 = null;
        java.awt.Rectangle rectangle51 = sensorPanel37.getBounds(rectangle50);
        sensorPanel28.paintImmediately(rectangle51);
        paymentPanel1.repaint(rectangle51);
        javax.swing.event.AncestorListener ancestorListener54 = null;
        paymentPanel1.removeAncestorListener(ancestorListener54);
        paymentPanel1.firePropertyChange("ADMIN_DASHBOARD", 0.0f, (float) 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(componentArray34);
        org.junit.Assert.assertNotNull(layoutManager35);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertNull(volatileImage46);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(rectangle51);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        mainUI11.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        mainUI11.addWindowFocusListener(windowFocusListener14);
        boolean boolean16 = mainUI11.isFocusableWindow();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        sensorPanel18.removeInputMethodListener(inputMethodListener23);
        sensorPanel18.enable();
        java.awt.Point point26 = sensorPanel18.location();
        mainUI11.setLocation(point26);
        mainUI0.setLocation(point26);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.lang.String str33 = sensorPanel30.toString();
        java.awt.MenuComponent menuComponent34 = null;
        sensorPanel30.remove(menuComponent34);
        java.awt.Component[] componentArray36 = sensorPanel30.getComponents();
        javax.swing.TransferHandler transferHandler37 = null;
        sensorPanel30.setTransferHandler(transferHandler37);
        scheduler.gui.MainUI mainUI39 = new scheduler.gui.MainUI();
        java.awt.Component component40 = mainUI39.getGlassPane();
        javax.swing.JMenuBar jMenuBar41 = mainUI39.getJMenuBar();
        mainUI39.setState((int) (short) 0);
        mainUI39.setLocation(0, 64);
        java.awt.Color color47 = mainUI39.getBackground();
        scheduler.gui.MainUI mainUI48 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        mainUI48.addPropertyChangeListener("hi!", propertyChangeListener50);
        java.awt.Insets insets52 = mainUI48.getInsets();
        java.awt.Rectangle rectangle53 = null;
        mainUI48.setMaximizedBounds(rectangle53);
        mainUI48.toBack();
        scheduler.gui.MainUI mainUI56 = new scheduler.gui.MainUI();
        mainUI56.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel59 = new scheduler.gui.AdminDashboardPanel(mainUI56);
        java.awt.Graphics graphics60 = mainUI56.getGraphics();
        mainUI48.paint(graphics60);
        mainUI39.paintComponents(graphics60);
        sensorPanel30.update(graphics60);
        mainUI0.paint(graphics60);
        java.awt.Color color65 = mainUI0.getBackground();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(componentArray36);
        org.junit.Assert.assertNotNull(component40);
        org.junit.Assert.assertNull(jMenuBar41);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(insets52);
        org.junit.Assert.assertNotNull(graphics60);
        org.junit.Assert.assertNotNull(color65);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.String str0 = scheduler.gui.MainUI.CHIEF_COORDINATOR_DASHBOARD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CHIEF_COORDINATOR_DASHBOARD" + "'", str0, "CHIEF_COORDINATOR_DASHBOARD");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        scheduler.gui.RoomManagementPanel roomManagementPanel8 = new scheduler.gui.RoomManagementPanel(mainUI0);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.PaymentPanel paymentPanel10 = new scheduler.gui.PaymentPanel(mainUI9);
        boolean boolean11 = paymentPanel10.isEnabled();
        boolean boolean12 = paymentPanel10.isPaintingForPrint();
        boolean boolean13 = paymentPanel10.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.Dimension dimension20 = sensorPanel15.minimumSize();
        paymentPanel10.setSize(dimension20);
        boolean boolean22 = paymentPanel10.isRequestFocusEnabled();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = sensorPanel24.getToolTipText(mouseEvent27);
        java.awt.Dimension dimension29 = sensorPanel24.minimumSize();
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        sensorPanel31.transferFocus();
        java.awt.image.ImageProducer imageProducer37 = null;
        java.awt.Image image38 = sensorPanel31.createImage(imageProducer37);
        scheduler.gui.MainUI mainUI41 = null;
        scheduler.gui.SensorPanel sensorPanel42 = new scheduler.gui.SensorPanel(mainUI41);
        java.awt.event.ContainerListener containerListener43 = null;
        sensorPanel42.removeContainerListener(containerListener43);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.lang.String str46 = sensorPanel42.getToolTipText(mouseEvent45);
        java.awt.Insets insets47 = sensorPanel42.getInsets();
        int int48 = sensorPanel24.checkImage(image38, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel42);
        java.awt.event.InputMethodListener[] inputMethodListenerArray49 = sensorPanel42.getInputMethodListeners();
        java.awt.Rectangle rectangle50 = sensorPanel42.getBounds();
        java.awt.event.MouseEvent mouseEvent51 = null;
        java.awt.Point point52 = sensorPanel42.getToolTipLocation(mouseEvent51);
        roomManagementPanel8.add((java.awt.Component) paymentPanel10, (java.lang.Object) mouseEvent51);
        paymentPanel10.setAlignmentY((float) 0L);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(image38);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(insets47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray49);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray49, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(rectangle50);
        org.junit.Assert.assertNull(point52);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel1);
        java.awt.Event event14 = null;
        boolean boolean17 = paymentPanel1.mouseExit(event14, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.enable();
        sensorPanel1.layout();
        sensorPanel1.setVerifyInputWhenFocusTarget(true);
        int int12 = sensorPanel1.getY();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        javax.swing.TransferHandler transferHandler13 = mainUI0.getTransferHandler();
        mainUI0.setEnabled(true);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(transferHandler13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        java.awt.event.KeyListener keyListener7 = null;
        mainUI0.addKeyListener(keyListener7);
        float float9 = mainUI0.getOpacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        javax.swing.JToolTip jToolTip11 = sensorPanel1.createToolTip();
        boolean boolean12 = jToolTip11.getInheritsPopupMenu();
        boolean boolean13 = jToolTip11.getVerifyInputWhenFocusTarget();
        jToolTip11.firePropertyChange("Room Booking System", (double) 6, (double) 2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(jToolTip11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        boolean boolean26 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) sensorPanel1);
        java.awt.LayoutManager layoutManager27 = null;
        sensorPanel1.setLayout(layoutManager27);
        java.awt.ComponentOrientation componentOrientation29 = null;
        sensorPanel1.setComponentOrientation(componentOrientation29);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.MainUI mainUI2 = null;
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI2);
        java.awt.event.ContainerListener containerListener4 = null;
        sensorPanel3.removeContainerListener(containerListener4);
        java.awt.event.MouseEvent mouseEvent6 = null;
        java.lang.String str7 = sensorPanel3.getToolTipText(mouseEvent6);
        java.awt.Graphics graphics8 = null;
        sensorPanel3.paintAll(graphics8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Dimension dimension16 = sensorPanel11.minimumSize();
        java.awt.ImageCapabilities imageCapabilities19 = null;
        java.awt.image.VolatileImage volatileImage20 = sensorPanel11.createVolatileImage(8, (-1), imageCapabilities19);
        java.awt.Image image23 = sensorPanel11.createImage(3, 1);
        java.awt.Graphics graphics24 = sensorPanel11.getGraphics();
        java.awt.Font font25 = sensorPanel11.getFont();
        java.awt.FontMetrics fontMetrics26 = sensorPanel3.getFontMetrics(font25);
        mainUI0.setFont(font25);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(volatileImage20);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(graphics24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(fontMetrics26);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        java.awt.Window window5 = mainUI0.getOwner();
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertNull(window5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("MY_BOOKINGS", "Room Booking System", "PAYMENT", "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        sensorPanel1.resetKeyboardActions();
        int int5 = sensorPanel1.getComponentCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.awt.Component component9 = mainUI8.getGlassPane();
        javax.swing.JMenuBar jMenuBar10 = mainUI8.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI8);
        mainUI0.setLocationRelativeTo((java.awt.Component) mainUI8);
        java.awt.Event event13 = null;
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.Dimension dimension20 = sensorPanel15.minimumSize();
        java.awt.ImageCapabilities imageCapabilities23 = null;
        java.awt.image.VolatileImage volatileImage24 = sensorPanel15.createVolatileImage(8, (-1), imageCapabilities23);
        java.awt.Image image27 = sensorPanel15.createImage(3, 1);
        java.awt.Rectangle rectangle28 = null;
        java.awt.Rectangle rectangle29 = sensorPanel15.getBounds(rectangle28);
        boolean boolean30 = mainUI8.action(event13, (java.lang.Object) rectangle28);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNull(jMenuBar10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(volatileImage24);
        org.junit.Assert.assertNull(image27);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = paymentPanel1.getPropertyChangeListeners("");
        java.awt.Dimension dimension7 = paymentPanel1.preferredSize();
        paymentPanel1.revalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray6, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        scheduler.payment.CreditCardPayment creditCardPayment0 = new scheduler.payment.CreditCardPayment();
        boolean boolean2 = creditCardPayment0.processTransaction((double) 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        javax.swing.TransferHandler transferHandler8 = null;
        sensorPanel1.setTransferHandler(transferHandler8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Dimension dimension16 = sensorPanel11.minimumSize();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        sensorPanel18.transferFocus();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = sensorPanel18.createImage(imageProducer24);
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        java.awt.Insets insets34 = sensorPanel29.getInsets();
        int int35 = sensorPanel11.checkImage(image25, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel29);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        sensorPanel29.addPropertyChangeListener("hi!", propertyChangeListener37);
        java.awt.Color color39 = sensorPanel29.getForeground();
        sensorPanel1.setForeground(color39);
        sensorPanel1.removeNotify();
        sensorPanel1.layout();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.awt.im.InputContext inputContext26 = sensorPanel1.getInputContext();
        java.awt.event.FocusEvent.Cause cause27 = null;
        sensorPanel1.requestFocus(cause27);
        sensorPanel1.invalidate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(inputContext26);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        paymentPanel5.firePropertyChange("hi!", 'a', ' ');
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        javax.swing.TransferHandler transferHandler11 = mainUI0.getTransferHandler();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Graphics graphics18 = null;
        sensorPanel13.paintAll(graphics18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.SensorPanel sensorPanel21 = new scheduler.gui.SensorPanel(mainUI20);
        java.awt.event.ContainerListener containerListener22 = null;
        sensorPanel21.removeContainerListener(containerListener22);
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.lang.String str25 = sensorPanel21.getToolTipText(mouseEvent24);
        java.awt.Dimension dimension26 = sensorPanel21.minimumSize();
        java.awt.ImageCapabilities imageCapabilities29 = null;
        java.awt.image.VolatileImage volatileImage30 = sensorPanel21.createVolatileImage(8, (-1), imageCapabilities29);
        java.awt.Image image33 = sensorPanel21.createImage(3, 1);
        java.awt.Graphics graphics34 = sensorPanel21.getGraphics();
        java.awt.Font font35 = sensorPanel21.getFont();
        java.awt.FontMetrics fontMetrics36 = sensorPanel13.getFontMetrics(font35);
        mainUI0.setFont(font35);
        mainUI0.showAdministratorBookings();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(transferHandler11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNull(volatileImage30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertNull(graphics34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(fontMetrics36);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        javax.swing.TransferHandler transferHandler6 = null;
        mainUI0.setTransferHandler(transferHandler6);
        java.awt.im.InputContext inputContext8 = mainUI0.getInputContext();
        boolean boolean9 = mainUI0.isShowing();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle("PAYMENT");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name PAYMENT, locale en_US");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(inputContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        java.awt.Toolkit toolkit4 = mainUI0.getToolkit();
        java.awt.image.BufferStrategy bufferStrategy5 = mainUI0.getBufferStrategy();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(toolkit4);
        org.junit.Assert.assertNull(bufferStrategy5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        javax.swing.JRootPane jRootPane14 = mainUI0.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point15 = jRootPane14.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = new scheduler.gui.MainUI();
        java.awt.Component component3 = mainUI2.getGlassPane();
        mainUI2.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mainUI2.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        mainUI2.show();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.lang.String str14 = sensorPanel11.toString();
        java.awt.MenuComponent menuComponent15 = null;
        sensorPanel11.remove(menuComponent15);
        java.awt.Component[] componentArray17 = sensorPanel11.getComponents();
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        mainUI18.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI18.addWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI18.isFocusableWindow();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        sensorPanel25.enable();
        java.awt.Point point33 = sensorPanel25.location();
        mainUI18.setLocation(point33);
        mainUI18.setFocusableWindowState(false);
        java.awt.Dimension dimension37 = mainUI18.getSize();
        sensorPanel11.resize(dimension37);
        paymentPanel1.putClientProperty((java.lang.Object) mainUI2, (java.lang.Object) sensorPanel11);
        int int42 = paymentPanel1.getBaseline((int) (byte) 0, 64);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        scheduler.gui.MainUI mainUI25 = new scheduler.gui.MainUI();
        mainUI25.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener28 = null;
        mainUI25.addWindowFocusListener(windowFocusListener28);
        boolean boolean30 = mainUI25.isFocusableWindow();
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.awt.event.MouseEvent mouseEvent35 = null;
        java.lang.String str36 = sensorPanel32.getToolTipText(mouseEvent35);
        java.awt.event.InputMethodListener inputMethodListener37 = null;
        sensorPanel32.removeInputMethodListener(inputMethodListener37);
        sensorPanel32.enable();
        java.awt.Point point40 = sensorPanel32.location();
        mainUI25.setLocation(point40);
        mainUI25.setFocusableWindowState(false);
        javax.accessibility.AccessibleContext accessibleContext44 = mainUI25.getAccessibleContext();
        java.awt.Window.Type type45 = mainUI25.getType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setType(type45);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(point40);
        org.junit.Assert.assertNotNull(accessibleContext44);
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + java.awt.Window.Type.NORMAL + "'", type45.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.GraphicsConfiguration graphicsConfiguration11 = mainUI0.getGraphicsConfiguration();
        mainUI0.firePropertyChange("", ' ', 'a');
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(graphicsConfiguration11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        java.awt.Container container6 = mainUI0.getContentPane();
        java.awt.Event event7 = null;
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        sensorPanel9.removeInputMethodListener(inputMethodListener14);
        java.awt.Event event16 = null;
        boolean boolean19 = sensorPanel9.mouseEnter(event16, 3, (int) (short) 100);
        java.awt.Color color20 = sensorPanel9.getBackground();
        sensorPanel9.nextFocus();
        sensorPanel9.transferFocusBackward();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray23 = sensorPanel9.getMouseMotionListeners();
        boolean boolean24 = mainUI0.gotFocus(event7, (java.lang.Object) sensorPanel9);
        java.awt.Shape shape25 = mainUI0.getShape();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(container6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray23);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray23, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.cancel();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime4 = booking0.getStartTime();
        booking0.cancel();
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        double double4 = booking0.calculateFinalCost();
        double double6 = booking0.calculateFinalCost((int) (short) -1);
        double double7 = booking0.calculateFinalCost();
        java.time.LocalDateTime localDateTime8 = booking0.getEndTime();
        scheduler.pricing.StaffPricing staffPricing9 = new scheduler.pricing.StaffPricing();
        double double10 = staffPricing9.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing9);
        booking0.cancel();
        booking0.setBookingID("MY_BOOKINGS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        int int27 = mainUI0.countComponents();
        java.awt.Event event28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = mainUI0.postEvent(event28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        paymentPanel1.reshape(0, (int) (byte) 1, (int) (short) 1, 128);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
        java.awt.AWTEvent aWTEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.dispatchEvent(aWTEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        java.awt.MenuComponent menuComponent5 = null;
        paymentPanel1.remove(menuComponent5);
        paymentPanel1.transferFocusUpCycle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        booking0.checkIn();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) (short) 0);
        java.awt.event.ComponentListener componentListener6 = null;
        mainUI0.removeComponentListener(componentListener6);
        java.awt.Container container8 = mainUI0.getFocusCycleRootAncestor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        mainUI0.firePropertyChange("", (long) 64, 10L);
        int int8 = mainUI0.getWidth();
        mainUI0.resize((int) ' ', (int) '4');
        java.awt.event.WindowFocusListener[] windowFocusListenerArray12 = mainUI0.getWindowFocusListeners();
        float float13 = mainUI0.getOpacity();
        boolean boolean14 = mainUI0.isLightweight();
        mainUI0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray16 = mainUI0.getWindowStateListeners();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(windowStateListenerArray16);
        org.junit.Assert.assertArrayEquals(windowStateListenerArray16, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        javax.swing.JRootPane jRootPane14 = mainUI0.getRootPane();
        mainUI0.setAlwaysOnTop(false);
        java.awt.BufferCapabilities bufferCapabilities18 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.createBufferStrategy((int) (byte) -1, bufferCapabilities18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            jPopupMenu6.resetKeyboardActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        javax.swing.KeyStroke keyStroke14 = null;
        int int15 = sensorPanel1.getConditionForKeyStroke(keyStroke14);
        javax.swing.border.Border border16 = sensorPanel1.getBorder();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.PaymentPanel paymentPanel18 = new scheduler.gui.PaymentPanel(mainUI17);
        boolean boolean19 = paymentPanel18.isEnabled();
        boolean boolean20 = paymentPanel18.isPaintingForPrint();
        boolean boolean21 = paymentPanel18.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI22 = new scheduler.gui.MainUI();
        mainUI22.setTitle("REGISTRATION");
        int int25 = mainUI22.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener26 = null;
        mainUI22.removeWindowFocusListener(windowFocusListener26);
        javax.swing.TransferHandler transferHandler28 = null;
        mainUI22.setTransferHandler(transferHandler28);
        java.awt.im.InputContext inputContext30 = mainUI22.getInputContext();
        paymentPanel18.setNextFocusableComponent((java.awt.Component) mainUI22);
        javax.swing.JLayeredPane jLayeredPane32 = mainUI22.getLayeredPane();
        java.awt.Dimension dimension33 = jLayeredPane32.getMaximumSize();
        sensorPanel1.setMinimumSize(dimension33);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(border16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(inputContext30);
        org.junit.Assert.assertNotNull(jLayeredPane32);
        org.junit.Assert.assertNotNull(dimension33);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        mainUI0.removeMouseMotionListener(mouseMotionListener6);
        java.awt.event.WindowFocusListener windowFocusListener8 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.setVerifyInputWhenFocusTarget(false);
        boolean boolean10 = sensorPanel1.isOpaque();
        sensorPanel1.setLocation(3, (int) (byte) -1);
        javax.swing.InputMap inputMap15 = sensorPanel1.getInputMap((int) (byte) 1);
        float float16 = sensorPanel1.getAlignmentX();
        sensorPanel1.revalidate();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(inputMap15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Graphics graphics6 = null;
        sensorPanel1.paintAll(graphics6);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.Dimension dimension14 = sensorPanel9.minimumSize();
        java.awt.ImageCapabilities imageCapabilities17 = null;
        java.awt.image.VolatileImage volatileImage18 = sensorPanel9.createVolatileImage(8, (-1), imageCapabilities17);
        java.awt.Image image21 = sensorPanel9.createImage(3, 1);
        java.awt.Graphics graphics22 = sensorPanel9.getGraphics();
        java.awt.Font font23 = sensorPanel9.getFont();
        java.awt.FontMetrics fontMetrics24 = sensorPanel1.getFontMetrics(font23);
        sensorPanel1.firePropertyChange("ADMIN_DASHBOARD", (int) 'a', (int) (byte) 0);
        java.beans.VetoableChangeListener vetoableChangeListener29 = null;
        sensorPanel1.removeVetoableChangeListener(vetoableChangeListener29);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(volatileImage18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(graphics22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(fontMetrics24);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        mainUI0.removeMouseMotionListener(mouseMotionListener6);
        java.lang.String str8 = mainUI0.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "REGISTRATION" + "'", str8, "REGISTRATION");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (double) (short) 1, (double) 16);
        javax.swing.KeyStroke keyStroke14 = null;
        int int15 = sensorPanel1.getConditionForKeyStroke(keyStroke14);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray16 = sensorPanel1.getHierarchyBoundsListeners();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray16);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray16, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        int int27 = mainUI0.countComponents();
        java.awt.Point point28 = mainUI0.getMousePosition();
        java.awt.Point point29 = mainUI0.getMousePosition();
        mainUI0.removeNotify();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(point28);
        org.junit.Assert.assertNull(point29);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        paymentPanel1.firePropertyChange("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        sensorPanel1.reshape(12, 8, 650, (int) (byte) -1);
        java.awt.Color color12 = sensorPanel1.getBackground();
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        java.awt.event.KeyListener keyListener7 = null;
        mainUI0.addKeyListener(keyListener7);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel1);
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        mainUI14.addPropertyChangeListener("hi!", propertyChangeListener16);
        java.awt.Insets insets18 = mainUI14.getInsets();
        java.awt.Rectangle rectangle19 = null;
        mainUI14.setMaximizedBounds(rectangle19);
        java.awt.Event event21 = null;
        boolean boolean24 = mainUI14.mouseDrag(event21, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension25 = mainUI14.getPreferredSize();
        java.awt.Dimension dimension26 = paymentPanel1.getSize(dimension25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.SensorPanel sensorPanel28 = new scheduler.gui.SensorPanel(mainUI27);
        java.awt.event.ContainerListener containerListener29 = null;
        sensorPanel28.removeContainerListener(containerListener29);
        java.lang.String str31 = sensorPanel28.toString();
        java.awt.MenuComponent menuComponent32 = null;
        sensorPanel28.remove(menuComponent32);
        java.awt.Component[] componentArray34 = sensorPanel28.getComponents();
        java.awt.LayoutManager layoutManager35 = sensorPanel28.getLayout();
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        java.awt.Dimension dimension42 = sensorPanel37.minimumSize();
        java.awt.ImageCapabilities imageCapabilities45 = null;
        java.awt.image.VolatileImage volatileImage46 = sensorPanel37.createVolatileImage(8, (-1), imageCapabilities45);
        java.awt.Image image49 = sensorPanel37.createImage(3, 1);
        java.awt.Rectangle rectangle50 = null;
        java.awt.Rectangle rectangle51 = sensorPanel37.getBounds(rectangle50);
        sensorPanel28.paintImmediately(rectangle51);
        paymentPanel1.repaint(rectangle51);
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI54);
        java.awt.event.ContainerListener containerListener56 = null;
        sensorPanel55.removeContainerListener(containerListener56);
        java.lang.String str58 = sensorPanel55.toString();
        java.awt.MenuComponent menuComponent59 = null;
        sensorPanel55.remove(menuComponent59);
        java.awt.Component[] componentArray61 = sensorPanel55.getComponents();
        javax.swing.TransferHandler transferHandler62 = null;
        sensorPanel55.setTransferHandler(transferHandler62);
        scheduler.gui.MainUI mainUI64 = new scheduler.gui.MainUI();
        java.awt.Component component65 = mainUI64.getGlassPane();
        javax.swing.JMenuBar jMenuBar66 = mainUI64.getJMenuBar();
        mainUI64.setState((int) (short) 0);
        mainUI64.setLocation(0, 64);
        java.awt.Color color72 = mainUI64.getBackground();
        scheduler.gui.MainUI mainUI73 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        mainUI73.addPropertyChangeListener("hi!", propertyChangeListener75);
        java.awt.Insets insets77 = mainUI73.getInsets();
        java.awt.Rectangle rectangle78 = null;
        mainUI73.setMaximizedBounds(rectangle78);
        mainUI73.toBack();
        scheduler.gui.MainUI mainUI81 = new scheduler.gui.MainUI();
        mainUI81.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel84 = new scheduler.gui.AdminDashboardPanel(mainUI81);
        java.awt.Graphics graphics85 = mainUI81.getGraphics();
        mainUI73.paint(graphics85);
        mainUI64.paintComponents(graphics85);
        sensorPanel55.update(graphics85);
        paymentPanel1.print(graphics85);
        java.awt.Dimension dimension90 = paymentPanel1.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(componentArray34);
        org.junit.Assert.assertNotNull(layoutManager35);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertNull(volatileImage46);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(rectangle51);
        org.junit.Assert.assertNotNull(componentArray61);
        org.junit.Assert.assertNotNull(component65);
        org.junit.Assert.assertNull(jMenuBar66);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(insets77);
        org.junit.Assert.assertNotNull(graphics85);
        org.junit.Assert.assertNotNull(dimension90);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        javax.swing.JLayeredPane jLayeredPane15 = mainUI5.getLayeredPane();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.lang.String str20 = sensorPanel17.toString();
        java.awt.MenuComponent menuComponent21 = null;
        sensorPanel17.remove(menuComponent21);
        java.awt.Component[] componentArray23 = sensorPanel17.getComponents();
        javax.swing.TransferHandler transferHandler24 = null;
        sensorPanel17.setTransferHandler(transferHandler24);
        java.awt.Toolkit toolkit26 = sensorPanel17.getToolkit();
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        mainUI27.setTitle("REGISTRATION");
        int int30 = mainUI27.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        mainUI27.addPropertyChangeListener("REGISTRATION", propertyChangeListener32);
        scheduler.gui.UserDashboardPanel userDashboardPanel34 = new scheduler.gui.UserDashboardPanel(mainUI27);
        java.awt.Component component37 = mainUI27.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI38 = new scheduler.gui.MainUI();
        mainUI38.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener41 = null;
        mainUI38.addWindowFocusListener(windowFocusListener41);
        boolean boolean43 = mainUI38.isFocusableWindow();
        scheduler.gui.MainUI mainUI44 = null;
        scheduler.gui.SensorPanel sensorPanel45 = new scheduler.gui.SensorPanel(mainUI44);
        java.awt.event.ContainerListener containerListener46 = null;
        sensorPanel45.removeContainerListener(containerListener46);
        java.awt.event.MouseEvent mouseEvent48 = null;
        java.lang.String str49 = sensorPanel45.getToolTipText(mouseEvent48);
        java.awt.event.InputMethodListener inputMethodListener50 = null;
        sensorPanel45.removeInputMethodListener(inputMethodListener50);
        sensorPanel45.enable();
        java.awt.Point point53 = sensorPanel45.location();
        mainUI38.setLocation(point53);
        mainUI27.setLocation(point53);
        scheduler.gui.MainUI mainUI56 = null;
        scheduler.gui.SensorPanel sensorPanel57 = new scheduler.gui.SensorPanel(mainUI56);
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel57.removeContainerListener(containerListener58);
        java.lang.String str60 = sensorPanel57.toString();
        java.awt.MenuComponent menuComponent61 = null;
        sensorPanel57.remove(menuComponent61);
        java.awt.Component[] componentArray63 = sensorPanel57.getComponents();
        javax.swing.TransferHandler transferHandler64 = null;
        sensorPanel57.setTransferHandler(transferHandler64);
        scheduler.gui.MainUI mainUI66 = new scheduler.gui.MainUI();
        java.awt.Component component67 = mainUI66.getGlassPane();
        javax.swing.JMenuBar jMenuBar68 = mainUI66.getJMenuBar();
        mainUI66.setState((int) (short) 0);
        mainUI66.setLocation(0, 64);
        java.awt.Color color74 = mainUI66.getBackground();
        scheduler.gui.MainUI mainUI75 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        mainUI75.addPropertyChangeListener("hi!", propertyChangeListener77);
        java.awt.Insets insets79 = mainUI75.getInsets();
        java.awt.Rectangle rectangle80 = null;
        mainUI75.setMaximizedBounds(rectangle80);
        mainUI75.toBack();
        scheduler.gui.MainUI mainUI83 = new scheduler.gui.MainUI();
        mainUI83.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel86 = new scheduler.gui.AdminDashboardPanel(mainUI83);
        java.awt.Graphics graphics87 = mainUI83.getGraphics();
        mainUI75.paint(graphics87);
        mainUI66.paintComponents(graphics87);
        sensorPanel57.update(graphics87);
        mainUI27.paint(graphics87);
        sensorPanel17.print(graphics87);
        jLayeredPane15.print(graphics87);
        java.beans.PropertyChangeListener propertyChangeListener94 = null;
        jLayeredPane15.removePropertyChangeListener(propertyChangeListener94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNotNull(jLayeredPane15);
        org.junit.Assert.assertNotNull(componentArray23);
        org.junit.Assert.assertNotNull(toolkit26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(point53);
        org.junit.Assert.assertNotNull(componentArray63);
        org.junit.Assert.assertNotNull(component67);
        org.junit.Assert.assertNull(jMenuBar68);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(insets79);
        org.junit.Assert.assertNotNull(graphics87);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        java.awt.Dimension dimension19 = mainUI0.getSize();
        java.awt.Color color20 = mainUI0.getBackground();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        javax.swing.TransferHandler transferHandler8 = null;
        sensorPanel1.setTransferHandler(transferHandler8);
        scheduler.gui.MainUI mainUI10 = new scheduler.gui.MainUI();
        java.awt.Component component11 = mainUI10.getGlassPane();
        javax.swing.JMenuBar jMenuBar12 = mainUI10.getJMenuBar();
        mainUI10.setState((int) (short) 0);
        mainUI10.setLocation(0, 64);
        java.awt.Color color18 = mainUI10.getBackground();
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        mainUI19.addPropertyChangeListener("hi!", propertyChangeListener21);
        java.awt.Insets insets23 = mainUI19.getInsets();
        java.awt.Rectangle rectangle24 = null;
        mainUI19.setMaximizedBounds(rectangle24);
        mainUI19.toBack();
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        mainUI27.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel30 = new scheduler.gui.AdminDashboardPanel(mainUI27);
        java.awt.Graphics graphics31 = mainUI27.getGraphics();
        mainUI19.paint(graphics31);
        mainUI10.paintComponents(graphics31);
        sensorPanel1.update(graphics31);
        sensorPanel1.enableInputMethods(false);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertNull(jMenuBar12);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(insets23);
        org.junit.Assert.assertNotNull(graphics31);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray1 = mainUI0.getWindowFocusListeners();
        mainUI0.list();
        org.junit.Assert.assertNotNull(windowFocusListenerArray1);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray1, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = mainUI5.getModalExclusionType();
        scheduler.gui.RegistrationPanel registrationPanel16 = new scheduler.gui.RegistrationPanel(mainUI5);
        java.awt.MenuBar menuBar17 = mainUI5.getMenuBar();
        mainUI5.setState(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(menuBar17);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = sensorPanel1.createImage(imageProducer7);
        boolean boolean9 = sensorPanel1.isMaximumSizeSet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.invalidate();
        int int7 = sensorPanel1.getComponentCount();
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseDown(event8, 10, (int) (short) 0);
        javax.swing.event.AncestorListener ancestorListener12 = null;
        sensorPanel1.addAncestorListener(ancestorListener12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        javax.swing.TransferHandler transferHandler13 = mainUI0.getTransferHandler();
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        mainUI0.addInputMethodListener(inputMethodListener14);
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printWriter16, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(transferHandler13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        int int11 = sensorPanel1.getX();
        java.awt.event.ContainerListener[] containerListenerArray12 = sensorPanel1.getContainerListeners();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertArrayEquals(containerListenerArray12, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = new scheduler.gui.MainUI();
        java.awt.Component component3 = mainUI2.getGlassPane();
        mainUI2.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mainUI2.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        mainUI2.show();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.lang.String str14 = sensorPanel11.toString();
        java.awt.MenuComponent menuComponent15 = null;
        sensorPanel11.remove(menuComponent15);
        java.awt.Component[] componentArray17 = sensorPanel11.getComponents();
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        mainUI18.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI18.addWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI18.isFocusableWindow();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        sensorPanel25.enable();
        java.awt.Point point33 = sensorPanel25.location();
        mainUI18.setLocation(point33);
        mainUI18.setFocusableWindowState(false);
        java.awt.Dimension dimension37 = mainUI18.getSize();
        sensorPanel11.resize(dimension37);
        paymentPanel1.putClientProperty((java.lang.Object) mainUI2, (java.lang.Object) sensorPanel11);
        mainUI2.setLocationByPlatform(false);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        sensorPanel1.setFocusTraversalPolicyProvider(false);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.PaymentPanel paymentPanel11 = new scheduler.gui.PaymentPanel(mainUI10);
        boolean boolean12 = paymentPanel11.isEnabled();
        boolean boolean13 = paymentPanel11.isPaintingForPrint();
        boolean boolean14 = paymentPanel11.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray16 = paymentPanel11.getPropertyChangeListeners("");
        java.awt.Dimension dimension17 = paymentPanel11.preferredSize();
        sensorPanel1.setPreferredSize(dimension17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray16);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray16, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        boolean boolean11 = paymentPanel1.isManagingFocus();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.PaymentPanel paymentPanel13 = new scheduler.gui.PaymentPanel(mainUI12);
        boolean boolean14 = paymentPanel13.isEnabled();
        paymentPanel13.paintImmediately(8, (int) '#', 100, 10);
        scheduler.gui.MainUI mainUI20 = new scheduler.gui.MainUI();
        mainUI20.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener23 = null;
        mainUI20.addWindowFocusListener(windowFocusListener23);
        boolean boolean25 = mainUI20.isFocusableWindow();
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        sensorPanel27.removeInputMethodListener(inputMethodListener32);
        sensorPanel27.enable();
        java.awt.Point point35 = sensorPanel27.location();
        mainUI20.setLocation(point35);
        java.awt.Component component37 = paymentPanel13.getComponentAt(point35);
        java.awt.Point point38 = paymentPanel1.getLocation(point35);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point39 = paymentPanel1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(point35);
        org.junit.Assert.assertNull(component37);
        org.junit.Assert.assertNotNull(point38);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        paymentPanel1.removePropertyChangeListener("hi!", propertyChangeListener10);
        paymentPanel1.disable();
        java.awt.event.ComponentListener componentListener13 = null;
        paymentPanel1.removeComponentListener(componentListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        mainUI0.disable();
        java.awt.event.WindowListener windowListener6 = null;
        mainUI0.removeWindowListener(windowListener6);
        org.junit.Assert.assertNotNull(insets4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        mainUI0.toFront();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        boolean boolean4 = userFactory0.isStrongPassword("Room Booking System");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.User user7 = userFactory0.createUser("MY_BOOKINGS", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User details are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        boolean boolean11 = paymentPanel1.isManagingFocus();
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap13 = paymentPanel1.getInputMap(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        scheduler.user.User user4 = userFactory0.getUserByID("ROOM_BOOKING");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        float float8 = sensorPanel1.getAlignmentY();
        java.awt.Event event9 = null;
        boolean boolean12 = sensorPanel1.mouseExit(event9, 16, 32);
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        java.awt.Graphics graphics19 = null;
        sensorPanel14.paintAll(graphics19);
        java.awt.event.MouseListener mouseListener21 = null;
        sensorPanel14.addMouseListener(mouseListener21);
        java.awt.Dimension dimension23 = sensorPanel14.minimumSize();
        java.awt.Dimension dimension24 = sensorPanel1.getSize(dimension23);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray30 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet31 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet31, aWTKeyStrokeArray30);
        sensorPanel19.setFocusTraversalKeys(0, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet31);
        boolean boolean34 = sensorPanel19.isOpaque();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray30);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray30, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        mainUI0.setName("LOGIN");
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.lang.String str13 = sensorPanel10.toString();
        java.awt.MenuComponent menuComponent14 = null;
        sensorPanel10.remove(menuComponent14);
        java.awt.Component[] componentArray16 = sensorPanel10.getComponents();
        javax.swing.TransferHandler transferHandler17 = null;
        sensorPanel10.setTransferHandler(transferHandler17);
        sensorPanel10.setVisible(false);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        boolean boolean23 = paymentPanel22.isEnabled();
        boolean boolean24 = paymentPanel22.isPaintingForPrint();
        boolean boolean25 = paymentPanel22.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.Dimension dimension32 = sensorPanel27.minimumSize();
        paymentPanel22.setSize(dimension32);
        boolean boolean34 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel22);
        scheduler.gui.MainUI mainUI35 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        mainUI35.addPropertyChangeListener("hi!", propertyChangeListener37);
        java.awt.Insets insets39 = mainUI35.getInsets();
        java.awt.Rectangle rectangle40 = null;
        mainUI35.setMaximizedBounds(rectangle40);
        java.awt.Event event42 = null;
        boolean boolean45 = mainUI35.mouseDrag(event42, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension46 = mainUI35.getPreferredSize();
        java.awt.Dimension dimension47 = paymentPanel22.getSize(dimension46);
        scheduler.gui.MainUI mainUI48 = null;
        scheduler.gui.SensorPanel sensorPanel49 = new scheduler.gui.SensorPanel(mainUI48);
        java.awt.event.ContainerListener containerListener50 = null;
        sensorPanel49.removeContainerListener(containerListener50);
        java.lang.String str52 = sensorPanel49.toString();
        java.awt.MenuComponent menuComponent53 = null;
        sensorPanel49.remove(menuComponent53);
        java.awt.Component[] componentArray55 = sensorPanel49.getComponents();
        java.awt.LayoutManager layoutManager56 = sensorPanel49.getLayout();
        scheduler.gui.MainUI mainUI57 = null;
        scheduler.gui.SensorPanel sensorPanel58 = new scheduler.gui.SensorPanel(mainUI57);
        java.awt.event.ContainerListener containerListener59 = null;
        sensorPanel58.removeContainerListener(containerListener59);
        java.awt.event.MouseEvent mouseEvent61 = null;
        java.lang.String str62 = sensorPanel58.getToolTipText(mouseEvent61);
        java.awt.Dimension dimension63 = sensorPanel58.minimumSize();
        java.awt.ImageCapabilities imageCapabilities66 = null;
        java.awt.image.VolatileImage volatileImage67 = sensorPanel58.createVolatileImage(8, (-1), imageCapabilities66);
        java.awt.Image image70 = sensorPanel58.createImage(3, 1);
        java.awt.Rectangle rectangle71 = null;
        java.awt.Rectangle rectangle72 = sensorPanel58.getBounds(rectangle71);
        sensorPanel49.paintImmediately(rectangle72);
        paymentPanel22.repaint(rectangle72);
        java.awt.Rectangle rectangle75 = sensorPanel10.getBounds(rectangle72);
        mainUI0.setMixingCutoutShape((java.awt.Shape) rectangle75);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(componentArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNotNull(componentArray55);
        org.junit.Assert.assertNotNull(layoutManager56);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(dimension63);
        org.junit.Assert.assertNull(volatileImage67);
        org.junit.Assert.assertNull(image70);
        org.junit.Assert.assertNotNull(rectangle72);
        org.junit.Assert.assertNotNull(rectangle75);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        boolean boolean6 = paymentPanel5.isEnabled();
        boolean boolean7 = paymentPanel5.isPaintingForPrint();
        boolean boolean8 = paymentPanel5.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        mainUI9.setTitle("REGISTRATION");
        int int12 = mainUI9.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener13 = null;
        mainUI9.removeWindowFocusListener(windowFocusListener13);
        javax.swing.TransferHandler transferHandler15 = null;
        mainUI9.setTransferHandler(transferHandler15);
        java.awt.im.InputContext inputContext17 = mainUI9.getInputContext();
        paymentPanel5.setNextFocusableComponent((java.awt.Component) mainUI9);
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = mainUI9.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType19);
        scheduler.gui.MainUI mainUI21 = new scheduler.gui.MainUI();
        mainUI21.setTitle("REGISTRATION");
        int int24 = mainUI21.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        mainUI21.addPropertyChangeListener("REGISTRATION", propertyChangeListener26);
        scheduler.gui.UserDashboardPanel userDashboardPanel28 = new scheduler.gui.UserDashboardPanel(mainUI21);
        java.awt.Component component31 = mainUI21.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI32 = new scheduler.gui.MainUI();
        mainUI32.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener35 = null;
        mainUI32.addWindowFocusListener(windowFocusListener35);
        boolean boolean37 = mainUI32.isFocusableWindow();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        sensorPanel39.removeInputMethodListener(inputMethodListener44);
        sensorPanel39.enable();
        java.awt.Point point47 = sensorPanel39.location();
        mainUI32.setLocation(point47);
        mainUI21.setLocation(point47);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.lang.String str54 = sensorPanel51.toString();
        java.awt.MenuComponent menuComponent55 = null;
        sensorPanel51.remove(menuComponent55);
        java.awt.Component[] componentArray57 = sensorPanel51.getComponents();
        javax.swing.TransferHandler transferHandler58 = null;
        sensorPanel51.setTransferHandler(transferHandler58);
        scheduler.gui.MainUI mainUI60 = new scheduler.gui.MainUI();
        java.awt.Component component61 = mainUI60.getGlassPane();
        javax.swing.JMenuBar jMenuBar62 = mainUI60.getJMenuBar();
        mainUI60.setState((int) (short) 0);
        mainUI60.setLocation(0, 64);
        java.awt.Color color68 = mainUI60.getBackground();
        scheduler.gui.MainUI mainUI69 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        mainUI69.addPropertyChangeListener("hi!", propertyChangeListener71);
        java.awt.Insets insets73 = mainUI69.getInsets();
        java.awt.Rectangle rectangle74 = null;
        mainUI69.setMaximizedBounds(rectangle74);
        mainUI69.toBack();
        scheduler.gui.MainUI mainUI77 = new scheduler.gui.MainUI();
        mainUI77.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel80 = new scheduler.gui.AdminDashboardPanel(mainUI77);
        java.awt.Graphics graphics81 = mainUI77.getGraphics();
        mainUI69.paint(graphics81);
        mainUI60.paintComponents(graphics81);
        sensorPanel51.update(graphics81);
        mainUI21.paint(graphics81);
        mainUI0.update(graphics81);
        scheduler.gui.MainUI mainUI87 = null;
        scheduler.gui.PaymentPanel paymentPanel88 = new scheduler.gui.PaymentPanel(mainUI87);
        boolean boolean89 = paymentPanel88.isEnabled();
        boolean boolean90 = paymentPanel88.isPaintingForPrint();
        paymentPanel88.removeAll();
        paymentPanel88.addNotify();
        mainUI0.remove((java.awt.Component) paymentPanel88);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(inputContext17);
        org.junit.Assert.assertTrue("'" + modalExclusionType19 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType19.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(component31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(point47);
        org.junit.Assert.assertNotNull(componentArray57);
        org.junit.Assert.assertNotNull(component61);
        org.junit.Assert.assertNull(jMenuBar62);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(insets73);
        org.junit.Assert.assertNotNull(graphics81);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        javax.swing.JMenuBar jMenuBar6 = mainUI0.getJMenuBar();
        boolean boolean7 = mainUI0.isShowing();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        scheduler.gui.MainUI mainUI10 = new scheduler.gui.MainUI();
        mainUI10.setTitle("REGISTRATION");
        int int13 = mainUI10.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet15 = mainUI10.getFocusTraversalKeys((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setFocusTraversalKeys(32, aWTKeyStrokeSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        javax.swing.JLayeredPane jLayeredPane61 = mainUI8.getLayeredPane();
        mainUI0.setLayeredPane(jLayeredPane61);
        jLayeredPane61.setLocation(3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane61);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        javax.swing.JLayeredPane jLayeredPane15 = mainUI5.getLayeredPane();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.lang.String str20 = sensorPanel17.toString();
        java.awt.MenuComponent menuComponent21 = null;
        sensorPanel17.remove(menuComponent21);
        java.awt.Component[] componentArray23 = sensorPanel17.getComponents();
        javax.swing.TransferHandler transferHandler24 = null;
        sensorPanel17.setTransferHandler(transferHandler24);
        java.awt.Toolkit toolkit26 = sensorPanel17.getToolkit();
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        mainUI27.setTitle("REGISTRATION");
        int int30 = mainUI27.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        mainUI27.addPropertyChangeListener("REGISTRATION", propertyChangeListener32);
        scheduler.gui.UserDashboardPanel userDashboardPanel34 = new scheduler.gui.UserDashboardPanel(mainUI27);
        java.awt.Component component37 = mainUI27.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI38 = new scheduler.gui.MainUI();
        mainUI38.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener41 = null;
        mainUI38.addWindowFocusListener(windowFocusListener41);
        boolean boolean43 = mainUI38.isFocusableWindow();
        scheduler.gui.MainUI mainUI44 = null;
        scheduler.gui.SensorPanel sensorPanel45 = new scheduler.gui.SensorPanel(mainUI44);
        java.awt.event.ContainerListener containerListener46 = null;
        sensorPanel45.removeContainerListener(containerListener46);
        java.awt.event.MouseEvent mouseEvent48 = null;
        java.lang.String str49 = sensorPanel45.getToolTipText(mouseEvent48);
        java.awt.event.InputMethodListener inputMethodListener50 = null;
        sensorPanel45.removeInputMethodListener(inputMethodListener50);
        sensorPanel45.enable();
        java.awt.Point point53 = sensorPanel45.location();
        mainUI38.setLocation(point53);
        mainUI27.setLocation(point53);
        scheduler.gui.MainUI mainUI56 = null;
        scheduler.gui.SensorPanel sensorPanel57 = new scheduler.gui.SensorPanel(mainUI56);
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel57.removeContainerListener(containerListener58);
        java.lang.String str60 = sensorPanel57.toString();
        java.awt.MenuComponent menuComponent61 = null;
        sensorPanel57.remove(menuComponent61);
        java.awt.Component[] componentArray63 = sensorPanel57.getComponents();
        javax.swing.TransferHandler transferHandler64 = null;
        sensorPanel57.setTransferHandler(transferHandler64);
        scheduler.gui.MainUI mainUI66 = new scheduler.gui.MainUI();
        java.awt.Component component67 = mainUI66.getGlassPane();
        javax.swing.JMenuBar jMenuBar68 = mainUI66.getJMenuBar();
        mainUI66.setState((int) (short) 0);
        mainUI66.setLocation(0, 64);
        java.awt.Color color74 = mainUI66.getBackground();
        scheduler.gui.MainUI mainUI75 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        mainUI75.addPropertyChangeListener("hi!", propertyChangeListener77);
        java.awt.Insets insets79 = mainUI75.getInsets();
        java.awt.Rectangle rectangle80 = null;
        mainUI75.setMaximizedBounds(rectangle80);
        mainUI75.toBack();
        scheduler.gui.MainUI mainUI83 = new scheduler.gui.MainUI();
        mainUI83.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel86 = new scheduler.gui.AdminDashboardPanel(mainUI83);
        java.awt.Graphics graphics87 = mainUI83.getGraphics();
        mainUI75.paint(graphics87);
        mainUI66.paintComponents(graphics87);
        sensorPanel57.update(graphics87);
        mainUI27.paint(graphics87);
        sensorPanel17.print(graphics87);
        jLayeredPane15.print(graphics87);
        int int94 = jLayeredPane15.getDebugGraphicsOptions();
        boolean boolean95 = jLayeredPane15.isDisplayable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNotNull(jLayeredPane15);
        org.junit.Assert.assertNotNull(componentArray23);
        org.junit.Assert.assertNotNull(toolkit26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(point53);
        org.junit.Assert.assertNotNull(componentArray63);
        org.junit.Assert.assertNotNull(component67);
        org.junit.Assert.assertNull(jMenuBar68);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(insets79);
        org.junit.Assert.assertNotNull(graphics87);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double3 = booking0.calculateFinalCost((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        java.util.List<scheduler.booking.Booking> bookingList1 = bookingSystemFacade0.getBookings();
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        mainUI0.transferFocusUpCycle();
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.setVerifyInputWhenFocusTarget(false);
        boolean boolean10 = sensorPanel1.isOpaque();
        sensorPanel1.setLocation(3, (int) (byte) -1);
        sensorPanel1.removeAll();
        java.awt.Dimension dimension15 = sensorPanel1.preferredSize();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.MouseListener[] mouseListenerArray6 = mainUI0.getMouseListeners();
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        mainUI7.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener10 = null;
        mainUI7.addWindowFocusListener(windowFocusListener10);
        boolean boolean12 = mainUI7.isFocusableWindow();
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        sensorPanel14.removeInputMethodListener(inputMethodListener19);
        sensorPanel14.enable();
        java.awt.Point point22 = sensorPanel14.location();
        mainUI7.setLocation(point22);
        mainUI7.setFocusableWindowState(false);
        javax.accessibility.AccessibleContext accessibleContext26 = mainUI7.getAccessibleContext();
        java.awt.Window.Type type27 = mainUI7.getType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setType(type27);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertArrayEquals(mouseListenerArray6, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertNotNull(accessibleContext26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + java.awt.Window.Type.NORMAL + "'", type27.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI0.getModalExclusionType();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        mainUI0.setLocationRelativeTo((java.awt.Component) mainUI9);
        java.awt.Component component11 = mainUI9.getGlassPane();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(component11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double2 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        java.time.LocalDateTime localDateTime4 = booking0.getEndTime();
        java.lang.String str5 = booking0.getBookingID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        mainUI0.firePropertyChange("SENSOR", '4', '#');
        javax.swing.JMenuBar jMenuBar16 = mainUI0.getJMenuBar();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jMenuBar16);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        paymentPanel1.setBounds((int) (byte) -1, 9, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        javax.swing.JRootPane jRootPane14 = mainUI0.getRootPane();
        float float15 = jRootPane14.getAlignmentX();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.event.HierarchyListener hierarchyListener6 = null;
        mainUI0.addHierarchyListener(hierarchyListener6);
        java.awt.Container container8 = mainUI0.getFocusCycleRootAncestor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Graphics graphics14 = sensorPanel1.getGraphics();
        java.awt.Font font15 = sensorPanel1.getFont();
        java.awt.Dimension dimension16 = sensorPanel1.getMinimumSize();
        sensorPanel1.validate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        java.awt.Rectangle rectangle12 = null;
        mainUI7.setMaximizedBounds(rectangle12);
        java.awt.Event event14 = null;
        boolean boolean17 = mainUI7.mouseDrag(event14, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension18 = mainUI7.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        mainUI7.addHierarchyBoundsListener(hierarchyBoundsListener19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Dimension dimension27 = sensorPanel22.minimumSize();
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        sensorPanel29.transferFocus();
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = sensorPanel29.createImage(imageProducer35);
        scheduler.gui.MainUI mainUI39 = null;
        scheduler.gui.SensorPanel sensorPanel40 = new scheduler.gui.SensorPanel(mainUI39);
        java.awt.event.ContainerListener containerListener41 = null;
        sensorPanel40.removeContainerListener(containerListener41);
        java.awt.event.MouseEvent mouseEvent43 = null;
        java.lang.String str44 = sensorPanel40.getToolTipText(mouseEvent43);
        java.awt.Insets insets45 = sensorPanel40.getInsets();
        int int46 = sensorPanel22.checkImage(image36, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel40);
        scheduler.gui.MainUI mainUI49 = null;
        scheduler.gui.SensorPanel sensorPanel50 = new scheduler.gui.SensorPanel(mainUI49);
        java.awt.event.ContainerListener containerListener51 = null;
        sensorPanel50.removeContainerListener(containerListener51);
        java.awt.event.MouseEvent mouseEvent53 = null;
        java.lang.String str54 = sensorPanel50.getToolTipText(mouseEvent53);
        java.awt.Insets insets55 = sensorPanel50.getInsets();
        boolean boolean56 = sensorPanel50.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener57 = null;
        sensorPanel50.addContainerListener(containerListener57);
        int int59 = mainUI7.checkImage(image36, 32, 1, (java.awt.image.ImageObserver) sensorPanel50);
        javax.swing.JLayeredPane jLayeredPane60 = mainUI7.getLayeredPane();
        java.util.Locale locale61 = javax.swing.JComponent.getDefaultLocale();
        mainUI7.setLocale(locale61);
        // The following exception was thrown during execution in test generation
        try {
            jPopupMenu6.setLocale(locale61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(insets55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.SensorPanel sensorPanel5 = new scheduler.gui.SensorPanel(mainUI4);
        java.awt.event.ContainerListener containerListener6 = null;
        sensorPanel5.removeContainerListener(containerListener6);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = sensorPanel5.getToolTipText(mouseEvent8);
        java.awt.Dimension dimension10 = sensorPanel5.minimumSize();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        sensorPanel12.transferFocus();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = sensorPanel12.createImage(imageProducer18);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Insets insets28 = sensorPanel23.getInsets();
        int int29 = sensorPanel5.checkImage(image19, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel23);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        sensorPanel23.addPropertyChangeListener("hi!", propertyChangeListener31);
        java.awt.Color color33 = sensorPanel23.getForeground();
        paymentPanel1.setForeground(color33);
        paymentPanel1.firePropertyChange("SENSOR", 'a', 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.user.Student student7 = new scheduler.user.Student();
        mainUI0.setCurrentUser((scheduler.user.User) student7);
        boolean boolean10 = student7.checkPassword("ADMIN_DASHBOARD");
        java.lang.String str11 = student7.getOrgID();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Shape shape8 = mainUI0.getShape();
        mainUI0.pack();
        java.awt.Event event10 = null;
        boolean boolean13 = mainUI0.mouseDown(event10, 8, 0);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Component[] componentArray14 = sensorPanel1.getComponents();
        java.awt.event.MouseListener mouseListener15 = null;
        sensorPanel1.addMouseListener(mouseListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.awt.Point point18 = sensorPanel1.getToolTipLocation(mouseEvent17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(componentArray14);
        org.junit.Assert.assertNull(point18);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        scheduler.gui.MainUI mainUI6 = new scheduler.gui.MainUI();
        java.awt.Component component7 = mainUI6.getGlassPane();
        javax.swing.JMenuBar jMenuBar8 = mainUI6.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI6);
        mainUI6.firePropertyChange("", (long) 64, 10L);
        int int14 = mainUI6.getWidth();
        mainUI6.resize((int) ' ', (int) '4');
        java.awt.event.WindowFocusListener[] windowFocusListenerArray18 = mainUI6.getWindowFocusListeners();
        float float19 = mainUI6.getOpacity();
        scheduler.gui.MainUI mainUI20 = new scheduler.gui.MainUI();
        mainUI20.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel23 = new scheduler.gui.AdminDashboardPanel(mainUI20);
        java.awt.Graphics graphics24 = mainUI20.getGraphics();
        int int25 = mainUI20.getHeight();
        javax.accessibility.AccessibleContext accessibleContext26 = mainUI20.getAccessibleContext();
        scheduler.gui.RoomBookingPanel roomBookingPanel27 = new scheduler.gui.RoomBookingPanel(mainUI20);
        scheduler.gui.MainUI mainUI28 = new scheduler.gui.MainUI();
        java.awt.Component component29 = mainUI28.getGlassPane();
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        component29.addInputMethodListener(inputMethodListener30);
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.lang.String str37 = sensorPanel33.getToolTipText(mouseEvent36);
        java.awt.Dimension dimension38 = sensorPanel33.minimumSize();
        java.awt.ImageCapabilities imageCapabilities41 = null;
        java.awt.image.VolatileImage volatileImage42 = sensorPanel33.createVolatileImage(8, (-1), imageCapabilities41);
        javax.swing.InputMap inputMap43 = sensorPanel33.getInputMap();
        scheduler.gui.MainUI mainUI44 = null;
        scheduler.gui.SensorPanel sensorPanel45 = new scheduler.gui.SensorPanel(mainUI44);
        java.awt.event.ContainerListener containerListener46 = null;
        sensorPanel45.removeContainerListener(containerListener46);
        java.lang.String str48 = sensorPanel45.toString();
        java.awt.MenuComponent menuComponent49 = null;
        sensorPanel45.remove(menuComponent49);
        java.awt.Component[] componentArray51 = sensorPanel45.getComponents();
        java.awt.LayoutManager layoutManager52 = sensorPanel45.getLayout();
        scheduler.gui.MainUI mainUI53 = null;
        scheduler.gui.SensorPanel sensorPanel54 = new scheduler.gui.SensorPanel(mainUI53);
        java.awt.event.ContainerListener containerListener55 = null;
        sensorPanel54.removeContainerListener(containerListener55);
        java.awt.event.MouseEvent mouseEvent57 = null;
        java.lang.String str58 = sensorPanel54.getToolTipText(mouseEvent57);
        java.awt.Dimension dimension59 = sensorPanel54.minimumSize();
        java.awt.ImageCapabilities imageCapabilities62 = null;
        java.awt.image.VolatileImage volatileImage63 = sensorPanel54.createVolatileImage(8, (-1), imageCapabilities62);
        java.awt.Image image66 = sensorPanel54.createImage(3, 1);
        java.awt.Rectangle rectangle67 = null;
        java.awt.Rectangle rectangle68 = sensorPanel54.getBounds(rectangle67);
        sensorPanel45.paintImmediately(rectangle68);
        sensorPanel33.paintImmediately(rectangle68);
        java.awt.Rectangle rectangle71 = component29.getBounds(rectangle68);
        roomBookingPanel27.setBounds(rectangle68);
        mainUI6.setMaximizedBounds(rectangle68);
        mainUI0.setMaximizedBounds(rectangle68);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1047 + "'", int14 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray18);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray18, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(graphics24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 650 + "'", int25 == 650);
        org.junit.Assert.assertNotNull(accessibleContext26);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNull(volatileImage42);
        org.junit.Assert.assertNotNull(inputMap43);
        org.junit.Assert.assertNotNull(componentArray51);
        org.junit.Assert.assertNotNull(layoutManager52);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(dimension59);
        org.junit.Assert.assertNull(volatileImage63);
        org.junit.Assert.assertNull(image66);
        org.junit.Assert.assertNotNull(rectangle68);
        org.junit.Assert.assertNotNull(rectangle71);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.updateUI();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        java.awt.Event event16 = null;
        boolean boolean19 = mainUI9.mouseDrag(event16, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension20 = mainUI9.getPreferredSize();
        scheduler.gui.RegistrationPanel registrationPanel21 = new scheduler.gui.RegistrationPanel(mainUI9);
        int int22 = sensorPanel1.getComponentZOrder((java.awt.Component) mainUI9);
        sensorPanel1.invalidate();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = sensorPanel1.getBaselineResizeBehavior();
        javax.swing.JRootPane jRootPane8 = sensorPanel1.getRootPane();
        sensorPanel1.requestFocus();
        scheduler.gui.MainUI mainUI10 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        mainUI10.addPropertyChangeListener("hi!", propertyChangeListener12);
        java.awt.Insets insets14 = mainUI10.getInsets();
        java.awt.Rectangle rectangle15 = null;
        mainUI10.setMaximizedBounds(rectangle15);
        java.awt.Event event17 = null;
        boolean boolean20 = mainUI10.mouseDrag(event17, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension21 = mainUI10.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        mainUI10.addHierarchyBoundsListener(hierarchyBoundsListener22);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.Dimension dimension30 = sensorPanel25.minimumSize();
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.awt.event.MouseEvent mouseEvent35 = null;
        java.lang.String str36 = sensorPanel32.getToolTipText(mouseEvent35);
        sensorPanel32.transferFocus();
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = sensorPanel32.createImage(imageProducer38);
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.SensorPanel sensorPanel43 = new scheduler.gui.SensorPanel(mainUI42);
        java.awt.event.ContainerListener containerListener44 = null;
        sensorPanel43.removeContainerListener(containerListener44);
        java.awt.event.MouseEvent mouseEvent46 = null;
        java.lang.String str47 = sensorPanel43.getToolTipText(mouseEvent46);
        java.awt.Insets insets48 = sensorPanel43.getInsets();
        int int49 = sensorPanel25.checkImage(image39, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel43);
        scheduler.gui.MainUI mainUI52 = null;
        scheduler.gui.SensorPanel sensorPanel53 = new scheduler.gui.SensorPanel(mainUI52);
        java.awt.event.ContainerListener containerListener54 = null;
        sensorPanel53.removeContainerListener(containerListener54);
        java.awt.event.MouseEvent mouseEvent56 = null;
        java.lang.String str57 = sensorPanel53.getToolTipText(mouseEvent56);
        java.awt.Insets insets58 = sensorPanel53.getInsets();
        boolean boolean59 = sensorPanel53.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener60 = null;
        sensorPanel53.addContainerListener(containerListener60);
        int int62 = mainUI10.checkImage(image39, 32, 1, (java.awt.image.ImageObserver) sensorPanel53);
        scheduler.gui.MainUI mainUI65 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        mainUI65.addPropertyChangeListener("hi!", propertyChangeListener67);
        java.awt.Insets insets69 = mainUI65.getInsets();
        javax.swing.TransferHandler transferHandler70 = mainUI65.getTransferHandler();
        scheduler.gui.MainUI mainUI71 = null;
        scheduler.gui.SensorPanel sensorPanel72 = new scheduler.gui.SensorPanel(mainUI71);
        java.awt.event.ContainerListener containerListener73 = null;
        sensorPanel72.removeContainerListener(containerListener73);
        java.awt.event.MouseEvent mouseEvent75 = null;
        java.lang.String str76 = sensorPanel72.getToolTipText(mouseEvent75);
        java.awt.Dimension dimension77 = sensorPanel72.minimumSize();
        java.awt.ImageCapabilities imageCapabilities80 = null;
        java.awt.image.VolatileImage volatileImage81 = sensorPanel72.createVolatileImage(8, (-1), imageCapabilities80);
        java.awt.Image image84 = sensorPanel72.createImage(3, 1);
        java.awt.Component[] componentArray85 = sensorPanel72.getComponents();
        boolean boolean86 = sensorPanel72.isCursorSet();
        java.awt.Dimension dimension87 = sensorPanel72.size();
        mainUI65.resize(dimension87);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = sensorPanel1.prepareImage(image39, 650, 8, (java.awt.image.ImageObserver) mainUI65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(jRootPane8);
        org.junit.Assert.assertNotNull(insets14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(insets48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(insets58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(insets69);
        org.junit.Assert.assertNull(transferHandler70);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(dimension77);
        org.junit.Assert.assertNull(volatileImage81);
        org.junit.Assert.assertNull(image84);
        org.junit.Assert.assertNotNull(componentArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(dimension87);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.enable();
        sensorPanel1.layout();
        sensorPanel1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        sensorPanel1.addHierarchyBoundsListener(hierarchyBoundsListener12);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        sensorPanel9.removeInputMethodListener(inputMethodListener14);
        sensorPanel9.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color22 = null;
        sensorPanel9.setBackground(color22);
        java.awt.event.ComponentListener[] componentListenerArray24 = sensorPanel9.getComponentListeners();
        boolean boolean25 = sensorPanel9.isDoubleBuffered();
        java.util.Locale locale26 = null;
        sensorPanel9.setLocale(locale26);
        boolean boolean28 = paymentPanel1.isAncestorOf((java.awt.Component) sensorPanel9);
        sensorPanel9.firePropertyChange("SENSOR", '#', '4');
        scheduler.gui.MainUI mainUI33 = new scheduler.gui.MainUI();
        mainUI33.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel36 = new scheduler.gui.AdminDashboardPanel(mainUI33);
        java.awt.Graphics graphics37 = mainUI33.getGraphics();
        sensorPanel9.update(graphics37);
        scheduler.gui.MainUI mainUI39 = null;
        scheduler.gui.SensorPanel sensorPanel40 = new scheduler.gui.SensorPanel(mainUI39);
        java.awt.event.ContainerListener containerListener41 = null;
        sensorPanel40.removeContainerListener(containerListener41);
        java.awt.event.MouseEvent mouseEvent43 = null;
        java.lang.String str44 = sensorPanel40.getToolTipText(mouseEvent43);
        java.awt.Dimension dimension45 = sensorPanel40.minimumSize();
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.SensorPanel sensorPanel47 = new scheduler.gui.SensorPanel(mainUI46);
        java.awt.event.ContainerListener containerListener48 = null;
        sensorPanel47.removeContainerListener(containerListener48);
        java.awt.event.MouseEvent mouseEvent50 = null;
        java.lang.String str51 = sensorPanel47.getToolTipText(mouseEvent50);
        sensorPanel47.transferFocus();
        java.awt.image.ImageProducer imageProducer53 = null;
        java.awt.Image image54 = sensorPanel47.createImage(imageProducer53);
        scheduler.gui.MainUI mainUI57 = null;
        scheduler.gui.SensorPanel sensorPanel58 = new scheduler.gui.SensorPanel(mainUI57);
        java.awt.event.ContainerListener containerListener59 = null;
        sensorPanel58.removeContainerListener(containerListener59);
        java.awt.event.MouseEvent mouseEvent61 = null;
        java.lang.String str62 = sensorPanel58.getToolTipText(mouseEvent61);
        java.awt.Insets insets63 = sensorPanel58.getInsets();
        int int64 = sensorPanel40.checkImage(image54, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel58);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        sensorPanel58.addPropertyChangeListener("hi!", propertyChangeListener66);
        java.awt.Color color68 = sensorPanel58.getForeground();
        javax.swing.plaf.PanelUI panelUI69 = sensorPanel58.getUI();
        sensorPanel9.setUI(panelUI69);
        boolean boolean71 = sensorPanel9.isOpaque();
        int int72 = sensorPanel9.getWidth();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(graphics37);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(image54);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(insets63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(panelUI69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        mainUI9.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel12 = new scheduler.gui.AdminDashboardPanel(mainUI9);
        java.awt.event.FocusListener[] focusListenerArray13 = mainUI9.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel14 = new scheduler.gui.AdminDashboardPanel(mainUI9);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.PaymentPanel paymentPanel16 = new scheduler.gui.PaymentPanel(mainUI15);
        boolean boolean17 = paymentPanel16.isEnabled();
        boolean boolean18 = paymentPanel16.isPaintingForPrint();
        boolean boolean19 = paymentPanel16.getVerifyInputWhenFocusTarget();
        java.awt.Event event20 = null;
        boolean boolean23 = paymentPanel16.mouseDrag(event20, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI24 = new scheduler.gui.MainUI();
        java.awt.Component component25 = mainUI24.getGlassPane();
        javax.swing.JMenuBar jMenuBar26 = mainUI24.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.Component component28 = null;
        boolean boolean29 = mainUI24.isAncestorOf(component28);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.PaymentPanel paymentPanel31 = new scheduler.gui.PaymentPanel(mainUI30);
        boolean boolean32 = paymentPanel31.isEnabled();
        boolean boolean33 = paymentPanel31.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation34 = paymentPanel31.getComponentOrientation();
        mainUI24.setComponentOrientation(componentOrientation34);
        paymentPanel16.applyComponentOrientation(componentOrientation34);
        java.awt.Point point37 = paymentPanel16.location();
        java.awt.Point point38 = adminDashboardPanel14.getLocation(point37);
        java.awt.Point point39 = paymentPanel1.getLocation(point38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(focusListenerArray13);
        org.junit.Assert.assertArrayEquals(focusListenerArray13, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNull(jMenuBar26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(componentOrientation34);
        org.junit.Assert.assertNotNull(point37);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertNotNull(point39);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        loginPanel11.setIgnoreRepaint(false);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        java.lang.Object obj9 = loginPanel8.getTreeLock();
        float float10 = loginPanel8.getAlignmentY();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.PaymentPanel paymentPanel12 = new scheduler.gui.PaymentPanel(mainUI11);
        boolean boolean13 = paymentPanel12.isEnabled();
        boolean boolean14 = paymentPanel12.isPaintingForPrint();
        paymentPanel12.hide();
        java.awt.Dimension dimension16 = paymentPanel12.getMaximumSize();
        paymentPanel12.enableInputMethods(true);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        sensorPanel20.removeInputMethodListener(inputMethodListener25);
        sensorPanel20.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color33 = null;
        sensorPanel20.setBackground(color33);
        java.awt.event.ComponentListener[] componentListenerArray35 = sensorPanel20.getComponentListeners();
        boolean boolean36 = sensorPanel20.isDoubleBuffered();
        java.util.Locale locale37 = null;
        sensorPanel20.setLocale(locale37);
        boolean boolean39 = paymentPanel12.isAncestorOf((java.awt.Component) sensorPanel20);
        sensorPanel20.firePropertyChange("SENSOR", '#', '4');
        scheduler.gui.MainUI mainUI44 = new scheduler.gui.MainUI();
        mainUI44.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel47 = new scheduler.gui.AdminDashboardPanel(mainUI44);
        java.awt.Graphics graphics48 = mainUI44.getGraphics();
        sensorPanel20.update(graphics48);
        loginPanel8.print(graphics48);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(componentListenerArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(graphics48);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.awt.event.InputMethodListener[] inputMethodListenerArray26 = sensorPanel19.getInputMethodListeners();
        int int27 = sensorPanel19.getY();
        java.awt.Cursor cursor28 = sensorPanel19.getCursor();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray26);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray26, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(cursor28);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        java.lang.String str3 = hardwareSensor2.getRoomID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADMIN_DASHBOARD" + "'", str3, "ADMIN_DASHBOARD");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.awt.Event event8 = null;
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        sensorPanel10.removeInputMethodListener(inputMethodListener15);
        sensorPanel10.enable();
        boolean boolean18 = mainUI0.lostFocus(event8, (java.lang.Object) sensorPanel10);
        java.awt.Cursor cursor19 = null;
        mainUI0.setCursor(cursor19);
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener21);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseEnter(event8, 3, (int) (short) 100);
        java.awt.Color color12 = sensorPanel1.getBackground();
        sensorPanel1.nextFocus();
        sensorPanel1.transferFocusBackward();
        sensorPanel1.enable();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        mainUI0.logout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        mainUI0.show(true);
        java.awt.event.InputMethodListener[] inputMethodListenerArray16 = mainUI0.getInputMethodListeners();
        boolean boolean17 = mainUI0.isAlwaysOnTop();
        boolean boolean18 = mainUI0.isFocusTraversalPolicySet();
        boolean boolean19 = mainUI0.isValidateRoot();
        mainUI0.dispose();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(inputMethodListenerArray16);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray16, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.addNotify();
        java.awt.Dimension dimension12 = null;
        mainUI0.setPreferredSize(dimension12);
        javax.swing.JRootPane jRootPane14 = mainUI0.getRootPane();
        jRootPane14.firePropertyChange("CHIEF_COORDINATOR_DASHBOARD", ' ', 'a');
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Shape shape4 = mainUI0.getShape();
        mainUI0.setFocusCycleRoot(false);
        boolean boolean7 = mainUI0.isValidateRoot();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.Dimension dimension14 = sensorPanel9.minimumSize();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel16.getToolTipText(mouseEvent19);
        sensorPanel16.transferFocus();
        java.awt.image.ImageProducer imageProducer22 = null;
        java.awt.Image image23 = sensorPanel16.createImage(imageProducer22);
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.Insets insets32 = sensorPanel27.getInsets();
        int int33 = sensorPanel9.checkImage(image23, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel27);
        scheduler.gui.MainUI mainUI34 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        mainUI34.addPropertyChangeListener("hi!", propertyChangeListener36);
        java.awt.Insets insets38 = mainUI34.getInsets();
        java.awt.Rectangle rectangle39 = null;
        mainUI34.setMaximizedBounds(rectangle39);
        java.awt.Event event41 = null;
        boolean boolean44 = mainUI34.mouseDrag(event41, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension45 = mainUI34.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener46 = null;
        mainUI34.addHierarchyBoundsListener(hierarchyBoundsListener46);
        java.awt.event.ComponentListener componentListener48 = null;
        mainUI34.addComponentListener(componentListener48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = mainUI0.prepareImage(image23, (java.awt.image.ImageObserver) mainUI34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(insets32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(insets38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dimension45);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        mainUI0.setName("LOGIN");
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        javax.swing.KeyStroke[] keyStrokeArray9 = loginPanel8.getRegisteredKeyStrokes();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(keyStrokeArray9);
        org.junit.Assert.assertArrayEquals(keyStrokeArray9, new javax.swing.KeyStroke[] {});
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        javax.swing.TransferHandler transferHandler5 = mainUI0.getTransferHandler();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.PaymentPanel paymentPanel7 = new scheduler.gui.PaymentPanel(mainUI6);
        boolean boolean8 = paymentPanel7.isEnabled();
        boolean boolean9 = paymentPanel7.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Dimension dimension16 = sensorPanel11.minimumSize();
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        sensorPanel18.transferFocus();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = sensorPanel18.createImage(imageProducer24);
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        java.awt.Insets insets34 = sensorPanel29.getInsets();
        int int35 = sensorPanel11.checkImage(image25, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel29);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        sensorPanel29.addPropertyChangeListener("hi!", propertyChangeListener37);
        java.awt.Color color39 = sensorPanel29.getForeground();
        paymentPanel7.setForeground(color39);
        mainUI0.setBackground(color39);
        mainUI0.setBounds(9, (int) (byte) 0, 0, 0);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNull(transferHandler5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.event.MouseListener mouseListener11 = null;
        sensorPanel1.removeMouseListener(mouseListener11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = sensorPanel1.areFocusTraversalKeysSet((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.awt.Event event8 = null;
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        sensorPanel10.removeInputMethodListener(inputMethodListener15);
        sensorPanel10.enable();
        boolean boolean18 = mainUI0.lostFocus(event8, (java.lang.Object) sensorPanel10);
        sensorPanel10.setLocation(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        java.awt.event.ContainerListener containerListener13 = null;
        paymentPanel1.removeContainerListener(containerListener13);
        java.awt.Event event15 = null;
        boolean boolean17 = paymentPanel1.action(event15, (java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.SensorPanel sensorPanel5 = new scheduler.gui.SensorPanel(mainUI4);
        java.awt.event.ContainerListener containerListener6 = null;
        sensorPanel5.removeContainerListener(containerListener6);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = sensorPanel5.getToolTipText(mouseEvent8);
        java.awt.Dimension dimension10 = sensorPanel5.minimumSize();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        sensorPanel12.transferFocus();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = sensorPanel12.createImage(imageProducer18);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Insets insets28 = sensorPanel23.getInsets();
        int int29 = sensorPanel5.checkImage(image19, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel23);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        sensorPanel23.addPropertyChangeListener("hi!", propertyChangeListener31);
        java.awt.Color color33 = sensorPanel23.getForeground();
        paymentPanel1.setForeground(color33);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray36 = paymentPanel1.getPropertyChangeListeners("Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray36);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray36, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.awt.Component component9 = mainUI8.getGlassPane();
        javax.swing.JMenuBar jMenuBar10 = mainUI8.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI8);
        mainUI0.setLocationRelativeTo((java.awt.Component) mainUI8);
        javax.swing.TransferHandler transferHandler13 = mainUI8.getTransferHandler();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNull(jMenuBar10);
        org.junit.Assert.assertNull(transferHandler13);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (long) 1, (long) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        sensorPanel1.addPropertyChangeListener(propertyChangeListener13);
        int int15 = sensorPanel1.getY();
        int int16 = sensorPanel1.getX();
        java.awt.Dimension dimension17 = sensorPanel1.minimumSize();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        javax.accessibility.AccessibleContext accessibleContext19 = mainUI0.getAccessibleContext();
        java.awt.Window.Type type20 = mainUI0.getType();
        java.io.PrintStream printStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(accessibleContext19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + java.awt.Window.Type.NORMAL + "'", type20.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        boolean boolean6 = paymentPanel5.isEnabled();
        boolean boolean7 = paymentPanel5.isPaintingForPrint();
        boolean boolean8 = paymentPanel5.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        mainUI9.setTitle("REGISTRATION");
        int int12 = mainUI9.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener13 = null;
        mainUI9.removeWindowFocusListener(windowFocusListener13);
        javax.swing.TransferHandler transferHandler15 = null;
        mainUI9.setTransferHandler(transferHandler15);
        java.awt.im.InputContext inputContext17 = mainUI9.getInputContext();
        paymentPanel5.setNextFocusableComponent((java.awt.Component) mainUI9);
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = mainUI9.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType19);
        int int21 = mainUI0.getCursorType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(inputContext17);
        org.junit.Assert.assertTrue("'" + modalExclusionType19 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType19.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        java.awt.MenuComponent menuComponent25 = null;
        mainUI0.remove(menuComponent25);
        java.awt.Dimension dimension27 = null;
        mainUI0.setMinimumSize(dimension27);
        java.awt.im.InputContext inputContext29 = mainUI0.getInputContext();
        java.awt.Window window30 = mainUI0.getOwner();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(inputContext29);
        org.junit.Assert.assertNull(window30);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        java.awt.ImageCapabilities imageCapabilities18 = null;
        java.awt.image.VolatileImage volatileImage19 = sensorPanel10.createVolatileImage(8, (-1), imageCapabilities18);
        java.awt.Image image22 = sensorPanel10.createImage(3, 1);
        java.awt.Rectangle rectangle23 = null;
        java.awt.Rectangle rectangle24 = sensorPanel10.getBounds(rectangle23);
        sensorPanel1.paintImmediately(rectangle24);
        boolean boolean26 = sensorPanel1.isDisplayable();
        sensorPanel1.repaint((int) 'a', (int) (short) -1, 10, 9);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(volatileImage19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        mainUI0.firePropertyChange("SENSOR", '4', '#');
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setOpacity((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray26 = sensorPanel19.getVetoableChangeListeners();
        sensorPanel19.enable(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray26);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray26, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        javax.accessibility.AccessibleContext accessibleContext19 = mainUI0.getAccessibleContext();
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printStream20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(accessibleContext19);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        boolean boolean8 = paymentPanel1.isBackgroundSet();
        boolean boolean9 = paymentPanel1.isMinimumSizeSet();
        java.awt.event.ActionListener actionListener10 = null;
        javax.swing.KeyStroke keyStroke11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentPanel1.registerKeyboardAction(actionListener10, keyStroke11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.SensorPanel sensorPanel5 = new scheduler.gui.SensorPanel(mainUI4);
        java.awt.event.ContainerListener containerListener6 = null;
        sensorPanel5.removeContainerListener(containerListener6);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = sensorPanel5.getToolTipText(mouseEvent8);
        java.awt.Dimension dimension10 = sensorPanel5.minimumSize();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        sensorPanel12.transferFocus();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = sensorPanel12.createImage(imageProducer18);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Insets insets28 = sensorPanel23.getInsets();
        int int29 = sensorPanel5.checkImage(image19, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel23);
        java.awt.im.InputContext inputContext30 = sensorPanel5.getInputContext();
        java.awt.LayoutManager layoutManager31 = sensorPanel5.getLayout();
        mainUI0.setLayout(layoutManager31);
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.PaymentPanel paymentPanel34 = new scheduler.gui.PaymentPanel(mainUI33);
        java.awt.Rectangle rectangle35 = null;
        paymentPanel34.scrollRectToVisible(rectangle35);
        java.awt.Event event37 = null;
        boolean boolean40 = paymentPanel34.mouseUp(event37, (int) (byte) 10, 3);
        paymentPanel34.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.awt.Point point46 = paymentPanel34.getPopupLocation(mouseEvent45);
        boolean boolean47 = mainUI0.isFocusCycleRoot((java.awt.Container) paymentPanel34);
        java.awt.image.BufferStrategy bufferStrategy48 = mainUI0.getBufferStrategy();
        java.awt.Event event49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = mainUI0.postEvent(event49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNull(inputContext30);
        org.junit.Assert.assertNotNull(layoutManager31);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(bufferStrategy48);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        scheduler.gui.MainUI mainUI61 = new scheduler.gui.MainUI();
        java.awt.Component component62 = mainUI61.getGlassPane();
        mainUI61.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener66 = null;
        mainUI61.removeHierarchyBoundsListener(hierarchyBoundsListener66);
        int int68 = mainUI0.checkImage(image37, (java.awt.image.ImageObserver) mainUI61);
        java.lang.String str69 = mainUI61.getTitle();
        mainUI61.repaint();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Room Booking System" + "'", str69, "Room Booking System");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension11 = mainUI0.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener12);
        mainUI0.show(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        mainUI0.addPropertyChangeListener("LOGIN", propertyChangeListener17);
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.showPaymentPanel("Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}", localDateTime20, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        scheduler.user.Student student0 = new scheduler.user.Student();
        java.lang.String str1 = student0.getAccountType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student" + "'", str1, "Student");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        scheduler.user.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.user.ChiefEventCoordinator.getInstance();
        boolean boolean3 = chiefEventCoordinator0.authenticate("Student", "");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = paymentPanel1.getPopupLocation(mouseEvent12);
        javax.swing.event.AncestorListener ancestorListener14 = null;
        paymentPanel1.removeAncestorListener(ancestorListener14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        java.awt.Color color13 = mainUI0.getBackground();
        java.awt.MenuBar menuBar14 = null;
        mainUI0.setMenuBar(menuBar14);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        boolean boolean13 = mainUI7.isAutoRequestFocus();
        mainUI7.setVisible(true);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.awt.Component component10 = mainUI9.getGlassPane();
        javax.swing.JMenuBar jMenuBar11 = mainUI9.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.Component component13 = null;
        boolean boolean14 = mainUI9.isAncestorOf(component13);
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.PaymentPanel paymentPanel16 = new scheduler.gui.PaymentPanel(mainUI15);
        boolean boolean17 = paymentPanel16.isEnabled();
        boolean boolean18 = paymentPanel16.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation19 = paymentPanel16.getComponentOrientation();
        mainUI9.setComponentOrientation(componentOrientation19);
        paymentPanel1.applyComponentOrientation(componentOrientation19);
        boolean boolean22 = paymentPanel1.isDoubleBuffered();
        scheduler.gui.MainUI mainUI23 = new scheduler.gui.MainUI();
        mainUI23.setTitle("REGISTRATION");
        int int26 = mainUI23.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        mainUI23.addPropertyChangeListener("REGISTRATION", propertyChangeListener28);
        scheduler.gui.UserDashboardPanel userDashboardPanel30 = new scheduler.gui.UserDashboardPanel(mainUI23);
        java.awt.Component component33 = mainUI23.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI34 = new scheduler.gui.MainUI();
        mainUI34.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener37 = null;
        mainUI34.addWindowFocusListener(windowFocusListener37);
        boolean boolean39 = mainUI34.isFocusableWindow();
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.event.InputMethodListener inputMethodListener46 = null;
        sensorPanel41.removeInputMethodListener(inputMethodListener46);
        sensorPanel41.enable();
        java.awt.Point point49 = sensorPanel41.location();
        mainUI34.setLocation(point49);
        mainUI23.setLocation(point49);
        java.awt.Point point52 = paymentPanel1.getLocation(point49);
        javax.swing.JToolTip jToolTip53 = paymentPanel1.createToolTip();
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI54);
        java.awt.event.ContainerListener containerListener56 = null;
        sensorPanel55.removeContainerListener(containerListener56);
        java.awt.event.MouseEvent mouseEvent58 = null;
        java.lang.String str59 = sensorPanel55.getToolTipText(mouseEvent58);
        java.awt.Dimension dimension60 = sensorPanel55.minimumSize();
        java.awt.ImageCapabilities imageCapabilities63 = null;
        java.awt.image.VolatileImage volatileImage64 = sensorPanel55.createVolatileImage(8, (-1), imageCapabilities63);
        java.awt.Image image67 = sensorPanel55.createImage(3, 1);
        javax.swing.KeyStroke keyStroke68 = null;
        int int69 = sensorPanel55.getConditionForKeyStroke(keyStroke68);
        javax.swing.border.Border border70 = sensorPanel55.getBorder();
        paymentPanel1.setBorder(border70);
        javax.swing.KeyStroke[] keyStrokeArray72 = paymentPanel1.getRegisteredKeyStrokes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(jMenuBar11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(componentOrientation19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(point49);
        org.junit.Assert.assertNotNull(point52);
        org.junit.Assert.assertNotNull(jToolTip53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertNull(volatileImage64);
        org.junit.Assert.assertNull(image67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(border70);
        org.junit.Assert.assertNotNull(keyStrokeArray72);
        org.junit.Assert.assertArrayEquals(keyStrokeArray72, new javax.swing.KeyStroke[] {});
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = mainUI5.getModalExclusionType();
        scheduler.gui.RegistrationPanel registrationPanel16 = new scheduler.gui.RegistrationPanel(mainUI5);
        registrationPanel16.setBounds(3, 12, (int) (short) 10, 0);
        java.awt.event.KeyListener[] keyListenerArray22 = registrationPanel16.getKeyListeners();
        java.awt.event.FocusEvent.Cause cause23 = null;
        boolean boolean24 = registrationPanel16.requestFocusInWindow(cause23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(keyListenerArray22);
        org.junit.Assert.assertArrayEquals(keyListenerArray22, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        boolean boolean7 = mainUI0.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.removeAll();
        paymentPanel1.addNotify();
        java.awt.Container container6 = paymentPanel1.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) container6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"peer\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.room.Room room2 = bookingSystemFacade0.getRoom("MY_BOOKINGS");
        boolean boolean6 = bookingSystemFacade0.processBooking("PAYMENT", "ROOM_BOOKING", (int) (byte) 0);
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(room2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        java.awt.Event event3 = null;
        boolean boolean6 = paymentPanel1.mouseUp(event3, 10, 4);
        boolean boolean7 = paymentPanel1.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        scheduler.gui.MainUI mainUI61 = new scheduler.gui.MainUI();
        java.awt.Component component62 = mainUI61.getGlassPane();
        mainUI61.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener66 = null;
        mainUI61.removeHierarchyBoundsListener(hierarchyBoundsListener66);
        int int68 = mainUI0.checkImage(image37, (java.awt.image.ImageObserver) mainUI61);
        java.lang.String str69 = mainUI61.getTitle();
        java.awt.Container container70 = mainUI61.getContentPane();
        mainUI61.setCursor(0);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Room Booking System" + "'", str69, "Room Booking System");
        org.junit.Assert.assertNotNull(container70);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        boolean boolean6 = paymentPanel5.isEnabled();
        boolean boolean7 = paymentPanel5.isPaintingForPrint();
        boolean boolean8 = paymentPanel5.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        paymentPanel5.setSize(dimension15);
        boolean boolean17 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel5);
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        mainUI18.addPropertyChangeListener("hi!", propertyChangeListener20);
        java.awt.Insets insets22 = mainUI18.getInsets();
        java.awt.Rectangle rectangle23 = null;
        mainUI18.setMaximizedBounds(rectangle23);
        java.awt.Event event25 = null;
        boolean boolean28 = mainUI18.mouseDrag(event25, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension29 = mainUI18.getPreferredSize();
        java.awt.Dimension dimension30 = paymentPanel5.getSize(dimension29);
        sensorPanel3.setSize(dimension30);
        scheduler.gui.MainUI mainUI32 = new scheduler.gui.MainUI();
        mainUI32.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener35 = null;
        mainUI32.addWindowFocusListener(windowFocusListener35);
        boolean boolean37 = mainUI32.isFocusableWindow();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        sensorPanel39.removeInputMethodListener(inputMethodListener44);
        sensorPanel39.enable();
        java.awt.Point point47 = sensorPanel39.location();
        mainUI32.setLocation(point47);
        mainUI32.setFocusableWindowState(false);
        java.awt.Dimension dimension51 = mainUI32.getSize();
        scheduler.gui.RoomManagementPanel roomManagementPanel52 = new scheduler.gui.RoomManagementPanel(mainUI32);
        roomManagementPanel52.firePropertyChange("hi!", 12, 3);
        java.awt.Dimension dimension57 = roomManagementPanel52.getMaximumSize();
        sensorPanel3.setMinimumSize(dimension57);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(insets22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(point47);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertNotNull(dimension57);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        scheduler.gui.PaymentPanel paymentPanel4 = new scheduler.gui.PaymentPanel(mainUI0);
        javax.accessibility.AccessibleContext accessibleContext5 = paymentPanel4.getAccessibleContext();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(accessibleContext5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        boolean boolean8 = sensorPanel1.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        boolean boolean9 = mainUI0.isAlwaysOnTop();
        boolean boolean10 = mainUI0.isResizable();
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double2 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        double double4 = booking0.calculateUpfrontCost();
        java.lang.String str5 = booking0.getBookingID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        boolean boolean16 = sensorPanel1.inside((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = sensorPanel1.getBounds(rectangle14);
        boolean boolean16 = sensorPanel1.isShowing();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        java.awt.Component component18 = mainUI17.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray19 = mainUI17.getKeyListeners();
        int int20 = mainUI17.getCursorType();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        boolean boolean23 = paymentPanel22.isEnabled();
        boolean boolean24 = paymentPanel22.isPaintingForPrint();
        boolean boolean25 = paymentPanel22.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI26 = new scheduler.gui.MainUI();
        mainUI26.setTitle("REGISTRATION");
        int int29 = mainUI26.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener30 = null;
        mainUI26.removeWindowFocusListener(windowFocusListener30);
        javax.swing.TransferHandler transferHandler32 = null;
        mainUI26.setTransferHandler(transferHandler32);
        java.awt.im.InputContext inputContext34 = mainUI26.getInputContext();
        paymentPanel22.setNextFocusableComponent((java.awt.Component) mainUI26);
        java.awt.Dialog.ModalExclusionType modalExclusionType36 = mainUI26.getModalExclusionType();
        mainUI17.setModalExclusionType(modalExclusionType36);
        scheduler.gui.MainUI mainUI38 = new scheduler.gui.MainUI();
        mainUI38.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel41 = new scheduler.gui.AdminDashboardPanel(mainUI38);
        java.awt.event.FocusListener[] focusListenerArray42 = mainUI38.getFocusListeners();
        boolean boolean43 = mainUI38.isActive();
        mainUI38.setName("LOGIN");
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel46 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI38);
        sensorPanel1.putClientProperty((java.lang.Object) modalExclusionType36, (java.lang.Object) mainUI38);
        boolean boolean48 = sensorPanel1.isFocusCycleRoot();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(keyListenerArray19);
        org.junit.Assert.assertArrayEquals(keyListenerArray19, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(inputContext34);
        org.junit.Assert.assertTrue("'" + modalExclusionType36 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType36.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(focusListenerArray42);
        org.junit.Assert.assertArrayEquals(focusListenerArray42, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printStream8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (double) (short) 1, (double) 16);
        javax.swing.border.Border border14 = sensorPanel1.getBorder();
        boolean boolean15 = sensorPanel1.isValidateRoot();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertNotNull(border14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        boolean boolean6 = mainUI0.isLocationByPlatform();
        java.lang.Class<?> wildcardClass7 = mainUI0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        scheduler.user.Administrator administrator2 = scheduler.user.Administrator.authenticate("hi!", "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(administrator2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        mainUI5.setTitle("REGISTRATION");
        int int8 = mainUI5.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mainUI5.removeWindowFocusListener(windowFocusListener9);
        javax.swing.TransferHandler transferHandler11 = null;
        mainUI5.setTransferHandler(transferHandler11);
        java.awt.im.InputContext inputContext13 = mainUI5.getInputContext();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) mainUI5);
        javax.swing.JLayeredPane jLayeredPane15 = mainUI5.getLayeredPane();
        jLayeredPane15.show(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNotNull(jLayeredPane15);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        float float2 = paymentPanel1.getAlignmentY();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        scheduler.gui.PaymentPanel paymentPanel4 = new scheduler.gui.PaymentPanel(mainUI0);
        javax.swing.KeyStroke keyStroke5 = null;
        int int6 = paymentPanel4.getConditionForKeyStroke(keyStroke5);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.awt.Component component17 = mainUI16.getGlassPane();
        javax.swing.JMenuBar jMenuBar18 = mainUI16.getJMenuBar();
        mainUI16.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType21 = mainUI16.getModalExclusionType();
        mainUI13.setModalExclusionType(modalExclusionType21);
        mainUI13.setOpacity(1.0f);
        java.awt.Color color25 = mainUI13.getBackground();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component27 = mainUI0.add((java.awt.Component) mainUI13, 650);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(jMenuBar18);
        org.junit.Assert.assertTrue("'" + modalExclusionType21 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType21.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        mainUI8.addWindowFocusListener(windowFocusListener11);
        boolean boolean13 = mainUI8.isFocusableWindow();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        sensorPanel15.removeInputMethodListener(inputMethodListener20);
        sensorPanel15.enable();
        java.awt.Point point23 = sensorPanel15.location();
        mainUI8.setLocation(point23);
        mainUI8.setFocusableWindowState(false);
        java.awt.Dimension dimension27 = mainUI8.getSize();
        sensorPanel1.resize(dimension27);
        boolean boolean29 = sensorPanel1.isFontSet();
        sensorPanel1.reshape((int) (byte) 100, 1047, (int) (byte) 1, 128);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        java.awt.Event event9 = null;
        boolean boolean11 = loginPanel8.gotFocus(event9, (java.lang.Object) 0.0f);
        boolean boolean12 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) loginPanel8);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        boolean boolean8 = mainUI0.isPreferredSizeSet();
        mainUI0.transferFocusDownCycle();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        scheduler.gui.MainUI mainUI7 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI7.addPropertyChangeListener("hi!", propertyChangeListener9);
        java.awt.Insets insets11 = mainUI7.getInsets();
        int int12 = mainUI0.getComponentZOrder((java.awt.Component) mainUI7);
        int int13 = mainUI7.getY();
        java.awt.MenuComponent menuComponent14 = null;
        mainUI7.remove(menuComponent14);
        // The following exception was thrown during execution in test generation
        try {
            mainUI7.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 83 + "'", int13 == 83);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Container container11 = sensorPanel1.getTopLevelAncestor();
        int int12 = sensorPanel1.getX();
        boolean boolean13 = sensorPanel1.isFocusOwner();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(container11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        java.awt.Color color12 = mainUI0.getBackground();
        java.util.List<java.awt.Image> imageList13 = mainUI0.getIconImages();
        java.lang.Class<?> wildcardClass14 = mainUI0.getClass();
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(imageList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.awt.event.WindowStateListener windowStateListener14 = null;
        mainUI0.removeWindowStateListener(windowStateListener14);
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.awt.Component component17 = mainUI16.getGlassPane();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        component17.addInputMethodListener(inputMethodListener18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.SensorPanel sensorPanel21 = new scheduler.gui.SensorPanel(mainUI20);
        java.awt.event.ContainerListener containerListener22 = null;
        sensorPanel21.removeContainerListener(containerListener22);
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.lang.String str25 = sensorPanel21.getToolTipText(mouseEvent24);
        java.awt.Dimension dimension26 = sensorPanel21.minimumSize();
        java.awt.ImageCapabilities imageCapabilities29 = null;
        java.awt.image.VolatileImage volatileImage30 = sensorPanel21.createVolatileImage(8, (-1), imageCapabilities29);
        javax.swing.InputMap inputMap31 = sensorPanel21.getInputMap();
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.lang.String str36 = sensorPanel33.toString();
        java.awt.MenuComponent menuComponent37 = null;
        sensorPanel33.remove(menuComponent37);
        java.awt.Component[] componentArray39 = sensorPanel33.getComponents();
        java.awt.LayoutManager layoutManager40 = sensorPanel33.getLayout();
        scheduler.gui.MainUI mainUI41 = null;
        scheduler.gui.SensorPanel sensorPanel42 = new scheduler.gui.SensorPanel(mainUI41);
        java.awt.event.ContainerListener containerListener43 = null;
        sensorPanel42.removeContainerListener(containerListener43);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.lang.String str46 = sensorPanel42.getToolTipText(mouseEvent45);
        java.awt.Dimension dimension47 = sensorPanel42.minimumSize();
        java.awt.ImageCapabilities imageCapabilities50 = null;
        java.awt.image.VolatileImage volatileImage51 = sensorPanel42.createVolatileImage(8, (-1), imageCapabilities50);
        java.awt.Image image54 = sensorPanel42.createImage(3, 1);
        java.awt.Rectangle rectangle55 = null;
        java.awt.Rectangle rectangle56 = sensorPanel42.getBounds(rectangle55);
        sensorPanel33.paintImmediately(rectangle56);
        sensorPanel21.paintImmediately(rectangle56);
        java.awt.Rectangle rectangle59 = component17.getBounds(rectangle56);
        mainUI0.setBounds(rectangle59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNull(volatileImage30);
        org.junit.Assert.assertNotNull(inputMap31);
        org.junit.Assert.assertNotNull(componentArray39);
        org.junit.Assert.assertNotNull(layoutManager40);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNull(volatileImage51);
        org.junit.Assert.assertNull(image54);
        org.junit.Assert.assertNotNull(rectangle56);
        org.junit.Assert.assertNotNull(rectangle59);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.SensorPanel sensorPanel6 = new scheduler.gui.SensorPanel(mainUI5);
        java.awt.event.ContainerListener containerListener7 = null;
        sensorPanel6.removeContainerListener(containerListener7);
        java.awt.event.MouseEvent mouseEvent9 = null;
        java.lang.String str10 = sensorPanel6.getToolTipText(mouseEvent9);
        java.awt.Dimension dimension11 = sensorPanel6.minimumSize();
        paymentPanel1.setSize(dimension11);
        java.awt.event.ContainerListener containerListener13 = null;
        paymentPanel1.removeContainerListener(containerListener13);
        java.awt.Insets insets15 = null;
        java.awt.Insets insets16 = paymentPanel1.getInsets(insets15);
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.Graphics graphics23 = null;
        sensorPanel18.paintAll(graphics23);
        java.awt.event.MouseListener mouseListener25 = null;
        sensorPanel18.addMouseListener(mouseListener25);
        java.awt.Component component28 = paymentPanel1.add((java.awt.Component) sensorPanel18, (int) (byte) -1);
        java.awt.event.KeyListener keyListener29 = null;
        component28.removeKeyListener(keyListener29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(insets16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(component28);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        sensorPanel7.removeInputMethodListener(inputMethodListener12);
        sensorPanel7.enable();
        java.awt.Point point15 = sensorPanel7.location();
        mainUI0.setLocation(point15);
        mainUI0.setFocusableWindowState(false);
        java.awt.Container container19 = mainUI0.getFocusCycleRootAncestor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNull(container19);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        sensorPanel1.resetKeyboardActions();
        javax.swing.InputMap inputMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.setInputMap((int) (short) 100, inputMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        javax.swing.TransferHandler transferHandler8 = null;
        sensorPanel1.setTransferHandler(transferHandler8);
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.lang.String str15 = sensorPanel11.getToolTipText(mouseEvent14);
        java.awt.Graphics graphics16 = null;
        sensorPanel11.paintAll(graphics16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.PaymentPanel paymentPanel19 = new scheduler.gui.PaymentPanel(mainUI18);
        boolean boolean20 = paymentPanel19.isEnabled();
        boolean boolean21 = paymentPanel19.isPaintingForPrint();
        paymentPanel19.hide();
        java.awt.Dimension dimension23 = paymentPanel19.getMaximumSize();
        sensorPanel11.setMaximumSize(dimension23);
        sensorPanel1.setMaximumSize(dimension23);
        boolean boolean26 = sensorPanel1.isOptimizedDrawingEnabled();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        boolean boolean6 = mainUI0.isFocusCycleRoot();
        boolean boolean7 = mainUI0.isFocusTraversalPolicySet();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        scheduler.gui.MainUI mainUI2 = new scheduler.gui.MainUI();
        java.awt.Component component3 = mainUI2.getGlassPane();
        mainUI2.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mainUI2.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        mainUI2.show();
        scheduler.gui.MainUI mainUI10 = null;
        scheduler.gui.SensorPanel sensorPanel11 = new scheduler.gui.SensorPanel(mainUI10);
        java.awt.event.ContainerListener containerListener12 = null;
        sensorPanel11.removeContainerListener(containerListener12);
        java.lang.String str14 = sensorPanel11.toString();
        java.awt.MenuComponent menuComponent15 = null;
        sensorPanel11.remove(menuComponent15);
        java.awt.Component[] componentArray17 = sensorPanel11.getComponents();
        scheduler.gui.MainUI mainUI18 = new scheduler.gui.MainUI();
        mainUI18.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI18.addWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI18.isFocusableWindow();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        sensorPanel25.removeInputMethodListener(inputMethodListener30);
        sensorPanel25.enable();
        java.awt.Point point33 = sensorPanel25.location();
        mainUI18.setLocation(point33);
        mainUI18.setFocusableWindowState(false);
        java.awt.Dimension dimension37 = mainUI18.getSize();
        sensorPanel11.resize(dimension37);
        paymentPanel1.putClientProperty((java.lang.Object) mainUI2, (java.lang.Object) sensorPanel11);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Dimension dimension46 = sensorPanel41.minimumSize();
        java.awt.ImageCapabilities imageCapabilities49 = null;
        java.awt.image.VolatileImage volatileImage50 = sensorPanel41.createVolatileImage(8, (-1), imageCapabilities49);
        java.awt.Image image53 = sensorPanel41.createImage(3, 1);
        java.awt.Rectangle rectangle54 = null;
        java.awt.Rectangle rectangle55 = sensorPanel41.getBounds(rectangle54);
        sensorPanel11.setBounds(rectangle55);
        scheduler.gui.MainUI mainUI57 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        mainUI57.addPropertyChangeListener("hi!", propertyChangeListener59);
        java.awt.Insets insets61 = mainUI57.getInsets();
        java.awt.Rectangle rectangle62 = null;
        mainUI57.setMaximizedBounds(rectangle62);
        mainUI57.toBack();
        scheduler.gui.MainUI mainUI65 = null;
        scheduler.gui.PaymentPanel paymentPanel66 = new scheduler.gui.PaymentPanel(mainUI65);
        boolean boolean67 = paymentPanel66.isEnabled();
        boolean boolean68 = paymentPanel66.isPaintingForPrint();
        boolean boolean69 = paymentPanel66.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI70 = new scheduler.gui.MainUI();
        mainUI70.setTitle("REGISTRATION");
        int int73 = mainUI70.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener74 = null;
        mainUI70.removeWindowFocusListener(windowFocusListener74);
        javax.swing.TransferHandler transferHandler76 = null;
        mainUI70.setTransferHandler(transferHandler76);
        java.awt.im.InputContext inputContext78 = mainUI70.getInputContext();
        paymentPanel66.setNextFocusableComponent((java.awt.Component) mainUI70);
        java.awt.Dialog.ModalExclusionType modalExclusionType80 = mainUI70.getModalExclusionType();
        mainUI57.setModalExclusionType(modalExclusionType80);
        javax.swing.JMenuBar jMenuBar82 = mainUI57.getJMenuBar();
        java.awt.Graphics graphics83 = mainUI57.getGraphics();
        sensorPanel11.paint(graphics83);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertNull(volatileImage50);
        org.junit.Assert.assertNull(image53);
        org.junit.Assert.assertNotNull(rectangle55);
        org.junit.Assert.assertNotNull(insets61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(inputContext78);
        org.junit.Assert.assertTrue("'" + modalExclusionType80 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType80.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar82);
        org.junit.Assert.assertNotNull(graphics83);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        paymentPanel1.removePropertyChangeListener("hi!", propertyChangeListener10);
        paymentPanel1.disable();
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.awt.Point point14 = paymentPanel1.getToolTipLocation(mouseEvent13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(point14);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        mainUI0.setFocusCycleRoot(false);
        java.awt.Event event11 = null;
        scheduler.gui.MainUI mainUI12 = new scheduler.gui.MainUI();
        java.awt.Component component13 = mainUI12.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel14 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI12);
        java.awt.Graphics graphics15 = chiefCoordinatorDashboardPanel14.getGraphics();
        javax.swing.KeyStroke keyStroke16 = null;
        int int17 = chiefCoordinatorDashboardPanel14.getConditionForKeyStroke(keyStroke16);
        boolean boolean18 = mainUI0.gotFocus(event11, (java.lang.Object) int17);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(graphics15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        int int7 = sensorPanel1.getHeight();
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        java.awt.ImageCapabilities imageCapabilities18 = null;
        java.awt.image.VolatileImage volatileImage19 = sensorPanel10.createVolatileImage(8, (-1), imageCapabilities18);
        java.awt.Image image22 = sensorPanel10.createImage(3, 1);
        boolean boolean23 = sensorPanel10.isFontSet();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component24 = sensorPanel1.add("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) sensorPanel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: unknown constraint: scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(volatileImage19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        double double4 = booking0.calculateFinalCost();
        double double6 = booking0.calculateFinalCost((int) (short) -1);
        double double7 = booking0.calculateFinalCost();
        java.time.LocalDateTime localDateTime8 = booking0.getEndTime();
        scheduler.pricing.StaffPricing staffPricing9 = new scheduler.pricing.StaffPricing();
        double double10 = staffPricing9.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing9);
        boolean boolean13 = booking0.executePayment((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.user.Student student7 = new scheduler.user.Student();
        mainUI0.setCurrentUser((scheduler.user.User) student7);
        boolean boolean10 = student7.checkPassword("ADMIN_DASHBOARD");
        boolean boolean11 = student7.isVerified();
        boolean boolean12 = student7.isVerified();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.list(printStream7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.awt.Event event8 = null;
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        sensorPanel10.removeInputMethodListener(inputMethodListener15);
        sensorPanel10.enable();
        boolean boolean18 = mainUI0.lostFocus(event8, (java.lang.Object) sensorPanel10);
        java.awt.Cursor cursor19 = null;
        mainUI0.setCursor(cursor19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.lang.String str25 = sensorPanel22.toString();
        java.awt.MenuComponent menuComponent26 = null;
        sensorPanel22.remove(menuComponent26);
        java.awt.Component[] componentArray28 = sensorPanel22.getComponents();
        javax.swing.TransferHandler transferHandler29 = null;
        sensorPanel22.setTransferHandler(transferHandler29);
        mainUI0.setContentPane((java.awt.Container) sensorPanel22);
        java.awt.Event event32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = mainUI0.postEvent(event32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(componentArray28);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        scheduler.user.User user4 = userFactory0.getUserByID("Room Booking System");
        scheduler.user.User user6 = userFactory0.getUserByID("ADMIN_DASHBOARD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        mainUI0.firePropertyChange("", (long) 64, 10L);
        int int8 = mainUI0.getWidth();
        mainUI0.resize((int) ' ', (int) '4');
        java.awt.event.WindowFocusListener[] windowFocusListenerArray12 = mainUI0.getWindowFocusListeners();
        float float13 = mainUI0.getOpacity();
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        mainUI14.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel17 = new scheduler.gui.AdminDashboardPanel(mainUI14);
        java.awt.Graphics graphics18 = mainUI14.getGraphics();
        int int19 = mainUI14.getHeight();
        javax.accessibility.AccessibleContext accessibleContext20 = mainUI14.getAccessibleContext();
        scheduler.gui.RoomBookingPanel roomBookingPanel21 = new scheduler.gui.RoomBookingPanel(mainUI14);
        scheduler.gui.MainUI mainUI22 = new scheduler.gui.MainUI();
        java.awt.Component component23 = mainUI22.getGlassPane();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        component23.addInputMethodListener(inputMethodListener24);
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.Dimension dimension32 = sensorPanel27.minimumSize();
        java.awt.ImageCapabilities imageCapabilities35 = null;
        java.awt.image.VolatileImage volatileImage36 = sensorPanel27.createVolatileImage(8, (-1), imageCapabilities35);
        javax.swing.InputMap inputMap37 = sensorPanel27.getInputMap();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.lang.String str42 = sensorPanel39.toString();
        java.awt.MenuComponent menuComponent43 = null;
        sensorPanel39.remove(menuComponent43);
        java.awt.Component[] componentArray45 = sensorPanel39.getComponents();
        java.awt.LayoutManager layoutManager46 = sensorPanel39.getLayout();
        scheduler.gui.MainUI mainUI47 = null;
        scheduler.gui.SensorPanel sensorPanel48 = new scheduler.gui.SensorPanel(mainUI47);
        java.awt.event.ContainerListener containerListener49 = null;
        sensorPanel48.removeContainerListener(containerListener49);
        java.awt.event.MouseEvent mouseEvent51 = null;
        java.lang.String str52 = sensorPanel48.getToolTipText(mouseEvent51);
        java.awt.Dimension dimension53 = sensorPanel48.minimumSize();
        java.awt.ImageCapabilities imageCapabilities56 = null;
        java.awt.image.VolatileImage volatileImage57 = sensorPanel48.createVolatileImage(8, (-1), imageCapabilities56);
        java.awt.Image image60 = sensorPanel48.createImage(3, 1);
        java.awt.Rectangle rectangle61 = null;
        java.awt.Rectangle rectangle62 = sensorPanel48.getBounds(rectangle61);
        sensorPanel39.paintImmediately(rectangle62);
        sensorPanel27.paintImmediately(rectangle62);
        java.awt.Rectangle rectangle65 = component23.getBounds(rectangle62);
        roomBookingPanel21.setBounds(rectangle62);
        mainUI0.setMaximizedBounds(rectangle62);
        scheduler.gui.MainUI mainUI68 = new scheduler.gui.MainUI();
        mainUI68.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener71 = null;
        mainUI68.addWindowFocusListener(windowFocusListener71);
        scheduler.gui.MainUI mainUI73 = null;
        scheduler.gui.PaymentPanel paymentPanel74 = new scheduler.gui.PaymentPanel(mainUI73);
        boolean boolean75 = paymentPanel74.isEnabled();
        boolean boolean76 = paymentPanel74.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation77 = paymentPanel74.getComponentOrientation();
        mainUI68.setComponentOrientation(componentOrientation77);
        java.awt.Window.Type type79 = mainUI68.getType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setType(type79);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(graphics18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 650 + "'", int19 == 650);
        org.junit.Assert.assertNotNull(accessibleContext20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertNull(volatileImage36);
        org.junit.Assert.assertNotNull(inputMap37);
        org.junit.Assert.assertNotNull(componentArray45);
        org.junit.Assert.assertNotNull(layoutManager46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(dimension53);
        org.junit.Assert.assertNull(volatileImage57);
        org.junit.Assert.assertNull(image60);
        org.junit.Assert.assertNotNull(rectangle62);
        org.junit.Assert.assertNotNull(rectangle65);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(componentOrientation77);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + java.awt.Window.Type.NORMAL + "'", type79.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        scheduler.user.Student student0 = new scheduler.user.Student();
        java.lang.String str1 = student0.getEmail();
        boolean boolean3 = student0.checkPassword("ToolTipText");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.Dimension dimension8 = sensorPanel1.getMinimumSize();
        java.awt.Event event9 = null;
        boolean boolean11 = sensorPanel1.lostFocus(event9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        mainUI0.setExtendedState((int) (byte) 10);
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI0.removePropertyChangeListener("ToolTipText", propertyChangeListener9);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        mainUI0.firePropertyChange("", (long) 64, 10L);
        int int8 = mainUI0.getWidth();
        mainUI0.resize((int) ' ', (int) '4');
        java.awt.event.WindowFocusListener[] windowFocusListenerArray12 = mainUI0.getWindowFocusListeners();
        float float13 = mainUI0.getOpacity();
        boolean boolean14 = mainUI0.isLightweight();
        mainUI0.setFocusTraversalPolicyProvider(true);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.awt.event.WindowStateListener windowStateListener14 = null;
        mainUI0.removeWindowStateListener(windowStateListener14);
        java.awt.ComponentOrientation componentOrientation16 = mainUI0.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(componentOrientation16);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
        boolean boolean11 = mainUI0.isMinimumSizeSet();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        scheduler.gui.RoomManagementPanel roomManagementPanel8 = new scheduler.gui.RoomManagementPanel(mainUI0);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.PaymentPanel paymentPanel10 = new scheduler.gui.PaymentPanel(mainUI9);
        boolean boolean11 = paymentPanel10.isEnabled();
        boolean boolean12 = paymentPanel10.isPaintingForPrint();
        boolean boolean13 = paymentPanel10.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.Dimension dimension20 = sensorPanel15.minimumSize();
        paymentPanel10.setSize(dimension20);
        boolean boolean22 = paymentPanel10.isRequestFocusEnabled();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = sensorPanel24.getToolTipText(mouseEvent27);
        java.awt.Dimension dimension29 = sensorPanel24.minimumSize();
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        sensorPanel31.transferFocus();
        java.awt.image.ImageProducer imageProducer37 = null;
        java.awt.Image image38 = sensorPanel31.createImage(imageProducer37);
        scheduler.gui.MainUI mainUI41 = null;
        scheduler.gui.SensorPanel sensorPanel42 = new scheduler.gui.SensorPanel(mainUI41);
        java.awt.event.ContainerListener containerListener43 = null;
        sensorPanel42.removeContainerListener(containerListener43);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.lang.String str46 = sensorPanel42.getToolTipText(mouseEvent45);
        java.awt.Insets insets47 = sensorPanel42.getInsets();
        int int48 = sensorPanel24.checkImage(image38, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel42);
        java.awt.event.InputMethodListener[] inputMethodListenerArray49 = sensorPanel42.getInputMethodListeners();
        java.awt.Rectangle rectangle50 = sensorPanel42.getBounds();
        java.awt.event.MouseEvent mouseEvent51 = null;
        java.awt.Point point52 = sensorPanel42.getToolTipLocation(mouseEvent51);
        roomManagementPanel8.add((java.awt.Component) paymentPanel10, (java.lang.Object) mouseEvent51);
        int int54 = roomManagementPanel8.getY();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(image38);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(insets47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray49);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray49, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(rectangle50);
        org.junit.Assert.assertNull(point52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        sensorPanel30.removeInputMethodListener(inputMethodListener35);
        java.awt.Component component39 = sensorPanel30.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.lang.String str44 = sensorPanel41.toString();
        java.awt.MenuComponent menuComponent45 = null;
        sensorPanel41.remove(menuComponent45);
        java.awt.Component[] componentArray47 = sensorPanel41.getComponents();
        javax.swing.TransferHandler transferHandler48 = null;
        sensorPanel41.setTransferHandler(transferHandler48);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Graphics graphics56 = null;
        sensorPanel51.paintAll(graphics56);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.PaymentPanel paymentPanel59 = new scheduler.gui.PaymentPanel(mainUI58);
        boolean boolean60 = paymentPanel59.isEnabled();
        boolean boolean61 = paymentPanel59.isPaintingForPrint();
        paymentPanel59.hide();
        java.awt.Dimension dimension63 = paymentPanel59.getMaximumSize();
        sensorPanel51.setMaximumSize(dimension63);
        sensorPanel41.setMaximumSize(dimension63);
        sensorPanel30.resize(dimension63);
        sensorPanel19.setMinimumSize(dimension63);
        sensorPanel19.firePropertyChange("Room Booking System", (double) 0.5f, 40.0d);
        boolean boolean74 = sensorPanel19.contains((int) (short) -1, 3);
        sensorPanel19.setAlignmentY((float) 10L);
        java.awt.GraphicsConfiguration graphicsConfiguration77 = sensorPanel19.getGraphicsConfiguration();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(component39);
        org.junit.Assert.assertNotNull(componentArray47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dimension63);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(graphicsConfiguration77);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        int int4 = mainUI0.getState();
        mainUI0.enableInputMethods(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = paymentPanel1.getPopupLocation(mouseEvent12);
        paymentPanel1.setInheritsPopupMenu(false);
        paymentPanel1.removeAll();
        boolean boolean19 = paymentPanel1.contains(13, 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.lang.String str1 = scheduler.database.CsvDatabase.clean("Room Booking System");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Room Booking System" + "'", str1, "Room Booking System");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        javax.swing.TransferHandler transferHandler6 = null;
        mainUI0.setTransferHandler(transferHandler6);
        java.awt.im.InputContext inputContext8 = mainUI0.getInputContext();
        mainUI0.show();
        java.awt.GraphicsConfiguration graphicsConfiguration10 = mainUI0.getGraphicsConfiguration();
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        java.awt.Component component12 = mainUI11.getGlassPane();
        mainUI11.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener16 = null;
        mainUI11.removeHierarchyBoundsListener(hierarchyBoundsListener16);
        mainUI11.show();
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        mainUI19.addPropertyChangeListener("hi!", propertyChangeListener21);
        java.awt.Insets insets23 = mainUI19.getInsets();
        java.awt.Rectangle rectangle24 = null;
        mainUI19.setMaximizedBounds(rectangle24);
        java.awt.Event event26 = null;
        boolean boolean29 = mainUI19.mouseDrag(event26, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension30 = mainUI19.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener31 = null;
        mainUI19.addHierarchyBoundsListener(hierarchyBoundsListener31);
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.SensorPanel sensorPanel34 = new scheduler.gui.SensorPanel(mainUI33);
        java.awt.event.ContainerListener containerListener35 = null;
        sensorPanel34.removeContainerListener(containerListener35);
        java.awt.event.MouseEvent mouseEvent37 = null;
        java.lang.String str38 = sensorPanel34.getToolTipText(mouseEvent37);
        java.awt.Dimension dimension39 = sensorPanel34.minimumSize();
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        sensorPanel41.transferFocus();
        java.awt.image.ImageProducer imageProducer47 = null;
        java.awt.Image image48 = sensorPanel41.createImage(imageProducer47);
        scheduler.gui.MainUI mainUI51 = null;
        scheduler.gui.SensorPanel sensorPanel52 = new scheduler.gui.SensorPanel(mainUI51);
        java.awt.event.ContainerListener containerListener53 = null;
        sensorPanel52.removeContainerListener(containerListener53);
        java.awt.event.MouseEvent mouseEvent55 = null;
        java.lang.String str56 = sensorPanel52.getToolTipText(mouseEvent55);
        java.awt.Insets insets57 = sensorPanel52.getInsets();
        int int58 = sensorPanel34.checkImage(image48, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel52);
        scheduler.gui.MainUI mainUI61 = null;
        scheduler.gui.SensorPanel sensorPanel62 = new scheduler.gui.SensorPanel(mainUI61);
        java.awt.event.ContainerListener containerListener63 = null;
        sensorPanel62.removeContainerListener(containerListener63);
        java.awt.event.MouseEvent mouseEvent65 = null;
        java.lang.String str66 = sensorPanel62.getToolTipText(mouseEvent65);
        java.awt.Insets insets67 = sensorPanel62.getInsets();
        boolean boolean68 = sensorPanel62.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener69 = null;
        sensorPanel62.addContainerListener(containerListener69);
        int int71 = mainUI19.checkImage(image48, 32, 1, (java.awt.image.ImageObserver) sensorPanel62);
        scheduler.gui.MainUI mainUI72 = new scheduler.gui.MainUI();
        java.awt.Component component73 = mainUI72.getGlassPane();
        mainUI72.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener77 = null;
        mainUI72.removeHierarchyBoundsListener(hierarchyBoundsListener77);
        int int79 = mainUI11.checkImage(image48, (java.awt.image.ImageObserver) mainUI72);
        scheduler.gui.MainUI mainUI82 = null;
        scheduler.gui.PaymentPanel paymentPanel83 = new scheduler.gui.PaymentPanel(mainUI82);
        boolean boolean84 = paymentPanel83.isEnabled();
        boolean boolean85 = paymentPanel83.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation86 = paymentPanel83.getComponentOrientation();
        java.awt.Component component87 = paymentPanel83.getNextFocusableComponent();
        int int88 = mainUI0.checkImage(image48, (int) (short) -1, 0, (java.awt.image.ImageObserver) paymentPanel83);
        java.awt.MenuComponent menuComponent89 = null;
        mainUI0.remove(menuComponent89);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component92 = mainUI0.getComponent((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(inputContext8);
        org.junit.Assert.assertNotNull(graphicsConfiguration10);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNotNull(insets23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(image48);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(insets57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(insets67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(component73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(componentOrientation86);
        org.junit.Assert.assertNull(component87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 32 + "'", int88 == 32);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        java.awt.MenuComponent menuComponent5 = null;
        paymentPanel1.remove(menuComponent5);
        java.awt.event.ComponentListener componentListener7 = null;
        paymentPanel1.addComponentListener(componentListener7);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = paymentPanel1.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        java.time.LocalDateTime localDateTime4 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI0.addPropertyChangeListener("SENSOR", propertyChangeListener10);
        boolean boolean12 = mainUI0.isFocusTraversalPolicyProvider();
        scheduler.gui.LoginPanel loginPanel13 = new scheduler.gui.LoginPanel(mainUI0);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.show();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        mainUI8.addPropertyChangeListener("hi!", propertyChangeListener10);
        java.awt.Insets insets12 = mainUI8.getInsets();
        java.awt.Rectangle rectangle13 = null;
        mainUI8.setMaximizedBounds(rectangle13);
        java.awt.Event event15 = null;
        boolean boolean18 = mainUI8.mouseDrag(event15, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension19 = mainUI8.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mainUI8.addHierarchyBoundsListener(hierarchyBoundsListener20);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Dimension dimension28 = sensorPanel23.minimumSize();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        sensorPanel30.transferFocus();
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = sensorPanel30.createImage(imageProducer36);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Insets insets46 = sensorPanel41.getInsets();
        int int47 = sensorPanel23.checkImage(image37, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.Insets insets56 = sensorPanel51.getInsets();
        boolean boolean57 = sensorPanel51.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener58 = null;
        sensorPanel51.addContainerListener(containerListener58);
        int int60 = mainUI8.checkImage(image37, 32, 1, (java.awt.image.ImageObserver) sensorPanel51);
        scheduler.gui.MainUI mainUI61 = new scheduler.gui.MainUI();
        java.awt.Component component62 = mainUI61.getGlassPane();
        mainUI61.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener66 = null;
        mainUI61.removeHierarchyBoundsListener(hierarchyBoundsListener66);
        int int68 = mainUI0.checkImage(image37, (java.awt.image.ImageObserver) mainUI61);
        boolean boolean69 = mainUI61.isLocationByPlatform();
        java.awt.Component component70 = mainUI61.getGlassPane();
        mainUI61.show();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(insets56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(component70);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        boolean boolean8 = userDashboardPanel7.isManagingFocus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.LayoutManager layoutManager8 = sensorPanel1.getLayout();
        java.awt.LayoutManager layoutManager9 = sensorPanel1.getLayout();
        sensorPanel1.firePropertyChange("REGISTRATION", (double) (short) 1, (double) 16);
        javax.swing.border.Border border14 = sensorPanel1.getBorder();
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.deliverEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertNotNull(border14);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        java.awt.Graphics graphics26 = mainUI0.getGraphics();
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.PaymentPanel paymentPanel28 = new scheduler.gui.PaymentPanel(mainUI27);
        boolean boolean29 = paymentPanel28.isEnabled();
        boolean boolean30 = paymentPanel28.isPaintingForPrint();
        boolean boolean31 = paymentPanel28.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI32 = new scheduler.gui.MainUI();
        mainUI32.setTitle("REGISTRATION");
        int int35 = mainUI32.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener36 = null;
        mainUI32.removeWindowFocusListener(windowFocusListener36);
        javax.swing.TransferHandler transferHandler38 = null;
        mainUI32.setTransferHandler(transferHandler38);
        java.awt.im.InputContext inputContext40 = mainUI32.getInputContext();
        paymentPanel28.setNextFocusableComponent((java.awt.Component) mainUI32);
        javax.swing.JLayeredPane jLayeredPane42 = mainUI32.getLayeredPane();
        java.awt.Dimension dimension43 = jLayeredPane42.getMaximumSize();
        mainUI0.setLayeredPane(jLayeredPane42);
        boolean boolean45 = mainUI0.isShowing();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertNotNull(graphics26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(inputContext40);
        org.junit.Assert.assertNotNull(jLayeredPane42);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = paymentPanel1.getPopupLocation(mouseEvent12);
        java.awt.Component[] componentArray14 = paymentPanel1.getComponents();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNotNull(componentArray14);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.cancel();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getEndTime();
        boolean boolean5 = booking0.executePayment((double) (short) 10);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.removeAll();
        paymentPanel1.addNotify();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.PaymentPanel paymentPanel7 = new scheduler.gui.PaymentPanel(mainUI6);
        boolean boolean8 = paymentPanel7.isEnabled();
        boolean boolean9 = paymentPanel7.isPaintingForPrint();
        boolean boolean10 = paymentPanel7.getVerifyInputWhenFocusTarget();
        java.awt.Event event11 = null;
        boolean boolean14 = paymentPanel7.mouseDrag(event11, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI15 = new scheduler.gui.MainUI();
        java.awt.Component component16 = mainUI15.getGlassPane();
        javax.swing.JMenuBar jMenuBar17 = mainUI15.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.Component component19 = null;
        boolean boolean20 = mainUI15.isAncestorOf(component19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        boolean boolean23 = paymentPanel22.isEnabled();
        boolean boolean24 = paymentPanel22.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation25 = paymentPanel22.getComponentOrientation();
        mainUI15.setComponentOrientation(componentOrientation25);
        paymentPanel7.applyComponentOrientation(componentOrientation25);
        boolean boolean28 = paymentPanel7.isDoubleBuffered();
        scheduler.gui.MainUI mainUI29 = new scheduler.gui.MainUI();
        mainUI29.setTitle("REGISTRATION");
        int int32 = mainUI29.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        mainUI29.addPropertyChangeListener("REGISTRATION", propertyChangeListener34);
        scheduler.gui.UserDashboardPanel userDashboardPanel36 = new scheduler.gui.UserDashboardPanel(mainUI29);
        java.awt.Component component39 = mainUI29.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI40 = new scheduler.gui.MainUI();
        mainUI40.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener43 = null;
        mainUI40.addWindowFocusListener(windowFocusListener43);
        boolean boolean45 = mainUI40.isFocusableWindow();
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.SensorPanel sensorPanel47 = new scheduler.gui.SensorPanel(mainUI46);
        java.awt.event.ContainerListener containerListener48 = null;
        sensorPanel47.removeContainerListener(containerListener48);
        java.awt.event.MouseEvent mouseEvent50 = null;
        java.lang.String str51 = sensorPanel47.getToolTipText(mouseEvent50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        sensorPanel47.removeInputMethodListener(inputMethodListener52);
        sensorPanel47.enable();
        java.awt.Point point55 = sensorPanel47.location();
        mainUI40.setLocation(point55);
        mainUI29.setLocation(point55);
        java.awt.Point point58 = paymentPanel7.getLocation(point55);
        java.awt.Component component59 = paymentPanel1.findComponentAt(point58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertNull(jMenuBar17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(componentOrientation25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(point55);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertNull(component59);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("");
        hardwareSensor2.notifyObservers("PAYMENT");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        java.awt.Graphics graphics14 = sensorPanel1.getGraphics();
        java.awt.Font font15 = sensorPanel1.getFont();
        java.awt.Dimension dimension16 = sensorPanel1.getMinimumSize();
        sensorPanel1.removeNotify();
        sensorPanel1.repaint((long) (short) 1, 83, 0, 128, 83);
        sensorPanel1.setOpaque(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.awt.Image image13 = sensorPanel1.createImage(3, 1);
        sensorPanel1.repaint(10L);
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.awt.Component component17 = mainUI16.getGlassPane();
        javax.swing.JMenuBar jMenuBar18 = mainUI16.getJMenuBar();
        mainUI16.setState((int) (short) 0);
        mainUI16.setLocation(0, 64);
        java.awt.Color color24 = mainUI16.getBackground();
        scheduler.gui.MainUI mainUI25 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        mainUI25.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.Insets insets29 = mainUI25.getInsets();
        java.awt.Rectangle rectangle30 = null;
        mainUI25.setMaximizedBounds(rectangle30);
        mainUI25.toBack();
        scheduler.gui.MainUI mainUI33 = new scheduler.gui.MainUI();
        mainUI33.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel36 = new scheduler.gui.AdminDashboardPanel(mainUI33);
        java.awt.Graphics graphics37 = mainUI33.getGraphics();
        mainUI25.paint(graphics37);
        mainUI16.paintComponents(graphics37);
        sensorPanel1.paint(graphics37);
        sensorPanel1.doLayout();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(jMenuBar18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertNotNull(graphics37);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = sensorPanel1.getPropertyChangeListeners();
        sensorPanel1.setOpaque(false);
        java.awt.event.MouseMotionListener mouseMotionListener11 = null;
        sensorPanel1.removeMouseMotionListener(mouseMotionListener11);
        boolean boolean15 = sensorPanel1.inside(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray8, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        java.awt.Event event3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mainUI0.postEvent(event3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        javax.swing.TransferHandler transferHandler11 = mainUI0.getTransferHandler();
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Graphics graphics18 = null;
        sensorPanel13.paintAll(graphics18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.SensorPanel sensorPanel21 = new scheduler.gui.SensorPanel(mainUI20);
        java.awt.event.ContainerListener containerListener22 = null;
        sensorPanel21.removeContainerListener(containerListener22);
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.lang.String str25 = sensorPanel21.getToolTipText(mouseEvent24);
        java.awt.Dimension dimension26 = sensorPanel21.minimumSize();
        java.awt.ImageCapabilities imageCapabilities29 = null;
        java.awt.image.VolatileImage volatileImage30 = sensorPanel21.createVolatileImage(8, (-1), imageCapabilities29);
        java.awt.Image image33 = sensorPanel21.createImage(3, 1);
        java.awt.Graphics graphics34 = sensorPanel21.getGraphics();
        java.awt.Font font35 = sensorPanel21.getFont();
        java.awt.FontMetrics fontMetrics36 = sensorPanel13.getFontMetrics(font35);
        mainUI0.setFont(font35);
        java.awt.MenuBar menuBar38 = mainUI0.getMenuBar();
        java.lang.Object obj39 = mainUI0.getTreeLock();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel40 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        mainUI0.setIgnoreRepaint(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(transferHandler11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNull(volatileImage30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertNull(graphics34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(fontMetrics36);
        org.junit.Assert.assertNull(menuBar38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        paymentPanel1.updateUI();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.PaymentPanel paymentPanel9 = new scheduler.gui.PaymentPanel(mainUI8);
        boolean boolean10 = paymentPanel9.isEnabled();
        boolean boolean11 = paymentPanel9.isPaintingForPrint();
        boolean boolean12 = paymentPanel9.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        mainUI13.setTitle("REGISTRATION");
        int int16 = mainUI13.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener17 = null;
        mainUI13.removeWindowFocusListener(windowFocusListener17);
        javax.swing.TransferHandler transferHandler19 = null;
        mainUI13.setTransferHandler(transferHandler19);
        java.awt.im.InputContext inputContext21 = mainUI13.getInputContext();
        paymentPanel9.setNextFocusableComponent((java.awt.Component) mainUI13);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = mainUI13.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType23);
        javax.swing.JMenuBar jMenuBar25 = mainUI0.getJMenuBar();
        mainUI0.enable();
        mainUI0.invalidate();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
        mainUI0.addHierarchyBoundsListener(hierarchyBoundsListener28);
        mainUI0.setFocusCycleRoot(true);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        java.awt.Component component7 = paymentPanel1.findComponentAt(0, 83);
        paymentPanel1.hide();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseEnter(event8, 3, (int) (short) 100);
        java.awt.Color color12 = sensorPanel1.getBackground();
        sensorPanel1.nextFocus();
        sensorPanel1.repaint(0L, (int) (byte) 10, (int) ' ', 12, 32);
        boolean boolean20 = sensorPanel1.requestFocusInWindow();
        java.awt.im.InputContext inputContext21 = sensorPanel1.getInputContext();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputContext21);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = sensorPanel9.getToolTipText(mouseEvent12);
        java.awt.Dimension dimension14 = sensorPanel9.minimumSize();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel16.getToolTipText(mouseEvent19);
        sensorPanel16.transferFocus();
        java.awt.image.ImageProducer imageProducer22 = null;
        java.awt.Image image23 = sensorPanel16.createImage(imageProducer22);
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.SensorPanel sensorPanel27 = new scheduler.gui.SensorPanel(mainUI26);
        java.awt.event.ContainerListener containerListener28 = null;
        sensorPanel27.removeContainerListener(containerListener28);
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.lang.String str31 = sensorPanel27.getToolTipText(mouseEvent30);
        java.awt.Insets insets32 = sensorPanel27.getInsets();
        int int33 = sensorPanel9.checkImage(image23, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel27);
        java.awt.im.InputContext inputContext34 = sensorPanel9.getInputContext();
        java.awt.LayoutManager layoutManager35 = sensorPanel9.getLayout();
        scheduler.gui.MainUI mainUI36 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        mainUI36.addPropertyChangeListener("hi!", propertyChangeListener38);
        java.awt.Insets insets40 = mainUI36.getInsets();
        javax.swing.TransferHandler transferHandler41 = mainUI36.getTransferHandler();
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.SensorPanel sensorPanel43 = new scheduler.gui.SensorPanel(mainUI42);
        java.awt.event.ContainerListener containerListener44 = null;
        sensorPanel43.removeContainerListener(containerListener44);
        java.awt.event.MouseEvent mouseEvent46 = null;
        java.lang.String str47 = sensorPanel43.getToolTipText(mouseEvent46);
        java.awt.Dimension dimension48 = sensorPanel43.minimumSize();
        java.awt.ImageCapabilities imageCapabilities51 = null;
        java.awt.image.VolatileImage volatileImage52 = sensorPanel43.createVolatileImage(8, (-1), imageCapabilities51);
        java.awt.Image image55 = sensorPanel43.createImage(3, 1);
        java.awt.Component[] componentArray56 = sensorPanel43.getComponents();
        boolean boolean57 = sensorPanel43.isCursorSet();
        java.awt.Dimension dimension58 = sensorPanel43.size();
        mainUI36.resize(dimension58);
        java.awt.Dimension dimension60 = sensorPanel9.getSize(dimension58);
        sensorPanel1.setMaximumSize(dimension60);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(insets32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNull(inputContext34);
        org.junit.Assert.assertNotNull(layoutManager35);
        org.junit.Assert.assertNotNull(insets40);
        org.junit.Assert.assertNull(transferHandler41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertNull(volatileImage52);
        org.junit.Assert.assertNull(image55);
        org.junit.Assert.assertNotNull(componentArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertNotNull(dimension60);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.updateUI();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        java.awt.Event event16 = null;
        boolean boolean19 = mainUI9.mouseDrag(event16, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension20 = mainUI9.getPreferredSize();
        scheduler.gui.RegistrationPanel registrationPanel21 = new scheduler.gui.RegistrationPanel(mainUI9);
        int int22 = sensorPanel1.getComponentZOrder((java.awt.Component) mainUI9);
        sensorPanel1.setRequestFocusEnabled(true);
        java.io.PrintStream printStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.list(printStream25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.Color color29 = sensorPanel19.getForeground();
        boolean boolean30 = sensorPanel19.isOpaque();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.SensorPanel sensorPanel5 = new scheduler.gui.SensorPanel(mainUI4);
        java.awt.event.ContainerListener containerListener6 = null;
        sensorPanel5.removeContainerListener(containerListener6);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = sensorPanel5.getToolTipText(mouseEvent8);
        java.awt.Dimension dimension10 = sensorPanel5.minimumSize();
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        sensorPanel12.transferFocus();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = sensorPanel12.createImage(imageProducer18);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.Insets insets28 = sensorPanel23.getInsets();
        int int29 = sensorPanel5.checkImage(image19, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel23);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        sensorPanel23.addPropertyChangeListener("hi!", propertyChangeListener31);
        java.awt.Color color33 = sensorPanel23.getForeground();
        paymentPanel1.setForeground(color33);
        java.awt.event.KeyListener keyListener35 = null;
        paymentPanel1.addKeyListener(keyListener35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        boolean boolean3 = booking0.isDepositForfeited();
        java.lang.String str4 = booking0.getBookingID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        java.awt.event.KeyListener keyListener7 = null;
        mainUI0.addKeyListener(keyListener7);
        boolean boolean9 = mainUI0.isVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.gui.RegistrationPanel registrationPanel7 = new scheduler.gui.RegistrationPanel(mainUI0);
        mainUI0.setAlwaysOnTop(true);
        mainUI0.setLocationByPlatform(false);
        org.junit.Assert.assertNotNull(insets4);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        sensorPanel8.transferFocus();
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = sensorPanel8.createImage(imageProducer14);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Insets insets24 = sensorPanel19.getInsets();
        int int25 = sensorPanel1.checkImage(image15, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel19);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        sensorPanel19.addPropertyChangeListener("hi!", propertyChangeListener27);
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.lang.String str33 = sensorPanel30.toString();
        java.awt.MenuComponent menuComponent34 = null;
        sensorPanel30.remove(menuComponent34);
        java.awt.Component[] componentArray36 = sensorPanel30.getComponents();
        java.awt.LayoutManager layoutManager37 = sensorPanel30.getLayout();
        java.awt.LayoutManager layoutManager38 = sensorPanel30.getLayout();
        sensorPanel19.setComponentZOrder((java.awt.Component) sensorPanel30, 3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(componentArray36);
        org.junit.Assert.assertNotNull(layoutManager37);
        org.junit.Assert.assertNotNull(layoutManager38);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        int int8 = mainUI0.getDefaultCloseOperation();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }
}
