import groovy.json.JsonSlurper;

def failureMessage = "";
def jsonResponse = null;

JsonSlurper JSON = new JsonSlurper();

try 
{
	jsonResponse = JSON.parseText(prev.getResponseDataAsString());
} 
catch (Exception e)
{	
	failureMessage += "\n------------------ RESPONSE BODY --------------- \n\n"
	failureMessage += "Ошибка: тело ответа пустое. \n"
}

if (!"200".equals(prev.getResponseCode()))
{
	failureMessage += "\n------------------ RESPONSE CODE --------------- \n\n"
	failureMessage += "Ожидаемый [200] \nФактический [" + prev.getResponseCode() + "]\n\n";
}

if (failureMessage?.trim())
{
	AssertionResult.setFailureMessage(failureMessage);
	AssertionResult.setFailure(true);
}