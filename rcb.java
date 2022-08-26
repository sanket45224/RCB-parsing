package demo1;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class rcb 
{
	
	public int forignPlayers = 0;
	public int wicketkeeper=0;
	JsonPath j;
	
	@BeforeMethod
	public void rcbJsonParcing() 
	{
			
		String jsonBody = "{\r\n"
				+ "  \"name\": \"Royal Challengers Bangalore\",\r\n"
				+ "  \"location\": \"Bangalore\",\r\n"
				+ "  \"player\": [\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Faf Du Plessis\",\r\n"
				+ "      \"country\": \"South Africa\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Virat Kohli\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"15\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Glenn Maxwell\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"11\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mohammad Siraj\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Harshal Patel\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Wanindu Hasaranga\",\r\n"
				+ "      \"country\": \"Srilanka\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Dinesh Karthik\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Wicket-keeper\",\r\n"
				+ "      \"price-in-crores\": \"5.5\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Shahbaz Ahmed\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"All-Rounder\",\r\n"
				+ "      \"price-in-crores\": \"2.4\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Rajat Patidar\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"0.20\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Josh Hazlewood\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mahipal Lomror\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		
		
		j= new JsonPath(jsonBody);
		List<Object> list=j.getList("player");
		System.err.println(list);
		System.out.println(list.size());		
		
	}

	
	@Test
	public void TC1() 
	{
		System.out.println("----------TC1 for counting forignPlayers--------");

		List<Object> country =j.getList("player.country");
		System.err.println(country);
		System.out.println(country.size());
		
		
		for(int i=0;i<country.size();i++) 
		{
			System.out.println(country.get(i));
			if(!country.get(i).equals("India")) 
			{
				forignPlayers=forignPlayers+1;			
			}		
		}
		
		System.out.println(forignPlayers);
		
		if (forignPlayers==4)
			{
			
			System.out.println("Test case 1 is Pass");
			
		    }		
	}
	
	
	
	@Test
	public void TC2() 
	{	
		System.out.println("------------TC2 for counting wicketkeeper----------");

		
		List<Object> role=j.getList("player.role");
		System.err.println(role);
		System.out.println(role.size());
		
		
		for(int i=0;i<role.size();i++) 
		{
			if(role.get(i).equals("Wicket-keeper")) 
			{
				
				wicketkeeper=wicketkeeper+1;			
			}		
		}
		
		System.out.println(wicketkeeper);
		
		if (wicketkeeper>=1)
		{
		
		System.out.println("Test case 2 is Pass");
		
	    }
		
	}
	
	
	
}
