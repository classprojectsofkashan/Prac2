package com.classroom;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Passport {
    String id;
    String firstName;
    String lastName;
    private Calendar birthDate;
    private Calendar exireDate;

    public void setBirthDate(JalaliCalendar.YearMonthDate birthDate) {
        this.birthDate = JalaliCalendar.jalaliToGregorian(birthDate).toCalendar();
    }

    public JalaliCalendar.YearMonthDate getBirthDate() {
        return JalaliCalendar.gregorianToJalali(new JalaliCalendar.YearMonthDate(this.birthDate));
    }

    public Calendar getBirthDateCalendar() {
        return this.birthDate;
    }

    public void setExireDate(JalaliCalendar.YearMonthDate expireDate) {
        this.exireDate = JalaliCalendar.jalaliToGregorian(expireDate).toCalendar();
    }

    public void setExireDateCalendar(Calendar expireDate) {
        this.exireDate = expireDate;
    }

    public boolean isExpired() {
        return exireDate.compareTo(Calendar.getInstance()) > 0;
    }
}
