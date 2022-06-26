Feature:LcWaikiki basket page



  Scenario: add product to basket
    Given application open
    When click on "kadin"  card in the top right
    When click on "bluz"
    Then should check "bluz" page
    When click on "Renk Ara" button
    When type "siyah" in renk ara bar
    When choose "siyah" button
    Then should check siyah filter page
    When click on first product
    Then should check product page
    When pick bluz size as M
    When click on "sepete ekle"
    When go to basket
    Then should check that product is added
    Then should check product name, size,number
    When click on "Ödeme Yap" button
    Then should check odeme page
