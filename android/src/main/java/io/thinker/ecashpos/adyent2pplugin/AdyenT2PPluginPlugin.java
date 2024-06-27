package io.thinker.ecashpos.adyent2pplugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import io.thinker.ecashpos.adyent2pplugin.models.AdyenStartPaymentRequest;
import io.thinker.ecashpos.adyent2pplugin.models.AdyenStartPaymentResponse;

@CapacitorPlugin(name = "AdyenT2PPlugin")
public class AdyenT2PPluginPlugin extends Plugin {

    private AdyenT2PPlugin implementation = new AdyenT2PPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void startPayment(PluginCall call) {

        AdyenStartPaymentRequest request = new AdyenStartPaymentRequest();
        request.serviceId = call.getString("serviceId");
        request.saleId = call.getString("saleId");
        request.transactionId = call.getString("transactionId");
        request.poiId = call.getString("poiId");

        request.amount = call.getString("amount");
        request.currency = call.getString("currency");

//         AdyenStartPaymentRequest request = Gson().fromJson<AdyenStartPaymentRequest>(
//             requestString,
//             AdyenStartPaymentRequest.class
//         );
//
//         implementation.startPayment(request);

        AdyenStartPaymentResponse response = new AdyenStartPaymentResponse();
        response.isSuccessful = true;
        response.data = "ANDROID" + request.amount + " " + request.currency;
        response.isFailure = false;
        response.errorMessage = "ANDROID: error error error";

        JSObject jsonResponse = new JSObject();
        jsonResponse.put("isSuccessful", response.isSuccessful);
        jsonResponse.put("data", response.data);
        jsonResponse.put("isFailure", response.isFailure);
        jsonResponse.put("error", response.errorMessage);

        call.resolve(jsonResponse);
    }
}
