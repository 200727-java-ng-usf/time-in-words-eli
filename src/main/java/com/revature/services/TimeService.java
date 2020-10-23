package com.revature.services;

import com.revature.models.TimeModel;
import com.revature.repos.TimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private TimeRepo timeRepo;

    @Transactional
    public String getTimeWord(){

        String time =" ";


        String minutes[] = {"zero" , "one" , "two" , "three" , "four", "five" ,
                "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine" , "thirty"} ;




        int m= 0;
        int h=0;

        if (m == 0) {

            time = minutes[h] + " o' clock";

        } else if (m == 15) {

            time = "quarter past " + minutes[h];

        } else if (m == 30) {

            time = "half past " + minutes[h];

        } else if (m == 45) {

            time = "quarter to " + minutes[h + 1];

        } else if (m == 1) {

            time = minutes[m] + " minute past " + minutes[h];

        } else if (m < 30) {

            time = minutes[m] + " minutes past " + minutes[h];

        } else {

            time = minutes[60 - m] + " minutes to " + minutes[h + 1];
        }

        return time;
    }


    @Transactional
    public List<TimeModel> findAll() {

        return timeRepo.findAll();
    }
}





