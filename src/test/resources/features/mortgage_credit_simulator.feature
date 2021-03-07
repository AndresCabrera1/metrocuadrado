# language: es

  Característica: Calcular el credito para vivienda
    como usuario web, quiero simular el credito para la compra de un bien inmueble

    Esquema del escenario: Ana desea simular el monto del prestamo de acuerdo a sus ingresos
      Dado que ana ingresa al portal web metrocuadrado.com
      Cuando ingresa su salario <COP> mensual y el <plazo en años>
      Entonces confirma el monto que un banco le puede prestar

      Ejemplos:
        |    COP      | plazo en años |
        |5000000      |    10         |

