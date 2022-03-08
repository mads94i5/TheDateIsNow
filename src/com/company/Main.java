package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.printCurrentDate();
    }
    private void printCurrentDate(){
        LocalDate today = LocalDate.now();
        System.out.println(theDateIsNow(today.getDayOfWeek().getValue(), today.getDayOfMonth(), today.getMonth().getValue(), today.getYear()));
    }
    private String theDateIsNow(int weekday, int date, int month, int year) {
        String returnString = "The date is now: ";
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        returnString += weekdays[weekday-1] + " ";
        if (date % 10 == 1) {
            returnString += "the " + date + "st of ";
        }
        else if (date % 10 == 2) {
            returnString += "the " + date + "nd of ";
        }
        else if (date % 10 == 3) {
            returnString += "the " + date + "rd of ";
        }
        else {
            returnString += "the " + date + "th of ";
        }
        returnString += months[month-1] + " ";
        returnString += year + ".";
        return returnString;
    }
}
