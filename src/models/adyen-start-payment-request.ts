export default interface AdyenStartPaymentRequest {
    serviceId: string;
    saleId: string;
    transactionId: string;
    poiId: string;

    amount: string;
    currency: string;
}
