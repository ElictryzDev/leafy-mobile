package com.leafyapp;

// NOTE: Google Play Billing STUB
// PROD: Replace TODO blocks with real BillingClient calls
// Docs: https://developer.android.com/google/play/billing/integrate

import android.content.Context;
import android.util.Log;

// TODO: import com.android.billingclient.api.*;

/**
 * ShopCosmetics — Google Play In-App Purchase integration stub.
 *
 * This class will handle purchasing Leafy shop items (stickers, themes, VIP)
 * via Google Play Billing Library v6.
 *
 * STUB: Current implementation is a no-op placeholder.
 * PROD: Wire BillingClient initialization, queryProductDetails, and launchBillingFlow.
 */
public class ShopCosmetics {
    private static final String TAG = "ShopCosmetics";
    private final Context context;

    // STUB: private BillingClient billingClient;

    public ShopCosmetics(Context context) {
        this.context = context;
        Log.d(TAG, "[STUB] ShopCosmetics initialized — Google Play Billing not yet configured.");
        // TODO: billingClient = BillingClient.newBuilder(context)
        //     .setListener(purchasesUpdatedListener)
        //     .enablePendingPurchases()
        //     .build();
        // TODO: billingClient.startConnection(billingClientStateListener);
    }

    /**
     * STUB: Query available products from Google Play.
     * PROD: Replace with queryProductDetailsAsync
     */
    public void queryProducts() {
        Log.d(TAG, "[STUB] queryProducts called — implement with BillingClient.queryProductDetailsAsync");
        // TODO: List<QueryProductDetailsParams.Product> productList = new ArrayList<>();
        // TODO: for (String productId : PRODUCT_IDS) {
        // TODO:   productList.add(QueryProductDetailsParams.Product.newBuilder()
        // TODO:       .setProductId(productId).setProductType(BillingClient.ProductType.INAPP).build());
        // TODO: }
        // TODO: billingClient.queryProductDetailsAsync(params, listener);
    }

    /**
     * STUB: Launch billing flow for a product.
     * PROD: Use launchBillingFlow after queryProducts succeeds
     */
    public void purchase(String productId) {
        Log.d(TAG, "[STUB] purchase called for: " + productId);
        // TODO: BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
        // TODO:     .setProductDetailsParamsList(productDetailsParamsList)
        // TODO:     .build();
        // TODO: BillingResult result = billingClient.launchBillingFlow(activity, billingFlowParams);
    }

    /**
     * STUB: Handle purchase updates callback.
     * PROD: Verify purchase with backend, then grant entitlement
     */
    private void handlePurchase(/* Purchase purchase */) {
        Log.d(TAG, "[STUB] handlePurchase — verify with Leafy backend POST /api/v1/shop/verify-play-purchase");
        // TODO: Verify purchase token with your backend
        // TODO: POST { product_id, purchase_token } to /api/v1/shop/verify-play-purchase
        // TODO: Backend acknowledges with billingClient.acknowledgePurchase(...)
    }
}
