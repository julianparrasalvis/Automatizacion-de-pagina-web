Feature: Validar la ubicacion de la empresa Datacenter Colombia

  @CP01
  Scenario Outline: Se validara la ubicacion de la empresa Datacenter Colombia S.A.S
    Given El usuario abre el navegador google chrome
    When El usuario busca la empresa datacenter colombia en google chrome "<link>"
    And El usuario selecciona la pagina de datacenter colombia
    And  El usuario busca la ubicacion de la empresa en la pagina web
    Then El usuario deberia ver ubicacion encontrada
    Examples:
       | link                |
       | datacenter colombia |