


public class Main {
    public static void main(String[] args) {
        // Заголовок
        
        Weather weatherTip = new Weather();
        System.out.println(weatherTip.dailyWeather);

// Воскресенье

        Weather sundayTip = new Weather();
      sundayTip.nameOfTheDay   = "Sunday";
        sundayTip.tempOfTheAirMin = 17;
                sundayTip.tempOfTheAirMax = 32;
                sundayTip.isItRain = true;
                sundayTip.humidity = 35;
                sundayTip.windSpeed = 10;
        System.out.println("Day:" + sundayTip.nameOfTheDay);
        System.out.println("MinTemp:" + sundayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + sundayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + sundayTip.isItRain);
        System.out.println("IS IT SNOW:" + sundayTip.isItSnow);
        System.out.println("Humidity:" + sundayTip.humidity);
        System.out.println("Wind Speed:"+ sundayTip.windSpeed);

// Понедельник

        Weather mondayTip = new Weather();
        mondayTip.nameOfTheDay   = "Monday";
        mondayTip.tempOfTheAirMin = 16;
        mondayTip.tempOfTheAirMax = 29;
        mondayTip.isItRain = true;
        mondayTip.humidity = 49;
        mondayTip.windSpeed = 12;
        System.out.println("Day:" + mondayTip.nameOfTheDay);
        System.out.println("MinTemp:" + mondayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + mondayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + mondayTip.isItRain);
        System.out.println("IS IT SNOW:" + mondayTip.isItSnow);
        System.out.println("Humidity:" + mondayTip.humidity);
        System.out.println("Wind Speed:"+ mondayTip.windSpeed);

        // Вторник

        Weather tuesdayTip = new Weather();
        tuesdayTip.nameOfTheDay   = "Tuesday";
        tuesdayTip.tempOfTheAirMin = 17;
        tuesdayTip.tempOfTheAirMax = 27;;
        tuesdayTip.humidity = 0;
        tuesdayTip.windSpeed = 11;
        System.out.println("Day:" + tuesdayTip.nameOfTheDay);
        System.out.println("MinTemp:" + tuesdayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + tuesdayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + tuesdayTip.isItRain);
        System.out.println("IS IT SNOW:" + tuesdayTip.isItSnow);
        System.out.println("Humidity:" + tuesdayTip.humidity);
        System.out.println("Wind Speed:"+ tuesdayTip.windSpeed);

        // Среда

        Weather wednesdayTip = new Weather();
        wednesdayTip.nameOfTheDay   = "Wednesday";
        wednesdayTip.tempOfTheAirMin = 16;
        wednesdayTip.tempOfTheAirMax = 27;
        wednesdayTip.isItRain = true;
        wednesdayTip.humidity = 93;
        wednesdayTip.windSpeed = 14;
        System.out.println("Day:" + wednesdayTip.nameOfTheDay);
        System.out.println("MinTemp:" + wednesdayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + wednesdayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + wednesdayTip.isItRain);
        System.out.println("IS IT SNOW:" + wednesdayTip.isItSnow);
        System.out.println("Humidity:" + wednesdayTip.humidity);
        System.out.println("Wind Speed:"+ wednesdayTip.windSpeed);

        // Четверг

        Weather thursdayTip = new Weather();
        thursdayTip.nameOfTheDay   = "Thursday";
        thursdayTip.tempOfTheAirMin = 13;
        thursdayTip.tempOfTheAirMax = 26;
        thursdayTip.humidity = 24;
        thursdayTip.windSpeed = 12;
        System.out.println("Day:" + thursdayTip.nameOfTheDay);
        System.out.println("MinTemp:" + thursdayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + thursdayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + thursdayTip.isItRain);
        System.out.println("IS IT SNOW:" + thursdayTip.isItSnow);
        System.out.println("Humidity:" + thursdayTip.humidity);
        System.out.println("Wind Speed:"+ thursdayTip.windSpeed);

        // Пятница

        Weather fridayTip = new Weather();
        fridayTip.nameOfTheDay   = "Friday";
        fridayTip.tempOfTheAirMin = 15;
        fridayTip.tempOfTheAirMax = 27;
        fridayTip.humidity = 7;
        fridayTip.windSpeed = 10;
        System.out.println("Day:" + fridayTip.nameOfTheDay);
        System.out.println("MinTemp:" + fridayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + fridayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + fridayTip.isItRain);
        System.out.println("IS IT SNOW:" + fridayTip.isItSnow);
        System.out.println("Humidity:" + fridayTip.humidity);
        System.out.println("Wind Speed:"+ fridayTip.windSpeed);

        // Суббота

        Weather saturdayTip = new Weather();
        saturdayTip.nameOfTheDay   = "Saturday";
        saturdayTip.tempOfTheAirMin = 20;
        saturdayTip.tempOfTheAirMax = 33;
        saturdayTip.humidity = 1;
        saturdayTip.windSpeed = 16;
        System.out.println("Day:" + saturdayTip.nameOfTheDay);
        System.out.println("MinTemp:" + saturdayTip.tempOfTheAirMin);
        System.out.println("MaxTemp:" + saturdayTip.tempOfTheAirMax);
        System.out.println("IS IT RAIN:" + saturdayTip.isItRain);
        System.out.println("IS IT SNOW:" + saturdayTip.isItSnow);
        System.out.println("Humidity:" + saturdayTip.humidity);
        System.out.println("Wind Speed:"+ saturdayTip.windSpeed);



    }
}
