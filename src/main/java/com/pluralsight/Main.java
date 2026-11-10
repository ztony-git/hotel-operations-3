package com.pluralsight;

/**
 * Main (Workbook 4a, Section 2-2 Creating Classes, Exercise 2)
 *
 * Walks one room through check in, check out and cleaning, printing the
 * two flags after each step, then one employee through a punchIn/punchOut
 * day (8.5 hours) and a punchTimeCard day (9 hours): 17.5 hours total,
 * all regular, 262.5 at 15.00 an hour.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a new employee and punch in
        Employee employee = new Employee(1, "John Doe", "Housekeeping", 15.00);
        employee.punchIn();

        Thread.sleep(10000);
        employee.punchOut();
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Total pay: " + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());

        Hotel hotel = new Hotel("Grand Plaza", 10, 40);
        System.out.println(hotel.bookRoom(6, true));
        System.out.println("Hotel booked: " + hotel.getAvailableSuites());
        System.out.println(hotel.bookRoom(29, false));
        System.out.println("Hotel booked: " + hotel.getAvailableRooms());
        System.out.println(hotel.bookRoom(29, false));
        System.out.println("Hotel booked: " + hotel.getAvailableRooms());
    }
}