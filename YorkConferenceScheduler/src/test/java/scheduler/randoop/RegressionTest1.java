package scheduler.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        double double4 = booking0.calculateUpfrontCost();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.awt.event.ContainerListener[] containerListenerArray57 = sensorPanel11.getContainerListeners();
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
        org.junit.Assert.assertNotNull(containerListenerArray57);
        org.junit.Assert.assertArrayEquals(containerListenerArray57, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Color color8 = mainUI0.getBackground();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        mainUI9.toBack();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel20 = new scheduler.gui.AdminDashboardPanel(mainUI17);
        java.awt.Graphics graphics21 = mainUI17.getGraphics();
        mainUI9.paint(graphics21);
        mainUI0.paintComponents(graphics21);
        boolean boolean24 = mainUI0.isFocusTraversable();
        mainUI0.setExtendedState(100);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.Rectangle rectangle7 = sensorPanel1.getVisibleRect();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel11 = new scheduler.gui.AdminDashboardPanel(mainUI8);
        java.awt.event.FocusListener[] focusListenerArray12 = mainUI8.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel13 = new scheduler.gui.AdminDashboardPanel(mainUI8);
        java.awt.event.MouseListener[] mouseListenerArray14 = mainUI8.getMouseListeners();
        mainUI8.logout();
        java.awt.Graphics graphics16 = mainUI8.getGraphics();
        sensorPanel1.print(graphics16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(focusListenerArray12);
        org.junit.Assert.assertArrayEquals(focusListenerArray12, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray14);
        org.junit.Assert.assertArrayEquals(mouseListenerArray14, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertNotNull(graphics16);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        int int15 = mainUI0.getCursorType();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = sensorPanel1.getBaselineResizeBehavior();
        sensorPanel1.reshape((int) (byte) 10, (int) (short) -1, 3, (int) (short) 100);
        java.lang.String str13 = sensorPanel1.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        boolean boolean11 = chiefCoordinatorDashboardPanel2.contains(83, (int) (byte) 10);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        mainUI0.addPropertyChangeListener(propertyChangeListener6);
        mainUI0.requestFocus();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.showPaymentPanel("CHIEF_COORDINATOR_DASHBOARD", localDateTime10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.modifyBooking("Student", localDateTime16, localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        boolean boolean17 = sensorPanel1.requestDefaultFocus();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(border16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        boolean boolean12 = sensorPanel1.getIgnoreRepaint();
        sensorPanel1.updateUI();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Shape shape8 = mainUI0.getShape();
        boolean boolean9 = mainUI0.isFocused();
        mainUI0.setBounds(6, 12, 64, 13);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        boolean boolean8 = mainUI0.isCursorSet();
        mainUI0.nextFocus();
        java.awt.Container container10 = mainUI0.getContentPane();
        container10.repaint(0, (int) (byte) 0, 0, (int) 'a');
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(container10);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.gui.RegistrationPanel registrationPanel7 = new scheduler.gui.RegistrationPanel(mainUI0);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = registrationPanel7.getBaselineResizeBehavior();
        javax.accessibility.AccessibleContext accessibleContext9 = registrationPanel7.getAccessibleContext();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = registrationPanel7.getPropertyChangeListeners("REGISTRATION");
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray11, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        boolean boolean8 = mainUI0.isCursorSet();
        mainUI0.nextFocus();
        java.awt.image.ColorModel colorModel10 = mainUI0.getColorModel();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(colorModel10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.setVerifyInputWhenFocusTarget(true);
        boolean boolean6 = paymentPanel1.isMaximumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.room.Room room2 = bookingSystemFacade0.getRoom("MY_BOOKINGS");
        boolean boolean4 = bookingSystemFacade0.removeRoom("LOGIN");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = bookingSystemFacade0.modifyBooking("SENSOR", localDateTime6, localDateTime7);
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(room2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        boolean boolean4 = booking0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        scheduler.gui.MainUI mainUI1 = new scheduler.gui.MainUI();
        java.awt.Component component2 = mainUI1.getGlassPane();
        javax.swing.JMenuBar jMenuBar3 = mainUI1.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel4 = new scheduler.gui.SensorPanel(mainUI1);
        java.awt.Component component5 = null;
        boolean boolean6 = mainUI1.isAncestorOf(component5);
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.PaymentPanel paymentPanel8 = new scheduler.gui.PaymentPanel(mainUI7);
        boolean boolean9 = paymentPanel8.isEnabled();
        boolean boolean10 = paymentPanel8.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation11 = paymentPanel8.getComponentOrientation();
        mainUI1.setComponentOrientation(componentOrientation11);
        java.awt.Dimension dimension13 = mainUI1.getSize();
        mainUI0.setMinimumSize(dimension13);
        java.awt.event.WindowListener windowListener15 = null;
        mainUI0.addWindowListener(windowListener15);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.createBufferStrategy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.InternalError; message: Could not create a buffer strategy");
        } catch (java.lang.InternalError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component2);
        org.junit.Assert.assertNull(jMenuBar3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(componentOrientation11);
        org.junit.Assert.assertNotNull(dimension13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        java.awt.Event event9 = null;
        boolean boolean12 = paymentPanel5.mouseUp(event9, 4, 6);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        paymentPanel5.removePropertyChangeListener(propertyChangeListener13);
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
        paymentPanel5.setComponentOrientation(componentOrientation34);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Color color8 = mainUI0.getBackground();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        mainUI9.toBack();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel20 = new scheduler.gui.AdminDashboardPanel(mainUI17);
        java.awt.Graphics graphics21 = mainUI17.getGraphics();
        mainUI9.paint(graphics21);
        mainUI0.paintComponents(graphics21);
        mainUI0.hide();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        mainUI0.showAdministratorBookings();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        boolean boolean8 = paymentPanel1.isOpaque();
        boolean boolean9 = paymentPanel1.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        scheduler.pricing.StaffPricing staffPricing12 = new scheduler.pricing.StaffPricing();
        double double13 = staffPricing12.getHourlyRate();
        double double14 = staffPricing12.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing12);
        double double17 = booking0.calculateFinalCost(5);
        java.lang.String str18 = booking0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation4 = paymentPanel1.getComponentOrientation();
        java.awt.Component component5 = paymentPanel1.getNextFocusableComponent();
        java.awt.event.KeyListener keyListener6 = null;
        paymentPanel1.removeKeyListener(keyListener6);
        boolean boolean8 = paymentPanel1.isManagingFocus();
        java.beans.VetoableChangeListener vetoableChangeListener9 = null;
        paymentPanel1.addVetoableChangeListener(vetoableChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        javax.swing.InputMap inputMap11 = sensorPanel1.getInputMap();
        boolean boolean14 = sensorPanel1.contains((int) ' ', 16);
        java.beans.VetoableChangeListener vetoableChangeListener15 = null;
        sensorPanel1.addVetoableChangeListener(vetoableChangeListener15);
        boolean boolean17 = sensorPanel1.isCursorSet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(inputMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        mainUI0.setTitle("ADMIN_DASHBOARD");
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        boolean boolean4 = userFactory0.isStrongPassword("Room Booking System");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.User user7 = userFactory0.createUser("ROOM_BOOKING", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User details are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        boolean boolean39 = sensorPanel1.requestFocus(false);
        boolean boolean40 = sensorPanel1.getAutoscrolls();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.event.MouseWheelListener mouseWheelListener5 = null;
        paymentPanel1.removeMouseWheelListener(mouseWheelListener5);
        int int7 = paymentPanel1.getComponentCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        scheduler.gui.MainUI mainUI41 = null;
        scheduler.gui.SensorPanel sensorPanel42 = new scheduler.gui.SensorPanel(mainUI41);
        java.awt.event.ContainerListener containerListener43 = null;
        sensorPanel42.removeContainerListener(containerListener43);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.lang.String str46 = sensorPanel42.getToolTipText(mouseEvent45);
        java.awt.Dimension dimension47 = sensorPanel42.minimumSize();
        java.awt.ImageCapabilities imageCapabilities50 = null;
        java.awt.image.VolatileImage volatileImage51 = sensorPanel42.createVolatileImage(8, (-1), imageCapabilities50);
        java.awt.event.MouseListener mouseListener52 = null;
        sensorPanel42.removeMouseListener(mouseListener52);
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI54);
        java.awt.event.ContainerListener containerListener56 = null;
        sensorPanel55.removeContainerListener(containerListener56);
        java.awt.event.MouseEvent mouseEvent58 = null;
        java.lang.String str59 = sensorPanel55.getToolTipText(mouseEvent58);
        sensorPanel55.transferFocus();
        java.awt.image.ImageProducer imageProducer61 = null;
        java.awt.Image image62 = sensorPanel55.createImage(imageProducer61);
        scheduler.gui.MainUI mainUI65 = null;
        scheduler.gui.SensorPanel sensorPanel66 = new scheduler.gui.SensorPanel(mainUI65);
        java.awt.event.ContainerListener containerListener67 = null;
        sensorPanel66.removeContainerListener(containerListener67);
        java.awt.event.MouseEvent mouseEvent69 = null;
        java.lang.String str70 = sensorPanel66.getToolTipText(mouseEvent69);
        java.awt.event.InputMethodListener inputMethodListener71 = null;
        sensorPanel66.removeInputMethodListener(inputMethodListener71);
        java.awt.Event event73 = null;
        boolean boolean76 = sensorPanel66.mouseEnter(event73, 3, (int) (short) 100);
        java.awt.Color color77 = sensorPanel66.getBackground();
        int int78 = sensorPanel42.checkImage(image62, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel66);
        scheduler.booking.Booking booking79 = new scheduler.booking.Booking();
        double double80 = booking79.calculateUpfrontCost();
        double double81 = booking79.calculateUpfrontCost();
        java.lang.String str82 = booking79.getBookingID();
        sensorPanel1.add((java.awt.Component) sensorPanel66, (java.lang.Object) str82);
        javax.swing.JPopupMenu jPopupMenu84 = sensorPanel1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            jPopupMenu84.setDoubleBuffered(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNull(volatileImage51);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(image62);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(jPopupMenu84);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.lang.String str27 = sensorPanel24.toString();
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.PaymentPanel paymentPanel29 = new scheduler.gui.PaymentPanel(mainUI28);
        boolean boolean30 = paymentPanel29.isEnabled();
        boolean boolean31 = paymentPanel29.isPaintingForPrint();
        boolean boolean32 = paymentPanel29.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = paymentPanel29.getPropertyChangeListeners("");
        java.awt.Dimension dimension35 = paymentPanel29.preferredSize();
        java.awt.Dimension dimension36 = sensorPanel24.getSize(dimension35);
        // The following exception was thrown during execution in test generation
        try {
            component22.setMaximumSize(dimension35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(component22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray34, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension36);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray18 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet19 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet19, aWTKeyStrokeArray18);
        // The following exception was thrown during execution in test generation
        try {
            registrationPanel16.setFocusTraversalKeys((int) '#', (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray18);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray18, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        mainUI0.firePropertyChange("", (long) 64, 10L);
        boolean boolean8 = mainUI0.isFocusCycleRoot();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        java.awt.Container container12 = mainUI0.getFocusCycleRootAncestor();
        boolean boolean13 = mainUI0.isValidateRoot();
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(container12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray49 = mainUI0.getHierarchyBoundsListeners();
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
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray49);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray49, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.nio.file.Path path0 = scheduler.database.CsvDatabase.BOOKINGS_FILE;
        scheduler.database.CsvDatabase.append(path0, "Room Booking System");
        org.junit.Assert.assertNotNull(path0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.setLocation((int) (byte) 10, 64);
        java.awt.Event event13 = null;
        boolean boolean16 = mainUI0.mouseEnter(event13, (int) '#', (int) (short) 1);
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setTitle("REGISTRATION");
        int int20 = mainUI17.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener21 = null;
        mainUI17.removeWindowFocusListener(windowFocusListener21);
        boolean boolean23 = mainUI17.isAutoRequestFocus();
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.Dimension dimension30 = sensorPanel25.minimumSize();
        sensorPanel25.resetKeyboardActions();
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.PaymentPanel paymentPanel33 = new scheduler.gui.PaymentPanel(mainUI32);
        boolean boolean34 = paymentPanel33.isEnabled();
        boolean boolean35 = paymentPanel33.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation36 = paymentPanel33.getComponentOrientation();
        sensorPanel25.applyComponentOrientation(componentOrientation36);
        mainUI17.applyComponentOrientation(componentOrientation36);
        mainUI0.setComponentOrientation(componentOrientation36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(componentOrientation36);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        java.util.ResourceBundle resourceBundle16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI5.applyResourceBundle(resourceBundle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNotNull(jLayeredPane15);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.PaymentPanel paymentPanel25 = new scheduler.gui.PaymentPanel(mainUI24);
        boolean boolean26 = paymentPanel25.isEnabled();
        boolean boolean27 = paymentPanel25.isPaintingForPrint();
        boolean boolean28 = paymentPanel25.getVerifyInputWhenFocusTarget();
        java.awt.Event event29 = null;
        boolean boolean32 = paymentPanel25.mouseDrag(event29, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener33 = null;
        paymentPanel25.removeComponentListener(componentListener33);
        boolean boolean35 = paymentPanel25.isManagingFocus();
        javax.swing.ActionMap actionMap36 = paymentPanel25.getActionMap();
        sensorPanel1.setActionMap(actionMap36);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(actionMap36);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.booking.Booking booking2 = bookingSystemFacade0.findBookingByUser("LOGIN");
        scheduler.room.Room room4 = bookingSystemFacade0.getRoom("CHIEF_COORDINATOR_DASHBOARD");
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNull(room4);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.PaymentPanel paymentPanel29 = new scheduler.gui.PaymentPanel(mainUI28);
        java.awt.Rectangle rectangle30 = null;
        paymentPanel29.scrollRectToVisible(rectangle30);
        java.awt.Event event32 = null;
        boolean boolean35 = paymentPanel29.mouseUp(event32, (int) (byte) 10, 3);
        paymentPanel29.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        scheduler.gui.MainUI mainUI40 = null;
        scheduler.gui.SensorPanel sensorPanel41 = new scheduler.gui.SensorPanel(mainUI40);
        java.awt.event.ContainerListener containerListener42 = null;
        sensorPanel41.removeContainerListener(containerListener42);
        java.awt.event.MouseEvent mouseEvent44 = null;
        java.lang.String str45 = sensorPanel41.getToolTipText(mouseEvent44);
        java.awt.Dimension dimension46 = sensorPanel41.minimumSize();
        java.awt.ImageCapabilities imageCapabilities49 = null;
        java.awt.image.VolatileImage volatileImage50 = sensorPanel41.createVolatileImage(8, (-1), imageCapabilities49);
        scheduler.gui.MainUI mainUI51 = new scheduler.gui.MainUI();
        scheduler.gui.MainUI mainUI52 = new scheduler.gui.MainUI();
        java.awt.Component component53 = mainUI52.getGlassPane();
        javax.swing.JMenuBar jMenuBar54 = mainUI52.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI52);
        java.awt.Component component56 = null;
        boolean boolean57 = mainUI52.isAncestorOf(component56);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.PaymentPanel paymentPanel59 = new scheduler.gui.PaymentPanel(mainUI58);
        boolean boolean60 = paymentPanel59.isEnabled();
        boolean boolean61 = paymentPanel59.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation62 = paymentPanel59.getComponentOrientation();
        mainUI52.setComponentOrientation(componentOrientation62);
        java.awt.Dimension dimension64 = mainUI52.getSize();
        mainUI51.setMinimumSize(dimension64);
        sensorPanel41.setSize(dimension64);
        paymentPanel29.setMaximumSize(dimension64);
        scheduler.gui.MainUI mainUI68 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        mainUI68.addPropertyChangeListener("hi!", propertyChangeListener70);
        java.awt.Insets insets72 = mainUI68.getInsets();
        java.awt.Rectangle rectangle73 = null;
        mainUI68.setMaximizedBounds(rectangle73);
        mainUI68.toBack();
        scheduler.gui.MainUI mainUI76 = null;
        scheduler.gui.PaymentPanel paymentPanel77 = new scheduler.gui.PaymentPanel(mainUI76);
        boolean boolean78 = paymentPanel77.isEnabled();
        boolean boolean79 = paymentPanel77.isPaintingForPrint();
        boolean boolean80 = paymentPanel77.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI81 = new scheduler.gui.MainUI();
        mainUI81.setTitle("REGISTRATION");
        int int84 = mainUI81.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener85 = null;
        mainUI81.removeWindowFocusListener(windowFocusListener85);
        javax.swing.TransferHandler transferHandler87 = null;
        mainUI81.setTransferHandler(transferHandler87);
        java.awt.im.InputContext inputContext89 = mainUI81.getInputContext();
        paymentPanel77.setNextFocusableComponent((java.awt.Component) mainUI81);
        java.awt.Dialog.ModalExclusionType modalExclusionType91 = mainUI81.getModalExclusionType();
        mainUI68.setModalExclusionType(modalExclusionType91);
        javax.swing.JMenuBar jMenuBar93 = mainUI68.getJMenuBar();
        java.awt.Graphics graphics94 = mainUI68.getGraphics();
        paymentPanel29.print(graphics94);
        sensorPanel19.print(graphics94);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertNull(volatileImage50);
        org.junit.Assert.assertNotNull(component53);
        org.junit.Assert.assertNull(jMenuBar54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(componentOrientation62);
        org.junit.Assert.assertNotNull(dimension64);
        org.junit.Assert.assertNotNull(insets72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertNotNull(inputContext89);
        org.junit.Assert.assertTrue("'" + modalExclusionType91 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType91.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar93);
        org.junit.Assert.assertNotNull(graphics94);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        sensorPanel1.transferFocusDownCycle();
        java.awt.Event event8 = null;
        boolean boolean11 = sensorPanel1.mouseEnter(event8, (int) '#', (int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel1.addContainerListener(containerListener13);
        boolean boolean15 = sensorPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Color color16 = sensorPanel1.getBackground();
        boolean boolean17 = sensorPanel1.isDoubleBuffered();
        javax.swing.JRootPane jRootPane18 = sensorPanel1.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jRootPane18.isPaintingTile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jRootPane18);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.awt.Color color87 = mainUI0.getBackground();
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
        org.junit.Assert.assertNotNull(color87);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        mainUI5.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        java.lang.String str22 = paymentPanel1.getName();
        boolean boolean23 = paymentPanel1.isDisplayable();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.String str1 = faculty0.getOrgID();
        boolean boolean3 = faculty0.checkPassword("Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        java.awt.MenuComponent menuComponent14 = null;
        mainUI0.remove(menuComponent14);
        boolean boolean16 = mainUI0.isLocationByPlatform();
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(imageList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.PaymentPanel paymentPanel39 = new scheduler.gui.PaymentPanel(mainUI38);
        boolean boolean40 = paymentPanel39.isEnabled();
        boolean boolean41 = paymentPanel39.isPaintingForPrint();
        boolean boolean42 = paymentPanel39.getVerifyInputWhenFocusTarget();
        java.awt.Event event43 = null;
        boolean boolean46 = paymentPanel39.mouseDrag(event43, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI47 = new scheduler.gui.MainUI();
        java.awt.Component component48 = mainUI47.getGlassPane();
        javax.swing.JMenuBar jMenuBar49 = mainUI47.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel50 = new scheduler.gui.SensorPanel(mainUI47);
        java.awt.Component component51 = null;
        boolean boolean52 = mainUI47.isAncestorOf(component51);
        scheduler.gui.MainUI mainUI53 = null;
        scheduler.gui.PaymentPanel paymentPanel54 = new scheduler.gui.PaymentPanel(mainUI53);
        boolean boolean55 = paymentPanel54.isEnabled();
        boolean boolean56 = paymentPanel54.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation57 = paymentPanel54.getComponentOrientation();
        mainUI47.setComponentOrientation(componentOrientation57);
        paymentPanel39.applyComponentOrientation(componentOrientation57);
        java.awt.Point point60 = paymentPanel39.location();
        mainUI0.setLocation(point60);
        java.awt.Container container62 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setContentPane(container62);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: contentPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(component48);
        org.junit.Assert.assertNull(jMenuBar49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(componentOrientation57);
        org.junit.Assert.assertNotNull(point60);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        sensorPanel20.transferFocus();
        java.awt.image.ImageProducer imageProducer26 = null;
        java.awt.Image image27 = sensorPanel20.createImage(imageProducer26);
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setIconImage(image27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.removeConsumer(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(image27);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        boolean boolean7 = sensorPanel1.isPreferredSizeSet();
        sensorPanel1.resetKeyboardActions();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.setLocation((int) (byte) 10, 64);
        java.awt.Event event13 = null;
        boolean boolean16 = mainUI0.mouseEnter(event13, (int) '#', (int) (short) 1);
        java.lang.String str17 = mainUI0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "1) test554(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "scheduler.gui.MainUI[frame13,10,64,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str17, "scheduler.gui.MainUI[frame13,10,64,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        paymentPanel5.list();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.booking.Booking booking2 = bookingSystemFacade0.findBookingByUser("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        boolean boolean6 = bookingSystemFacade0.processBooking("", "ROOM_BOOKING", (int) 'a');
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.PaymentPanel paymentPanel6 = new scheduler.gui.PaymentPanel(mainUI5);
        boolean boolean7 = paymentPanel6.isEnabled();
        boolean boolean8 = paymentPanel6.isPaintingForPrint();
        boolean boolean9 = paymentPanel6.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = paymentPanel6.getPropertyChangeListeners("");
        java.awt.Dimension dimension12 = paymentPanel6.preferredSize();
        java.awt.Dimension dimension13 = sensorPanel1.getSize(dimension12);
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = null;
        sensorPanel1.setFocusTraversalPolicy(focusTraversalPolicy14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray11, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(dimension13);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        java.awt.Graphics graphics71 = mainUI61.getGraphics();
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
        org.junit.Assert.assertNotNull(graphics71);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        mainUI38.setBounds((int) '#', (int) 'a', 100, 83);
        scheduler.gui.RegistrationPanel registrationPanel53 = new scheduler.gui.RegistrationPanel(mainUI38);
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = sensorPanel1.getHierarchyBoundsListeners();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.awt.Component component9 = mainUI8.getGlassPane();
        mainUI8.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        mainUI8.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        mainUI8.show();
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        mainUI16.addPropertyChangeListener("hi!", propertyChangeListener18);
        java.awt.Insets insets20 = mainUI16.getInsets();
        java.awt.Rectangle rectangle21 = null;
        mainUI16.setMaximizedBounds(rectangle21);
        java.awt.Event event23 = null;
        boolean boolean26 = mainUI16.mouseDrag(event23, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension27 = mainUI16.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
        mainUI16.addHierarchyBoundsListener(hierarchyBoundsListener28);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        java.awt.Dimension dimension36 = sensorPanel31.minimumSize();
        scheduler.gui.MainUI mainUI37 = null;
        scheduler.gui.SensorPanel sensorPanel38 = new scheduler.gui.SensorPanel(mainUI37);
        java.awt.event.ContainerListener containerListener39 = null;
        sensorPanel38.removeContainerListener(containerListener39);
        java.awt.event.MouseEvent mouseEvent41 = null;
        java.lang.String str42 = sensorPanel38.getToolTipText(mouseEvent41);
        sensorPanel38.transferFocus();
        java.awt.image.ImageProducer imageProducer44 = null;
        java.awt.Image image45 = sensorPanel38.createImage(imageProducer44);
        scheduler.gui.MainUI mainUI48 = null;
        scheduler.gui.SensorPanel sensorPanel49 = new scheduler.gui.SensorPanel(mainUI48);
        java.awt.event.ContainerListener containerListener50 = null;
        sensorPanel49.removeContainerListener(containerListener50);
        java.awt.event.MouseEvent mouseEvent52 = null;
        java.lang.String str53 = sensorPanel49.getToolTipText(mouseEvent52);
        java.awt.Insets insets54 = sensorPanel49.getInsets();
        int int55 = sensorPanel31.checkImage(image45, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel49);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.SensorPanel sensorPanel59 = new scheduler.gui.SensorPanel(mainUI58);
        java.awt.event.ContainerListener containerListener60 = null;
        sensorPanel59.removeContainerListener(containerListener60);
        java.awt.event.MouseEvent mouseEvent62 = null;
        java.lang.String str63 = sensorPanel59.getToolTipText(mouseEvent62);
        java.awt.Insets insets64 = sensorPanel59.getInsets();
        boolean boolean65 = sensorPanel59.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener66 = null;
        sensorPanel59.addContainerListener(containerListener66);
        int int68 = mainUI16.checkImage(image45, 32, 1, (java.awt.image.ImageObserver) sensorPanel59);
        scheduler.gui.MainUI mainUI69 = new scheduler.gui.MainUI();
        java.awt.Component component70 = mainUI69.getGlassPane();
        mainUI69.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener74 = null;
        mainUI69.removeHierarchyBoundsListener(hierarchyBoundsListener74);
        int int76 = mainUI8.checkImage(image45, (java.awt.image.ImageObserver) mainUI69);
        boolean boolean82 = sensorPanel1.imageUpdate(image45, 83, (int) (byte) 10, 16, 6, (-1));
        java.awt.Component component85 = sensorPanel1.locate(128, (int) (byte) 100);
        java.awt.im.InputMethodRequests inputMethodRequests86 = sensorPanel1.getInputMethodRequests();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(image45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(insets54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(insets64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(component70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(component85);
        org.junit.Assert.assertNull(inputMethodRequests86);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        scheduler.pricing.PricingStrategy pricingStrategy1 = booking0.getPricingStrategy();
        java.lang.String str2 = booking0.getBookingID();
        org.junit.Assert.assertNull(pricingStrategy1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        mainUI0.setName("LOGIN");
        java.awt.Container container8 = mainUI0.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            container8.firePropertyChange("Student", (float) 650, (float) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        java.awt.event.HierarchyListener hierarchyListener39 = null;
        sensorPanel9.removeHierarchyListener(hierarchyListener39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(graphics37);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        scheduler.user.User user4 = userFactory0.getUserByID("Room Booking System");
        boolean boolean6 = userFactory0.isStrongPassword("MY_BOOKINGS");
        boolean boolean8 = userFactory0.isEmailRegistered("Student");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.isRoomAvailable("hi!", localDateTime16, localDateTime17);
        bookingManager12.update("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.util.List<scheduler.booking.Booking> bookingList21 = bookingManager12.getActiveBookings();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookingList21);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
        int int11 = mainUI0.getY();
        int int12 = mainUI0.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 83 + "'", int11 == 83);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 268 + "'", int12 == 268);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        javax.swing.TransferHandler transferHandler30 = mainUI0.getTransferHandler();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertNull(transferHandler30);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        java.awt.Graphics graphics17 = null;
        sensorPanel12.paintAll(graphics17);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.Dimension dimension25 = sensorPanel20.minimumSize();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = sensorPanel20.createVolatileImage(8, (-1), imageCapabilities28);
        java.awt.Image image32 = sensorPanel20.createImage(3, 1);
        java.awt.Graphics graphics33 = sensorPanel20.getGraphics();
        java.awt.Font font34 = sensorPanel20.getFont();
        java.awt.FontMetrics fontMetrics35 = sensorPanel12.getFontMetrics(font34);
        java.awt.FontMetrics fontMetrics36 = paymentPanel1.getFontMetrics(font34);
        paymentPanel1.setEnabled(true);
        int int39 = paymentPanel1.getWidth();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNull(graphics33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(fontMetrics35);
        org.junit.Assert.assertNotNull(fontMetrics36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        mainUI0.firePropertyChange("ToolTipText", (short) 100, (short) 0);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel9 = new scheduler.gui.AdminDashboardPanel(mainUI0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Shape shape4 = mainUI0.getShape();
        java.awt.MenuComponent menuComponent5 = null;
        mainUI0.remove(menuComponent5);
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        java.awt.Dimension dimension13 = sensorPanel8.minimumSize();
        java.awt.ImageCapabilities imageCapabilities16 = null;
        java.awt.image.VolatileImage volatileImage17 = sensorPanel8.createVolatileImage(8, (-1), imageCapabilities16);
        java.awt.Image image20 = sensorPanel8.createImage(3, 1);
        boolean boolean21 = sensorPanel8.getFocusTraversalKeysEnabled();
        java.awt.Rectangle rectangle22 = sensorPanel8.bounds();
        mainUI0.setMixingCutoutShape((java.awt.Shape) rectangle22);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.lang.String str28 = sensorPanel25.toString();
        java.awt.MenuComponent menuComponent29 = null;
        sensorPanel25.remove(menuComponent29);
        java.awt.Component[] componentArray31 = sensorPanel25.getComponents();
        javax.swing.TransferHandler transferHandler32 = null;
        sensorPanel25.setTransferHandler(transferHandler32);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.SensorPanel sensorPanel35 = new scheduler.gui.SensorPanel(mainUI34);
        java.awt.event.ContainerListener containerListener36 = null;
        sensorPanel35.removeContainerListener(containerListener36);
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.lang.String str39 = sensorPanel35.getToolTipText(mouseEvent38);
        java.awt.Graphics graphics40 = null;
        sensorPanel35.paintAll(graphics40);
        scheduler.gui.MainUI mainUI42 = null;
        scheduler.gui.PaymentPanel paymentPanel43 = new scheduler.gui.PaymentPanel(mainUI42);
        boolean boolean44 = paymentPanel43.isEnabled();
        boolean boolean45 = paymentPanel43.isPaintingForPrint();
        paymentPanel43.hide();
        java.awt.Dimension dimension47 = paymentPanel43.getMaximumSize();
        sensorPanel35.setMaximumSize(dimension47);
        sensorPanel25.setMaximumSize(dimension47);
        scheduler.gui.MainUI mainUI50 = null;
        scheduler.gui.SensorPanel sensorPanel51 = new scheduler.gui.SensorPanel(mainUI50);
        java.awt.event.ContainerListener containerListener52 = null;
        sensorPanel51.removeContainerListener(containerListener52);
        java.awt.event.MouseEvent mouseEvent54 = null;
        java.lang.String str55 = sensorPanel51.getToolTipText(mouseEvent54);
        java.awt.event.InputMethodListener inputMethodListener56 = null;
        sensorPanel51.removeInputMethodListener(inputMethodListener56);
        sensorPanel51.enable();
        sensorPanel51.layout();
        sensorPanel51.setVisible(false);
        java.awt.Point point62 = sensorPanel51.getLocation();
        boolean boolean63 = sensorPanel25.contains(point62);
        java.awt.Component component64 = mainUI0.getComponentAt(point62);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertNull(volatileImage17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(point62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(component64);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        scheduler.payment.PaymentStrategy paymentStrategy2 = booking0.getPaymentStrategy();
        java.lang.String str3 = booking0.getBookingID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paymentStrategy2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
        java.awt.Container container11 = mainUI0.getFocusCycleRootAncestor();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray13 = mainUI0.getPropertyChangeListeners("PAYMENT");
        mainUI0.repaint();
        javax.swing.JRootPane jRootPane15 = mainUI0.getRootPane();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(container11);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray13);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray13, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(jRootPane15);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        mainUI0.setFocusable(false);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        boolean boolean15 = mainUI0.isFontSet();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.Dimension dimension8 = sensorPanel1.getMinimumSize();
        boolean boolean9 = sensorPanel1.getAutoscrolls();
        java.lang.String str10 = sensorPanel1.toString();
        java.awt.ImageCapabilities imageCapabilities13 = null;
        java.awt.image.VolatileImage volatileImage14 = sensorPanel1.createVolatileImage(83, (int) (short) 10, imageCapabilities13);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(volatileImage14);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        java.lang.Object obj33 = mainUI0.getTreeLock();
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
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        mainUI9.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel12 = new scheduler.gui.AdminDashboardPanel(mainUI9);
        java.awt.Graphics graphics13 = mainUI9.getGraphics();
        int int14 = mainUI9.getHeight();
        javax.accessibility.AccessibleContext accessibleContext15 = mainUI9.getAccessibleContext();
        scheduler.gui.RoomBookingPanel roomBookingPanel16 = new scheduler.gui.RoomBookingPanel(mainUI9);
        boolean boolean17 = roomBookingPanel16.isMinimumSizeSet();
        roomBookingPanel16.loadRooms();
        boolean boolean19 = sensorPanel1.isAncestorOf((java.awt.Component) roomBookingPanel16);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(graphics13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 650 + "'", int14 == 650);
        org.junit.Assert.assertNotNull(accessibleContext15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        scheduler.gui.MainUI mainUI77 = null;
        scheduler.gui.PaymentPanel paymentPanel78 = new scheduler.gui.PaymentPanel(mainUI77);
        java.awt.Rectangle rectangle79 = null;
        paymentPanel78.scrollRectToVisible(rectangle79);
        java.awt.Event event81 = null;
        boolean boolean84 = paymentPanel78.mouseUp(event81, (int) (byte) 10, 3);
        paymentPanel78.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.FocusListener[] focusListenerArray89 = paymentPanel78.getFocusListeners();
        java.beans.PropertyChangeListener propertyChangeListener90 = null;
        paymentPanel78.removePropertyChangeListener(propertyChangeListener90);
        java.awt.Insets insets92 = paymentPanel78.getInsets();
        java.awt.Insets insets93 = sensorPanel19.getInsets(insets92);
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(focusListenerArray89);
        org.junit.Assert.assertArrayEquals(focusListenerArray89, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(insets92);
        org.junit.Assert.assertNotNull(insets93);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        boolean boolean8 = mainUI0.isLightweight();
        mainUI0.setIgnoreRepaint(false);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.lang.String str37 = sensorPanel33.getToolTipText(mouseEvent36);
        java.awt.Dimension dimension38 = sensorPanel33.minimumSize();
        paymentPanel28.setSize(dimension38);
        boolean boolean40 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel28);
        scheduler.gui.MainUI mainUI41 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        mainUI41.addPropertyChangeListener("hi!", propertyChangeListener43);
        java.awt.Insets insets45 = mainUI41.getInsets();
        java.awt.Rectangle rectangle46 = null;
        mainUI41.setMaximizedBounds(rectangle46);
        java.awt.Event event48 = null;
        boolean boolean51 = mainUI41.mouseDrag(event48, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension52 = mainUI41.getPreferredSize();
        java.awt.Dimension dimension53 = paymentPanel28.getSize(dimension52);
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI54);
        java.awt.event.ContainerListener containerListener56 = null;
        sensorPanel55.removeContainerListener(containerListener56);
        java.lang.String str58 = sensorPanel55.toString();
        java.awt.MenuComponent menuComponent59 = null;
        sensorPanel55.remove(menuComponent59);
        java.awt.Component[] componentArray61 = sensorPanel55.getComponents();
        java.awt.LayoutManager layoutManager62 = sensorPanel55.getLayout();
        scheduler.gui.MainUI mainUI63 = null;
        scheduler.gui.SensorPanel sensorPanel64 = new scheduler.gui.SensorPanel(mainUI63);
        java.awt.event.ContainerListener containerListener65 = null;
        sensorPanel64.removeContainerListener(containerListener65);
        java.awt.event.MouseEvent mouseEvent67 = null;
        java.lang.String str68 = sensorPanel64.getToolTipText(mouseEvent67);
        java.awt.Dimension dimension69 = sensorPanel64.minimumSize();
        java.awt.ImageCapabilities imageCapabilities72 = null;
        java.awt.image.VolatileImage volatileImage73 = sensorPanel64.createVolatileImage(8, (-1), imageCapabilities72);
        java.awt.Image image76 = sensorPanel64.createImage(3, 1);
        java.awt.Rectangle rectangle77 = null;
        java.awt.Rectangle rectangle78 = sensorPanel64.getBounds(rectangle77);
        sensorPanel55.paintImmediately(rectangle78);
        paymentPanel28.repaint(rectangle78);
        mainUI0.setBounds(rectangle78);
        java.awt.MenuBar menuBar82 = null;
        mainUI0.setMenuBar(menuBar82);
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertNotNull(dimension53);
        org.junit.Assert.assertNotNull(componentArray61);
        org.junit.Assert.assertNotNull(layoutManager62);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(dimension69);
        org.junit.Assert.assertNull(volatileImage73);
        org.junit.Assert.assertNull(image76);
        org.junit.Assert.assertNotNull(rectangle78);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        boolean boolean26 = sensorPanel19.isForegroundSet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        java.awt.Dimension dimension12 = mainUI0.getSize();
        boolean boolean13 = mainUI0.isPreferredSizeSet();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager5 = new scheduler.booking.BookingManager();
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager5);
        boolean boolean9 = bookingManager5.extendBooking("ROOM_BOOKING", (int) (byte) -1);
        boolean boolean11 = bookingManager5.cancelBooking("");
        boolean boolean13 = bookingManager5.cancelBooking("PAYMENT");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.removeAll();
        paymentPanel1.addNotify();
        java.awt.Component component6 = paymentPanel1.getNextFocusableComponent();
        javax.swing.event.AncestorListener[] ancestorListenerArray7 = paymentPanel1.getAncestorListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(component6);
        org.junit.Assert.assertNotNull(ancestorListenerArray7);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray7, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        scheduler.payment.DebitCardPayment debitCardPayment0 = new scheduler.payment.DebitCardPayment();
        boolean boolean2 = debitCardPayment0.processTransaction((double) 0);
        boolean boolean4 = debitCardPayment0.processTransaction((double) ' ');
        boolean boolean6 = debitCardPayment0.processTransaction((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = sensorPanel1.getBaselineResizeBehavior();
        float float8 = sensorPanel1.getAlignmentY();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.event.WindowStateListener windowStateListener8 = null;
        mainUI0.addWindowStateListener(windowStateListener8);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        java.lang.String str53 = mainUI0.getWarningString();
        mainUI0.setAlwaysOnTop(false);
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
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        mainUI0.toFront();
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        javax.swing.KeyStroke keyStroke40 = null;
        int int41 = paymentPanel1.getConditionForKeyStroke(keyStroke40);
        javax.swing.KeyStroke keyStroke42 = null;
        int int43 = paymentPanel1.getConditionForKeyStroke(keyStroke42);
        javax.swing.TransferHandler transferHandler44 = paymentPanel1.getTransferHandler();
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(transferHandler44);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Dimension dimension18 = sensorPanel13.minimumSize();
        java.awt.ImageCapabilities imageCapabilities21 = null;
        java.awt.image.VolatileImage volatileImage22 = sensorPanel13.createVolatileImage(8, (-1), imageCapabilities21);
        scheduler.gui.MainUI mainUI23 = new scheduler.gui.MainUI();
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
        java.awt.Dimension dimension36 = mainUI24.getSize();
        mainUI23.setMinimumSize(dimension36);
        sensorPanel13.setSize(dimension36);
        paymentPanel1.setMaximumSize(dimension36);
        scheduler.gui.MainUI mainUI40 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        mainUI40.addPropertyChangeListener("hi!", propertyChangeListener42);
        java.awt.Insets insets44 = mainUI40.getInsets();
        java.awt.Rectangle rectangle45 = null;
        mainUI40.setMaximizedBounds(rectangle45);
        mainUI40.toBack();
        scheduler.gui.MainUI mainUI48 = null;
        scheduler.gui.PaymentPanel paymentPanel49 = new scheduler.gui.PaymentPanel(mainUI48);
        boolean boolean50 = paymentPanel49.isEnabled();
        boolean boolean51 = paymentPanel49.isPaintingForPrint();
        boolean boolean52 = paymentPanel49.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI53 = new scheduler.gui.MainUI();
        mainUI53.setTitle("REGISTRATION");
        int int56 = mainUI53.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener57 = null;
        mainUI53.removeWindowFocusListener(windowFocusListener57);
        javax.swing.TransferHandler transferHandler59 = null;
        mainUI53.setTransferHandler(transferHandler59);
        java.awt.im.InputContext inputContext61 = mainUI53.getInputContext();
        paymentPanel49.setNextFocusableComponent((java.awt.Component) mainUI53);
        java.awt.Dialog.ModalExclusionType modalExclusionType63 = mainUI53.getModalExclusionType();
        mainUI40.setModalExclusionType(modalExclusionType63);
        javax.swing.JMenuBar jMenuBar65 = mainUI40.getJMenuBar();
        java.awt.Graphics graphics66 = mainUI40.getGraphics();
        paymentPanel1.print(graphics66);
        java.beans.VetoableChangeListener vetoableChangeListener68 = null;
        paymentPanel1.removeVetoableChangeListener(vetoableChangeListener68);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(volatileImage22);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNull(jMenuBar26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(componentOrientation34);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNotNull(insets44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(inputContext61);
        org.junit.Assert.assertTrue("'" + modalExclusionType63 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType63.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar65);
        org.junit.Assert.assertNotNull(graphics66);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        java.awt.event.KeyListener keyListener5 = null;
        mainUI0.removeKeyListener(keyListener5);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle("Student");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name Student, locale en_US");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        scheduler.gui.RoomManagementPanel roomManagementPanel8 = new scheduler.gui.RoomManagementPanel(mainUI0);
        scheduler.gui.MainUI mainUI9 = null;
        scheduler.gui.SensorPanel sensorPanel10 = new scheduler.gui.SensorPanel(mainUI9);
        java.awt.event.ContainerListener containerListener11 = null;
        sensorPanel10.removeContainerListener(containerListener11);
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = sensorPanel10.getToolTipText(mouseEvent13);
        java.awt.Dimension dimension15 = sensorPanel10.minimumSize();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray16 = sensorPanel10.getHierarchyBoundsListeners();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        java.awt.Component component18 = mainUI17.getGlassPane();
        mainUI17.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        mainUI17.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        mainUI17.show();
        scheduler.gui.MainUI mainUI25 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        mainUI25.addPropertyChangeListener("hi!", propertyChangeListener27);
        java.awt.Insets insets29 = mainUI25.getInsets();
        java.awt.Rectangle rectangle30 = null;
        mainUI25.setMaximizedBounds(rectangle30);
        java.awt.Event event32 = null;
        boolean boolean35 = mainUI25.mouseDrag(event32, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension36 = mainUI25.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener37 = null;
        mainUI25.addHierarchyBoundsListener(hierarchyBoundsListener37);
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
        scheduler.gui.MainUI mainUI67 = null;
        scheduler.gui.SensorPanel sensorPanel68 = new scheduler.gui.SensorPanel(mainUI67);
        java.awt.event.ContainerListener containerListener69 = null;
        sensorPanel68.removeContainerListener(containerListener69);
        java.awt.event.MouseEvent mouseEvent71 = null;
        java.lang.String str72 = sensorPanel68.getToolTipText(mouseEvent71);
        java.awt.Insets insets73 = sensorPanel68.getInsets();
        boolean boolean74 = sensorPanel68.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener75 = null;
        sensorPanel68.addContainerListener(containerListener75);
        int int77 = mainUI25.checkImage(image54, 32, 1, (java.awt.image.ImageObserver) sensorPanel68);
        scheduler.gui.MainUI mainUI78 = new scheduler.gui.MainUI();
        java.awt.Component component79 = mainUI78.getGlassPane();
        mainUI78.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener83 = null;
        mainUI78.removeHierarchyBoundsListener(hierarchyBoundsListener83);
        int int85 = mainUI17.checkImage(image54, (java.awt.image.ImageObserver) mainUI78);
        boolean boolean91 = sensorPanel10.imageUpdate(image54, 83, (int) (byte) 10, 16, 6, (-1));
        scheduler.gui.MainUI mainUI94 = null;
        scheduler.gui.SensorPanel sensorPanel95 = new scheduler.gui.SensorPanel(mainUI94);
        java.awt.event.ContainerListener containerListener96 = null;
        sensorPanel95.removeContainerListener(containerListener96);
        sensorPanel95.resetKeyboardActions();
        int int99 = mainUI0.checkImage(image54, 5, 5, (java.awt.image.ImageObserver) sensorPanel95);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray16);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray16, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(image54);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(insets63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(insets73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(component79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        scheduler.user.Partner partner0 = new scheduler.user.Partner();
        scheduler.room.OccupiedState occupiedState1 = new scheduler.room.OccupiedState();
        scheduler.room.AvailableState availableState2 = new scheduler.room.AvailableState();
        scheduler.room.Room room6 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str7 = room6.getLocation();
        availableState2.handleReserve(room6);
        occupiedState1.handleReserve(room6);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        scheduler.pricing.StaffPricing staffPricing12 = new scheduler.pricing.StaffPricing();
        scheduler.payment.DebitCardPayment debitCardPayment13 = new scheduler.payment.DebitCardPayment();
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking14 = new scheduler.booking.Booking((scheduler.user.User) partner0, room6, localDateTime10, localDateTime11, (scheduler.pricing.PricingStrategy) staffPricing12, (scheduler.payment.PaymentStrategy) debitCardPayment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Start and end times are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Booking System" + "'", str7, "Room Booking System");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        java.util.Locale locale5 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale5);
        paymentPanel1.setLocale(locale5);
        javax.swing.JComponent.setDefaultLocale(locale5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Shape shape8 = mainUI0.getShape();
        boolean boolean9 = mainUI0.isFocused();
        java.awt.Point point10 = mainUI0.location();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(point10);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        java.awt.Insets insets18 = mainUI5.insets();
        boolean boolean19 = mainUI5.isMinimumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(menuBar17);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.transferFocus();
        java.awt.Rectangle rectangle7 = sensorPanel1.getVisibleRect();
        javax.accessibility.AccessibleContext accessibleContext8 = sensorPanel1.getAccessibleContext();
        java.awt.Dimension dimension9 = sensorPanel1.getMaximumSize();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        java.awt.Rectangle rectangle8 = sensorPanel1.getVisibleRect();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        javax.swing.JPopupMenu jPopupMenu6 = sensorPanel1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jPopupMenu6.isManagingFocus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jPopupMenu6);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        scheduler.pricing.FacultyPricing facultyPricing0 = new scheduler.pricing.FacultyPricing();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.isRoomAvailable("hi!", localDateTime16, localDateTime17);
        bookingManager12.update("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        boolean boolean22 = bookingManager12.removeRoom("scheduler.gui.MainUI[frame13,10,64,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        int int27 = paymentPanel1.getDebugGraphicsOptions();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        javax.swing.JRootPane jRootPane3 = mainUI0.getRootPane();
        jRootPane3.removeNotify();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(jRootPane3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        mainUI0.showUserBookings();
        boolean boolean18 = mainUI0.isValid();
        java.awt.Component component19 = mainUI0.getGlassPane();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(component19);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isEmailRegistered("ADMIN_DASHBOARD");
        boolean boolean4 = userFactory0.isStrongPassword("Room Booking System");
        boolean boolean6 = userFactory0.isValidEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        scheduler.pricing.StaffPricing staffPricing12 = new scheduler.pricing.StaffPricing();
        double double13 = staffPricing12.getHourlyRate();
        double double14 = staffPricing12.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing12);
        scheduler.pricing.PricingStrategy pricingStrategy16 = booking0.getPricingStrategy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(pricingStrategy16);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
        int int13 = mainUI0.getCursorType();
        boolean boolean14 = mainUI0.isEnabled();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = sensorPanel1.getFocusTraversalPolicy();
        boolean boolean11 = sensorPanel1.requestFocusInWindow();
        int int12 = sensorPanel1.countComponents();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(focusTraversalPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        sensorPanel18.removeInputMethodListener(inputMethodListener23);
        java.awt.Component component27 = sensorPanel18.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.lang.String str32 = sensorPanel29.toString();
        java.awt.MenuComponent menuComponent33 = null;
        sensorPanel29.remove(menuComponent33);
        java.awt.Component[] componentArray35 = sensorPanel29.getComponents();
        javax.swing.TransferHandler transferHandler36 = null;
        sensorPanel29.setTransferHandler(transferHandler36);
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.Graphics graphics44 = null;
        sensorPanel39.paintAll(graphics44);
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.PaymentPanel paymentPanel47 = new scheduler.gui.PaymentPanel(mainUI46);
        boolean boolean48 = paymentPanel47.isEnabled();
        boolean boolean49 = paymentPanel47.isPaintingForPrint();
        paymentPanel47.hide();
        java.awt.Dimension dimension51 = paymentPanel47.getMaximumSize();
        sensorPanel39.setMaximumSize(dimension51);
        sensorPanel29.setMaximumSize(dimension51);
        sensorPanel18.resize(dimension51);
        sensorPanel1.setMaximumSize(dimension51);
        sensorPanel1.setDoubleBuffered(true);
        java.awt.event.MouseWheelListener mouseWheelListener58 = null;
        sensorPanel1.addMouseWheelListener(mouseWheelListener58);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(component27);
        org.junit.Assert.assertNotNull(componentArray35);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        java.awt.event.FocusListener focusListener12 = null;
        sensorPanel1.removeFocusListener(focusListener12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.FocusEvent.Cause cause6 = null;
        sensorPanel1.requestFocus(cause6);
        javax.swing.JToolTip jToolTip8 = sensorPanel1.createToolTip();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jToolTip8);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
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
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        sensorPanel40.addPropertyChangeListener("hi!", propertyChangeListener48);
        java.awt.Color color50 = sensorPanel40.getForeground();
        sensorPanel12.setForeground(color50);
        sensorPanel12.removeNotify();
        int int53 = mainUI0.getComponentZOrder((java.awt.Component) sensorPanel12);
        java.awt.AWTEvent aWTEvent54 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.dispatchEvent(aWTEvent54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNotNull(componentArray18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        mainUI0.setCursor((int) (short) 10);
        scheduler.gui.UserDashboardPanel userDashboardPanel8 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Cursor cursor9 = userDashboardPanel8.getCursor();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(cursor9);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.room.Room room2 = bookingSystemFacade0.getRoom("MY_BOOKINGS");
        boolean boolean4 = bookingSystemFacade0.cancelBooking("");
        scheduler.booking.Booking booking6 = bookingSystemFacade0.findBookingByUser("ADMIN_DASHBOARD");
        boolean boolean8 = bookingSystemFacade0.removeRoom("Student");
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(room2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.hide();
        java.awt.Dimension dimension5 = paymentPanel1.getMaximumSize();
        paymentPanel1.enableInputMethods(true);
        boolean boolean8 = paymentPanel1.isBackgroundSet();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        paymentPanel1.addMouseWheelListener(mouseWheelListener9);
        javax.swing.KeyStroke keyStroke11 = null;
        paymentPanel1.unregisterKeyboardAction(keyStroke11);
        java.awt.event.ComponentListener componentListener13 = null;
        paymentPanel1.addComponentListener(componentListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        boolean boolean30 = mainUI0.isFocusTraversable();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        scheduler.room.Room room4 = booking0.getRoom();
        boolean boolean5 = booking0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        sensorPanel1.setLocation((int) (short) 100, 0);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        scheduler.pricing.PricingStrategy pricingStrategy1 = booking0.getPricingStrategy();
        double double2 = booking0.calculateFinalCost();
        org.junit.Assert.assertNull(pricingStrategy1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        scheduler.payment.DebitCardPayment debitCardPayment0 = new scheduler.payment.DebitCardPayment();
        boolean boolean2 = debitCardPayment0.processTransaction((double) 0);
        boolean boolean4 = debitCardPayment0.processTransaction(40.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Color color8 = mainUI0.getBackground();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        mainUI9.toBack();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel20 = new scheduler.gui.AdminDashboardPanel(mainUI17);
        java.awt.Graphics graphics21 = mainUI17.getGraphics();
        mainUI9.paint(graphics21);
        mainUI0.paintComponents(graphics21);
        boolean boolean24 = mainUI0.isValidateRoot();
        java.awt.Component component25 = mainUI0.getFocusOwner();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertNotNull(graphics21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(component25);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) (short) 0);
        java.awt.event.ComponentListener componentListener6 = null;
        mainUI0.removeComponentListener(componentListener6);
        mainUI0.showPanel("");
        java.awt.LayoutManager layoutManager10 = mainUI0.getLayout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
        org.junit.Assert.assertNotNull(layoutManager10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
        java.awt.Event event54 = null;
        boolean boolean56 = paymentPanel1.keyDown(event54, 10);
        javax.swing.InputMap inputMap58 = paymentPanel1.getInputMap(0);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(inputMap58);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        java.awt.image.ImageProducer imageProducer16 = null;
        java.awt.Image image17 = mainUI0.createImage(imageProducer16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(image17);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        scheduler.gui.MainUI mainUI5 = new scheduler.gui.MainUI();
        java.awt.Component component6 = mainUI5.getGlassPane();
        javax.swing.JMenuBar jMenuBar7 = mainUI5.getJMenuBar();
        mainUI5.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType10 = mainUI5.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType10);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertNull(jMenuBar7);
        org.junit.Assert.assertTrue("'" + modalExclusionType10 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType10.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        mainUI0.addInputMethodListener(inputMethodListener5);
        mainUI0.setFocusCycleRoot(true);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.lang.String str1 = scheduler.database.CsvDatabase.clean("REGISTRATION");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "REGISTRATION" + "'", str1, "REGISTRATION");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation4 = paymentPanel1.getComponentOrientation();
        javax.swing.event.AncestorListener ancestorListener5 = null;
        paymentPanel1.removeAncestorListener(ancestorListener5);
        paymentPanel1.removeNotify();
        java.awt.Container container8 = paymentPanel1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) (short) 0);
        int int6 = mainUI0.getCursorType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        boolean boolean15 = sensorPanel1.isFocusOwner();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        occupiedState0.handleRelease(room4);
        scheduler.room.MaintenanceState maintenanceState7 = new scheduler.room.MaintenanceState();
        room4.setState((scheduler.room.RoomState) maintenanceState7);
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        java.lang.String str21 = sensorPanel1.getName();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = sensorPanel1.getPropertyChangeListeners("ToolTipText");
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.PaymentPanel paymentPanel25 = new scheduler.gui.PaymentPanel(mainUI24);
        boolean boolean26 = paymentPanel25.isEnabled();
        boolean boolean27 = paymentPanel25.isPaintingForPrint();
        boolean boolean28 = paymentPanel25.getVerifyInputWhenFocusTarget();
        java.awt.Event event29 = null;
        boolean boolean32 = paymentPanel25.mouseDrag(event29, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI33 = new scheduler.gui.MainUI();
        java.awt.Component component34 = mainUI33.getGlassPane();
        javax.swing.JMenuBar jMenuBar35 = mainUI33.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel36 = new scheduler.gui.SensorPanel(mainUI33);
        java.awt.Component component37 = null;
        boolean boolean38 = mainUI33.isAncestorOf(component37);
        scheduler.gui.MainUI mainUI39 = null;
        scheduler.gui.PaymentPanel paymentPanel40 = new scheduler.gui.PaymentPanel(mainUI39);
        boolean boolean41 = paymentPanel40.isEnabled();
        boolean boolean42 = paymentPanel40.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation43 = paymentPanel40.getComponentOrientation();
        mainUI33.setComponentOrientation(componentOrientation43);
        paymentPanel25.applyComponentOrientation(componentOrientation43);
        boolean boolean46 = paymentPanel25.isDoubleBuffered();
        scheduler.gui.MainUI mainUI47 = new scheduler.gui.MainUI();
        mainUI47.setTitle("REGISTRATION");
        int int50 = mainUI47.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        mainUI47.addPropertyChangeListener("REGISTRATION", propertyChangeListener52);
        scheduler.gui.UserDashboardPanel userDashboardPanel54 = new scheduler.gui.UserDashboardPanel(mainUI47);
        java.awt.Component component57 = mainUI47.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI58 = new scheduler.gui.MainUI();
        mainUI58.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener61 = null;
        mainUI58.addWindowFocusListener(windowFocusListener61);
        boolean boolean63 = mainUI58.isFocusableWindow();
        scheduler.gui.MainUI mainUI64 = null;
        scheduler.gui.SensorPanel sensorPanel65 = new scheduler.gui.SensorPanel(mainUI64);
        java.awt.event.ContainerListener containerListener66 = null;
        sensorPanel65.removeContainerListener(containerListener66);
        java.awt.event.MouseEvent mouseEvent68 = null;
        java.lang.String str69 = sensorPanel65.getToolTipText(mouseEvent68);
        java.awt.event.InputMethodListener inputMethodListener70 = null;
        sensorPanel65.removeInputMethodListener(inputMethodListener70);
        sensorPanel65.enable();
        java.awt.Point point73 = sensorPanel65.location();
        mainUI58.setLocation(point73);
        mainUI47.setLocation(point73);
        java.awt.Point point76 = paymentPanel25.getLocation(point73);
        javax.swing.JToolTip jToolTip77 = paymentPanel25.createToolTip();
        scheduler.gui.MainUI mainUI78 = null;
        scheduler.gui.SensorPanel sensorPanel79 = new scheduler.gui.SensorPanel(mainUI78);
        java.awt.event.ContainerListener containerListener80 = null;
        sensorPanel79.removeContainerListener(containerListener80);
        java.awt.event.MouseEvent mouseEvent82 = null;
        java.lang.String str83 = sensorPanel79.getToolTipText(mouseEvent82);
        java.awt.Dimension dimension84 = sensorPanel79.minimumSize();
        java.awt.ImageCapabilities imageCapabilities87 = null;
        java.awt.image.VolatileImage volatileImage88 = sensorPanel79.createVolatileImage(8, (-1), imageCapabilities87);
        java.awt.Image image91 = sensorPanel79.createImage(3, 1);
        javax.swing.KeyStroke keyStroke92 = null;
        int int93 = sensorPanel79.getConditionForKeyStroke(keyStroke92);
        javax.swing.border.Border border94 = sensorPanel79.getBorder();
        paymentPanel25.setBorder(border94);
        sensorPanel1.setBorder(border94);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray23, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(component34);
        org.junit.Assert.assertNull(jMenuBar35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(componentOrientation43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(component57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(point73);
        org.junit.Assert.assertNotNull(point76);
        org.junit.Assert.assertNotNull(jToolTip77);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(dimension84);
        org.junit.Assert.assertNull(volatileImage88);
        org.junit.Assert.assertNull(image91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(border94);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        boolean boolean13 = paymentPanel1.requestFocusInWindow();
        java.awt.LayoutManager layoutManager14 = paymentPanel1.getLayout();
        boolean boolean15 = paymentPanel1.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.PaymentPanel paymentPanel13 = new scheduler.gui.PaymentPanel(mainUI12);
        boolean boolean14 = paymentPanel13.isEnabled();
        boolean boolean15 = paymentPanel13.isPaintingForPrint();
        boolean boolean16 = paymentPanel13.getVerifyInputWhenFocusTarget();
        java.awt.Event event17 = null;
        boolean boolean20 = paymentPanel13.mouseDrag(event17, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI21 = new scheduler.gui.MainUI();
        java.awt.Component component22 = mainUI21.getGlassPane();
        javax.swing.JMenuBar jMenuBar23 = mainUI21.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.Component component25 = null;
        boolean boolean26 = mainUI21.isAncestorOf(component25);
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.PaymentPanel paymentPanel28 = new scheduler.gui.PaymentPanel(mainUI27);
        boolean boolean29 = paymentPanel28.isEnabled();
        boolean boolean30 = paymentPanel28.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation31 = paymentPanel28.getComponentOrientation();
        mainUI21.setComponentOrientation(componentOrientation31);
        paymentPanel13.applyComponentOrientation(componentOrientation31);
        boolean boolean34 = paymentPanel13.isDoubleBuffered();
        scheduler.gui.MainUI mainUI35 = new scheduler.gui.MainUI();
        mainUI35.setTitle("REGISTRATION");
        int int38 = mainUI35.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        mainUI35.addPropertyChangeListener("REGISTRATION", propertyChangeListener40);
        scheduler.gui.UserDashboardPanel userDashboardPanel42 = new scheduler.gui.UserDashboardPanel(mainUI35);
        java.awt.Component component45 = mainUI35.getComponentAt((int) (byte) 0, 2);
        scheduler.gui.MainUI mainUI46 = new scheduler.gui.MainUI();
        mainUI46.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener49 = null;
        mainUI46.addWindowFocusListener(windowFocusListener49);
        boolean boolean51 = mainUI46.isFocusableWindow();
        scheduler.gui.MainUI mainUI52 = null;
        scheduler.gui.SensorPanel sensorPanel53 = new scheduler.gui.SensorPanel(mainUI52);
        java.awt.event.ContainerListener containerListener54 = null;
        sensorPanel53.removeContainerListener(containerListener54);
        java.awt.event.MouseEvent mouseEvent56 = null;
        java.lang.String str57 = sensorPanel53.getToolTipText(mouseEvent56);
        java.awt.event.InputMethodListener inputMethodListener58 = null;
        sensorPanel53.removeInputMethodListener(inputMethodListener58);
        sensorPanel53.enable();
        java.awt.Point point61 = sensorPanel53.location();
        mainUI46.setLocation(point61);
        mainUI35.setLocation(point61);
        java.awt.Point point64 = paymentPanel13.getLocation(point61);
        mainUI0.setLocation(point61);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertNull(jMenuBar23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(componentOrientation31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(component45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(point61);
        org.junit.Assert.assertNotNull(point64);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        java.awt.Dimension dimension10 = sensorPanel1.minimumSize();
        boolean boolean11 = sensorPanel1.isPaintingForPrint();
        java.awt.Event event12 = null;
        boolean boolean15 = sensorPanel1.mouseDrag(event12, (int) (short) -1, 9);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.nio.file.Path path0 = scheduler.database.CsvDatabase.ROOMS_FILE;
        scheduler.database.CsvDatabase.append(path0, "");
        org.junit.Assert.assertNotNull(path0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        mainUI0.setEnabled(true);
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        java.awt.Point point10 = mainUI0.getMousePosition(false);
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        java.awt.Component component12 = mainUI11.getGlassPane();
        javax.swing.JMenuBar jMenuBar13 = mainUI11.getJMenuBar();
        mainUI11.setState((int) (short) 0);
        mainUI11.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel19 = new scheduler.gui.LoginPanel(mainUI11);
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
        mainUI11.setMaximizedBounds(rectangle68);
        java.awt.Rectangle rectangle74 = mainUI0.getBounds(rectangle68);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertNull(jMenuBar13);
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
        org.junit.Assert.assertNotNull(rectangle74);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        boolean boolean6 = mainUI0.isFocusTraversable();
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setFocusable(false);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        scheduler.gui.MainUI mainUI4 = new scheduler.gui.MainUI();
        mainUI4.setTitle("REGISTRATION");
        int int7 = mainUI4.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        mainUI4.addPropertyChangeListener("REGISTRATION", propertyChangeListener9);
        scheduler.gui.UserDashboardPanel userDashboardPanel11 = new scheduler.gui.UserDashboardPanel(mainUI4);
        java.awt.Component component14 = mainUI4.getComponentAt((int) (byte) 0, 2);
        javax.swing.TransferHandler transferHandler15 = mainUI4.getTransferHandler();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        java.awt.Graphics graphics22 = null;
        sensorPanel17.paintAll(graphics22);
        scheduler.gui.MainUI mainUI24 = null;
        scheduler.gui.SensorPanel sensorPanel25 = new scheduler.gui.SensorPanel(mainUI24);
        java.awt.event.ContainerListener containerListener26 = null;
        sensorPanel25.removeContainerListener(containerListener26);
        java.awt.event.MouseEvent mouseEvent28 = null;
        java.lang.String str29 = sensorPanel25.getToolTipText(mouseEvent28);
        java.awt.Dimension dimension30 = sensorPanel25.minimumSize();
        java.awt.ImageCapabilities imageCapabilities33 = null;
        java.awt.image.VolatileImage volatileImage34 = sensorPanel25.createVolatileImage(8, (-1), imageCapabilities33);
        java.awt.Image image37 = sensorPanel25.createImage(3, 1);
        java.awt.Graphics graphics38 = sensorPanel25.getGraphics();
        java.awt.Font font39 = sensorPanel25.getFont();
        java.awt.FontMetrics fontMetrics40 = sensorPanel17.getFontMetrics(font39);
        mainUI4.setFont(font39);
        java.awt.FontMetrics fontMetrics42 = mainUI0.getFontMetrics(font39);
        java.awt.Event event43 = null;
        boolean boolean46 = mainUI0.mouseEnter(event43, 32, 10);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior47 = mainUI0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNull(transferHandler15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNull(volatileImage34);
        org.junit.Assert.assertNull(image37);
        org.junit.Assert.assertNull(graphics38);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(fontMetrics40);
        org.junit.Assert.assertNotNull(fontMetrics42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior47 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior47.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
        int int11 = mainUI0.getY();
        java.awt.event.WindowFocusListener windowFocusListener12 = null;
        mainUI0.addWindowFocusListener(windowFocusListener12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 83 + "'", int11 == 83);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        boolean boolean4 = mainUI0.getFocusableWindowState();
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mainUI0.handleEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        mainUI0.removeAll();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component16 = mainUI0.getComponent(1047);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 1047");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        mainUI0.setFocusCycleRoot(false);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.PaymentPanel paymentPanel12 = new scheduler.gui.PaymentPanel(mainUI11);
        boolean boolean13 = paymentPanel12.isEnabled();
        paymentPanel12.paintImmediately(8, (int) '#', 100, 10);
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        mainUI19.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener22 = null;
        mainUI19.addWindowFocusListener(windowFocusListener22);
        boolean boolean24 = mainUI19.isFocusableWindow();
        scheduler.gui.MainUI mainUI25 = null;
        scheduler.gui.SensorPanel sensorPanel26 = new scheduler.gui.SensorPanel(mainUI25);
        java.awt.event.ContainerListener containerListener27 = null;
        sensorPanel26.removeContainerListener(containerListener27);
        java.awt.event.MouseEvent mouseEvent29 = null;
        java.lang.String str30 = sensorPanel26.getToolTipText(mouseEvent29);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        sensorPanel26.removeInputMethodListener(inputMethodListener31);
        sensorPanel26.enable();
        java.awt.Point point34 = sensorPanel26.location();
        mainUI19.setLocation(point34);
        java.awt.Component component36 = paymentPanel12.getComponentAt(point34);
        mainUI0.setLocation(point34);
        mainUI0.showPanel("scheduler.gui.MainUI[frame14,0,0,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(point34);
        org.junit.Assert.assertNull(component36);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        mainUI0.setSize(12, (int) (short) 1);
        java.awt.event.WindowFocusListener windowFocusListener12 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener12);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
        float float13 = mainUI7.getAlignmentY();
        scheduler.gui.MyBookingsPanel myBookingsPanel14 = new scheduler.gui.MyBookingsPanel(mainUI7);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        paymentPanel1.addPropertyChangeListener("ADMIN_DASHBOARD", propertyChangeListener5);
        java.lang.String str7 = paymentPanel1.getToolTipText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.String str1 = faculty0.getOrgID();
        boolean boolean2 = faculty0.isVerified();
        faculty0.setVerified(true);
        java.lang.String str5 = faculty0.getOrgID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        java.awt.image.ColorModel colorModel12 = mainUI0.getColorModel();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertNotNull(colorModel12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        java.awt.Event event8 = null;
        boolean boolean11 = mainUI0.mouseEnter(event8, 1, 12);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
        int int15 = sensorPanel1.getX();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
        java.awt.dnd.DropTarget dropTarget13 = mainUI7.getDropTarget();
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.PaymentPanel paymentPanel15 = new scheduler.gui.PaymentPanel(mainUI14);
        boolean boolean16 = paymentPanel15.isEnabled();
        boolean boolean17 = paymentPanel15.isPaintingForPrint();
        boolean boolean18 = paymentPanel15.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        mainUI19.setTitle("REGISTRATION");
        int int22 = mainUI19.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener23 = null;
        mainUI19.removeWindowFocusListener(windowFocusListener23);
        javax.swing.TransferHandler transferHandler25 = null;
        mainUI19.setTransferHandler(transferHandler25);
        java.awt.im.InputContext inputContext27 = mainUI19.getInputContext();
        paymentPanel15.setNextFocusableComponent((java.awt.Component) mainUI19);
        java.awt.Dialog.ModalExclusionType modalExclusionType29 = mainUI19.getModalExclusionType();
        mainUI7.setModalExclusionType(modalExclusionType29);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(dropTarget13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(inputContext27);
        org.junit.Assert.assertTrue("'" + modalExclusionType29 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType29.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.PaymentPanel paymentPanel16 = new scheduler.gui.PaymentPanel(mainUI15);
        boolean boolean17 = paymentPanel16.isEnabled();
        boolean boolean18 = paymentPanel16.isPaintingForPrint();
        boolean boolean19 = paymentPanel16.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.SensorPanel sensorPanel21 = new scheduler.gui.SensorPanel(mainUI20);
        java.awt.event.ContainerListener containerListener22 = null;
        sensorPanel21.removeContainerListener(containerListener22);
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.lang.String str25 = sensorPanel21.getToolTipText(mouseEvent24);
        java.awt.Dimension dimension26 = sensorPanel21.minimumSize();
        paymentPanel16.setSize(dimension26);
        boolean boolean28 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel16);
        scheduler.gui.MainUI mainUI29 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        mainUI29.addPropertyChangeListener("hi!", propertyChangeListener31);
        java.awt.Insets insets33 = mainUI29.getInsets();
        java.awt.Rectangle rectangle34 = null;
        mainUI29.setMaximizedBounds(rectangle34);
        java.awt.Event event36 = null;
        boolean boolean39 = mainUI29.mouseDrag(event36, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension40 = mainUI29.getPreferredSize();
        java.awt.Dimension dimension41 = paymentPanel16.getSize(dimension40);
        java.awt.image.ImageProducer imageProducer42 = null;
        java.awt.Image image43 = paymentPanel16.createImage(imageProducer42);
        mainUI5.setContentPane((java.awt.Container) paymentPanel16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(insets33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dimension40);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertNotNull(image43);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
        java.lang.String str14 = sensorPanel1.toString();
        java.awt.event.MouseListener mouseListener15 = null;
        sensorPanel1.addMouseListener(mouseListener15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
        java.awt.event.WindowFocusListener windowFocusListener48 = null;
        mainUI38.removeWindowFocusListener(windowFocusListener48);
        javax.swing.TransferHandler transferHandler50 = mainUI38.getTransferHandler();
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
        org.junit.Assert.assertNull(transferHandler50);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        java.awt.event.ContainerListener containerListener21 = null;
        mainUI0.removeContainerListener(containerListener21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(accessibleContext19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + java.awt.Window.Type.NORMAL + "'", type20.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        mainUI0.addPropertyChangeListener(propertyChangeListener6);
        java.awt.Component component10 = mainUI0.locate((int) (byte) 100, 9);
        java.awt.event.KeyListener[] keyListenerArray11 = component10.getKeyListeners();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNotNull(keyListenerArray11);
        org.junit.Assert.assertArrayEquals(keyListenerArray11, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.Dimension dimension23 = sensorPanel18.minimumSize();
        java.awt.ImageCapabilities imageCapabilities26 = null;
        java.awt.image.VolatileImage volatileImage27 = sensorPanel18.createVolatileImage(8, (-1), imageCapabilities26);
        javax.swing.InputMap inputMap28 = sensorPanel18.getInputMap();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.lang.String str33 = sensorPanel30.toString();
        java.awt.MenuComponent menuComponent34 = null;
        sensorPanel30.remove(menuComponent34);
        java.awt.Component[] componentArray36 = sensorPanel30.getComponents();
        java.awt.LayoutManager layoutManager37 = sensorPanel30.getLayout();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.Dimension dimension44 = sensorPanel39.minimumSize();
        java.awt.ImageCapabilities imageCapabilities47 = null;
        java.awt.image.VolatileImage volatileImage48 = sensorPanel39.createVolatileImage(8, (-1), imageCapabilities47);
        java.awt.Image image51 = sensorPanel39.createImage(3, 1);
        java.awt.Rectangle rectangle52 = null;
        java.awt.Rectangle rectangle53 = sensorPanel39.getBounds(rectangle52);
        sensorPanel30.paintImmediately(rectangle53);
        sensorPanel18.paintImmediately(rectangle53);
        sensorPanel1.scrollRectToVisible(rectangle53);
        sensorPanel1.repaint(32, 2, 7, (int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertNotNull(inputMap28);
        org.junit.Assert.assertNotNull(componentArray36);
        org.junit.Assert.assertNotNull(layoutManager37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertNull(volatileImage48);
        org.junit.Assert.assertNull(image51);
        org.junit.Assert.assertNotNull(rectangle53);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        mainUI0.setLocation(268, 83);
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
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = paymentPanel1.getPropertyChangeListeners("");
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray7 = paymentPanel1.getVetoableChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray6, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray7);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray7, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Dimension dimension18 = sensorPanel13.minimumSize();
        sensorPanel13.resetKeyboardActions();
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.PaymentPanel paymentPanel21 = new scheduler.gui.PaymentPanel(mainUI20);
        boolean boolean22 = paymentPanel21.isEnabled();
        boolean boolean23 = paymentPanel21.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation24 = paymentPanel21.getComponentOrientation();
        sensorPanel13.applyComponentOrientation(componentOrientation24);
        java.awt.Dimension dimension26 = sensorPanel13.preferredSize();
        int int29 = sensorPanel13.getBaseline(12, 1047);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        java.awt.Dimension dimension36 = sensorPanel31.minimumSize();
        sensorPanel31.resetKeyboardActions();
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.PaymentPanel paymentPanel39 = new scheduler.gui.PaymentPanel(mainUI38);
        boolean boolean40 = paymentPanel39.isEnabled();
        boolean boolean41 = paymentPanel39.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation42 = paymentPanel39.getComponentOrientation();
        sensorPanel31.applyComponentOrientation(componentOrientation42);
        java.awt.Dimension dimension44 = sensorPanel31.preferredSize();
        loginPanel11.putClientProperty((java.lang.Object) int29, (java.lang.Object) sensorPanel31);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(componentOrientation24);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(componentOrientation42);
        org.junit.Assert.assertNotNull(dimension44);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        sensorPanel1.enable();
        java.awt.Point point9 = sensorPanel1.location();
        boolean boolean10 = sensorPanel1.isManagingFocus();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = sensorPanel1.areFocusTraversalKeysSet(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(point9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        java.awt.Dimension dimension8 = sensorPanel1.getMinimumSize();
        javax.swing.plaf.PanelUI panelUI9 = sensorPanel1.getUI();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(panelUI9);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        java.awt.event.FocusListener focusListener9 = null;
        mainUI0.removeFocusListener(focusListener9);
        java.awt.Event event11 = null;
        scheduler.booking.Booking booking12 = new scheduler.booking.Booking();
        booking12.cancel();
        double double14 = booking12.getUpfrontDeposit();
        double double15 = booking12.calculateFinalCost();
        double double16 = booking12.getUpfrontDeposit();
        boolean boolean17 = mainUI0.action(event11, (java.lang.Object) double16);
        mainUI0.disable();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.lang.String str19 = sensorPanel15.getToolTipText(mouseEvent18);
        java.awt.Dimension dimension20 = sensorPanel15.minimumSize();
        java.awt.ImageCapabilities imageCapabilities23 = null;
        java.awt.image.VolatileImage volatileImage24 = sensorPanel15.createVolatileImage(8, (-1), imageCapabilities23);
        javax.swing.InputMap inputMap25 = sensorPanel15.getInputMap();
        sensorPanel1.setInputMap(1, inputMap25);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(volatileImage24);
        org.junit.Assert.assertNotNull(inputMap25);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        scheduler.gui.RoomManagementPanel roomManagementPanel8 = new scheduler.gui.RoomManagementPanel(mainUI0);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        roomManagementPanel8.removeAncestorListener(ancestorListener9);
        java.awt.event.HierarchyListener[] hierarchyListenerArray11 = roomManagementPanel8.getHierarchyListeners();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray11);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray11, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.repaint();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        mainUI0.firePropertyChange("", (long) 64, 10L);
        int int8 = mainUI0.getWidth();
        mainUI0.resize((int) ' ', (int) '4');
        java.awt.event.WindowFocusListener[] windowFocusListenerArray12 = mainUI0.getWindowFocusListeners();
        java.util.Locale locale13 = mainUI0.getLocale();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1047 + "'", int8 == 1047);
        org.junit.Assert.assertNotNull(windowFocusListenerArray12);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray12, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
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
        java.awt.MenuComponent menuComponent19 = null;
        mainUI0.remove(menuComponent19);
        java.io.PrintStream printStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.list(printStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        scheduler.user.Partner partner5 = new scheduler.user.Partner("", "MY_BOOKINGS", "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "ROOM_BOOKING", true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        java.awt.Point point21 = mainUI0.getMousePosition();
        java.awt.AWTEvent aWTEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.dispatchEvent(aWTEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(point21);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        javax.swing.TransferHandler transferHandler6 = null;
        mainUI0.setTransferHandler(transferHandler6);
        java.awt.im.InputContext inputContext8 = mainUI0.getInputContext();
        boolean boolean9 = mainUI0.isShowing();
        java.awt.Window window10 = mainUI0.getOwner();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(inputContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(window10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        java.awt.image.ColorModel colorModel13 = sensorPanel1.getColorModel();
        int int14 = sensorPanel1.getComponentCount();
        java.awt.AWTEvent aWTEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.dispatchEvent(aWTEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(colorModel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        scheduler.user.Faculty faculty0 = new scheduler.user.Faculty();
        java.lang.String str1 = faculty0.getOrgID();
        boolean boolean2 = faculty0.isVerified();
        faculty0.setVerified(true);
        java.lang.String str5 = faculty0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        java.awt.Event event25 = null;
        boolean boolean28 = sensorPanel1.mouseUp(event25, 0, (int) (byte) -1);
        int int29 = sensorPanel1.getX();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        scheduler.room.Room room3 = new scheduler.room.Room("ADMIN_DASHBOARD", (int) (byte) 1, "scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        scheduler.room.AvailableState availableState4 = new scheduler.room.AvailableState();
        scheduler.room.Room room8 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str9 = room8.getLocation();
        availableState4.handleReserve(room8);
        room3.setState((scheduler.room.RoomState) availableState4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Booking System" + "'", str9, "Room Booking System");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        boolean boolean9 = mainUI0.isAlwaysOnTop();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = mainUI0.getPropertyChangeListeners("MY_BOOKINGS");
        mainUI0.setSize(7, (int) (short) 0);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray11, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.isRoomAvailable("hi!", localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = bookingManager12.modifyBooking("Student", localDateTime20, localDateTime21);
        boolean boolean24 = bookingManager12.cancelBooking("PAYMENT");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        javax.swing.plaf.PanelUI panelUI8 = sensorPanel1.getUI();
        boolean boolean9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) sensorPanel1);
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
        java.awt.Rectangle rectangle24 = null;
        java.awt.Rectangle rectangle25 = sensorPanel11.getBounds(rectangle24);
        boolean boolean26 = sensorPanel11.isShowing();
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        mainUI27.addPropertyChangeListener("hi!", propertyChangeListener29);
        java.awt.Shape shape31 = mainUI27.getShape();
        java.lang.Object obj32 = sensorPanel11.getClientProperty((java.lang.Object) shape31);
        int int33 = sensorPanel11.getX();
        int int34 = sensorPanel1.getComponentZOrder((java.awt.Component) sensorPanel11);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(volatileImage20);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(rectangle25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        occupiedState0.handleRelease(room4);
        scheduler.room.MaintenanceState maintenanceState7 = new scheduler.room.MaintenanceState();
        room4.setState((scheduler.room.RoomState) maintenanceState7);
        java.lang.String str9 = room4.getStatus();
        java.lang.String str10 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "enabled" + "'", str9, "enabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.detectOccupancy();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        java.awt.Event event9 = null;
        boolean boolean12 = paymentPanel5.mouseUp(event9, 4, 6);
        paymentPanel5.transferFocusDownCycle();
        paymentPanel5.firePropertyChange("ToolTipText", true, false);
        boolean boolean18 = paymentPanel5.isValidateRoot();
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        sensorPanel20.removeInputMethodListener(inputMethodListener25);
        sensorPanel20.enable();
        sensorPanel20.layout();
        sensorPanel20.setVisible(false);
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        sensorPanel20.removeHierarchyListener(hierarchyListener31);
        boolean boolean33 = paymentPanel5.isAncestorOf((java.awt.Component) sensorPanel20);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        javax.swing.TransferHandler transferHandler7 = mainUI0.getTransferHandler();
        mainUI0.setTitle("ToolTipText");
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNull(transferHandler7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        boolean boolean3 = mainUI0.isLocationByPlatform();
        boolean boolean4 = mainUI0.isResizable();
        java.awt.Graphics graphics5 = mainUI0.getGraphics();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(graphics5);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        mainUI0.hide();
        java.awt.PopupMenu popupMenu22 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.add(popupMenu22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
        java.awt.event.ComponentListener componentListener14 = null;
        mainUI0.addComponentListener(componentListener14);
        boolean boolean16 = mainUI0.isResizable();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
        boolean boolean40 = paymentPanel1.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(componentArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.MouseListener[] mouseListenerArray6 = mainUI0.getMouseListeners();
        java.awt.Container container7 = mainUI0.getContentPane();
        java.awt.Event event8 = null;
        scheduler.booking.Booking booking9 = new scheduler.booking.Booking();
        boolean boolean11 = booking9.extendBooking((int) (byte) 0);
        scheduler.user.User user12 = booking9.getUser();
        double double13 = booking9.calculateFinalCost();
        double double15 = booking9.calculateFinalCost((int) (short) -1);
        java.time.LocalDateTime localDateTime16 = booking9.getEndTime();
        boolean boolean17 = mainUI0.gotFocus(event8, (java.lang.Object) booking9);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertArrayEquals(mouseListenerArray6, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertNotNull(container7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        boolean boolean71 = mainUI61.isAlwaysOnTopSupported();
        java.io.PrintStream printStream72 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI61.list(printStream72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        mainUI0.setAutoRequestFocus(true);
        java.awt.Point point8 = mainUI0.location();
        java.awt.event.WindowListener windowListener9 = null;
        mainUI0.addWindowListener(windowListener9);
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        mainUI11.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel14 = new scheduler.gui.AdminDashboardPanel(mainUI11);
        java.awt.Graphics graphics15 = mainUI11.getGraphics();
        int int16 = mainUI11.getHeight();
        mainUI11.setAutoRequestFocus(true);
        java.awt.Point point19 = mainUI11.location();
        mainUI11.setFocusCycleRoot(false);
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.PaymentPanel paymentPanel23 = new scheduler.gui.PaymentPanel(mainUI22);
        boolean boolean24 = paymentPanel23.isEnabled();
        paymentPanel23.paintImmediately(8, (int) '#', 100, 10);
        scheduler.gui.MainUI mainUI30 = new scheduler.gui.MainUI();
        mainUI30.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener33 = null;
        mainUI30.addWindowFocusListener(windowFocusListener33);
        boolean boolean35 = mainUI30.isFocusableWindow();
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        sensorPanel37.removeInputMethodListener(inputMethodListener42);
        sensorPanel37.enable();
        java.awt.Point point45 = sensorPanel37.location();
        mainUI30.setLocation(point45);
        java.awt.Component component47 = paymentPanel23.getComponentAt(point45);
        mainUI11.setLocation(point45);
        boolean boolean49 = mainUI0.contains(point45);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(graphics15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 650 + "'", int16 == 650);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(point45);
        org.junit.Assert.assertNull(component47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior53 = paymentPanel1.getBaselineResizeBehavior();
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
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior53 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior53.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double2 = booking0.calculateUpfrontCost();
        booking0.cancel();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior18 = mainUI5.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(menuBar17);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior18 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior18.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.MenuBar menuBar5 = mainUI0.getMenuBar();
        mainUI0.setVisible(true);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNull(menuBar5);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
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
        scheduler.gui.MainUI mainUI84 = null;
        scheduler.gui.SensorPanel sensorPanel85 = new scheduler.gui.SensorPanel(mainUI84);
        java.awt.event.ContainerListener containerListener86 = null;
        sensorPanel85.removeContainerListener(containerListener86);
        java.awt.event.MouseEvent mouseEvent88 = null;
        java.lang.String str89 = sensorPanel85.getToolTipText(mouseEvent88);
        java.awt.Dimension dimension90 = sensorPanel85.minimumSize();
        sensorPanel85.resetKeyboardActions();
        scheduler.gui.MainUI mainUI92 = null;
        scheduler.gui.PaymentPanel paymentPanel93 = new scheduler.gui.PaymentPanel(mainUI92);
        boolean boolean94 = paymentPanel93.isEnabled();
        boolean boolean95 = paymentPanel93.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation96 = paymentPanel93.getComponentOrientation();
        sensorPanel85.applyComponentOrientation(componentOrientation96);
        mainUI0.applyComponentOrientation(componentOrientation96);
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
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(dimension90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(componentOrientation96);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        scheduler.payment.DebitCardPayment debitCardPayment0 = new scheduler.payment.DebitCardPayment();
        boolean boolean2 = debitCardPayment0.processTransaction((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        java.awt.image.BufferStrategy bufferStrategy14 = mainUI0.getBufferStrategy();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(bufferStrategy14);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        boolean boolean6 = mainUI0.isAutoRequestFocus();
        scheduler.gui.MainUI mainUI7 = null;
        scheduler.gui.SensorPanel sensorPanel8 = new scheduler.gui.SensorPanel(mainUI7);
        java.awt.event.ContainerListener containerListener9 = null;
        sensorPanel8.removeContainerListener(containerListener9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.lang.String str12 = sensorPanel8.getToolTipText(mouseEvent11);
        java.awt.Dimension dimension13 = sensorPanel8.minimumSize();
        sensorPanel8.resetKeyboardActions();
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.PaymentPanel paymentPanel16 = new scheduler.gui.PaymentPanel(mainUI15);
        boolean boolean17 = paymentPanel16.isEnabled();
        boolean boolean18 = paymentPanel16.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation19 = paymentPanel16.getComponentOrientation();
        sensorPanel8.applyComponentOrientation(componentOrientation19);
        mainUI0.applyComponentOrientation(componentOrientation19);
        boolean boolean22 = mainUI0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(componentOrientation19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        occupiedState0.handleRelease(room4);
        scheduler.room.AvailableState availableState7 = new scheduler.room.AvailableState();
        scheduler.room.Room room11 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str12 = room11.getLocation();
        availableState7.handleReserve(room11);
        occupiedState0.handleReserve(room11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Booking System" + "'", str12, "Room Booking System");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
        mainUI5.disable();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet19 = mainUI5.getFocusTraversalKeys(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        scheduler.user.Staff staff0 = new scheduler.user.Staff();
        boolean boolean2 = staff0.checkPassword("");
        java.lang.String str3 = staff0.getUserID();
        java.lang.String str4 = staff0.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
        sensorPanel9.hide();
        sensorPanel9.setVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        java.awt.Component component15 = mainUI14.getGlassPane();
        javax.swing.JMenuBar jMenuBar16 = mainUI14.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.Component component18 = null;
        boolean boolean19 = mainUI14.isAncestorOf(component18);
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.PaymentPanel paymentPanel21 = new scheduler.gui.PaymentPanel(mainUI20);
        boolean boolean22 = paymentPanel21.isEnabled();
        boolean boolean23 = paymentPanel21.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation24 = paymentPanel21.getComponentOrientation();
        mainUI14.setComponentOrientation(componentOrientation24);
        java.awt.Dimension dimension26 = mainUI14.getSize();
        sensorPanel1.setSize(dimension26);
        javax.swing.KeyStroke keyStroke28 = null;
        java.awt.event.ActionListener actionListener29 = sensorPanel1.getActionForKeyStroke(keyStroke28);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertNull(jMenuBar16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(componentOrientation24);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNull(actionListener29);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        component1.setLocation(32, 0);
        boolean boolean5 = component1.isVisible();
        boolean boolean6 = component1.hasFocus();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        scheduler.pricing.StaffPricing staffPricing12 = new scheduler.pricing.StaffPricing();
        double double13 = staffPricing12.getHourlyRate();
        double double14 = staffPricing12.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing12);
        double double16 = booking0.getUpfrontDeposit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        java.lang.String str16 = sensorPanel1.getToolTipText();
        float float17 = sensorPanel1.getAlignmentY();
        boolean boolean18 = sensorPanel1.isFocusable();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        scheduler.user.Student student5 = new scheduler.user.Student("REGISTRATION", "LOGIN", "CHIEF_COORDINATOR_DASHBOARD", "enabled", true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet5 = mainUI0.getFocusTraversalKeys((int) (short) 0);
        java.awt.event.ComponentListener componentListener6 = null;
        mainUI0.removeComponentListener(componentListener6);
        mainUI0.setTitle("PAYMENT");
        java.awt.Window window10 = mainUI0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = window10.getIgnoreRepaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet5);
        org.junit.Assert.assertNull(window10);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        paymentPanel1.removeAll();
        paymentPanel1.addNotify();
        paymentPanel1.setRequestFocusEnabled(false);
        paymentPanel1.repaint((long) 6, (int) (short) 10, (int) (byte) 0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        scheduler.user.Staff staff5 = new scheduler.user.Staff("enabled", "PAYMENT", "ToolTipText", "hi!", true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
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
        boolean boolean38 = sensorPanel1.isMaximumSizeSet();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(componentArray18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: wrong parent for CardLayout");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        scheduler.user.User user4 = booking0.getUser();
        booking0.setBookingID("SENSOR");
        java.time.LocalDateTime localDateTime7 = booking0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        mainUI0.setBounds(8, 6, (int) '4', 0);
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = mainUI0.handleEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        mainUI0.repaint(650, 650, 10, 100);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        occupiedState0.handleRelease(room4);
        scheduler.room.MaintenanceState maintenanceState7 = new scheduler.room.MaintenanceState();
        room4.setState((scheduler.room.RoomState) maintenanceState7);
        scheduler.room.OccupiedState occupiedState9 = new scheduler.room.OccupiedState();
        scheduler.room.Room room13 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str14 = room13.getBuilding();
        occupiedState9.handleReserve(room13);
        maintenanceState7.handleRelease(room13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Booking System" + "'", str14, "Room Booking System");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        scheduler.user.ChiefEventCoordinator chiefEventCoordinator0 = scheduler.user.ChiefEventCoordinator.getInstance();
        boolean boolean3 = chiefEventCoordinator0.authenticate("ToolTipText", "");
        // The following exception was thrown during execution in test generation
        try {
            scheduler.user.Administrator administrator6 = chiefEventCoordinator0.generateAdminAccount("", "ADMIN_DASHBOARD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Administrator email cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        scheduler.sensor.SensorObserver sensorObserver5 = null;
        hardwareSensor2.detach(sensorObserver5);
        java.lang.String str7 = hardwareSensor2.getSensorID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADMIN_DASHBOARD" + "'", str7, "ADMIN_DASHBOARD");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        java.awt.image.ColorModel colorModel13 = sensorPanel1.getColorModel();
        int int14 = sensorPanel1.getComponentCount();
        boolean boolean15 = sensorPanel1.isShowing();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        java.awt.Dimension dimension22 = sensorPanel17.minimumSize();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = sensorPanel24.getToolTipText(mouseEvent27);
        sensorPanel24.transferFocus();
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = sensorPanel24.createImage(imageProducer30);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.SensorPanel sensorPanel35 = new scheduler.gui.SensorPanel(mainUI34);
        java.awt.event.ContainerListener containerListener36 = null;
        sensorPanel35.removeContainerListener(containerListener36);
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.lang.String str39 = sensorPanel35.getToolTipText(mouseEvent38);
        java.awt.Insets insets40 = sensorPanel35.getInsets();
        int int41 = sensorPanel17.checkImage(image31, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel35);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        sensorPanel35.addPropertyChangeListener("hi!", propertyChangeListener43);
        java.awt.Color color45 = sensorPanel35.getForeground();
        javax.swing.plaf.PanelUI panelUI46 = sensorPanel35.getUI();
        sensorPanel1.setUI(panelUI46);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(colorModel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(insets40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(panelUI46);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        boolean boolean15 = sensorPanel1.isCursorSet();
        java.awt.Dimension dimension16 = sensorPanel1.size();
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        java.awt.Component component18 = mainUI17.getGlassPane();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        component18.addInputMethodListener(inputMethodListener19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Dimension dimension27 = sensorPanel22.minimumSize();
        java.awt.ImageCapabilities imageCapabilities30 = null;
        java.awt.image.VolatileImage volatileImage31 = sensorPanel22.createVolatileImage(8, (-1), imageCapabilities30);
        javax.swing.InputMap inputMap32 = sensorPanel22.getInputMap();
        scheduler.gui.MainUI mainUI33 = null;
        scheduler.gui.SensorPanel sensorPanel34 = new scheduler.gui.SensorPanel(mainUI33);
        java.awt.event.ContainerListener containerListener35 = null;
        sensorPanel34.removeContainerListener(containerListener35);
        java.lang.String str37 = sensorPanel34.toString();
        java.awt.MenuComponent menuComponent38 = null;
        sensorPanel34.remove(menuComponent38);
        java.awt.Component[] componentArray40 = sensorPanel34.getComponents();
        java.awt.LayoutManager layoutManager41 = sensorPanel34.getLayout();
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
        java.awt.Rectangle rectangle56 = null;
        java.awt.Rectangle rectangle57 = sensorPanel43.getBounds(rectangle56);
        sensorPanel34.paintImmediately(rectangle57);
        sensorPanel22.paintImmediately(rectangle57);
        java.awt.Rectangle rectangle60 = component18.getBounds(rectangle57);
        sensorPanel1.repaint(rectangle60);
        sensorPanel1.enable(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(componentArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(volatileImage31);
        org.junit.Assert.assertNotNull(inputMap32);
        org.junit.Assert.assertNotNull(componentArray40);
        org.junit.Assert.assertNotNull(layoutManager41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertNull(volatileImage52);
        org.junit.Assert.assertNull(image55);
        org.junit.Assert.assertNotNull(rectangle57);
        org.junit.Assert.assertNotNull(rectangle60);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        java.awt.Component component10 = mainUI0.getComponentAt((int) (byte) 0, 2);
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
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        sensorPanel40.addPropertyChangeListener("hi!", propertyChangeListener48);
        java.awt.Color color50 = sensorPanel40.getForeground();
        sensorPanel12.setForeground(color50);
        sensorPanel12.removeNotify();
        int int53 = mainUI0.getComponentZOrder((java.awt.Component) sensorPanel12);
        java.awt.Component component54 = mainUI0.getMostRecentFocusOwner();
        java.awt.Rectangle rectangle55 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setBounds(rectangle55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNotNull(componentArray18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(component54);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.isRoomAvailable("hi!", localDateTime16, localDateTime17);
        java.util.Map<java.lang.String, scheduler.room.Room> strMap19 = bookingManager12.getRooms();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        // The following exception was thrown during execution in test generation
        try {
            scheduler.room.Room room3 = new scheduler.room.Room("LOGIN", (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        scheduler.user.Partner partner5 = new scheduler.user.Partner("hi!", "", "REGISTRATION", "LOGIN", false);
        partner5.setVerified(true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("hi!", "REGISTRATION");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        scheduler.booking.BookingManager bookingManager0 = new scheduler.booking.BookingManager();
        bookingManager0.update("ToolTipText");
        bookingManager0.checkTimeouts();
        bookingManager0.update("SENSOR");
        scheduler.user.Staff staff6 = new scheduler.user.Staff();
        boolean boolean8 = staff6.checkPassword("SENSOR");
        java.lang.String str9 = staff6.getOrgID();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        scheduler.pricing.StaffPricing staffPricing13 = new scheduler.pricing.StaffPricing();
        double double14 = staffPricing13.getHourlyRate();
        double double15 = staffPricing13.getHourlyRate();
        double double16 = staffPricing13.getHourlyRate();
        scheduler.payment.CreditCardPayment creditCardPayment17 = new scheduler.payment.CreditCardPayment();
        boolean boolean19 = creditCardPayment17.processTransaction((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking20 = bookingManager0.createBooking((scheduler.user.User) staff6, "scheduler.gui.MainUI[frame13,10,64,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", localDateTime11, localDateTime12, (scheduler.pricing.PricingStrategy) staffPricing13, (scheduler.payment.PaymentStrategy) creditCardPayment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The selected room does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
        java.awt.Dimension dimension12 = mainUI0.getSize();
        mainUI0.resize(64, (-1));
        scheduler.gui.RoomBookingPanel roomBookingPanel16 = new scheduler.gui.RoomBookingPanel(mainUI0);
        scheduler.gui.MainUI mainUI17 = new scheduler.gui.MainUI();
        mainUI17.setTitle("REGISTRATION");
        int int20 = mainUI17.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        mainUI17.addPropertyChangeListener("REGISTRATION", propertyChangeListener22);
        scheduler.gui.UserDashboardPanel userDashboardPanel24 = new scheduler.gui.UserDashboardPanel(mainUI17);
        java.awt.Component component27 = mainUI17.getComponentAt((int) (byte) 0, 2);
        javax.swing.TransferHandler transferHandler28 = mainUI17.getTransferHandler();
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        java.awt.Dimension dimension35 = sensorPanel30.minimumSize();
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        sensorPanel37.transferFocus();
        java.awt.image.ImageProducer imageProducer43 = null;
        java.awt.Image image44 = sensorPanel37.createImage(imageProducer43);
        scheduler.gui.MainUI mainUI47 = null;
        scheduler.gui.SensorPanel sensorPanel48 = new scheduler.gui.SensorPanel(mainUI47);
        java.awt.event.ContainerListener containerListener49 = null;
        sensorPanel48.removeContainerListener(containerListener49);
        java.awt.event.MouseEvent mouseEvent51 = null;
        java.lang.String str52 = sensorPanel48.getToolTipText(mouseEvent51);
        java.awt.Insets insets53 = sensorPanel48.getInsets();
        int int54 = sensorPanel30.checkImage(image44, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel48);
        java.awt.event.InputMethodListener[] inputMethodListenerArray55 = sensorPanel48.getInputMethodListeners();
        java.awt.Rectangle rectangle56 = sensorPanel48.getBounds();
        mainUI17.setBounds(rectangle56);
        java.awt.Rectangle rectangle58 = roomBookingPanel16.getBounds(rectangle56);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNull(transferHandler28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(image44);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(insets53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray55);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray55, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertNotNull(rectangle56);
        org.junit.Assert.assertNotNull(rectangle58);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        scheduler.room.Room room3 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str4 = room3.getLocation();
        int int5 = room3.getCapacity();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Room Booking System" + "'", str4, "Room Booking System");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 83 + "'", int5 == 83);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        boolean boolean10 = mainUI0.isMaximumSizeSet();
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
        mainUI11.setFocusableWindowState(false);
        javax.accessibility.AccessibleContext accessibleContext30 = mainUI11.getAccessibleContext();
        java.awt.Window.Type type31 = mainUI11.getType();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setType(type31);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(accessibleContext30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + java.awt.Window.Type.NORMAL + "'", type31.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        component1.addInputMethodListener(inputMethodListener2);
        java.awt.event.MouseListener mouseListener4 = null;
        component1.removeMouseListener(mouseListener4);
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        int int5 = mainUI0.countComponents();
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
        scheduler.gui.PaymentPanel paymentPanel16 = new scheduler.gui.PaymentPanel(mainUI15);
        boolean boolean17 = paymentPanel16.isEnabled();
        boolean boolean18 = paymentPanel16.isPaintingForPrint();
        boolean boolean19 = paymentPanel16.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI20 = null;
        scheduler.gui.SensorPanel sensorPanel21 = new scheduler.gui.SensorPanel(mainUI20);
        java.awt.event.ContainerListener containerListener22 = null;
        sensorPanel21.removeContainerListener(containerListener22);
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.lang.String str25 = sensorPanel21.getToolTipText(mouseEvent24);
        java.awt.Dimension dimension26 = sensorPanel21.minimumSize();
        paymentPanel16.setSize(dimension26);
        java.awt.event.ContainerListener containerListener28 = null;
        paymentPanel16.removeContainerListener(containerListener28);
        java.awt.Insets insets30 = null;
        java.awt.Insets insets31 = paymentPanel16.getInsets(insets30);
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.lang.String str37 = sensorPanel33.getToolTipText(mouseEvent36);
        java.awt.Graphics graphics38 = null;
        sensorPanel33.paintAll(graphics38);
        java.awt.event.MouseListener mouseListener40 = null;
        sensorPanel33.addMouseListener(mouseListener40);
        java.awt.Component component43 = paymentPanel16.add((java.awt.Component) sensorPanel33, (int) (byte) -1);
        int int44 = mainUI0.checkImage(image14, (java.awt.image.ImageObserver) sensorPanel33);
        scheduler.gui.MainUI mainUI45 = new scheduler.gui.MainUI();
        mainUI45.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener48 = null;
        mainUI45.addWindowFocusListener(windowFocusListener48);
        boolean boolean50 = mainUI45.isFocusableWindow();
        scheduler.gui.MainUI mainUI51 = null;
        scheduler.gui.SensorPanel sensorPanel52 = new scheduler.gui.SensorPanel(mainUI51);
        java.awt.event.ContainerListener containerListener53 = null;
        sensorPanel52.removeContainerListener(containerListener53);
        java.awt.event.MouseEvent mouseEvent55 = null;
        java.lang.String str56 = sensorPanel52.getToolTipText(mouseEvent55);
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        sensorPanel52.removeInputMethodListener(inputMethodListener57);
        sensorPanel52.enable();
        java.awt.Point point60 = sensorPanel52.location();
        mainUI45.setLocation(point60);
        mainUI45.setFocusableWindowState(false);
        java.awt.event.FocusEvent.Cause cause64 = null;
        mainUI45.requestFocus(cause64);
        scheduler.gui.MainUI mainUI66 = null;
        scheduler.gui.SensorPanel sensorPanel67 = new scheduler.gui.SensorPanel(mainUI66);
        java.awt.event.ContainerListener containerListener68 = null;
        sensorPanel67.removeContainerListener(containerListener68);
        java.lang.String str70 = sensorPanel67.toString();
        java.awt.MenuComponent menuComponent71 = null;
        sensorPanel67.remove(menuComponent71);
        java.awt.Component[] componentArray73 = sensorPanel67.getComponents();
        java.awt.LayoutManager layoutManager74 = sensorPanel67.getLayout();
        java.awt.LayoutManager layoutManager75 = sensorPanel67.getLayout();
        sensorPanel67.firePropertyChange("REGISTRATION", (double) (short) 1, (double) 16);
        javax.swing.border.Border border80 = sensorPanel67.getBorder();
        scheduler.gui.MainUI mainUI81 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        mainUI81.addPropertyChangeListener("hi!", propertyChangeListener83);
        java.awt.Insets insets85 = mainUI81.getInsets();
        java.awt.Rectangle rectangle86 = null;
        mainUI81.setMaximizedBounds(rectangle86);
        mainUI81.toBack();
        scheduler.gui.MainUI mainUI89 = new scheduler.gui.MainUI();
        mainUI89.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel92 = new scheduler.gui.AdminDashboardPanel(mainUI89);
        java.awt.Graphics graphics93 = mainUI89.getGraphics();
        mainUI81.paint(graphics93);
        sensorPanel67.print(graphics93);
        mainUI45.update(graphics93);
        mainUI0.printComponents(graphics93);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(image14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(insets31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(component43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(point60);
        org.junit.Assert.assertNotNull(componentArray73);
        org.junit.Assert.assertNotNull(layoutManager74);
        org.junit.Assert.assertNotNull(layoutManager75);
        org.junit.Assert.assertNotNull(border80);
        org.junit.Assert.assertNotNull(insets85);
        org.junit.Assert.assertNotNull(graphics93);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
        scheduler.gui.MainUI mainUI15 = new scheduler.gui.MainUI();
        mainUI15.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener18 = null;
        mainUI15.addWindowFocusListener(windowFocusListener18);
        boolean boolean20 = mainUI15.isFocusableWindow();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        sensorPanel22.removeInputMethodListener(inputMethodListener27);
        sensorPanel22.enable();
        java.awt.Point point30 = sensorPanel22.location();
        mainUI15.setLocation(point30);
        mainUI15.setFocusableWindowState(false);
        java.awt.Dimension dimension34 = mainUI15.getSize();
        paymentPanel1.setSize(dimension34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        mainUI0.removeWindowFocusListener(windowFocusListener4);
        javax.swing.TransferHandler transferHandler6 = null;
        mainUI0.setTransferHandler(transferHandler6);
        java.awt.im.InputContext inputContext8 = mainUI0.getInputContext();
        javax.swing.TransferHandler transferHandler9 = mainUI0.getTransferHandler();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(inputContext8);
        org.junit.Assert.assertNull(transferHandler9);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        scheduler.gui.UserDashboardPanel userDashboardPanel7 = new scheduler.gui.UserDashboardPanel(mainUI0);
        mainUI0.setVisible(false);
        mainUI0.toBack();
        boolean boolean11 = mainUI0.isUndecorated();
        java.awt.Rectangle rectangle12 = mainUI0.getMaximizedBounds();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(rectangle12);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.invalidate();
        boolean boolean3 = mainUI0.isMaximumSizeSet();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        scheduler.pricing.PartnerPricing partnerPricing0 = new scheduler.pricing.PartnerPricing();
        double double1 = partnerPricing0.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        mainUI0.setSize(12, (int) (short) 1);
        scheduler.gui.MainUI mainUI12 = new scheduler.gui.MainUI();
        java.awt.Component component13 = mainUI12.getGlassPane();
        javax.swing.JMenuBar jMenuBar14 = mainUI12.getJMenuBar();
        mainUI12.setState((int) (short) 0);
        mainUI12.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel20 = new scheduler.gui.LoginPanel(mainUI12);
        java.awt.Event event21 = null;
        boolean boolean23 = loginPanel20.gotFocus(event21, (java.lang.Object) 0.0f);
        scheduler.gui.MainUI mainUI24 = new scheduler.gui.MainUI();
        mainUI24.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel27 = new scheduler.gui.AdminDashboardPanel(mainUI24);
        java.awt.Graphics graphics28 = mainUI24.getGraphics();
        int int29 = mainUI24.getHeight();
        mainUI24.setAutoRequestFocus(true);
        java.awt.Point point32 = mainUI24.location();
        java.awt.Component component33 = loginPanel20.findComponentAt(point32);
        java.awt.Point point34 = mainUI0.getLocation(point32);
        java.awt.Rectangle rectangle35 = mainUI0.getMaximizedBounds();
        java.awt.Event event36 = null;
        boolean boolean39 = mainUI0.mouseExit(event36, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jMenuBar14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(graphics28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 650 + "'", int29 == 650);
        org.junit.Assert.assertNotNull(point32);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNotNull(point34);
        org.junit.Assert.assertNull(rectangle35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
        int int13 = mainUI0.getCursorType();
        java.awt.Toolkit toolkit14 = mainUI0.getToolkit();
        mainUI0.logout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(toolkit14);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        boolean boolean5 = mainUI0.isActive();
        java.awt.dnd.DropTarget dropTarget6 = null;
        mainUI0.setDropTarget(dropTarget6);
        javax.accessibility.AccessibleContext accessibleContext8 = mainUI0.getAccessibleContext();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(accessibleContext8);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        java.awt.Color color8 = mainUI0.getBackground();
        scheduler.gui.LoginPanel loginPanel9 = new scheduler.gui.LoginPanel(mainUI0);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        scheduler.gui.MainUI mainUI12 = null;
        scheduler.gui.SensorPanel sensorPanel13 = new scheduler.gui.SensorPanel(mainUI12);
        java.awt.event.ContainerListener containerListener14 = null;
        sensorPanel13.removeContainerListener(containerListener14);
        java.awt.event.MouseEvent mouseEvent16 = null;
        java.lang.String str17 = sensorPanel13.getToolTipText(mouseEvent16);
        java.awt.Dimension dimension18 = sensorPanel13.minimumSize();
        java.awt.ImageCapabilities imageCapabilities21 = null;
        java.awt.image.VolatileImage volatileImage22 = sensorPanel13.createVolatileImage(8, (-1), imageCapabilities21);
        scheduler.gui.MainUI mainUI23 = new scheduler.gui.MainUI();
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
        java.awt.Dimension dimension36 = mainUI24.getSize();
        mainUI23.setMinimumSize(dimension36);
        sensorPanel13.setSize(dimension36);
        paymentPanel1.setMaximumSize(dimension36);
        scheduler.gui.MainUI mainUI40 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        mainUI40.addPropertyChangeListener("hi!", propertyChangeListener42);
        java.awt.Insets insets44 = mainUI40.getInsets();
        java.awt.Rectangle rectangle45 = null;
        mainUI40.setMaximizedBounds(rectangle45);
        mainUI40.toBack();
        scheduler.gui.MainUI mainUI48 = null;
        scheduler.gui.PaymentPanel paymentPanel49 = new scheduler.gui.PaymentPanel(mainUI48);
        boolean boolean50 = paymentPanel49.isEnabled();
        boolean boolean51 = paymentPanel49.isPaintingForPrint();
        boolean boolean52 = paymentPanel49.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI53 = new scheduler.gui.MainUI();
        mainUI53.setTitle("REGISTRATION");
        int int56 = mainUI53.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener57 = null;
        mainUI53.removeWindowFocusListener(windowFocusListener57);
        javax.swing.TransferHandler transferHandler59 = null;
        mainUI53.setTransferHandler(transferHandler59);
        java.awt.im.InputContext inputContext61 = mainUI53.getInputContext();
        paymentPanel49.setNextFocusableComponent((java.awt.Component) mainUI53);
        java.awt.Dialog.ModalExclusionType modalExclusionType63 = mainUI53.getModalExclusionType();
        mainUI40.setModalExclusionType(modalExclusionType63);
        javax.swing.JMenuBar jMenuBar65 = mainUI40.getJMenuBar();
        java.awt.Graphics graphics66 = mainUI40.getGraphics();
        paymentPanel1.print(graphics66);
        scheduler.gui.MainUI mainUI68 = null;
        scheduler.gui.PaymentPanel paymentPanel69 = new scheduler.gui.PaymentPanel(mainUI68);
        boolean boolean70 = paymentPanel69.isEnabled();
        boolean boolean71 = paymentPanel69.isPaintingForPrint();
        paymentPanel69.hide();
        java.awt.event.MouseWheelListener mouseWheelListener73 = null;
        paymentPanel69.removeMouseWheelListener(mouseWheelListener73);
        boolean boolean75 = paymentPanel69.isDisplayable();
        java.awt.Component component76 = paymentPanel1.add((java.awt.Component) paymentPanel69);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(volatileImage22);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNull(jMenuBar26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(componentOrientation34);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNotNull(insets44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(inputContext61);
        org.junit.Assert.assertTrue("'" + modalExclusionType63 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType63.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar65);
        org.junit.Assert.assertNotNull(graphics66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(component76);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
        java.awt.Point point28 = mainUI0.location();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setDefaultCloseOperation((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
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
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(point28);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Graphics graphics3 = chiefCoordinatorDashboardPanel2.getGraphics();
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        boolean boolean6 = paymentPanel5.isEnabled();
        boolean boolean7 = paymentPanel5.isPaintingForPrint();
        boolean boolean8 = paymentPanel5.getVerifyInputWhenFocusTarget();
        java.awt.Event event9 = null;
        boolean boolean12 = paymentPanel5.mouseDrag(event9, (int) (byte) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        java.awt.Component component14 = mainUI13.getGlassPane();
        javax.swing.JMenuBar jMenuBar15 = mainUI13.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.Component component17 = null;
        boolean boolean18 = mainUI13.isAncestorOf(component17);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.PaymentPanel paymentPanel20 = new scheduler.gui.PaymentPanel(mainUI19);
        boolean boolean21 = paymentPanel20.isEnabled();
        boolean boolean22 = paymentPanel20.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation23 = paymentPanel20.getComponentOrientation();
        mainUI13.setComponentOrientation(componentOrientation23);
        paymentPanel5.applyComponentOrientation(componentOrientation23);
        java.lang.String str26 = paymentPanel5.getName();
        scheduler.gui.MainUI mainUI27 = null;
        scheduler.gui.PaymentPanel paymentPanel28 = new scheduler.gui.PaymentPanel(mainUI27);
        boolean boolean29 = paymentPanel28.isEnabled();
        boolean boolean30 = paymentPanel28.isPaintingForPrint();
        paymentPanel28.hide();
        java.awt.Dimension dimension32 = paymentPanel28.getMaximumSize();
        paymentPanel28.enableInputMethods(true);
        scheduler.gui.MainUI mainUI35 = null;
        scheduler.gui.SensorPanel sensorPanel36 = new scheduler.gui.SensorPanel(mainUI35);
        java.awt.event.ContainerListener containerListener37 = null;
        sensorPanel36.removeContainerListener(containerListener37);
        java.awt.event.MouseEvent mouseEvent39 = null;
        java.lang.String str40 = sensorPanel36.getToolTipText(mouseEvent39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        sensorPanel36.removeInputMethodListener(inputMethodListener41);
        sensorPanel36.repaint((long) (short) 100, 32, (int) (short) 1, (int) (byte) 1, 100);
        java.awt.Color color49 = null;
        sensorPanel36.setBackground(color49);
        java.awt.event.ComponentListener[] componentListenerArray51 = sensorPanel36.getComponentListeners();
        boolean boolean52 = sensorPanel36.isDoubleBuffered();
        java.util.Locale locale53 = null;
        sensorPanel36.setLocale(locale53);
        boolean boolean55 = paymentPanel28.isAncestorOf((java.awt.Component) sensorPanel36);
        sensorPanel36.firePropertyChange("SENSOR", '#', '4');
        scheduler.gui.MainUI mainUI60 = new scheduler.gui.MainUI();
        mainUI60.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel63 = new scheduler.gui.AdminDashboardPanel(mainUI60);
        java.awt.Graphics graphics64 = mainUI60.getGraphics();
        sensorPanel36.update(graphics64);
        scheduler.gui.MainUI mainUI66 = null;
        scheduler.gui.SensorPanel sensorPanel67 = new scheduler.gui.SensorPanel(mainUI66);
        java.awt.event.ContainerListener containerListener68 = null;
        sensorPanel67.removeContainerListener(containerListener68);
        java.awt.event.MouseEvent mouseEvent70 = null;
        java.lang.String str71 = sensorPanel67.getToolTipText(mouseEvent70);
        java.awt.Dimension dimension72 = sensorPanel67.minimumSize();
        scheduler.gui.MainUI mainUI73 = null;
        scheduler.gui.SensorPanel sensorPanel74 = new scheduler.gui.SensorPanel(mainUI73);
        java.awt.event.ContainerListener containerListener75 = null;
        sensorPanel74.removeContainerListener(containerListener75);
        java.awt.event.MouseEvent mouseEvent77 = null;
        java.lang.String str78 = sensorPanel74.getToolTipText(mouseEvent77);
        sensorPanel74.transferFocus();
        java.awt.image.ImageProducer imageProducer80 = null;
        java.awt.Image image81 = sensorPanel74.createImage(imageProducer80);
        scheduler.gui.MainUI mainUI84 = null;
        scheduler.gui.SensorPanel sensorPanel85 = new scheduler.gui.SensorPanel(mainUI84);
        java.awt.event.ContainerListener containerListener86 = null;
        sensorPanel85.removeContainerListener(containerListener86);
        java.awt.event.MouseEvent mouseEvent88 = null;
        java.lang.String str89 = sensorPanel85.getToolTipText(mouseEvent88);
        java.awt.Insets insets90 = sensorPanel85.getInsets();
        int int91 = sensorPanel67.checkImage(image81, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel85);
        java.beans.PropertyChangeListener propertyChangeListener93 = null;
        sensorPanel85.addPropertyChangeListener("hi!", propertyChangeListener93);
        java.awt.Color color95 = sensorPanel85.getForeground();
        javax.swing.plaf.PanelUI panelUI96 = sensorPanel85.getUI();
        sensorPanel36.setUI(panelUI96);
        paymentPanel5.setUI(panelUI96);
        chiefCoordinatorDashboardPanel2.setUI(panelUI96);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(graphics3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNull(jMenuBar15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(componentOrientation23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(componentListenerArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(graphics64);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(dimension72);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(image81);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(insets90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 32 + "'", int91 == 32);
        org.junit.Assert.assertNotNull(color95);
        org.junit.Assert.assertNotNull(panelUI96);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.gui.RegistrationPanel registrationPanel7 = new scheduler.gui.RegistrationPanel(mainUI0);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = registrationPanel7.getBaselineResizeBehavior();
        javax.accessibility.AccessibleContext accessibleContext9 = registrationPanel7.getAccessibleContext();
        java.awt.Event event10 = null;
        java.lang.Object obj11 = null;
        boolean boolean12 = registrationPanel7.lostFocus(event10, obj11);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        javax.accessibility.AccessibleContext accessibleContext6 = mainUI0.getAccessibleContext();
        scheduler.gui.RoomBookingPanel roomBookingPanel7 = new scheduler.gui.RoomBookingPanel(mainUI0);
        java.util.ResourceBundle resourceBundle8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle(resourceBundle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(accessibleContext6);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        scheduler.user.Staff staff0 = new scheduler.user.Staff();
        staff0.setVerified(false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
        java.awt.Container container29 = mainUI0.getFocusCycleRootAncestor();
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
        org.junit.Assert.assertNull(container29);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.lang.String str15 = hardwareSensor2.getRoomID();
        scheduler.sensor.HardwareSensor hardwareSensor18 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor18.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager21 = new scheduler.booking.BookingManager();
        hardwareSensor18.detach((scheduler.sensor.SensorObserver) bookingManager21);
        boolean boolean25 = bookingManager21.extendBooking("ROOM_BOOKING", (int) (byte) -1);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager21);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ADMIN_DASHBOARD" + "'", str15, "ADMIN_DASHBOARD");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.room.Room room2 = bookingSystemFacade0.getRoom("MY_BOOKINGS");
        boolean boolean5 = bookingSystemFacade0.extendBooking("hi!", 650);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = bookingSystemFacade0.modifyBooking("Room Booking System", localDateTime7, localDateTime8);
        boolean boolean11 = bookingSystemFacade0.removeRoom("Room Booking System");
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(room2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
        boolean boolean29 = sensorPanel1.getIgnoreRepaint();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
        mainUI5.show();
        scheduler.gui.UserDashboardPanel userDashboardPanel16 = new scheduler.gui.UserDashboardPanel(mainUI5);
        userDashboardPanel16.resetKeyboardActions();
        java.awt.event.MouseListener mouseListener18 = null;
        userDashboardPanel16.addMouseListener(mouseListener18);
        boolean boolean20 = userDashboardPanel16.isMaximumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        javax.swing.TransferHandler transferHandler30 = null;
        mainUI0.setTransferHandler(transferHandler30);
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
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.Graphics graphics4 = mainUI0.getGraphics();
        int int5 = mainUI0.getHeight();
        javax.accessibility.AccessibleContext accessibleContext6 = mainUI0.getAccessibleContext();
        scheduler.gui.RoomBookingPanel roomBookingPanel7 = new scheduler.gui.RoomBookingPanel(mainUI0);
        boolean boolean8 = roomBookingPanel7.isMinimumSizeSet();
        java.awt.Event event9 = null;
        boolean boolean12 = roomBookingPanel7.mouseMove(event9, (int) (byte) -1, 16);
        org.junit.Assert.assertNotNull(graphics4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 650 + "'", int5 == 650);
        org.junit.Assert.assertNotNull(accessibleContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
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
        sensorPanel1.disable();
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
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
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
        mainUI10.hide();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component64 = loginPanel8.add("SENSOR", (java.awt.Component) mainUI10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
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
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        int int3 = mainUI0.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mainUI0.addPropertyChangeListener("REGISTRATION", propertyChangeListener5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        scheduler.gui.MainUI mainUI8 = null;
        scheduler.gui.SensorPanel sensorPanel9 = new scheduler.gui.SensorPanel(mainUI8);
        java.awt.event.ContainerListener containerListener10 = null;
        sensorPanel9.removeContainerListener(containerListener10);
        java.lang.String str12 = sensorPanel9.toString();
        java.awt.MenuComponent menuComponent13 = null;
        sensorPanel9.remove(menuComponent13);
        java.awt.Component[] componentArray15 = sensorPanel9.getComponents();
        javax.swing.TransferHandler transferHandler16 = null;
        sensorPanel9.setTransferHandler(transferHandler16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Dimension dimension24 = sensorPanel19.minimumSize();
        scheduler.gui.MainUI mainUI25 = null;
        scheduler.gui.SensorPanel sensorPanel26 = new scheduler.gui.SensorPanel(mainUI25);
        java.awt.event.ContainerListener containerListener27 = null;
        sensorPanel26.removeContainerListener(containerListener27);
        java.awt.event.MouseEvent mouseEvent29 = null;
        java.lang.String str30 = sensorPanel26.getToolTipText(mouseEvent29);
        sensorPanel26.transferFocus();
        java.awt.image.ImageProducer imageProducer32 = null;
        java.awt.Image image33 = sensorPanel26.createImage(imageProducer32);
        scheduler.gui.MainUI mainUI36 = null;
        scheduler.gui.SensorPanel sensorPanel37 = new scheduler.gui.SensorPanel(mainUI36);
        java.awt.event.ContainerListener containerListener38 = null;
        sensorPanel37.removeContainerListener(containerListener38);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.lang.String str41 = sensorPanel37.getToolTipText(mouseEvent40);
        java.awt.Insets insets42 = sensorPanel37.getInsets();
        int int43 = sensorPanel19.checkImage(image33, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel37);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        sensorPanel37.addPropertyChangeListener("hi!", propertyChangeListener45);
        java.awt.Color color47 = sensorPanel37.getForeground();
        sensorPanel9.setForeground(color47);
        mainUI0.setBackground(color47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertNotNull(componentArray15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(insets42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(color47);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        java.awt.image.ColorModel colorModel13 = sensorPanel1.getColorModel();
        int int14 = sensorPanel1.getComponentCount();
        boolean boolean15 = sensorPanel1.isShowing();
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.PaymentPanel paymentPanel17 = new scheduler.gui.PaymentPanel(mainUI16);
        boolean boolean18 = paymentPanel17.isEnabled();
        boolean boolean19 = paymentPanel17.isPaintingForPrint();
        boolean boolean20 = paymentPanel17.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Dimension dimension27 = sensorPanel22.minimumSize();
        paymentPanel17.setSize(dimension27);
        sensorPanel1.resize(dimension27);
        sensorPanel1.setInheritsPopupMenu(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(colorModel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
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
        java.lang.String str20 = mainUI0.toString();
        scheduler.gui.MyBookingsPanel myBookingsPanel21 = new scheduler.gui.MyBookingsPanel(mainUI0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(dimension19);
// flaky "2) test761(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "scheduler.gui.MainUI[frame17,0,0,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str20, "scheduler.gui.MainUI[frame17,0,0,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        scheduler.room.Room room3 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str4 = room3.getLocation();
        room3.release();
        room3.release();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Room Booking System" + "'", str4, "Room Booking System");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
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
        scheduler.gui.RegistrationPanel registrationPanel25 = new scheduler.gui.RegistrationPanel(mainUI0);
        java.awt.Dimension dimension26 = registrationPanel25.preferredSize();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        int int3 = mainUI0.getExtendedState();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        mainUI0.removeMouseWheelListener(mouseWheelListener4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        mainUI0.firePropertyChange("hi!", (byte) 0, (byte) 100);
        java.awt.FocusTraversalPolicy focusTraversalPolicy23 = null;
        mainUI0.setFocusTraversalPolicy(focusTraversalPolicy23);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        java.lang.String str5 = hardwareSensor2.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADMIN_DASHBOARD" + "'", str5, "ADMIN_DASHBOARD");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
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
        sensorPanel1.reshape((int) (short) 1, (int) (short) 100, (int) '#', 83);
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel1.getToolTipText(mouseEvent19);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.FocusListener[] focusListenerArray12 = paymentPanel1.getFocusListeners();
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
        paymentPanel1.setForeground(color25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(focusListenerArray12);
        org.junit.Assert.assertArrayEquals(focusListenerArray12, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(jMenuBar18);
        org.junit.Assert.assertTrue("'" + modalExclusionType21 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType21.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
        boolean boolean17 = sensorPanel1.isForegroundSet();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(inputMap15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = sensorPanel1.getPropertyChangeListeners("");
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel1.addContainerListener(containerListener13);
        boolean boolean15 = sensorPanel1.getVerifyInputWhenFocusTarget();
        java.awt.event.ActionListener actionListener16 = null;
        javax.swing.KeyStroke keyStroke17 = null;
        sensorPanel1.registerKeyboardAction(actionListener16, keyStroke17, 2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray12, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        java.awt.Dimension dimension19 = sensorPanel14.minimumSize();
        java.awt.ImageCapabilities imageCapabilities22 = null;
        java.awt.image.VolatileImage volatileImage23 = sensorPanel14.createVolatileImage(8, (-1), imageCapabilities22);
        java.awt.Image image26 = sensorPanel14.createImage(3, 1);
        java.awt.Rectangle rectangle27 = null;
        java.awt.Rectangle rectangle28 = sensorPanel14.getBounds(rectangle27);
        java.awt.Rectangle rectangle29 = mainUI0.getBounds(rectangle28);
        boolean boolean30 = mainUI0.isCursorSet();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(volatileImage23);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNotNull(rectangle28);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.MouseListener[] mouseListenerArray6 = mainUI0.getMouseListeners();
        mainUI0.logout();
        java.awt.Graphics graphics8 = mainUI0.getGraphics();
        scheduler.gui.MainUI mainUI9 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        mainUI9.addPropertyChangeListener("hi!", propertyChangeListener11);
        java.awt.Insets insets13 = mainUI9.getInsets();
        java.awt.Rectangle rectangle14 = null;
        mainUI9.setMaximizedBounds(rectangle14);
        mainUI9.toBack();
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
        java.awt.Dialog.ModalExclusionType modalExclusionType32 = mainUI22.getModalExclusionType();
        mainUI9.setModalExclusionType(modalExclusionType32);
        javax.swing.JMenuBar jMenuBar34 = mainUI9.getJMenuBar();
        java.awt.Graphics graphics35 = mainUI9.getGraphics();
        mainUI0.printComponents(graphics35);
        java.awt.Container container37 = mainUI0.getContentPane();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertArrayEquals(mouseListenerArray6, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertNotNull(graphics8);
        org.junit.Assert.assertNotNull(insets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(inputContext30);
        org.junit.Assert.assertTrue("'" + modalExclusionType32 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType32.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar34);
        org.junit.Assert.assertNotNull(graphics35);
        org.junit.Assert.assertNotNull(container37);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
        scheduler.gui.MainUI mainUI14 = null;
        scheduler.gui.SensorPanel sensorPanel15 = new scheduler.gui.SensorPanel(mainUI14);
        java.awt.event.ContainerListener containerListener16 = null;
        sensorPanel15.removeContainerListener(containerListener16);
        java.lang.String str18 = sensorPanel15.toString();
        java.awt.MenuComponent menuComponent19 = null;
        sensorPanel15.remove(menuComponent19);
        java.awt.Component[] componentArray21 = sensorPanel15.getComponents();
        javax.swing.TransferHandler transferHandler22 = null;
        sensorPanel15.setTransferHandler(transferHandler22);
        sensorPanel15.setVisible(false);
        scheduler.gui.MainUI mainUI26 = null;
        scheduler.gui.PaymentPanel paymentPanel27 = new scheduler.gui.PaymentPanel(mainUI26);
        boolean boolean28 = paymentPanel27.isEnabled();
        boolean boolean29 = paymentPanel27.isPaintingForPrint();
        boolean boolean30 = paymentPanel27.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI31 = null;
        scheduler.gui.SensorPanel sensorPanel32 = new scheduler.gui.SensorPanel(mainUI31);
        java.awt.event.ContainerListener containerListener33 = null;
        sensorPanel32.removeContainerListener(containerListener33);
        java.awt.event.MouseEvent mouseEvent35 = null;
        java.lang.String str36 = sensorPanel32.getToolTipText(mouseEvent35);
        java.awt.Dimension dimension37 = sensorPanel32.minimumSize();
        paymentPanel27.setSize(dimension37);
        boolean boolean39 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel27);
        scheduler.gui.MainUI mainUI40 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        mainUI40.addPropertyChangeListener("hi!", propertyChangeListener42);
        java.awt.Insets insets44 = mainUI40.getInsets();
        java.awt.Rectangle rectangle45 = null;
        mainUI40.setMaximizedBounds(rectangle45);
        java.awt.Event event47 = null;
        boolean boolean50 = mainUI40.mouseDrag(event47, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension51 = mainUI40.getPreferredSize();
        java.awt.Dimension dimension52 = paymentPanel27.getSize(dimension51);
        scheduler.gui.MainUI mainUI53 = null;
        scheduler.gui.SensorPanel sensorPanel54 = new scheduler.gui.SensorPanel(mainUI53);
        java.awt.event.ContainerListener containerListener55 = null;
        sensorPanel54.removeContainerListener(containerListener55);
        java.lang.String str57 = sensorPanel54.toString();
        java.awt.MenuComponent menuComponent58 = null;
        sensorPanel54.remove(menuComponent58);
        java.awt.Component[] componentArray60 = sensorPanel54.getComponents();
        java.awt.LayoutManager layoutManager61 = sensorPanel54.getLayout();
        scheduler.gui.MainUI mainUI62 = null;
        scheduler.gui.SensorPanel sensorPanel63 = new scheduler.gui.SensorPanel(mainUI62);
        java.awt.event.ContainerListener containerListener64 = null;
        sensorPanel63.removeContainerListener(containerListener64);
        java.awt.event.MouseEvent mouseEvent66 = null;
        java.lang.String str67 = sensorPanel63.getToolTipText(mouseEvent66);
        java.awt.Dimension dimension68 = sensorPanel63.minimumSize();
        java.awt.ImageCapabilities imageCapabilities71 = null;
        java.awt.image.VolatileImage volatileImage72 = sensorPanel63.createVolatileImage(8, (-1), imageCapabilities71);
        java.awt.Image image75 = sensorPanel63.createImage(3, 1);
        java.awt.Rectangle rectangle76 = null;
        java.awt.Rectangle rectangle77 = sensorPanel63.getBounds(rectangle76);
        sensorPanel54.paintImmediately(rectangle77);
        paymentPanel27.repaint(rectangle77);
        java.awt.Rectangle rectangle80 = sensorPanel15.getBounds(rectangle77);
        mainUI0.setMaximizedBounds(rectangle80);
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(imageList13);
        org.junit.Assert.assertNotNull(componentArray21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(insets44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertNotNull(componentArray60);
        org.junit.Assert.assertNotNull(layoutManager61);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(dimension68);
        org.junit.Assert.assertNull(volatileImage72);
        org.junit.Assert.assertNull(image75);
        org.junit.Assert.assertNotNull(rectangle77);
        org.junit.Assert.assertNotNull(rectangle80);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
        int int20 = mainUI0.getDefaultCloseOperation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNotNull(accessibleContext19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.lang.String str10 = sensorPanel7.toString();
        java.awt.Dimension dimension11 = sensorPanel7.getMaximumSize();
        mainUI0.setSize(dimension11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        mainUI0.setSize(12, (int) (short) 1);
        java.awt.Image image12 = mainUI0.getIconImage();
        boolean boolean13 = mainUI0.isFocusableWindow();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray1 = mainUI0.getWindowFocusListeners();
        int int2 = mainUI0.getY();
        org.junit.Assert.assertNotNull(windowFocusListenerArray1);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray1, new java.awt.event.WindowFocusListener[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        javax.swing.JMenuBar jMenuBar5 = null;
        mainUI0.setJMenuBar(jMenuBar5);
        java.awt.Rectangle rectangle7 = mainUI0.getMaximizedBounds();
        boolean boolean8 = mainUI0.isPreferredSizeSet();
        scheduler.gui.UserDashboardPanel userDashboardPanel9 = new scheduler.gui.UserDashboardPanel(mainUI0);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
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
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.PaymentPanel paymentPanel14 = new scheduler.gui.PaymentPanel(mainUI13);
        boolean boolean15 = paymentPanel14.isEnabled();
        boolean boolean16 = paymentPanel14.isPaintingForPrint();
        boolean boolean17 = paymentPanel14.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.awt.event.MouseEvent mouseEvent22 = null;
        java.lang.String str23 = sensorPanel19.getToolTipText(mouseEvent22);
        java.awt.Dimension dimension24 = sensorPanel19.minimumSize();
        paymentPanel14.setSize(dimension24);
        boolean boolean26 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) paymentPanel14);
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        mainUI27.addPropertyChangeListener("hi!", propertyChangeListener29);
        java.awt.Insets insets31 = mainUI27.getInsets();
        java.awt.Rectangle rectangle32 = null;
        mainUI27.setMaximizedBounds(rectangle32);
        java.awt.Event event34 = null;
        boolean boolean37 = mainUI27.mouseDrag(event34, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension38 = mainUI27.getPreferredSize();
        java.awt.Dimension dimension39 = paymentPanel14.getSize(dimension38);
        java.awt.image.ImageProducer imageProducer40 = null;
        java.awt.Image image41 = paymentPanel14.createImage(imageProducer40);
        scheduler.gui.MainUI mainUI44 = new scheduler.gui.MainUI();
        mainUI44.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel47 = new scheduler.gui.AdminDashboardPanel(mainUI44);
        java.awt.event.FocusListener[] focusListenerArray48 = mainUI44.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel49 = new scheduler.gui.AdminDashboardPanel(mainUI44);
        java.awt.event.MouseListener[] mouseListenerArray50 = mainUI44.getMouseListeners();
        java.awt.Container container51 = mainUI44.getContentPane();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = mainUI0.prepareImage(image41, 7, (int) (byte) 100, (java.awt.image.ImageObserver) container51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(insets31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertNotNull(image41);
        org.junit.Assert.assertNotNull(focusListenerArray48);
        org.junit.Assert.assertArrayEquals(focusListenerArray48, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray50);
        org.junit.Assert.assertArrayEquals(mouseListenerArray50, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertNotNull(container51);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        scheduler.room.AvailableState availableState0 = new scheduler.room.AvailableState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        availableState0.handleReserve(room4);
        scheduler.room.OccupiedState occupiedState7 = new scheduler.room.OccupiedState();
        scheduler.room.Room room11 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str12 = room11.getLocation();
        occupiedState7.handleRelease(room11);
        scheduler.room.AvailableState availableState14 = new scheduler.room.AvailableState();
        scheduler.room.Room room18 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str19 = room18.getLocation();
        availableState14.handleReserve(room18);
        occupiedState7.handleRelease(room18);
        boolean boolean22 = room18.isOccupied();
        java.lang.String str23 = room18.toString();
        availableState0.handleRelease(room18);
        scheduler.room.OccupiedState occupiedState25 = new scheduler.room.OccupiedState();
        scheduler.room.AvailableState availableState26 = new scheduler.room.AvailableState();
        scheduler.room.Room room30 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str31 = room30.getLocation();
        availableState26.handleReserve(room30);
        occupiedState25.handleReserve(room30);
        availableState0.handleReserve(room30);
        scheduler.room.OccupiedState occupiedState35 = new scheduler.room.OccupiedState();
        scheduler.room.Room room39 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str40 = room39.getLocation();
        occupiedState35.handleRelease(room39);
        java.lang.String str42 = room39.toString();
        availableState0.handleRelease(room39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Booking System" + "'", str12, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room Booking System" + "'", str19, "Room Booking System");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}" + "'", str23, "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Room Booking System" + "'", str31, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Room Booking System" + "'", str40, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}" + "'", str42, "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
        java.awt.im.InputMethodRequests inputMethodRequests28 = mainUI0.getInputMethodRequests();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertNull(inputMethodRequests28);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
        float float17 = sensorPanel1.getAlignmentX();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
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
        mainUI0.toBack();
        int int70 = mainUI0.countComponents();
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        scheduler.sensor.HardwareSensor hardwareSensor0 = new scheduler.sensor.HardwareSensor();
        hardwareSensor0.notifyObservers("LOGIN");
        hardwareSensor0.badgeScan("SENSOR");
        java.lang.String str5 = hardwareSensor0.getRoomID();
        hardwareSensor0.notifyObservers("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str8 = hardwareSensor0.getSensorID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.Event event5 = null;
        boolean boolean8 = mainUI0.mouseUp(event5, (int) (byte) 10, 2);
        mainUI0.setLocation(12, (int) (short) -1);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
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
        mainUI7.toBack();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
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
        mainUI11.setMinimumSize(dimension24);
        sensorPanel1.setSize(dimension24);
        java.awt.Cursor cursor27 = sensorPanel1.getCursor();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jMenuBar14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(componentOrientation22);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertNotNull(cursor27);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        boolean boolean3 = mainUI0.isLocationByPlatform();
        boolean boolean4 = mainUI0.isValid();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        boolean boolean3 = booking0.executePayment((double) '#');
        scheduler.payment.DebitCardPayment debitCardPayment4 = new scheduler.payment.DebitCardPayment();
        boolean boolean6 = debitCardPayment4.processTransaction((double) 0);
        boolean boolean8 = debitCardPayment4.processTransaction((double) ' ');
        booking0.setPaymentStrategy((scheduler.payment.PaymentStrategy) debitCardPayment4);
        double double10 = booking0.calculateFinalCost();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
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
        boolean boolean27 = sensorPanel1.isFocusable();
        javax.swing.event.AncestorListener ancestorListener28 = null;
        sensorPanel1.addAncestorListener(ancestorListener28);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(insets24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(inputContext26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        java.awt.event.KeyListener keyListener7 = null;
        mainUI0.addKeyListener(keyListener7);
        java.awt.Component component10 = mainUI0.getComponent(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
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
        mainUI38.setBounds((int) '#', (int) 'a', 100, 83);
        scheduler.gui.RoomBookingPanel roomBookingPanel53 = new scheduler.gui.RoomBookingPanel(mainUI38);
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
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        scheduler.payment.InstitutionBilling institutionBilling0 = new scheduler.payment.InstitutionBilling();
        boolean boolean2 = institutionBilling0.processTransaction((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        mainUI0.setLocation(128, 3);
        java.awt.Component component8 = mainUI0.getMostRecentFocusOwner();
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        double double4 = booking0.calculateFinalCost();
        double double6 = booking0.calculateFinalCost((int) (short) -1);
        double double7 = booking0.calculateFinalCost();
        double double8 = booking0.getUpfrontDeposit();
        java.time.LocalDateTime localDateTime9 = booking0.getEndTime();
        booking0.checkIn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = mainUI0.isFocusableWindow();
        java.awt.Color color6 = mainUI0.getBackground();
        java.awt.event.KeyListener keyListener7 = null;
        mainUI0.addKeyListener(keyListener7);
        java.awt.Component[] componentArray9 = mainUI0.getComponents();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.applyResourceBundle("CHIEF_COORDINATOR_DASHBOARD");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name CHIEF_COORDINATOR_DASHBOARD, locale en_US");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(componentArray9);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = sensorPanel1.getHierarchyBoundsListeners();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        java.awt.Component component9 = mainUI8.getGlassPane();
        mainUI8.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        mainUI8.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        mainUI8.show();
        scheduler.gui.MainUI mainUI16 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        mainUI16.addPropertyChangeListener("hi!", propertyChangeListener18);
        java.awt.Insets insets20 = mainUI16.getInsets();
        java.awt.Rectangle rectangle21 = null;
        mainUI16.setMaximizedBounds(rectangle21);
        java.awt.Event event23 = null;
        boolean boolean26 = mainUI16.mouseDrag(event23, (int) '4', (int) (short) 1);
        java.awt.Dimension dimension27 = mainUI16.getPreferredSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener28 = null;
        mainUI16.addHierarchyBoundsListener(hierarchyBoundsListener28);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.SensorPanel sensorPanel31 = new scheduler.gui.SensorPanel(mainUI30);
        java.awt.event.ContainerListener containerListener32 = null;
        sensorPanel31.removeContainerListener(containerListener32);
        java.awt.event.MouseEvent mouseEvent34 = null;
        java.lang.String str35 = sensorPanel31.getToolTipText(mouseEvent34);
        java.awt.Dimension dimension36 = sensorPanel31.minimumSize();
        scheduler.gui.MainUI mainUI37 = null;
        scheduler.gui.SensorPanel sensorPanel38 = new scheduler.gui.SensorPanel(mainUI37);
        java.awt.event.ContainerListener containerListener39 = null;
        sensorPanel38.removeContainerListener(containerListener39);
        java.awt.event.MouseEvent mouseEvent41 = null;
        java.lang.String str42 = sensorPanel38.getToolTipText(mouseEvent41);
        sensorPanel38.transferFocus();
        java.awt.image.ImageProducer imageProducer44 = null;
        java.awt.Image image45 = sensorPanel38.createImage(imageProducer44);
        scheduler.gui.MainUI mainUI48 = null;
        scheduler.gui.SensorPanel sensorPanel49 = new scheduler.gui.SensorPanel(mainUI48);
        java.awt.event.ContainerListener containerListener50 = null;
        sensorPanel49.removeContainerListener(containerListener50);
        java.awt.event.MouseEvent mouseEvent52 = null;
        java.lang.String str53 = sensorPanel49.getToolTipText(mouseEvent52);
        java.awt.Insets insets54 = sensorPanel49.getInsets();
        int int55 = sensorPanel31.checkImage(image45, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel49);
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.SensorPanel sensorPanel59 = new scheduler.gui.SensorPanel(mainUI58);
        java.awt.event.ContainerListener containerListener60 = null;
        sensorPanel59.removeContainerListener(containerListener60);
        java.awt.event.MouseEvent mouseEvent62 = null;
        java.lang.String str63 = sensorPanel59.getToolTipText(mouseEvent62);
        java.awt.Insets insets64 = sensorPanel59.getInsets();
        boolean boolean65 = sensorPanel59.requestDefaultFocus();
        java.awt.event.ContainerListener containerListener66 = null;
        sensorPanel59.addContainerListener(containerListener66);
        int int68 = mainUI16.checkImage(image45, 32, 1, (java.awt.image.ImageObserver) sensorPanel59);
        scheduler.gui.MainUI mainUI69 = new scheduler.gui.MainUI();
        java.awt.Component component70 = mainUI69.getGlassPane();
        mainUI69.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener74 = null;
        mainUI69.removeHierarchyBoundsListener(hierarchyBoundsListener74);
        int int76 = mainUI8.checkImage(image45, (java.awt.image.ImageObserver) mainUI69);
        boolean boolean82 = sensorPanel1.imageUpdate(image45, 83, (int) (byte) 10, 16, 6, (-1));
        sensorPanel1.setVisible(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(image45);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(insets54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(insets64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(component70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        scheduler.room.OccupiedState occupiedState0 = new scheduler.room.OccupiedState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getBuilding();
        occupiedState0.handleReserve(room4);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}" + "'", str7, "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}" + "'", str8, "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
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
        java.awt.Window window14 = mainUI0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point15 = window14.location();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(imageList13);
        org.junit.Assert.assertNull(window14);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        paymentPanel1.paintImmediately(8, (int) '#', 100, 10);
        boolean boolean8 = paymentPanel1.isOptimizedDrawingEnabled();
        javax.swing.event.AncestorListener ancestorListener9 = null;
        paymentPanel1.addAncestorListener(ancestorListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        java.lang.String str0 = scheduler.gui.MainUI.USER_DASHBOARD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USER_DASHBOARD" + "'", str0, "USER_DASHBOARD");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
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
        scheduler.gui.MainUI mainUI15 = null;
        scheduler.gui.SensorPanel sensorPanel16 = new scheduler.gui.SensorPanel(mainUI15);
        java.awt.event.ContainerListener containerListener17 = null;
        sensorPanel16.removeContainerListener(containerListener17);
        java.lang.String str19 = sensorPanel16.toString();
        java.awt.MenuComponent menuComponent20 = null;
        sensorPanel16.remove(menuComponent20);
        java.awt.Component[] componentArray22 = sensorPanel16.getComponents();
        java.awt.LayoutManager layoutManager23 = sensorPanel16.getLayout();
        java.awt.GraphicsConfiguration graphicsConfiguration24 = sensorPanel16.getGraphicsConfiguration();
        java.awt.Dimension dimension25 = sensorPanel16.getMaximumSize();
        jRootPane14.setMinimumSize(dimension25);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jRootPane14);
        org.junit.Assert.assertNotNull(componentArray22);
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNull(graphicsConfiguration24);
        org.junit.Assert.assertNotNull(dimension25);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.Rectangle rectangle2 = null;
        paymentPanel1.scrollRectToVisible(rectangle2);
        java.awt.Event event4 = null;
        boolean boolean7 = paymentPanel1.mouseUp(event4, (int) (byte) 10, 3);
        paymentPanel1.firePropertyChange("hi!", (int) (byte) -1, (int) (byte) 100);
        java.awt.event.FocusListener[] focusListenerArray12 = paymentPanel1.getFocusListeners();
        scheduler.gui.MainUI mainUI13 = null;
        scheduler.gui.SensorPanel sensorPanel14 = new scheduler.gui.SensorPanel(mainUI13);
        java.awt.event.ContainerListener containerListener15 = null;
        sensorPanel14.removeContainerListener(containerListener15);
        java.awt.event.MouseEvent mouseEvent17 = null;
        java.lang.String str18 = sensorPanel14.getToolTipText(mouseEvent17);
        java.awt.Graphics graphics19 = null;
        sensorPanel14.paintAll(graphics19);
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.SensorPanel sensorPanel22 = new scheduler.gui.SensorPanel(mainUI21);
        java.awt.event.ContainerListener containerListener23 = null;
        sensorPanel22.removeContainerListener(containerListener23);
        java.awt.event.MouseEvent mouseEvent25 = null;
        java.lang.String str26 = sensorPanel22.getToolTipText(mouseEvent25);
        java.awt.Dimension dimension27 = sensorPanel22.minimumSize();
        java.awt.ImageCapabilities imageCapabilities30 = null;
        java.awt.image.VolatileImage volatileImage31 = sensorPanel22.createVolatileImage(8, (-1), imageCapabilities30);
        java.awt.Image image34 = sensorPanel22.createImage(3, 1);
        java.awt.Graphics graphics35 = sensorPanel22.getGraphics();
        java.awt.Font font36 = sensorPanel22.getFont();
        java.awt.FontMetrics fontMetrics37 = sensorPanel14.getFontMetrics(font36);
        java.awt.FontMetrics fontMetrics38 = paymentPanel1.getFontMetrics(font36);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(focusListenerArray12);
        org.junit.Assert.assertArrayEquals(focusListenerArray12, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNull(volatileImage31);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertNull(graphics35);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(fontMetrics37);
        org.junit.Assert.assertNotNull(fontMetrics38);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.WindowStateListener windowStateListener5 = null;
        mainUI0.addWindowStateListener(windowStateListener5);
        org.junit.Assert.assertNotNull(component1);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        boolean boolean9 = paymentPanel1.requestDefaultFocus();
        java.awt.event.ComponentListener componentListener10 = null;
        paymentPanel1.addComponentListener(componentListener10);
        boolean boolean12 = paymentPanel1.isManagingFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
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
        mainUI0.showUserBookings();
        java.awt.dnd.DropTarget dropTarget18 = null;
        mainUI0.setDropTarget(dropTarget18);
        java.awt.Component component20 = mainUI0.getFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
        org.junit.Assert.assertNull(component20);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
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
        boolean boolean13 = booking0.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = mainUI0.getModalExclusionType();
        javax.swing.JMenuBar jMenuBar6 = mainUI0.getJMenuBar();
        boolean boolean7 = mainUI0.hasFocus();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
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
        boolean boolean13 = paymentPanel1.requestFocusInWindow();
        java.awt.event.FocusListener focusListener14 = null;
        paymentPanel1.removeFocusListener(focusListener14);
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        java.awt.Dimension dimension22 = sensorPanel17.minimumSize();
        scheduler.gui.MainUI mainUI23 = null;
        scheduler.gui.SensorPanel sensorPanel24 = new scheduler.gui.SensorPanel(mainUI23);
        java.awt.event.ContainerListener containerListener25 = null;
        sensorPanel24.removeContainerListener(containerListener25);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = sensorPanel24.getToolTipText(mouseEvent27);
        sensorPanel24.transferFocus();
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = sensorPanel24.createImage(imageProducer30);
        scheduler.gui.MainUI mainUI34 = null;
        scheduler.gui.SensorPanel sensorPanel35 = new scheduler.gui.SensorPanel(mainUI34);
        java.awt.event.ContainerListener containerListener36 = null;
        sensorPanel35.removeContainerListener(containerListener36);
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.lang.String str39 = sensorPanel35.getToolTipText(mouseEvent38);
        java.awt.Insets insets40 = sensorPanel35.getInsets();
        int int41 = sensorPanel17.checkImage(image31, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel35);
        boolean boolean42 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) sensorPanel17);
        java.awt.LayoutManager layoutManager43 = null;
        sensorPanel17.setLayout(layoutManager43);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component46 = paymentPanel1.add((java.awt.Component) sensorPanel17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(insets40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
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
        java.lang.String str16 = sensorPanel1.getToolTipText();
        float float17 = sensorPanel1.getAlignmentY();
        boolean boolean18 = sensorPanel1.isDoubleBuffered();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
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
        scheduler.gui.MainUI mainUI16 = null;
        scheduler.gui.SensorPanel sensorPanel17 = new scheduler.gui.SensorPanel(mainUI16);
        java.awt.event.ContainerListener containerListener18 = null;
        sensorPanel17.removeContainerListener(containerListener18);
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.lang.String str21 = sensorPanel17.getToolTipText(mouseEvent20);
        java.awt.Dimension dimension22 = sensorPanel17.minimumSize();
        java.awt.ImageCapabilities imageCapabilities25 = null;
        java.awt.image.VolatileImage volatileImage26 = sensorPanel17.createVolatileImage(8, (-1), imageCapabilities25);
        java.awt.event.MouseListener mouseListener27 = null;
        sensorPanel17.removeMouseListener(mouseListener27);
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
        java.awt.event.InputMethodListener inputMethodListener46 = null;
        sensorPanel41.removeInputMethodListener(inputMethodListener46);
        java.awt.Event event48 = null;
        boolean boolean51 = sensorPanel41.mouseEnter(event48, 3, (int) (short) 100);
        java.awt.Color color52 = sensorPanel41.getBackground();
        int int53 = sensorPanel17.checkImage(image37, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel41);
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.PaymentPanel paymentPanel55 = new scheduler.gui.PaymentPanel(mainUI54);
        boolean boolean56 = paymentPanel55.isEnabled();
        boolean boolean57 = paymentPanel55.isFocusTraversalPolicyProvider();
        boolean boolean58 = paymentPanel55.isFocusCycleRoot();
        scheduler.gui.MainUI mainUI59 = new scheduler.gui.MainUI();
        java.awt.Component component60 = mainUI59.getGlassPane();
        mainUI59.setSize(16, (int) (byte) 100);
        java.awt.Event event64 = null;
        boolean boolean67 = mainUI59.mouseUp(event64, (int) (byte) 10, 2);
        sensorPanel17.putClientProperty((java.lang.Object) boolean58, (java.lang.Object) (byte) 10);
        scheduler.gui.MainUI mainUI69 = new scheduler.gui.MainUI();
        mainUI69.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel72 = new scheduler.gui.AdminDashboardPanel(mainUI69);
        java.awt.Graphics graphics73 = mainUI69.getGraphics();
        sensorPanel17.update(graphics73);
        mainUI5.setContentPane((java.awt.Container) sensorPanel17);
        mainUI5.setAutoRequestFocus(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNull(volatileImage26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(component60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(graphics73);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        paymentPanel1.addContainerListener(containerListener2);
        java.awt.event.KeyListener keyListener4 = null;
        paymentPanel1.addKeyListener(keyListener4);
        java.lang.String str6 = paymentPanel1.getUIClassID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PanelUI" + "'", str6, "PanelUI");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        java.awt.MenuComponent menuComponent5 = null;
        paymentPanel1.remove(menuComponent5);
        java.awt.event.ComponentListener componentListener7 = null;
        paymentPanel1.addComponentListener(componentListener7);
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
        boolean boolean40 = paymentPanel1.imageUpdate(image24, 64, (int) (byte) 0, 100, 7, 1047);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(insets33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        double double2 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        double double4 = booking0.calculateUpfrontCost();
        scheduler.pricing.PricingStrategy pricingStrategy5 = booking0.getPricingStrategy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(pricingStrategy5);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        java.lang.String str1 = scheduler.database.CsvDatabase.clean("scheduler.gui.MainUI[frame3,268,83,1000x650,invalid,hidden,layout=java.awt.BorderLayout,title=Room Booking System,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,986x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "scheduler.gui.MainUI[frame3 268 83 1000x650 invalid hidden layout=java.awt.BorderLayout title=Room Booking System resizable normal defaultCloseOperation=EXIT_ON_CLOSE rootPane=javax.swing.JRootPane[ 7 30 986x613 invalid layout=javax.swing.JRootPane$RootLayout alignmentX=0.0 alignmentY=0.0 border= flags=16777673 maximumSize= minimumSize= preferredSize=] rootPaneCheckingEnabled=true]" + "'", str1, "scheduler.gui.MainUI[frame3 268 83 1000x650 invalid hidden layout=java.awt.BorderLayout title=Room Booking System resizable normal defaultCloseOperation=EXIT_ON_CLOSE rootPane=javax.swing.JRootPane[ 7 30 986x613 invalid layout=javax.swing.JRootPane$RootLayout alignmentX=0.0 alignmentY=0.0 border= flags=16777673 maximumSize= minimumSize= preferredSize=] rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = mainUI0.getMouseMotionListeners();
        mainUI0.setCursor((int) (short) 1);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray3, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        java.awt.Component[] componentArray7 = sensorPanel1.getComponents();
        sensorPanel1.updateUI();
        java.awt.Event event9 = null;
        scheduler.gui.MainUI mainUI10 = new scheduler.gui.MainUI();
        mainUI10.setTitle("REGISTRATION");
        int int13 = mainUI10.getDefaultCloseOperation();
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        mainUI10.removeWindowFocusListener(windowFocusListener14);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        mainUI10.removeMouseMotionListener(mouseMotionListener16);
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel18 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI10);
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        mainUI19.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel22 = new scheduler.gui.AdminDashboardPanel(mainUI19);
        java.awt.event.FocusListener[] focusListenerArray23 = mainUI19.getFocusListeners();
        boolean boolean24 = mainUI19.isActive();
        java.awt.dnd.DropTarget dropTarget25 = null;
        mainUI19.setDropTarget(dropTarget25);
        scheduler.gui.MainUI mainUI27 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        mainUI27.addPropertyChangeListener("hi!", propertyChangeListener29);
        java.awt.Insets insets31 = mainUI27.getInsets();
        java.awt.Rectangle rectangle32 = null;
        mainUI27.setMaximizedBounds(rectangle32);
        mainUI27.toBack();
        scheduler.gui.MainUI mainUI35 = new scheduler.gui.MainUI();
        mainUI35.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel38 = new scheduler.gui.AdminDashboardPanel(mainUI35);
        java.awt.Graphics graphics39 = mainUI35.getGraphics();
        mainUI27.paint(graphics39);
        mainUI19.printComponents(graphics39);
        mainUI10.paint(graphics39);
        java.lang.Object obj43 = mainUI10.getTreeLock();
        java.awt.event.WindowStateListener windowStateListener44 = null;
        mainUI10.addWindowStateListener(windowStateListener44);
        boolean boolean46 = sensorPanel1.lostFocus(event9, (java.lang.Object) windowStateListener44);
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(focusListenerArray23);
        org.junit.Assert.assertArrayEquals(focusListenerArray23, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(insets31);
        org.junit.Assert.assertNotNull(graphics39);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        boolean boolean2 = booking0.isCancelled();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
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
        boolean boolean10 = sensorPanel1.getAutoscrolls();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
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
        sensorPanel19.list();
        boolean boolean73 = sensorPanel19.isValid();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation4 = paymentPanel1.getComponentOrientation();
        java.awt.Component component5 = paymentPanel1.getNextFocusableComponent();
        java.awt.event.KeyListener keyListener6 = null;
        paymentPanel1.removeKeyListener(keyListener6);
        boolean boolean8 = paymentPanel1.isManagingFocus();
        boolean boolean9 = paymentPanel1.isPaintingForPrint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(componentOrientation4);
        org.junit.Assert.assertNull(component5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = mainUI0.getPropertyChangeListeners("PAYMENT");
        javax.swing.TransferHandler transferHandler8 = null;
        mainUI0.setTransferHandler(transferHandler8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray7);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray7, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        scheduler.user.Staff staff5 = new scheduler.user.Staff("LOGIN", "ToolTipText", "USER_DASHBOARD", "PAYMENT", true);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        sensorPanel1.addPropertyChangeListener("ToolTipText", propertyChangeListener39);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(componentArray18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
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
        java.awt.event.ComponentListener componentListener15 = null;
        sensorPanel1.removeComponentListener(componentListener15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        sensorPanel1.setVisible(true);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray12 = sensorPanel1.getMouseWheelListeners();
        scheduler.gui.MainUI mainUI13 = new scheduler.gui.MainUI();
        java.awt.Component component14 = mainUI13.getGlassPane();
        javax.swing.JMenuBar jMenuBar15 = mainUI13.getJMenuBar();
        mainUI13.setState((int) (short) 0);
        mainUI13.setLocation(0, 64);
        java.awt.Color color21 = mainUI13.getBackground();
        sensorPanel1.setForeground(color21);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray12);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray12, new java.awt.event.MouseWheelListener[] {});
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertNull(jMenuBar15);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
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
        java.awt.event.ComponentListener componentListener17 = null;
        sensorPanel1.removeComponentListener(componentListener17);
        java.awt.Container container19 = sensorPanel1.getTopLevelAncestor();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(container19);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager5 = new scheduler.booking.BookingManager();
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager5);
        scheduler.booking.BookingManager bookingManager7 = new scheduler.booking.BookingManager();
        bookingManager7.update("ToolTipText");
        boolean boolean11 = bookingManager7.cancelBooking("ADMIN_DASHBOARD");
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager7);
        scheduler.booking.BookingManager bookingManager13 = new scheduler.booking.BookingManager();
        boolean boolean16 = bookingManager13.extendBooking("", (int) (short) 1);
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager13);
        java.lang.String str18 = hardwareSensor2.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ADMIN_DASHBOARD" + "'", str18, "ADMIN_DASHBOARD");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        scheduler.user.Faculty faculty5 = new scheduler.user.Faculty("hi!", "hi!", "hi!", "ADMIN_DASHBOARD", false);
        boolean boolean6 = faculty5.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
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
        boolean boolean25 = sensorPanel1.contains(6, (int) (short) 1);
        sensorPanel1.firePropertyChange("", 'a', '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(component22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        scheduler.user.Student student7 = new scheduler.user.Student();
        mainUI0.setCurrentUser((scheduler.user.User) student7);
        boolean boolean10 = student7.checkPassword("ADMIN_DASHBOARD");
        scheduler.room.OccupiedState occupiedState11 = new scheduler.room.OccupiedState();
        scheduler.room.AvailableState availableState12 = new scheduler.room.AvailableState();
        scheduler.room.Room room16 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str17 = room16.getLocation();
        availableState12.handleReserve(room16);
        occupiedState11.handleReserve(room16);
        scheduler.room.OccupiedState occupiedState20 = new scheduler.room.OccupiedState();
        scheduler.room.Room room24 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str25 = room24.getLocation();
        occupiedState20.handleRelease(room24);
        scheduler.room.AvailableState availableState27 = new scheduler.room.AvailableState();
        scheduler.room.Room room31 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str32 = room31.getLocation();
        availableState27.handleReserve(room31);
        occupiedState20.handleRelease(room31);
        boolean boolean35 = room31.isOccupied();
        int int36 = room31.getCapacity();
        occupiedState11.handleReserve(room31);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        scheduler.booking.Booking booking40 = new scheduler.booking.Booking();
        boolean boolean42 = booking40.extendBooking((int) (byte) 0);
        scheduler.user.User user43 = booking40.getUser();
        double double44 = booking40.calculateFinalCost();
        double double46 = booking40.calculateFinalCost((int) (short) -1);
        double double47 = booking40.calculateFinalCost();
        java.time.LocalDateTime localDateTime48 = booking40.getEndTime();
        scheduler.pricing.StaffPricing staffPricing49 = new scheduler.pricing.StaffPricing();
        double double50 = staffPricing49.getHourlyRate();
        booking40.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing49);
        double double52 = staffPricing49.getHourlyRate();
        scheduler.payment.CreditCardPayment creditCardPayment53 = new scheduler.payment.CreditCardPayment();
        boolean boolean55 = creditCardPayment53.processTransaction((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            scheduler.booking.Booking booking56 = new scheduler.booking.Booking((scheduler.user.User) student7, room31, localDateTime38, localDateTime39, (scheduler.pricing.PricingStrategy) staffPricing49, (scheduler.payment.PaymentStrategy) creditCardPayment53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Start and end times are required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Booking System" + "'", str17, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Room Booking System" + "'", str25, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Room Booking System" + "'", str32, "Room Booking System");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 83 + "'", int36 == 83);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(user43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 40.0d + "'", double50 == 40.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 40.0d + "'", double52 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        sensorPanel1.removeAll();
        sensorPanel1.revalidate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.cancel();
        double double2 = booking0.getUpfrontDeposit();
        scheduler.payment.CreditCardPayment creditCardPayment3 = new scheduler.payment.CreditCardPayment();
        boolean boolean5 = creditCardPayment3.processTransaction((double) 10.0f);
        booking0.setPaymentStrategy((scheduler.payment.PaymentStrategy) creditCardPayment3);
        boolean boolean8 = creditCardPayment3.processTransaction((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        java.awt.MenuComponent menuComponent5 = null;
        sensorPanel1.remove(menuComponent5);
        sensorPanel1.reshape(12, 8, 650, (int) (byte) -1);
        java.awt.Color color12 = sensorPanel1.getBackground();
        sensorPanel1.setInheritsPopupMenu(false);
        boolean boolean15 = sensorPanel1.isOpaque();
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        javax.swing.InputMap inputMap11 = sensorPanel1.getInputMap();
        boolean boolean12 = sensorPanel1.getFocusTraversalKeysEnabled();
        java.awt.LayoutManager layoutManager13 = sensorPanel1.getLayout();
        scheduler.gui.MainUI mainUI14 = new scheduler.gui.MainUI();
        mainUI14.setTitle("REGISTRATION");
        int int17 = mainUI14.getDefaultCloseOperation();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        mainUI14.addPropertyChangeListener("REGISTRATION", propertyChangeListener19);
        scheduler.gui.UserDashboardPanel userDashboardPanel21 = new scheduler.gui.UserDashboardPanel(mainUI14);
        java.awt.Component component24 = mainUI14.getComponentAt((int) (byte) 0, 2);
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
        mainUI14.setLocation(point40);
        scheduler.gui.MainUI mainUI43 = null;
        scheduler.gui.SensorPanel sensorPanel44 = new scheduler.gui.SensorPanel(mainUI43);
        java.awt.event.ContainerListener containerListener45 = null;
        sensorPanel44.removeContainerListener(containerListener45);
        java.lang.String str47 = sensorPanel44.toString();
        java.awt.MenuComponent menuComponent48 = null;
        sensorPanel44.remove(menuComponent48);
        java.awt.Component[] componentArray50 = sensorPanel44.getComponents();
        javax.swing.TransferHandler transferHandler51 = null;
        sensorPanel44.setTransferHandler(transferHandler51);
        scheduler.gui.MainUI mainUI53 = new scheduler.gui.MainUI();
        java.awt.Component component54 = mainUI53.getGlassPane();
        javax.swing.JMenuBar jMenuBar55 = mainUI53.getJMenuBar();
        mainUI53.setState((int) (short) 0);
        mainUI53.setLocation(0, 64);
        java.awt.Color color61 = mainUI53.getBackground();
        scheduler.gui.MainUI mainUI62 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        mainUI62.addPropertyChangeListener("hi!", propertyChangeListener64);
        java.awt.Insets insets66 = mainUI62.getInsets();
        java.awt.Rectangle rectangle67 = null;
        mainUI62.setMaximizedBounds(rectangle67);
        mainUI62.toBack();
        scheduler.gui.MainUI mainUI70 = new scheduler.gui.MainUI();
        mainUI70.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel73 = new scheduler.gui.AdminDashboardPanel(mainUI70);
        java.awt.Graphics graphics74 = mainUI70.getGraphics();
        mainUI62.paint(graphics74);
        mainUI53.paintComponents(graphics74);
        sensorPanel44.update(graphics74);
        mainUI14.paint(graphics74);
        sensorPanel1.printAll(graphics74);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(inputMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(layoutManager13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(point40);
        org.junit.Assert.assertNotNull(componentArray50);
        org.junit.Assert.assertNotNull(component54);
        org.junit.Assert.assertNull(jMenuBar55);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(insets66);
        org.junit.Assert.assertNotNull(graphics74);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        scheduler.room.AvailableState availableState0 = new scheduler.room.AvailableState();
        scheduler.room.Room room4 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str5 = room4.getLocation();
        availableState0.handleReserve(room4);
        scheduler.room.OccupiedState occupiedState7 = new scheduler.room.OccupiedState();
        scheduler.room.Room room11 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str12 = room11.getLocation();
        occupiedState7.handleRelease(room11);
        scheduler.room.AvailableState availableState14 = new scheduler.room.AvailableState();
        scheduler.room.Room room18 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str19 = room18.getLocation();
        availableState14.handleReserve(room18);
        occupiedState7.handleRelease(room18);
        boolean boolean22 = room18.isOccupied();
        java.lang.String str23 = room18.toString();
        availableState0.handleRelease(room18);
        scheduler.room.Room room28 = new scheduler.room.Room("ToolTipText", 83, "Room Booking System");
        java.lang.String str29 = room28.getLocation();
        room28.release();
        availableState0.handleRelease(room28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Booking System" + "'", str5, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Booking System" + "'", str12, "Room Booking System");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room Booking System" + "'", str19, "Room Booking System");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}" + "'", str23, "Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Room Booking System" + "'", str29, "Room Booking System");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
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
        boolean boolean89 = paymentPanel83.isShowing();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
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
        scheduler.gui.MainUI mainUI29 = null;
        scheduler.gui.SensorPanel sensorPanel30 = new scheduler.gui.SensorPanel(mainUI29);
        java.awt.event.ContainerListener containerListener31 = null;
        sensorPanel30.removeContainerListener(containerListener31);
        java.awt.event.MouseEvent mouseEvent33 = null;
        java.lang.String str34 = sensorPanel30.getToolTipText(mouseEvent33);
        java.awt.Dimension dimension35 = sensorPanel30.minimumSize();
        java.awt.ImageCapabilities imageCapabilities38 = null;
        java.awt.image.VolatileImage volatileImage39 = sensorPanel30.createVolatileImage(8, (-1), imageCapabilities38);
        java.awt.Container container40 = sensorPanel30.getTopLevelAncestor();
        int int41 = sensorPanel30.getX();
        paymentPanel1.setNextFocusableComponent((java.awt.Component) sensorPanel30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(componentListenerArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNull(volatileImage39);
        org.junit.Assert.assertNull(container40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.show(true);
        mainUI0.setResizable(false);
        int int10 = mainUI0.getState();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isPaintingForPrint();
        boolean boolean4 = paymentPanel1.getVerifyInputWhenFocusTarget();
        java.awt.Event event5 = null;
        boolean boolean8 = paymentPanel1.mouseDrag(event5, (int) (byte) 1, (int) (short) 100);
        java.awt.event.ComponentListener componentListener9 = null;
        paymentPanel1.removeComponentListener(componentListener9);
        scheduler.gui.MainUI mainUI11 = null;
        scheduler.gui.SensorPanel sensorPanel12 = new scheduler.gui.SensorPanel(mainUI11);
        java.awt.event.ContainerListener containerListener13 = null;
        sensorPanel12.removeContainerListener(containerListener13);
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.lang.String str16 = sensorPanel12.getToolTipText(mouseEvent15);
        java.awt.Graphics graphics17 = null;
        sensorPanel12.paintAll(graphics17);
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.lang.String str24 = sensorPanel20.getToolTipText(mouseEvent23);
        java.awt.Dimension dimension25 = sensorPanel20.minimumSize();
        java.awt.ImageCapabilities imageCapabilities28 = null;
        java.awt.image.VolatileImage volatileImage29 = sensorPanel20.createVolatileImage(8, (-1), imageCapabilities28);
        java.awt.Image image32 = sensorPanel20.createImage(3, 1);
        java.awt.Graphics graphics33 = sensorPanel20.getGraphics();
        java.awt.Font font34 = sensorPanel20.getFont();
        java.awt.FontMetrics fontMetrics35 = sensorPanel12.getFontMetrics(font34);
        java.awt.FontMetrics fontMetrics36 = paymentPanel1.getFontMetrics(font34);
        java.awt.Event event37 = null;
        boolean boolean40 = paymentPanel1.mouseDown(event37, 1047, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNull(graphics33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(fontMetrics35);
        org.junit.Assert.assertNotNull(fontMetrics36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        mainUI0.showPanel("");
        boolean boolean8 = mainUI0.isCursorSet();
        mainUI0.nextFocus();
        java.awt.Container container10 = mainUI0.getContentPane();
        mainUI0.removeAll();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(container10);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel11 = new scheduler.gui.AdminDashboardPanel(mainUI8);
        java.awt.Graphics graphics12 = mainUI8.getGraphics();
        mainUI0.paint(graphics12);
        boolean boolean14 = mainUI0.getFocusableWindowState();
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNotNull(graphics12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
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
        java.awt.Rectangle rectangle22 = mainUI0.getBounds();
        java.awt.Toolkit toolkit23 = mainUI0.getToolkit();
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
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(toolkit23);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        double double1 = booking0.calculateUpfrontCost();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        java.time.LocalDateTime localDateTime3 = booking0.getStartTime();
        scheduler.room.Room room4 = booking0.getRoom();
        java.time.LocalDateTime localDateTime5 = booking0.getEndTime();
        booking0.checkIn();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
        java.awt.Dimension dimension30 = mainUI0.getMinimumSize();
        java.awt.im.InputContext inputContext31 = mainUI0.getInputContext();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNotNull(inputContext31);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        scheduler.booking.BookingSystemFacade bookingSystemFacade0 = scheduler.booking.BookingSystemFacade.getInstance();
        scheduler.room.Room room2 = bookingSystemFacade0.getRoom("MY_BOOKINGS");
        boolean boolean4 = bookingSystemFacade0.cancelBooking("");
        boolean boolean8 = bookingSystemFacade0.processBooking("LOGIN", "", 10);
        boolean boolean10 = bookingSystemFacade0.cancelBooking("LOGIN");
        org.junit.Assert.assertNotNull(bookingSystemFacade0);
        org.junit.Assert.assertNull(room2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.MainUI mainUI3 = new scheduler.gui.MainUI();
        java.awt.Component component4 = mainUI3.getGlassPane();
        javax.swing.JMenuBar jMenuBar5 = mainUI3.getJMenuBar();
        mainUI3.setState((int) (short) 0);
        java.awt.Dialog.ModalExclusionType modalExclusionType8 = mainUI3.getModalExclusionType();
        mainUI0.setModalExclusionType(modalExclusionType8);
        mainUI0.setOpacity(1.0f);
        mainUI0.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(component4);
        org.junit.Assert.assertNull(jMenuBar5);
        org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean3 = paymentPanel1.requestFocus(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        mainUI0.setState((int) (short) 0);
        mainUI0.setLocation(0, 64);
        scheduler.gui.LoginPanel loginPanel8 = new scheduler.gui.LoginPanel(mainUI0);
        java.awt.Event event9 = null;
        boolean boolean11 = loginPanel8.gotFocus(event9, (java.lang.Object) 0.0f);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = loginPanel8.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        java.awt.event.KeyListener[] keyListenerArray2 = mainUI0.getKeyListeners();
        int int3 = mainUI0.getCursorType();
        boolean boolean4 = mainUI0.isPreferredSizeSet();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(keyListenerArray2);
        org.junit.Assert.assertArrayEquals(keyListenerArray2, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        java.awt.Event event7 = null;
        boolean boolean10 = mainUI0.mouseDrag(event7, (int) '4', (int) (short) 1);
        scheduler.gui.LoginPanel loginPanel11 = new scheduler.gui.LoginPanel(mainUI0);
        loginPanel11.revalidate();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray13 = loginPanel11.getPropertyChangeListeners();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray13);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray13, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        booking0.cancel();
        java.time.LocalDateTime localDateTime2 = booking0.getEndTime();
        scheduler.pricing.StaffPricing staffPricing3 = new scheduler.pricing.StaffPricing();
        double double4 = staffPricing3.getHourlyRate();
        double double5 = staffPricing3.getHourlyRate();
        double double6 = staffPricing3.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing3);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
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
        boolean boolean30 = mainUI0.isFocusableWindow();
        java.awt.im.InputMethodRequests inputMethodRequests31 = mainUI0.getInputMethodRequests();
        java.awt.Color color32 = mainUI0.getBackground();
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext21);
        org.junit.Assert.assertTrue("'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(jMenuBar25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(inputMethodRequests31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        int int5 = mainUI0.getComponentCount();
        boolean boolean6 = mainUI0.isLocationByPlatform();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mainUI0.postEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        mainUI0.setSize(16, (int) (byte) 100);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        mainUI0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        mainUI0.setIgnoreRepaint(true);
        boolean boolean9 = mainUI0.isBackgroundSet();
        java.awt.event.FocusEvent.Cause cause10 = null;
        mainUI0.requestFocus(cause10);
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.lang.String str4 = sensorPanel1.toString();
        boolean boolean5 = sensorPanel1.isShowing();
        boolean boolean6 = sensorPanel1.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor2.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor9 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor9.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager12 = new scheduler.booking.BookingManager();
        hardwareSensor9.detach((scheduler.sensor.SensorObserver) bookingManager12);
        hardwareSensor2.attach((scheduler.sensor.SensorObserver) bookingManager12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = bookingManager12.isRoomAvailable("hi!", localDateTime16, localDateTime17);
        bookingManager12.checkTimeouts();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        scheduler.pricing.StudentPricing studentPricing0 = new scheduler.pricing.StudentPricing();
        double double1 = studentPricing0.getHourlyRate();
        double double2 = studentPricing0.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
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
        registrationPanel16.transferFocusBackward();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(keyListenerArray22);
        org.junit.Assert.assertArrayEquals(keyListenerArray22, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        boolean boolean7 = sensorPanel1.requestDefaultFocus();
        java.awt.Dimension dimension8 = sensorPanel1.getPreferredSize();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
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
        scheduler.gui.MainUI mainUI54 = new scheduler.gui.MainUI();
        java.awt.Component component55 = mainUI54.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel56 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI54);
        java.awt.Event event57 = null;
        scheduler.gui.MainUI mainUI58 = null;
        scheduler.gui.PaymentPanel paymentPanel59 = new scheduler.gui.PaymentPanel(mainUI58);
        java.awt.Rectangle rectangle60 = null;
        paymentPanel59.scrollRectToVisible(rectangle60);
        boolean boolean62 = chiefCoordinatorDashboardPanel56.lostFocus(event57, (java.lang.Object) paymentPanel59);
        java.awt.Component component63 = jToolTip53.add((java.awt.Component) chiefCoordinatorDashboardPanel56);
        int int64 = component63.getX();
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
        org.junit.Assert.assertNotNull(component55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(component63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Insets insets6 = sensorPanel1.getInsets();
        sensorPanel1.transferFocusDownCycle();
        java.awt.Component[] componentArray8 = sensorPanel1.getComponents();
        java.awt.event.MouseListener[] mouseListenerArray9 = sensorPanel1.getMouseListeners();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNotNull(componentArray8);
        org.junit.Assert.assertNotNull(mouseListenerArray9);
        org.junit.Assert.assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        sensorPanel1.addHierarchyListener(hierarchyListener16);
        scheduler.gui.MainUI mainUI18 = null;
        scheduler.gui.SensorPanel sensorPanel19 = new scheduler.gui.SensorPanel(mainUI18);
        java.awt.event.ContainerListener containerListener20 = null;
        sensorPanel19.removeContainerListener(containerListener20);
        java.lang.String str22 = sensorPanel19.toString();
        java.awt.MenuComponent menuComponent23 = null;
        sensorPanel19.remove(menuComponent23);
        java.awt.Component[] componentArray25 = sensorPanel19.getComponents();
        javax.swing.TransferHandler transferHandler26 = null;
        sensorPanel19.setTransferHandler(transferHandler26);
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.awt.event.MouseEvent mouseEvent32 = null;
        java.lang.String str33 = sensorPanel29.getToolTipText(mouseEvent32);
        java.awt.Dimension dimension34 = sensorPanel29.minimumSize();
        scheduler.gui.MainUI mainUI35 = null;
        scheduler.gui.SensorPanel sensorPanel36 = new scheduler.gui.SensorPanel(mainUI35);
        java.awt.event.ContainerListener containerListener37 = null;
        sensorPanel36.removeContainerListener(containerListener37);
        java.awt.event.MouseEvent mouseEvent39 = null;
        java.lang.String str40 = sensorPanel36.getToolTipText(mouseEvent39);
        sensorPanel36.transferFocus();
        java.awt.image.ImageProducer imageProducer42 = null;
        java.awt.Image image43 = sensorPanel36.createImage(imageProducer42);
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.SensorPanel sensorPanel47 = new scheduler.gui.SensorPanel(mainUI46);
        java.awt.event.ContainerListener containerListener48 = null;
        sensorPanel47.removeContainerListener(containerListener48);
        java.awt.event.MouseEvent mouseEvent50 = null;
        java.lang.String str51 = sensorPanel47.getToolTipText(mouseEvent50);
        java.awt.Insets insets52 = sensorPanel47.getInsets();
        int int53 = sensorPanel29.checkImage(image43, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel47);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        sensorPanel47.addPropertyChangeListener("hi!", propertyChangeListener55);
        java.awt.Color color57 = sensorPanel47.getForeground();
        sensorPanel19.setForeground(color57);
        sensorPanel1.setBackground(color57);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(componentArray25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(image43);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(insets52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
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
        java.lang.String str22 = paymentPanel1.getName();
        java.awt.Rectangle rectangle23 = paymentPanel1.bounds();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(rectangle23);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        scheduler.sensor.HardwareSensor hardwareSensor5 = new scheduler.sensor.HardwareSensor("ADMIN_DASHBOARD", "ADMIN_DASHBOARD");
        hardwareSensor5.badgeScan("ADMIN_DASHBOARD");
        hardwareSensor5.notifyObservers("MY_BOOKINGS");
        scheduler.sensor.HardwareSensor hardwareSensor12 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor12.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager15 = new scheduler.booking.BookingManager();
        hardwareSensor12.detach((scheduler.sensor.SensorObserver) bookingManager15);
        hardwareSensor5.attach((scheduler.sensor.SensorObserver) bookingManager15);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingManager15.isRoomAvailable("hi!", localDateTime19, localDateTime20);
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager15);
        java.lang.String str23 = hardwareSensor2.getSensorID();
        java.lang.String str24 = hardwareSensor2.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ADMIN_DASHBOARD" + "'", str23, "ADMIN_DASHBOARD");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ADMIN_DASHBOARD" + "'", str24, "ADMIN_DASHBOARD");
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
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
        boolean boolean18 = mainUI5.getIgnoreRepaint();
        mainUI5.nextFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(menuBar17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.PaymentPanel paymentPanel1 = new scheduler.gui.PaymentPanel(mainUI0);
        boolean boolean2 = paymentPanel1.isEnabled();
        boolean boolean3 = paymentPanel1.isFocusTraversalPolicyProvider();
        boolean boolean4 = paymentPanel1.isFocusCycleRoot();
        boolean boolean5 = paymentPanel1.isBackgroundSet();
        scheduler.gui.MainUI mainUI6 = null;
        scheduler.gui.SensorPanel sensorPanel7 = new scheduler.gui.SensorPanel(mainUI6);
        java.awt.event.ContainerListener containerListener8 = null;
        sensorPanel7.removeContainerListener(containerListener8);
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.lang.String str11 = sensorPanel7.getToolTipText(mouseEvent10);
        java.awt.Dimension dimension12 = sensorPanel7.minimumSize();
        java.awt.ImageCapabilities imageCapabilities15 = null;
        java.awt.image.VolatileImage volatileImage16 = sensorPanel7.createVolatileImage(8, (-1), imageCapabilities15);
        java.awt.event.MouseListener mouseListener17 = null;
        sensorPanel7.removeMouseListener(mouseListener17);
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
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        sensorPanel31.removeInputMethodListener(inputMethodListener36);
        java.awt.Event event38 = null;
        boolean boolean41 = sensorPanel31.mouseEnter(event38, 3, (int) (short) 100);
        java.awt.Color color42 = sensorPanel31.getBackground();
        int int43 = sensorPanel7.checkImage(image27, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel31);
        scheduler.gui.MainUI mainUI44 = null;
        scheduler.gui.PaymentPanel paymentPanel45 = new scheduler.gui.PaymentPanel(mainUI44);
        boolean boolean46 = paymentPanel45.isEnabled();
        boolean boolean47 = paymentPanel45.isFocusTraversalPolicyProvider();
        boolean boolean48 = paymentPanel45.isFocusCycleRoot();
        scheduler.gui.MainUI mainUI49 = new scheduler.gui.MainUI();
        java.awt.Component component50 = mainUI49.getGlassPane();
        mainUI49.setSize(16, (int) (byte) 100);
        java.awt.Event event54 = null;
        boolean boolean57 = mainUI49.mouseUp(event54, (int) (byte) 10, 2);
        sensorPanel7.putClientProperty((java.lang.Object) boolean48, (java.lang.Object) (byte) 10);
        scheduler.gui.MainUI mainUI59 = new scheduler.gui.MainUI();
        mainUI59.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel62 = new scheduler.gui.AdminDashboardPanel(mainUI59);
        java.awt.Graphics graphics63 = mainUI59.getGraphics();
        sensorPanel7.update(graphics63);
        paymentPanel1.printAll(graphics63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNull(volatileImage16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(image27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(component50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(graphics63);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
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
        boolean boolean13 = paymentPanel1.requestFocusInWindow();
        java.awt.LayoutManager layoutManager14 = paymentPanel1.getLayout();
        scheduler.gui.MainUI mainUI15 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        mainUI15.addPropertyChangeListener("hi!", propertyChangeListener17);
        java.awt.Insets insets19 = mainUI15.getInsets();
        javax.swing.TransferHandler transferHandler20 = mainUI15.getTransferHandler();
        scheduler.gui.MainUI mainUI21 = null;
        scheduler.gui.PaymentPanel paymentPanel22 = new scheduler.gui.PaymentPanel(mainUI21);
        boolean boolean23 = paymentPanel22.isEnabled();
        boolean boolean24 = paymentPanel22.isFocusTraversalPolicyProvider();
        scheduler.gui.MainUI mainUI25 = null;
        scheduler.gui.SensorPanel sensorPanel26 = new scheduler.gui.SensorPanel(mainUI25);
        java.awt.event.ContainerListener containerListener27 = null;
        sensorPanel26.removeContainerListener(containerListener27);
        java.awt.event.MouseEvent mouseEvent29 = null;
        java.lang.String str30 = sensorPanel26.getToolTipText(mouseEvent29);
        java.awt.Dimension dimension31 = sensorPanel26.minimumSize();
        scheduler.gui.MainUI mainUI32 = null;
        scheduler.gui.SensorPanel sensorPanel33 = new scheduler.gui.SensorPanel(mainUI32);
        java.awt.event.ContainerListener containerListener34 = null;
        sensorPanel33.removeContainerListener(containerListener34);
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.lang.String str37 = sensorPanel33.getToolTipText(mouseEvent36);
        sensorPanel33.transferFocus();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = sensorPanel33.createImage(imageProducer39);
        scheduler.gui.MainUI mainUI43 = null;
        scheduler.gui.SensorPanel sensorPanel44 = new scheduler.gui.SensorPanel(mainUI43);
        java.awt.event.ContainerListener containerListener45 = null;
        sensorPanel44.removeContainerListener(containerListener45);
        java.awt.event.MouseEvent mouseEvent47 = null;
        java.lang.String str48 = sensorPanel44.getToolTipText(mouseEvent47);
        java.awt.Insets insets49 = sensorPanel44.getInsets();
        int int50 = sensorPanel26.checkImage(image40, (int) ' ', (int) (byte) 0, (java.awt.image.ImageObserver) sensorPanel44);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        sensorPanel44.addPropertyChangeListener("hi!", propertyChangeListener52);
        java.awt.Color color54 = sensorPanel44.getForeground();
        paymentPanel22.setForeground(color54);
        mainUI15.setBackground(color54);
        paymentPanel1.setForeground(color54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertNotNull(insets19);
        org.junit.Assert.assertNull(transferHandler20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(insets49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
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
        javax.swing.plaf.PanelUI panelUI12 = paymentPanel1.getUI();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertArrayEquals(containerListenerArray11, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertNotNull(panelUI12);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
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
        registrationPanel16.setToolTipText("");
        registrationPanel16.enable(false);
        boolean boolean26 = registrationPanel16.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.lang.String str0 = scheduler.gui.MainUI.ROOM_MANAGEMENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOM_MANAGEMENT" + "'", str0, "ROOM_MANAGEMENT");
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
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
        java.awt.Insets insets18 = mainUI5.insets();
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.PaymentPanel paymentPanel20 = new scheduler.gui.PaymentPanel(mainUI19);
        boolean boolean21 = paymentPanel20.isEnabled();
        boolean boolean22 = paymentPanel20.isPaintingForPrint();
        paymentPanel20.setVerifyInputWhenFocusTarget(true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component26 = mainUI5.add((java.awt.Component) paymentPanel20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + modalExclusionType15 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType15.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNull(menuBar17);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        mainUI0.addPropertyChangeListener("hi!", propertyChangeListener2);
        java.awt.Insets insets4 = mainUI0.getInsets();
        java.awt.Rectangle rectangle5 = null;
        mainUI0.setMaximizedBounds(rectangle5);
        mainUI0.toBack();
        scheduler.gui.MainUI mainUI8 = new scheduler.gui.MainUI();
        mainUI8.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel11 = new scheduler.gui.AdminDashboardPanel(mainUI8);
        java.awt.Graphics graphics12 = mainUI8.getGraphics();
        mainUI0.paint(graphics12);
        mainUI0.setEnabled(false);
        java.awt.image.VolatileImage volatileImage18 = mainUI0.createVolatileImage((int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component20 = mainUI0.getComponent(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNotNull(graphics12);
        org.junit.Assert.assertNotNull(volatileImage18);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
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
        sensorPanel43.hide();
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
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
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
        javax.swing.KeyStroke keyStroke27 = null;
        sensorPanel1.unregisterKeyboardAction(keyStroke27);
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
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        scheduler.user.Staff staff5 = new scheduler.user.Staff("", "REGISTRATION", "hi!", "", false);
        boolean boolean7 = staff5.checkPassword("SENSOR");
        java.lang.String str8 = staff5.getUserID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel3 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.FocusListener[] focusListenerArray4 = mainUI0.getFocusListeners();
        scheduler.gui.AdminDashboardPanel adminDashboardPanel5 = new scheduler.gui.AdminDashboardPanel(mainUI0);
        java.awt.event.MouseListener[] mouseListenerArray6 = mainUI0.getMouseListeners();
        mainUI0.logout();
        java.awt.Graphics graphics8 = mainUI0.getGraphics();
        mainUI0.layout();
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertArrayEquals(mouseListenerArray6, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertNotNull(graphics8);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
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
        java.awt.Dimension dimension12 = mainUI0.getSize();
        mainUI0.resize(64, (-1));
        scheduler.gui.RoomBookingPanel roomBookingPanel16 = new scheduler.gui.RoomBookingPanel(mainUI0);
        roomBookingPanel16.revalidate();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(componentOrientation10);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
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
        scheduler.gui.MainUI mainUI19 = null;
        scheduler.gui.SensorPanel sensorPanel20 = new scheduler.gui.SensorPanel(mainUI19);
        java.awt.event.ContainerListener containerListener21 = null;
        sensorPanel20.removeContainerListener(containerListener21);
        java.lang.String str23 = sensorPanel20.toString();
        java.awt.MenuComponent menuComponent24 = null;
        sensorPanel20.remove(menuComponent24);
        java.awt.Component[] componentArray26 = sensorPanel20.getComponents();
        java.awt.Dimension dimension27 = sensorPanel20.getMinimumSize();
        sensorPanel10.setMaximumSize(dimension27);
        java.awt.event.HierarchyListener[] hierarchyListenerArray29 = sensorPanel10.getHierarchyListeners();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(componentArray26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNotNull(hierarchyListenerArray29);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray29, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        scheduler.room.Room room3 = new scheduler.room.Room("scheduler.gui.MainUI[frame14,0,0,1047x650,invalid,hidden,layout=java.awt.BorderLayout,title=REGISTRATION,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,7,30,1033x613,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 8, "USER_DASHBOARD");
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = sensorPanel1.createVolatileImage(8, (-1), imageCapabilities9);
        javax.swing.InputMap inputMap11 = sensorPanel1.getInputMap();
        javax.swing.event.AncestorListener ancestorListener12 = null;
        sensorPanel1.removeAncestorListener(ancestorListener12);
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
        java.awt.event.InputMethodListener[] inputMethodListenerArray40 = sensorPanel33.getInputMethodListeners();
        int int41 = sensorPanel33.getY();
        sensorPanel1.remove((java.awt.Component) sensorPanel33);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNotNull(inputMap11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(insets38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray40);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray40, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
        java.lang.String str16 = sensorPanel1.getToolTipText();
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener17);
        java.awt.event.MouseListener mouseListener19 = null;
        sensorPanel1.addMouseListener(mouseListener19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
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
        java.awt.dnd.DropTarget dropTarget13 = mainUI7.getDropTarget();
        boolean boolean14 = mainUI7.requestFocusInWindow();
        boolean boolean15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) mainUI7);
        boolean boolean16 = mainUI7.isValidateRoot();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNotNull(insets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(dropTarget13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
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
        java.lang.String str22 = paymentPanel1.getName();
        paymentPanel1.requestFocus();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        sensorPanel1.removeInputMethodListener(inputMethodListener6);
        java.awt.Component component10 = sensorPanel1.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI11 = new scheduler.gui.MainUI();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        mainUI11.addPropertyChangeListener("hi!", propertyChangeListener13);
        java.awt.Insets insets15 = mainUI11.getInsets();
        java.awt.Rectangle rectangle16 = null;
        mainUI11.setMaximizedBounds(rectangle16);
        mainUI11.toBack();
        scheduler.gui.MainUI mainUI19 = new scheduler.gui.MainUI();
        mainUI19.setFocusCycleRoot(true);
        scheduler.gui.AdminDashboardPanel adminDashboardPanel22 = new scheduler.gui.AdminDashboardPanel(mainUI19);
        java.awt.Graphics graphics23 = mainUI19.getGraphics();
        mainUI11.paint(graphics23);
        mainUI11.setEnabled(false);
        java.awt.image.VolatileImage volatileImage29 = mainUI11.createVolatileImage((int) (short) 1, (int) (short) 100);
        scheduler.gui.MainUI mainUI30 = null;
        scheduler.gui.PaymentPanel paymentPanel31 = new scheduler.gui.PaymentPanel(mainUI30);
        boolean boolean32 = paymentPanel31.isEnabled();
        boolean boolean33 = paymentPanel31.isPaintingForPrint();
        boolean boolean34 = paymentPanel31.getVerifyInputWhenFocusTarget();
        scheduler.gui.MainUI mainUI35 = null;
        scheduler.gui.SensorPanel sensorPanel36 = new scheduler.gui.SensorPanel(mainUI35);
        java.awt.event.ContainerListener containerListener37 = null;
        sensorPanel36.removeContainerListener(containerListener37);
        java.awt.event.MouseEvent mouseEvent39 = null;
        java.lang.String str40 = sensorPanel36.getToolTipText(mouseEvent39);
        java.awt.Dimension dimension41 = sensorPanel36.minimumSize();
        paymentPanel31.setSize(dimension41);
        java.awt.event.ContainerListener containerListener43 = null;
        paymentPanel31.removeContainerListener(containerListener43);
        java.awt.Insets insets45 = null;
        java.awt.Insets insets46 = paymentPanel31.getInsets(insets45);
        boolean boolean47 = sensorPanel1.prepareImage((java.awt.Image) volatileImage29, (java.awt.image.ImageObserver) paymentPanel31);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(component10);
        org.junit.Assert.assertNotNull(insets15);
        org.junit.Assert.assertNotNull(graphics23);
        org.junit.Assert.assertNotNull(volatileImage29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertNotNull(insets46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
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
        mainUI0.showUserBookings();
        java.awt.dnd.DropTarget dropTarget18 = null;
        mainUI0.setDropTarget(dropTarget18);
        mainUI0.setResizable(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(point15);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setTitle("REGISTRATION");
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        mainUI0.addWindowFocusListener(windowFocusListener3);
        scheduler.gui.MainUI mainUI5 = null;
        scheduler.gui.PaymentPanel paymentPanel6 = new scheduler.gui.PaymentPanel(mainUI5);
        boolean boolean7 = paymentPanel6.isEnabled();
        boolean boolean8 = paymentPanel6.isPaintingForPrint();
        java.awt.ComponentOrientation componentOrientation9 = paymentPanel6.getComponentOrientation();
        mainUI0.setComponentOrientation(componentOrientation9);
        scheduler.gui.RoomManagementPanel roomManagementPanel11 = new scheduler.gui.RoomManagementPanel(mainUI0);
        mainUI0.setLocation(1047, 268);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(componentOrientation9);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        javax.swing.JMenuBar jMenuBar2 = mainUI0.getJMenuBar();
        scheduler.gui.SensorPanel sensorPanel3 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.Component component4 = null;
        boolean boolean5 = mainUI0.isAncestorOf(component4);
        java.awt.Dimension dimension6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.setSize(dimension6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"width\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertNull(jMenuBar2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
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
        boolean boolean48 = sensorPanel1.isShowing();
        java.awt.event.FocusEvent.Cause cause49 = null;
        sensorPanel1.requestFocus(cause49);
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
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
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
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = sensorPanel16.getToolTipText(mouseEvent19);
        sensorPanel16.transferFocus();
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.awt.event.MouseEvent mouseEvent26 = null;
        java.lang.String str27 = sensorPanel23.getToolTipText(mouseEvent26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        sensorPanel23.removeInputMethodListener(inputMethodListener28);
        java.awt.Event event30 = null;
        boolean boolean33 = sensorPanel23.mouseEnter(event30, 3, (int) (short) 100);
        java.awt.Color color34 = sensorPanel23.getBackground();
        sensorPanel16.setForeground(color34);
        sensorPanel1.setBackground(color34);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener37 = null;
        sensorPanel1.removeHierarchyBoundsListener(hierarchyBoundsListener37);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color34);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        java.awt.Dimension dimension6 = sensorPanel1.minimumSize();
        sensorPanel1.setAlignmentX((float) 268);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
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
        // The following exception was thrown during execution in test generation
        try {
            mainUI0.createBufferStrategy(16);
            org.junit.Assert.fail("Expected exception of type java.lang.InternalError; message: Could not create a buffer strategy");
        } catch (java.lang.InternalError e) {
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
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        java.awt.Component component1 = mainUI0.getGlassPane();
        scheduler.gui.ChiefCoordinatorDashboardPanel chiefCoordinatorDashboardPanel2 = new scheduler.gui.ChiefCoordinatorDashboardPanel(mainUI0);
        java.awt.Event event3 = null;
        scheduler.gui.MainUI mainUI4 = null;
        scheduler.gui.PaymentPanel paymentPanel5 = new scheduler.gui.PaymentPanel(mainUI4);
        java.awt.Rectangle rectangle6 = null;
        paymentPanel5.scrollRectToVisible(rectangle6);
        boolean boolean8 = chiefCoordinatorDashboardPanel2.lostFocus(event3, (java.lang.Object) paymentPanel5);
        paymentPanel5.setRequestFocusEnabled(true);
        java.awt.Rectangle rectangle11 = paymentPanel5.getVisibleRect();
        org.junit.Assert.assertNotNull(component1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle11);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
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
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray68 = mainUI0.getHierarchyBoundsListeners();
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
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray68);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray68, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
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
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray12 = paymentPanel1.getMouseWheelListeners();
        java.awt.Event event13 = null;
        boolean boolean16 = paymentPanel1.mouseDown(event13, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray12);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray12, new java.awt.event.MouseWheelListener[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        scheduler.gui.MainUI mainUI0 = null;
        scheduler.gui.SensorPanel sensorPanel1 = new scheduler.gui.SensorPanel(mainUI0);
        java.awt.event.ContainerListener containerListener2 = null;
        sensorPanel1.removeContainerListener(containerListener2);
        java.awt.event.MouseEvent mouseEvent4 = null;
        java.lang.String str5 = sensorPanel1.getToolTipText(mouseEvent4);
        sensorPanel1.invalidate();
        int int7 = sensorPanel1.getComponentCount();
        sensorPanel1.repaint((long) '4');
        java.awt.event.MouseListener mouseListener10 = null;
        sensorPanel1.removeMouseListener(mouseListener10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
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
        scheduler.gui.MainUI mainUI41 = null;
        scheduler.gui.SensorPanel sensorPanel42 = new scheduler.gui.SensorPanel(mainUI41);
        java.awt.event.ContainerListener containerListener43 = null;
        sensorPanel42.removeContainerListener(containerListener43);
        java.awt.event.MouseEvent mouseEvent45 = null;
        java.lang.String str46 = sensorPanel42.getToolTipText(mouseEvent45);
        java.awt.Dimension dimension47 = sensorPanel42.minimumSize();
        java.awt.ImageCapabilities imageCapabilities50 = null;
        java.awt.image.VolatileImage volatileImage51 = sensorPanel42.createVolatileImage(8, (-1), imageCapabilities50);
        java.awt.event.MouseListener mouseListener52 = null;
        sensorPanel42.removeMouseListener(mouseListener52);
        scheduler.gui.MainUI mainUI54 = null;
        scheduler.gui.SensorPanel sensorPanel55 = new scheduler.gui.SensorPanel(mainUI54);
        java.awt.event.ContainerListener containerListener56 = null;
        sensorPanel55.removeContainerListener(containerListener56);
        java.awt.event.MouseEvent mouseEvent58 = null;
        java.lang.String str59 = sensorPanel55.getToolTipText(mouseEvent58);
        sensorPanel55.transferFocus();
        java.awt.image.ImageProducer imageProducer61 = null;
        java.awt.Image image62 = sensorPanel55.createImage(imageProducer61);
        scheduler.gui.MainUI mainUI65 = null;
        scheduler.gui.SensorPanel sensorPanel66 = new scheduler.gui.SensorPanel(mainUI65);
        java.awt.event.ContainerListener containerListener67 = null;
        sensorPanel66.removeContainerListener(containerListener67);
        java.awt.event.MouseEvent mouseEvent69 = null;
        java.lang.String str70 = sensorPanel66.getToolTipText(mouseEvent69);
        java.awt.event.InputMethodListener inputMethodListener71 = null;
        sensorPanel66.removeInputMethodListener(inputMethodListener71);
        java.awt.Event event73 = null;
        boolean boolean76 = sensorPanel66.mouseEnter(event73, 3, (int) (short) 100);
        java.awt.Color color77 = sensorPanel66.getBackground();
        int int78 = sensorPanel42.checkImage(image62, (int) '#', (int) (short) 100, (java.awt.image.ImageObserver) sensorPanel66);
        scheduler.booking.Booking booking79 = new scheduler.booking.Booking();
        double double80 = booking79.calculateUpfrontCost();
        double double81 = booking79.calculateUpfrontCost();
        java.lang.String str82 = booking79.getBookingID();
        sensorPanel1.add((java.awt.Component) sensorPanel66, (java.lang.Object) str82);
        boolean boolean84 = sensorPanel1.requestFocusInWindow();
        org.junit.Assert.assertNotNull(componentArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertNull(volatileImage51);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(image62);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        scheduler.sensor.HardwareSensor hardwareSensor2 = new scheduler.sensor.HardwareSensor("SENSOR", "ADMIN_DASHBOARD");
        hardwareSensor2.notifyObservers("Room Booking System");
        scheduler.booking.BookingManager bookingManager5 = new scheduler.booking.BookingManager();
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager5);
        scheduler.booking.BookingManager bookingManager7 = new scheduler.booking.BookingManager();
        bookingManager7.update("ToolTipText");
        boolean boolean11 = bookingManager7.cancelBooking("ADMIN_DASHBOARD");
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager7);
        scheduler.booking.BookingManager bookingManager13 = new scheduler.booking.BookingManager();
        boolean boolean16 = bookingManager13.extendBooking("", (int) (short) 1);
        hardwareSensor2.detach((scheduler.sensor.SensorObserver) bookingManager13);
        bookingManager13.update("USER_DASHBOARD");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        scheduler.gui.MainUI mainUI0 = new scheduler.gui.MainUI();
        mainUI0.setFocusCycleRoot(true);
        mainUI0.showAdministratorBookings();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray4 = mainUI0.getWindowFocusListeners();
        org.junit.Assert.assertNotNull(windowFocusListenerArray4);
        org.junit.Assert.assertArrayEquals(windowFocusListenerArray4, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
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
        boolean boolean20 = sensorPanel1.isOpaque();
        sensorPanel1.requestFocus();
        scheduler.gui.MainUI mainUI22 = null;
        scheduler.gui.SensorPanel sensorPanel23 = new scheduler.gui.SensorPanel(mainUI22);
        java.awt.event.ContainerListener containerListener24 = null;
        sensorPanel23.removeContainerListener(containerListener24);
        java.lang.String str26 = sensorPanel23.toString();
        java.awt.MenuComponent menuComponent27 = null;
        sensorPanel23.remove(menuComponent27);
        sensorPanel23.reshape(12, 8, 650, (int) (byte) -1);
        java.awt.Color color34 = sensorPanel23.getBackground();
        sensorPanel23.setInheritsPopupMenu(false);
        sensorPanel23.setRequestFocusEnabled(true);
        java.awt.Dimension dimension39 = sensorPanel23.getMinimumSize();
        sensorPanel1.setMaximumSize(dimension39);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(componentListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray18);
        org.junit.Assert.assertArrayEquals(keyListenerArray18, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(dimension39);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
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
        scheduler.gui.MainUI mainUI17 = null;
        scheduler.gui.SensorPanel sensorPanel18 = new scheduler.gui.SensorPanel(mainUI17);
        java.awt.event.ContainerListener containerListener19 = null;
        sensorPanel18.removeContainerListener(containerListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.lang.String str22 = sensorPanel18.getToolTipText(mouseEvent21);
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        sensorPanel18.removeInputMethodListener(inputMethodListener23);
        java.awt.Component component27 = sensorPanel18.getComponentAt((int) (byte) -1, (int) ' ');
        scheduler.gui.MainUI mainUI28 = null;
        scheduler.gui.SensorPanel sensorPanel29 = new scheduler.gui.SensorPanel(mainUI28);
        java.awt.event.ContainerListener containerListener30 = null;
        sensorPanel29.removeContainerListener(containerListener30);
        java.lang.String str32 = sensorPanel29.toString();
        java.awt.MenuComponent menuComponent33 = null;
        sensorPanel29.remove(menuComponent33);
        java.awt.Component[] componentArray35 = sensorPanel29.getComponents();
        javax.swing.TransferHandler transferHandler36 = null;
        sensorPanel29.setTransferHandler(transferHandler36);
        scheduler.gui.MainUI mainUI38 = null;
        scheduler.gui.SensorPanel sensorPanel39 = new scheduler.gui.SensorPanel(mainUI38);
        java.awt.event.ContainerListener containerListener40 = null;
        sensorPanel39.removeContainerListener(containerListener40);
        java.awt.event.MouseEvent mouseEvent42 = null;
        java.lang.String str43 = sensorPanel39.getToolTipText(mouseEvent42);
        java.awt.Graphics graphics44 = null;
        sensorPanel39.paintAll(graphics44);
        scheduler.gui.MainUI mainUI46 = null;
        scheduler.gui.PaymentPanel paymentPanel47 = new scheduler.gui.PaymentPanel(mainUI46);
        boolean boolean48 = paymentPanel47.isEnabled();
        boolean boolean49 = paymentPanel47.isPaintingForPrint();
        paymentPanel47.hide();
        java.awt.Dimension dimension51 = paymentPanel47.getMaximumSize();
        sensorPanel39.setMaximumSize(dimension51);
        sensorPanel29.setMaximumSize(dimension51);
        sensorPanel18.resize(dimension51);
        sensorPanel1.setMaximumSize(dimension51);
        sensorPanel1.setDoubleBuffered(true);
        java.io.PrintStream printStream58 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensorPanel1.list(printStream58, 650);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(dimension16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(component27);
        org.junit.Assert.assertNotNull(componentArray35);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        scheduler.user.UserFactory userFactory0 = new scheduler.user.UserFactory();
        boolean boolean2 = userFactory0.isValidEmail("ADMIN_DASHBOARD");
        scheduler.user.User user4 = userFactory0.getUserByEmail("");
        boolean boolean6 = userFactory0.isStrongPassword("ADMIN_DASHBOARD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        scheduler.booking.BookingManager bookingManager0 = new scheduler.booking.BookingManager();
        java.util.Map<java.lang.String, scheduler.room.Room> strMap1 = bookingManager0.getRooms();
        scheduler.room.Room room3 = bookingManager0.getRoom("Room{roomID='ToolTipText', capacity=83, location='Room Booking System', currentState=AvailableState}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(room3);
    }
}
