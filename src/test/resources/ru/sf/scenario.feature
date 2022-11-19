Feature: site testing skillfactory.ru

  Scenario: choose a course
    Given url of skillfactory
    Then select all courses

  Scenario: back to home page
    Given url of skillfactory
    Then select all courses
    Then back to home page

  Scenario: open menu On-lain-kursi
    Given url of skillfactory
    Then select menu On-lain-kursi
    Then select menu Dizain

  Scenario: open menu Besplatno
    Given url of skillfactory
    Then select menu Besplatno

  Scenario: open menu Korporativnoe obychenie
    Given url of skillfactory
    Then select menu Korporativnoe obychenie

  Scenario: open menu Sotrydnichestvo
    Given url of skillfactory
    Then select menu Sotrydnichestvo

  Scenario: select menu Blog
    Given url of skillfactory
    Then select menu Blog

  Scenario: click  button Vibrat kurs
    Given url of skillfactory
    Then click button Vibrat kurs

  Scenario: course selection Data Science
    Given url of skillfactory
    Then select all courses
    Then choice Data Science

  Scenario: course selection Analitika dannih
    Given url of skillfactory
    Then select all courses
    Then choice Analitika dannih

  Scenario: course selection Programmirovanie
    Given url of skillfactory
    Then select all courses
    Then choice Programmirovanie

  Scenario: course selection Marketing
    Given url of skillfactory
    Then select all courses
    Then choice Marketing

  Scenario: course selection Testirovanie
    Given url of skillfactory
    Then select all courses
    Then choice Testirovanie

  Scenario: course selection Veb-razrabotka
    Given url of skillfactory
    Then select all courses
    Then choice Veb-razrabotka

  Scenario: course selection Backend-razrabotka
    Given url of skillfactory
    Then select all courses
    Then choice Backend-razrabotka

  Scenario: course selection Dizain
    Given url of skillfactory
    Then select all courses
    Then choice Dizain

  Scenario: course selection Bezopasnost
    Given url of skillfactory
    Then select all courses
    Then choice Bezopasnost

  Scenario: course selection Infrastructure
    Given url of skillfactory
    Then select all courses
    Then choice Infrastructure

  Scenario: course selection Razrabotka igr
    Given url of skillfactory
    Then select all courses
    Then choice Razrabotka igr

  Scenario: course selection Menegment
    Given url of skillfactory
    Then select all courses
    Then choice Menegment

  Scenario: course selection Visshoe obrazovanie NEW
    Given url of skillfactory
    Then select all courses
    Then choice Visshoe obrazovanie NEW

  Scenario: course selection Razrabotka prilogenii
    Given url of skillfactory
    Then select all courses
    Then choice Razrabotka prilogenii

  Scenario: course selection Sozdanie sites
    Given url of skillfactory
    Then select all courses
    Then choice Sozdanie sites

  Scenario: select blog Habr
    Given url of skillfactory
    Then select blog Habr

  Scenario: select blog VKontakte
    Given url of skillfactory
    Then select blog VKontakte

  Scenario: select blog Twitter
    Given url of skillfactory
    Then select blog Twitter

  Scenario: select blog YouTube
    Given url of skillfactory
    Then select blog YouTube

  Scenario: select blog Telegram
    Given url of skillfactory
    Then select blog Telegram

  Scenario: select blog Jandeks.Dzen
    Given url of skillfactory
    Then select blog Jandeks.Dzen

  Scenario: open a bank Tinkoff
    Given url of skillfactory
    Then open a bank Tinkoff

  Scenario: open a bank Sberbank
    Given url of skillfactory
    Then open a bank Sberbank

  Scenario: open a bank Pochta Bank
    Given url of skillfactory
    Then open a bank Pochta Bank

  Scenario: open a bank Alfa-bank
    Given url of skillfactory
    Then open a bank Alfa-bank

  Scenario: choose direction "Razrabotka igr"
    Given url of skillfactory
    Then choose direction Razrabotka igr

  Scenario: get the consultation pozitiv
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then click on the button otpravit zajavku, ne zapolnjat objazatelie polja
    And assert that user got message 'Пожалуйста, заполните все обязательные поля'

  Scenario: get the consultation negotiv
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then click on the button otpravit zajavku
    And assert that user got message 'ERROR Пожалуйста, заполните все обязательные поля'

  Scenario: send a request for a consultation
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then enter data 'Test Test', 'Test@test.ru', '9059999999'
    Then click on the button otpravit zajavku

  Scenario: send a request for a consultation with an empty field phone number
    Given url of skillfactory
    Then click on the button poluchit konsultaciu
    Then enter data 'Test Test', 'Test@test.ru', ''
    Then click on the button otpravit zajavku
    And assert that user got message 'Пожалуйста, заполните все обязательные поля'