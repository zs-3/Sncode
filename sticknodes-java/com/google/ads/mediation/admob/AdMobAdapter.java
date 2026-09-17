package com.google.ads.mediation.admob;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@androidx.annotation.Keep
/* loaded from: classes.dex */
public final class AdMobAdapter extends com.google.ads.mediation.AbstractAdViewAdapter {
    static final java.lang.String AD_JSON_PARAMETER = "adJson";
    static final java.lang.String AD_PARAMETER = "_ad";
    static final java.lang.String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final java.lang.String NEW_BUNDLE = "_newBundle";

    public AdMobAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    protected android.os.Bundle buildExtrasBundle(android.os.Bundle r4, android.os.Bundle r5) {
            r3 = this;
            if (r4 != 0) goto L7
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L7:
            java.lang.String r0 = "_newBundle"
            boolean r0 = r4.getBoolean(r0)
            if (r0 == 0) goto L15
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r4)
            r4 = r0
        L15:
            java.lang.String r0 = "gw"
            r1 = 1
            r4.putInt(r0, r1)
            java.lang.String r0 = "mad_hac"
            java.lang.String r2 = r5.getString(r0)
            r4.putString(r0, r2)
            java.lang.String r0 = "adJson"
            java.lang.String r2 = r5.getString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L39
            java.lang.String r5 = r5.getString(r0)
            java.lang.String r0 = "_ad"
            r4.putString(r0, r5)
        L39:
            java.lang.String r5 = "_noRefresh"
            r4.putBoolean(r5, r1)
            return r4
    }
}
