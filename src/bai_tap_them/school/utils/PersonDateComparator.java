package bai_tap_them.school.utils;

import bai_tap_them.school.models.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class PersonDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate Date1 = LocalDate.parse(o1.getAge(), dateTimeFormatter);
        LocalDate Date2 = LocalDate.parse(o2.getAge(), dateTimeFormatter);

        if (Date1.compareTo(Date2) > 0) {
            return 1;
        } else if (Date1.compareTo(Date2) < 0) {
            return -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
