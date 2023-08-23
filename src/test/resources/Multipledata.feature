Feature: title of the feature

  Scenario: letcode login
    Given log in to the letcode form
    When enter login credentials in the form
      | firstname | lastname | state         |
      | revathy   | poomalai | tamil namdu   |
      | poomalai  | rengaih  | andra pradesh |
      | kalyani   | poomalai | kerala        |
      | govind    | poomalai | karnataka     |
      | shiva     | shiva    | India         |
