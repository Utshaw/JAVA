# time
- now() gives date time based on local machine
```
LocalTime openingHour = LocalTime.now();
System.out.println(openingHour);
System.out.println(LocalTime.of(23, 59));

System.out.println(LocalDate.now());
System.out.println(LocalDateTime.now());
System.out.println(LocalDate.now().minusDays(3));
System.out.println(LocalDateTime.now().plusHours(15).plusMinutes(15).plusSeconds(100));

long diffTime = ChronoUnit.MINUTES.between(LocalTime.now(), LocalTime.now().plusMinutes(100));
System.out.println(diffTime); // 100

System.out.println(LocalTime.now().isBefore(LocalTime.now().plusMinutes(100)));
```