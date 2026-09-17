package org.fortheloss.androidcore;

/* loaded from: classes2.dex */
public class AdmobInterstitialHandler {
    private android.app.Activity _activityRef;
    private org.fortheloss.framework.IAdListener _adListenerRef;
    private int _adState;
    private com.google.android.gms.ads.interstitial.InterstitialAd _admobInterstitialAd;

    /* renamed from: org.fortheloss.androidcore.AdmobInterstitialHandler$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ org.fortheloss.androidcore.AdmobInterstitialHandler this$0;
        final /* synthetic */ java.lang.String val$adUnitID;


        AnonymousClass1(org.fortheloss.androidcore.AdmobInterstitialHandler r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$adUnitID = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.google.android.gms.ads.AdRequest$Builder r0 = new com.google.android.gms.ads.AdRequest$Builder
                r0.<init>()
                com.google.android.gms.ads.AdRequest r0 = r0.build()
                org.fortheloss.androidcore.AdmobInterstitialHandler r1 = r4.this$0
                android.app.Activity r1 = org.fortheloss.androidcore.AdmobInterstitialHandler.m132$$Nest$fget_activityRef(r1)
                java.lang.String r2 = r4.val$adUnitID
                org.fortheloss.androidcore.AdmobInterstitialHandler$1$1 r3 = new org.fortheloss.androidcore.AdmobInterstitialHandler$1$1
                r3.<init>(r4)
                UX.aTqO5.a()
                return
        }
    }


    /* renamed from: -$$Nest$fget_activityRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.app.Activity m132$$Nest$fget_activityRef(org.fortheloss.androidcore.AdmobInterstitialHandler r0) {
            android.app.Activity r0 = r0._activityRef
            return r0
    }

    /* renamed from: -$$Nest$fget_adState, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m133$$Nest$fget_adState(org.fortheloss.androidcore.AdmobInterstitialHandler r0) {
            int r0 = r0._adState
            return r0
    }

    /* renamed from: -$$Nest$fget_admobInterstitialAd, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.google.android.gms.ads.interstitial.InterstitialAd m134$$Nest$fget_admobInterstitialAd(org.fortheloss.androidcore.AdmobInterstitialHandler r0) {
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r0._admobInterstitialAd
            return r0
    }

    /* renamed from: -$$Nest$fput_adState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m135$$Nest$fput_adState(org.fortheloss.androidcore.AdmobInterstitialHandler r0, int r1) {
            r0._adState = r1
            return
    }

    /* renamed from: -$$Nest$fput_admobInterstitialAd, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m136$$Nest$fput_admobInterstitialAd(org.fortheloss.androidcore.AdmobInterstitialHandler r0, com.google.android.gms.ads.interstitial.InterstitialAd r1) {
            r0._admobInterstitialAd = r1
            return
    }

    /* renamed from: -$$Nest$mfinishAd, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m137$$Nest$mfinishAd(org.fortheloss.androidcore.AdmobInterstitialHandler r0) {
            r0.finishAd()
            return
    }

    public AdmobInterstitialHandler(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._adState = r0
            r1._activityRef = r2
            com.google.android.gms.ads.MobileAds.initialize(r2)
            return
    }

    private void finishAd() {
            r2 = this;
            r0 = 0
            r2._adState = r0
            r0 = 0
            r2._admobInterstitialAd = r0
            org.fortheloss.framework.IAdListener r1 = r2._adListenerRef
            if (r1 == 0) goto Lf
            r1.onAdClosed()
            r2._adListenerRef = r0
        Lf:
            return
    }

    public void loadAd(java.lang.String r3) {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "STICKNODES: About to load an ad..."
            r0.println(r1)
            int r0 = r2._adState
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 1
            if (r0 != r1) goto L10
            goto L1d
        L10:
            r2._adState = r1
            android.app.Activity r0 = r2._activityRef
            org.fortheloss.androidcore.AdmobInterstitialHandler$1 r1 = new org.fortheloss.androidcore.AdmobInterstitialHandler$1
            r1.<init>(r2, r3)
            r0.runOnUiThread(r1)
            return
        L1d:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Can't load ad, it's already been requested to load or is loaded."
            r3.println(r0)
            return
    }

    public void showAd(org.fortheloss.framework.IAdListener r3) {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "STICKNODES: Attempting to show an ad..."
            r0.println(r1)
            r2._adListenerRef = r3
            com.google.android.gms.ads.interstitial.InterstitialAd r3 = r2._admobInterstitialAd
            if (r3 != 0) goto L18
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Can't show ad, ad wasn't initialized."
            r3.println(r0)
            r2.finishAd()
            return
        L18:
            int r3 = r2._adState
            if (r3 != 0) goto L27
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Can't show ad, it's not loaded."
            r3.println(r0)
            r2.finishAd()
            return
        L27:
            android.app.Activity r3 = r2._activityRef
            org.fortheloss.androidcore.AdmobInterstitialHandler$2 r0 = new org.fortheloss.androidcore.AdmobInterstitialHandler$2
            r0.<init>(r2)
            r3.runOnUiThread(r0)
            return
    }
}
