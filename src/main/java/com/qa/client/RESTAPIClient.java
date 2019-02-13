package com.qa.client;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RESTAPIClient {

public CloseableHttpResponse getClosesableHttpResponse() throws IOException {
    CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
    HttpGet httpGet = new HttpGet(ClientInstances.URL);
    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpGet);
    return closeableHttpResponse;
}
// Status Code
public Integer getStatus(CloseableHttpResponse closeableHttpResponse){
    int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
    return statusCode;
}
// Json Status Code
public JSONObject getStatusResponseObject(CloseableHttpResponse closeableHttpResponse) throws IOException {
    String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UFT-8");
    JSONObject jsonObject = new JSONObject(responseString);
    return  jsonObject;
}
// All Headers
public Map getHeaderValues(CloseableHttpResponse closeableHttpResponse){
    Header [] headersArray = closeableHttpResponse.getAllHeaders();
    HashMap<String, String> allHeaders = new HashMap<String, String>();
    for(Header header : headersArray){
        allHeaders.put(header.getName(), header.getValue());
    }
    return  allHeaders;
}

}
