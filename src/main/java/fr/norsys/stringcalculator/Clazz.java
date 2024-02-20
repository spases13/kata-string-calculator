package fr.norsys.stringcalculator;

public class Clazz {

  public String[] getNumbersAsArray(String numbersStr) {
    String[] arr = numbersStr.length() > 0 ? numbersStr.split("[,\n]") : new String[0];
    return arr;
  }

  public int Add(String numbers) {
    String[] arrOfNumbersString = getNumbersAsArray(numbers);
    int result = 0;

    for (int i = 0; i < arrOfNumbersString.length; i++) {
      result += Integer.parseInt(arrOfNumbersString[i]);
    }

    return result;
  }
}