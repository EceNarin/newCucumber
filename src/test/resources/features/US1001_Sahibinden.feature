
Feature: US1001 user in Sahbinden page

  Scenario: TC positive testcase
    Given user navigate to "sahibindenUrl" homepage
    Then accept cookies
    And  verify to on the homepage notices result if its 56
    And  page down
    And  verify to into populer searhing "sahibinden Param Güvende"
    And kullanici 5 sn bekler
    And vasita menusunden "Arazi, SUV & Pickup" a tikla
    And kullanici 5 sn bekler
    And verify to "Citroën" ilan sayisi 800 den fazla
    And "Citroën" e tikla
    And "C4 Cactus" e tikla
    And fiyat araligi olarak "300-400 bin tl" gir
    And yakit benzin sec
    And km max 150 bin sec
    And renk beyaz sec
    And fotografli ilanlar sec
    And arama butonuna tikla
    And gelen ilanlari fiyata gore sirala
    And en ucuz ilanin yil, km, fiyat biglierini yazdir

