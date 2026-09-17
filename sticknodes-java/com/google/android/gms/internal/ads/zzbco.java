package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbco {
    public zzbco() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final android.content.SharedPreferences zza(android.content.Context r2) {
            java.lang.String r0 = "google_ads_flags"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.IllegalStateException -> L8
            return r2
        L8:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            r2 = 0
            return r2
    }
}
