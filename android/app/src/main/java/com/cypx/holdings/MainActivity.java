package com.cypx.holdings;

import android.app.AlertDialog;
import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
        public void onBackPressed() {

                if (bridge != null &&
                                bridge.getWebView() != null &&
                                                bridge.getWebView().canGoBack()) {

                                                            bridge.getWebView().goBack();

                                                                    } else {

                                                                                new AlertDialog.Builder(this)
                                                                                                    .setTitle("Exit App")
                                                                                                                        .setMessage("Do you want to exit the app?")
                                                                                                                                            .setCancelable(true)
                                                                                                                                                                .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                                                                                                                                                                                    .setPositiveButton("Exit", (dialog, which) -> finish())
                                                                                                                                                                                                        .show();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    }