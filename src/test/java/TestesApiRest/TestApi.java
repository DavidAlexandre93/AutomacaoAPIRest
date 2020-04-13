package TestesApiRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import io.restassured.http.ContentType;

public class TestApi {

	@Test
	public void TestMake() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Make";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ID", "1").param("Name", "Chevrolet")
	    .param("ID", "2").param("Name", "Honda")
	    .param("ID", "3").param("Name", "Ford")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	
	
	@Test
	public void TestModel1() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=1";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("MakeID", "1").param("ID", "1").param("Name", "Agile")
	    .param("MakeID", "2").param("ID", "2").param("Name", "Astra")
	    .param("MakeID", "3").param("ID", "3").param("Name", "Onix")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	
	@Test
	public void TestModel2() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("MakeID", "2").param("ID", "4").param("Name", "City")
	    .param("MakeID", "2").param("ID", "5").param("Name", "CRV")
	    .param("MakeID", "2").param("ID", "6").param("Name", "Fit")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	@Test
	public void TestModel3() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=3";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("MakeID", "3").param("ID", "7").param("Name", "Ecosport")
	    .param("MakeID", "3").param("ID", "8").param("Name", "Fussion")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	
	@Test
	public void TestVersion1() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=1";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ModelID", "1").param("ID", "6").param("Name", "1.5 DX 16V FLEX 4P AUTOMÁTICO")
	    .param("ModelID", "1").param("ID", "7").param("Name", "1.5 LX 16V FLEX 4P MANUAL")
	    .param("ModelID", "1").param("ID", "8").param("Name", "2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO")
	    .param("ModelID", "1").param("ID", "9").param("Name", "1.8 16V EVO FLEX FREEDOM OPEN EDITION AUTOMÁTICO")
	    .param("ModelID", "1").param("ID", "10").param("Name", "1.0 MPI EL 8V FLEX 4P MANUAL")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	@Test
	public void TestVersion2() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=2";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ModelID", "2").param("ID", "11").param("Name", "1.5 DX 16V FLEX 4P AUTOMÁTICO")
	    .param("ModelID", "2").param("ID", "13").param("Name", "2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO")
	    .param("ModelID", "2").param("ID", "15").param("Name", "1.0 MPI EL 8V FLEX 4P MANUAL")
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	@Test
	public void TestVersion3() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=3";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ModelID", "3").param("ID", "16").param("Name", "1.5 DX 16V FLEX 4P AUTOMÁTICO")
	    .param("ModelID", "3").param("ID", "17").param("Name", "1.5 LX 16V FLEX 4P MANUAL")
	    .param("ModelID", "3").param("ID", "18").param("Name", "2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO")
	    .param("ModelID", "3").param("ID", "19").param("Name", "1.8 16V EVO FLEX FREEDOM OPEN EDITION AUTOMÁTICO")
	    .param("ModelID", "3").param("ID", "20").param("Name", "1.0 MPI EL 8V FLEX 4P MANUAL")

	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("Name", containsString("")); 
	}
	
	
	@Test
	public void TestVehicles1() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Vehicles?Page=1";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ID", "1").param("Make", "Honda").param("Model", "City").param("Version", "2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/01.jpg").param("KM", "0").param("Price", "59000,00").param("YearModel", "2018").param("YearFab", "2017").param("Color", "Azul")
	    .param("ID", "2").param("Make", "Mitsubishi").param("Model", "Lancer").param("Version", "2.0 EVO 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/02.jpg").param("KM", "47500").param("Price", "49000,00").param("YearModel", "2012").param("YearFab", "2012").param("Color", "Branco")
	    .param("ID", "3").param("Make", "Honda").param("Model", "Fit").param("Version", "1.4 LXL 16V FLEX 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/03.jpg").param("KM", "0").param("Price", "78000,00").param("YearModel", "2018").param("YearFab", "2018").param("Color", "Preto")
	    .param("ID", "4").param("Make", "Mitsubishi").param("Model", "Lancer").param("Version", "2.0 EVO 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/04.jpg").param("KM", "12900").param("Price", "59000,00").param("YearModel", "2016").param("YearFab", "2015").param("Color", "Vermelho")
	    .param("ID", "5").param("Make", "Honda").param("Model", "Fit").param("Version", "1.4 LXL 16V FLEX 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/05.jpg").param("KM", "12000").param("Price", "55000,00").param("YearModel", "2016").param("YearFab", "2016").param("Color", "Azul")   
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("ID", containsString("")); 
	    
	}
	
	
	
	@Test
	public void TestVehicles2() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Vehicles?Page=2";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ID", "11").param("Make", "Mitsubishi").param("Model", "Lancer").param("Version", "2.0 EVO 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/04.jpg").param("KM", "12900").param("Price", "59000,00").param("YearModel", "2016").param("YearFab", "2015").param("Color", "Vermelho")
	    .param("ID", "12").param("Make", "Honda").param("Model", "Fit").param("Version", "1.4 LXL 16V FLEX 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/05.jpg").param("KM", "12000").param("Price", "55000,00").param("YearModel", "2016").param("YearFab", "2016").param("Color", "Azul")
	    .param("ID", "13").param("Make", "Chevrolet").param("Model", "Agile").param("Version", "1.4 MPFI EFFECT 8V FLEX 4P AUTOMATIZADO").param("Image", "http://desafioonline.webmotors.com.br/content/img/06.jpg").param("KM", "12000").param("Price", "37000,00").param("YearModel", "2014").param("YearFab", "2013").param("Color", "Vermelho")
	    .param("ID", "14").param("Make", "Honda").param("Model", "Fit").param("Version", "1.4 LXL 16V FLEX 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/05.jpg").param("KM", "12000").param("Price", "55000,00").param("YearModel", "2016").param("YearFab", "2016").param("Color", "Azul")
	    .param("ID", "15").param("Make", "Honda").param("Model", "City").param("Version", "2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO").param("Image", "http://desafioonline.webmotors.com.br/content/img/01.jpg").param("KM", "0").param("Price", "59000,00").param("YearModel", "2018").param("YearFab", "2017").param("Color", "Azul")   
	    
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("ID", containsString("")); 
	    
	}
	
	
	
	@Test
	public void TestVehicles3() {
		
	String uriBase = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Vehicles?Page=3";
	
	
	given()
	    .relaxedHTTPSValidation()
	    .param("ID", "21").param("Make", "Ford").param("Model", "Ecosport").param("Version", "1.6 FREESTYLE 16V FLEX 4P MANUAL").param("Image", "http://desafioonline.webmotors.com.br/content/img/08.jpg").param("KM", "93000").param("Price", "45000,00").param("YearModel", "2013").param("YearFab", "2012").param("Color", "Branca")
	    
	
	.when()
	    .get(uriBase)
	.then()
	    .statusCode(200) // O status http retornado foi 200
	    .contentType(ContentType.JSON); // O response foi retornado no formato JSON
	    //.body("ID", containsString("")); 
	    
	}

}
