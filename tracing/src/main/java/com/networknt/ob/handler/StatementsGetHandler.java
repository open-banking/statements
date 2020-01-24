package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class StatementsGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"Statement\":[{\"AccountId\":\"22289\",\"StatementId\":\"8sfhke-sifhkeuf-97813\",\"StatementReference\":\"002\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-08-01T00:00:00+00:00\",\"EndDateTime\":\"2017-08-31T23:59:59+00:00\",\"CreationDateTime\":\"2017-09-01T00:00:00+00:00\",\"StatementDescription\":[\"August 2017 Statement\",\"One Free Uber Ride\"],\"StatementAmount\":[{\"Amount\":{\"Amount\":\"400.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"600.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]},{\"AccountId\":\"22289\",\"StatementId\":\"34hj24u-324h33-31i3p4\",\"StatementReference\":\"003\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-09-01T00:00:00+00:00\",\"EndDateTime\":\"2017-09-30T23:59:59+00:00\",\"CreationDateTime\":\"2017-10-01T00:00:00+00:00\",\"StatementDescription\":[\"September 2017 Statement\"],\"StatementAmount\":[{\"Amount\":{\"Amount\":\"200.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"400.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]},{\"AccountId\":\"31820\",\"StatementId\":\"9034ee-4ewa4e-342er6\",\"StatementReference\":\"002\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-09-01T00:00:00+00:00\",\"EndDateTime\":\"2017-09-30T23:59:59+00:00\",\"CreationDateTime\":\"2017-10-01T00:00:00+00:00\",\"StatementAmount\":[{\"Amount\":{\"Amount\":\"2700.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"4060.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]}],\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/statements/\"},\"Meta\":{\"TotalPages\":1}}}";
        } else if ("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"Statement\":[{\"AccountId\":\"42281\",\"StatementId\":\"8sfhke-sifhkeuf-97813\",\"StatementReference\":\"002\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-08-01T00:00:00+00:00\",\"EndDateTime\":\"2017-08-31T23:59:59+00:00\",\"CreationDateTime\":\"2017-09-01T00:00:00+00:00\",\"StatementDescription\":[\"August 2017 Statement\",\"One Free Uber Ride\"],\"StatementAmount\":[{\"Amount\":{\"Amount\":\"400.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"600.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]},{\"AccountId\":\"42281\",\"StatementId\":\"34hj24u-324h33-31i3p4\",\"StatementReference\":\"003\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-09-01T00:00:00+00:00\",\"EndDateTime\":\"2017-09-30T23:59:59+00:00\",\"CreationDateTime\":\"2017-10-01T00:00:00+00:00\",\"StatementDescription\":[\"September 2017 Statement\"],\"StatementAmount\":[{\"Amount\":{\"Amount\":\"200.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"400.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]},{\"AccountId\":\"41221\",\"StatementId\":\"9034ee-4ewa4e-342er6\",\"StatementReference\":\"002\",\"Type\":\"RegularPeriodic\",\"StartDateTime\":\"2017-09-01T00:00:00+00:00\",\"EndDateTime\":\"2017-09-30T23:59:59+00:00\",\"CreationDateTime\":\"2017-10-01T00:00:00+00:00\",\"StatementAmount\":[{\"Amount\":{\"Amount\":\"2700.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"ClosingBalance\"},{\"Amount\":{\"Amount\":\"4060.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"PreviousClosingBalance\"}]}],\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/statements/\"},\"Meta\":{\"TotalPages\":1}}}";
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
