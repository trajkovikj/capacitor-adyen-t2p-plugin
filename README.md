# capacitor-adyen-t2p-plugin

Adyen tap to pay capacitor plugin

## Install

```bash
npm install capacitor-adyen-t2p-plugin
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`startPayment(...)`](#startpayment)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### startPayment(...)

```typescript
startPayment(request: AdyenStartPaymentRequest) => Promise<AdyenStartPaymentResponse>
```

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`request`** | <code><a href="#adyenstartpaymentrequest">AdyenStartPaymentRequest</a></code> |

**Returns:** <code>Promise&lt;<a href="#adyenstartpaymentresponse">AdyenStartPaymentResponse</a>&gt;</code>

--------------------


### Interfaces


#### AdyenStartPaymentResponse

| Prop               | Type                 |
| ------------------ | -------------------- |
| **`isSuccessful`** | <code>boolean</code> |
| **`data`**         | <code>string</code>  |
| **`isFailure`**    | <code>boolean</code> |
| **`errorMessage`** | <code>string</code>  |


#### AdyenStartPaymentRequest

| Prop                | Type                |
| ------------------- | ------------------- |
| **`serviceId`**     | <code>string</code> |
| **`saleId`**        | <code>string</code> |
| **`transactionId`** | <code>string</code> |
| **`poiId`**         | <code>string</code> |
| **`amount`**        | <code>string</code> |
| **`currency`**      | <code>string</code> |

</docgen-api>
