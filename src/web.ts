import { WebPlugin } from '@capacitor/core';

import type { AdyenT2PPluginPlugin } from './definitions';
import type AdyenStartPaymentRequest from './models/adyen-start-payment-request';
import type AdyenStartPaymentResponse from './models/adyen-start-payment-response';

export class AdyenT2PPluginWeb extends WebPlugin implements AdyenT2PPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async startPayment(request: AdyenStartPaymentRequest): Promise<AdyenStartPaymentResponse> {
    console.log('AdyenT2PPlugin::web::startPayment');
    console.log(request);

    const response = {
      isSuccessful: false,
      isFailure: false,
      data: `WEB: ${request.amount} ${request.currency}`,
      errorMessage: 'WEB: error test message',
    } as AdyenStartPaymentResponse;

    return Promise.resolve(response);
  }
}
