package com.example;
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.business.Person;

/**
 * Hello world!
 *
 */
public class App 
{
  
  public static void main( String[] args )
  {
    //Convert to Json
    Person person = new Person("Joanna", "Pathenay");
    String personToJson = convertToJson(person);
    System.out.println(personToJson);

    //Capitalize
    String toCapitalize = "capitalize";
    capitalizeString(toCapitalize);
    System.out.println(toCapitalize);
    }
    
    public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}
