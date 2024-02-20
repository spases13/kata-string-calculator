package fr.norsys.stringcalculator;

public class Clazz {

  public String[] getNumbersAsArray(String numbersStr) {
    String[] arr = numbersStr.length() > 0 ? numbersStr.split(",") : new String[0];
    return arr;
  }

  public int Add(String numbers) {
    String[] arrOfNumbersString = getNumbersAsArray(numbers);
    switch (arrOfNumbersString.length) {
      case 0:
        return 0;
      case 1:
        return Integer.parseInt(arrOfNumbersString[0]);
      case 2:
        return Integer.parseInt(arrOfNumbersString[0]) + Integer.parseInt(arrOfNumbersString[1]);
      default:
        return -1;
    }
  }

  public static void main(String[] args) {
    Clazz c = new Clazz();
    System.out.println(c.Add("5,9"));
  }
}