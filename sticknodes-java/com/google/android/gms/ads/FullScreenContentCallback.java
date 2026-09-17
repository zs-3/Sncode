package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class FullScreenContentCallback {
    public static final int ERROR_CODE_AD_REUSED = 1;
    public static final int ERROR_CODE_APP_NOT_FOREGROUND = 3;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_MEDIATION_SHOW_ERROR = 4;
    public static final int ERROR_CODE_NOT_READY = 2;

    public FullScreenContentCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onAdClicked() {
            r0 = this;
            return
    }

    public void onAdDismissedFullScreenContent() {
            r0 = this;
            return
    }

    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError r1) {
            r0 = this;
            return
    }

    public void onAdImpression() {
            r0 = this;
            return
    }

    public void onAdShowedFullScreenContent() {
            r0 = this;
            return
    }
}
