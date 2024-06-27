package io.thinker.ecashpos.adyent2pplugin;

import android.util.Log;

import io.thinker.ecashpos.adyent2pplugin.models.AdyenStartPaymentRequest;
import io.thinker.ecashpos.adyent2pplugin.models.AdyenStartPaymentResponse;

public class AdyenT2PPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public AdyenStartPaymentResponse startPayment(AdyenStartPaymentRequest request) {
        AdyenStartPaymentResponse response = new AdyenStartPaymentResponse();

        response.isSuccessful = true;
        response.isFailure = false;

        response.data = "data data data";
        response.errorMessage = "error error error";

        return response;
    }
}
