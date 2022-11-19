
Задание 38.1.1

Написано 38 тестов с использованием Java, JUnit и Selenium.
В качестве тестируемого сайта использовался сайт https://skillfactory.ru/.


1. Для опитимазации кода, URL вынеcли в константы, для объявления один раз для всего проекта
    final String TESTED_SITE = "https://skillfactory.ru/".
	
2. В строке System.setProperty добавлено определение имени пользователя
System.setProperty("webdriver.chrome.driver", "C:\\Users\\"+System.getenv("USERNAME")+"\\IdeaProjects\\FinalTestSF\\src\\test\\resources\\chromedriver.exe").

3. Максимизирован размер открываемой страницы
webDriver.manage().window().maximize().

4. В классе HomePage оптимизированы шаги гипперссылок (Habr, VKontakte, Twitter, YouTube, Telegram, Яндекс.Дзен).

5. В классе AllCoursesPage оптимизированно присвоение локаторов


Feature: site testing skillfactory.ru

  1. Scenario: choose a course
    Given url of skillfactory
    Then select all courses
	
	открытие всех курсов
	открывается сайт skillfactory.ru
	открываются все курсы

  2. Scenario: back to home page
    Given url of skillfactory
    Then select all courses
    Then back to home page
	
	возврат на главную страницу
	открывается сайт skillfactory.ru
	открываются  все курсы
	возвращаемся на главную страницу skillfactory.ru

  3. Scenario: open menu On-lain-kursi
    Given url of skillfactory
    Then select menu On-lain-kursi
    Then select menu Dizain
	
	Открытие меню Онлйн-курсы
	открывается сайт skillfactory.ru
	открываем меню Онлйн-курсы
	выбираем курс Дизайн

  4. Scenario: open menu Besplatno
    Given url of skillfactory
    Then select menu Besplatno
	
	Открытие меню Бесплатно
	открывается сайт skillfactory.ru
	открываем меню Бесплатно
	
  5. Scenario: open menu Korporativnoe obychenie
    Given url of skillfactory
    Then select menu Korporativnoe obychenie
	
	Открытие меню Корпоративное обучение
	открывается сайт skillfactory.ru
	открываем меню Корпоративное обучение

  6. Scenario: open menu Sotrydnichestvo
    Given url of skillfactory
    Then select menu Sotrydnichestvo
	
	Открытие меню Сотрудничество
	открывается сайт skillfactory.ru
	открываем меню Сотрудничество

  7. Scenario: select menu Blog
    Given url of skillfactory
    Then select menu Blog
	
	Открытие меню Блог
	открывается сайт skillfactory.ru
	открываем меню Блог

  8. Scenario: click  button Vibrat kurs
    Given url of skillfactory
    Then click button Vibrat kurs
	
	кликаем на кнопку Выбрать курс
	открывается сайт skillfactory.ru
	нажимаем на кнопку выбрать курс
	

  9. Scenario: course selection Data Science
    Given url of skillfactory
    Then select all courses
    Then choice Data Science
	
	открыть направление Data Science
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Data Science

  10. Scenario: course selection Analitika dannih
    Given url of skillfactory
    Then select all courses
    Then choice Analitika dannih
	
	открыть направление Аналитика данных
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Аналитика данных

  11. Scenario: course selection Programmirovanie
    Given url of skillfactory
    Then select all courses
    Then choice Programmirovanie
	
	открыть направление Программирование
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Программирование

  12. Scenario: course selection Marketing
    Given url of skillfactory
    Then select all courses
    Then choice Marketing
	
	открыть направление Маркетинг
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Маркетинг

  13. Scenario: course selection Testirovanie
    Given url of skillfactory
    Then select all courses
    Then choice Testirovanie
	
	открыть направление Тестирование
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Тестирование

  14. Scenario: course selection Veb-razrabotka
    Given url of skillfactory
    Then select all courses
    Then choice Veb-razrabotka
	
	открыть направление Веб-разработка
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Веб-разработка

  15. Scenario: course selection Backend-razrabotka
    Given url of skillfactory
    Then select all courses
    Then choice Backend-razrabotka
	
	открыть направление Backend-разработка
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Backend-разработка

  16. Scenario: course selection Dizain
    Given url of skillfactory
    Then select all courses
    Then choice Dizain
	
	открыть направление Дизайн
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Дизайн

  17. Scenario: course selection Bezopasnost
    Given url of skillfactory
    Then select all courses
    Then choice Bezopasnost
	
	открыть направление Безопасность
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Безопасность

  18. Scenario: course selection Infrastructure
    Given url of skillfactory
    Then select all courses
    Then choice Infrastructure
	
	открыть направление Инфраструктура
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Инфраструктура

  19. Scenario: course selection Razrabotka igr
    Given url of skillfactory
    Then select all courses
    Then choice Razrabotka igr
	
	открыть направление Разработка игр
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Разработка игр

  20. Scenario: course selection Menegment
    Given url of skillfactory
    Then select all courses
    Then choice Menegment

	открыть направление Менеджмент
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Менеджмент

  21. Scenario: course selection Visshoe obrazovanie NEW
    Given url of skillfactory
    Then select all courses
    Then choice Visshoe obrazovanie NEW
	
	открыть направление Высшее образование NEW
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Высшее образование NEW

  22. Scenario: course selection Razrabotka prilogenii
    Given url of skillfactory
    Then select all courses
    Then choice Razrabotka prilogenii
	
	открыть направление Разработка приложений
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Разработка приложений

  23. Scenario: course selection Sozdanie sites
    Given url of skillfactory
    Then select all courses
    Then choice Sozdanie sites
	
	открыть направление Создание сайтов
	открывается сайт skillfactory.ru
	открываются  все курсы
	открывается Создание сайтов

  24. Scenario: select blog Habr
    Given url of skillfactory
    Then select blog Habr
	
	открыть гиперссылку Хабр
	открывается сайт skillfactory.ru
	кликаем на Хабр

  25. Scenario: select blog VKontakte
    Given url of skillfactory
    Then select blog VKontakte
	
	открыть гиперссылку VKontakte
	открывается сайт skillfactory.ru
	кликаем на VKontakte

  26. Scenario: select blog Twitter
    Given url of skillfactory
    Then select blog Twitter
	
	открыть гиперссылку Twitter
	открывается сайт skillfactory.ru
	кликаем на Twitter

  27. Scenario: select blog YouTube
    Given url of skillfactory
    Then select blog YouTube
	
	открыть гиперссылку YouTube
	открывается сайт skillfactory.ru
	кликаем на YouTube

  28. Scenario: select blog Telegram
    Given url of skillfactory
    Then select blog Telegram
	
	открыть гиперссылку Telegram
	открывается сайт skillfactory.ru
	кликаем на Telegram

  29. Scenario: select blog Jandeks.Dzen
    Given url of skillfactory
    Then select blog Jandeks.Dzen
	
	открыть гиперссылку Яндекс.Дзен
	открывается сайт skillfactory.ru
	кликаем на Яндекс.Дзен

  30. Scenario: open a bank Tinkoff
    Given url of skillfactory
    Then open a bank Tinkoff
	
	открыть банк Тинькофф
	открывается сайт skillfactory.ru
	кликаем на Тинькофф

  31. Scenario: open a bank Sberbank
    Given url of skillfactory
    Then open a bank Sberbank
	
	открыть банк Сбербанк
	открывается сайт skillfactory.ru
	кликаем на Сбербанк

  32. Scenario: open a bank Pochta Bank
    Given url of skillfactory
    Then open a bank Pochta Bank
	
	открыть банк Почта Банк
	открывается сайт skillfactory.ru
	кликаем на Почта Банк

  33. Scenario: open a bank Alfa-bank
    Given url of skillfactory
    Then open a bank Alfa-bank
	
	открыть банк Альфа-банк
	открывается сайт skillfactory.ru
	кликаем на Альфа-банк

  34. Scenario: choose direction "Razrabotka igr"
    Given url of skillfactory
    Then choose direction Razrabotka igr
	
	открыть направление Разработка игр
	открывается сайт skillfactory.ru
	кликаем на напрправлеие Разработка игр

  35. Scenario: get the consultation pozitiv
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then click on the button otpravit zajavku, ne zapolnjat objazatelie polja
    And assert that user got message 'Пожалуйста, заполните все обязательные поля'
	
	отправить заявку на консультацию
	открывается сайт skillfactory.ru
	кликаем по кнопке получить консультацию
	кликаем по кнопке отправить заявку, не заполнять обязательные поля
	выходит сообщение 'Пожалуйста, заполните все обязательные поля'

  36. Scenario: get the consultation negotiv
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then click on the button otpravit zajavku
    And assert that user got message 'ERROR Пожалуйста, заполните все обязательные поля'
	
	отправить заявку на консультацию (проверочный тест, на отображение неправильного текста ошибки при не заполненных полях. Тест не падает и выдает правельное сообщение) 
	открывается сайт skillfactory.ru
	кликаем по кнопке получить консультацию
	кликаем по кнопке отправить заявку
	выходит сообщение 'ERROR Пожалуйста, заполните все обязательные поля'

  37. Scenario: send a request for a consultation
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then enter data 'Test Test', 'Test@test.ru', '9059999999'
    Then click on the button otpravit zajavku
	
	отправка заявки на консультацию
	открывается сайт skillfactory.ru
	кликаем по кнопке получить консультацию
	заполнаем поля данными
	нажимаем кнопку отправить заявку

  38. Scenario: send a request for a consultation with an empty field phone number
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then enter data 'Test Test', 'Test@test.ru', ''
    Then click on the button otpravit zajavku
    And assert that user got message 'Пожалуйста, заполните все обязательные поля'
	
	отправка заявки на консультацию без ввода номера телефона
	открывается сайт skillfactory.ru
	кликаем по кнопке получить консультацию
	заполнаем поля данными,(кроме номера телефона)
	нажимаем кнопку отправить заявку
	получаем сообщение об ошибке 'Пожалуйста, заполните все обязательные поля'
	