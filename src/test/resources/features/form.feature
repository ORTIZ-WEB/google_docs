#languaje: En
#Author: Santipkj901@gmail.com
  Feature: Form

    Scenario Outline: User complete form and submit
      Given that the user want answer the form
      When user enters data information
        | name | age | gender | address | email | cel | role |
        | <name> | <age> | <gender>| <address> | <email>| <cel>| <role> |
      Examples:
        | name | age | gender | address | email | cel | role |
        | Santiago Ortiz | 19 | Hombre| Cll 4f 78 bb 11 | santipkj901@gmail.com | 3005993791 | Analista Automatizador |



