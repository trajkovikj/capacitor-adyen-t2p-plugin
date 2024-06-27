export default interface AdyenStartPaymentResponse {
    isSuccessful: boolean;
    data: string | undefined;

    isFailure: boolean | undefined;
    errorMessage: string | undefined;
}
