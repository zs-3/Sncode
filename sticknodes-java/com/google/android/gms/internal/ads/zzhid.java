package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzhid {
    final java.util.LinkedHashMap zza;

    zzhid(int r1) {
            r0 = this;
            r0.<init>()
            java.util.LinkedHashMap r1 = com.google.android.gms.internal.ads.zzhif.zzb(r1)
            r0.zza = r1
            return
    }

    final com.google.android.gms.internal.ads.zzhid zza(java.lang.Object r2, com.google.android.gms.internal.ads.zzhir r3) {
            r1 = this;
            java.lang.String r0 = "key"
            com.google.android.gms.internal.ads.zzhiq.zza(r2, r0)
            java.lang.String r0 = "provider"
            com.google.android.gms.internal.ads.zzhiq.zza(r3, r0)
            java.util.LinkedHashMap r0 = r1.zza
            r0.put(r2, r3)
            return r1
    }
}
