import type AdyenStartPaymentRequest from "./models/adyen-start-payment-request";
import type AdyenStartPaymentResponse from "./models/adyen-start-payment-response";

export interface AdyenT2PPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;

  startPayment(request: AdyenStartPaymentRequest): Promise<AdyenStartPaymentResponse>;
}
