package fr.norsys.stringcalculator;

public class Clazz {

  public boolean hasNewDeliemeter(String str) {
    if (str.length() < 2)
      return false;
    if (str.substring(0, 2).equals("//"))
      return true;
    else {
      return false;
    }
  }

  public String getDeliemeterFromString(String str) {
    String subStr = str.substring(2);
    return String.valueOf(subStr.charAt(0));
  }

  public String[] getNumbersAsArray(String numbersStr) {
    String delimetersRegex = "[,\n;]";
    if (hasNewDeliemeter(numbersStr)) {
      String newDelimeter = getDeliemeterFromString(numbersStr);
      delimetersRegex = "[\n" + newDelimeter + "]";
    }
    String[] arr = numbersStr.length() > 0 ? numbersStr.split(delimetersRegex) : new String[0];
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