package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhdx extends java.lang.RuntimeException {
    public zzhdx(com.google.android.gms.internal.ads.zzhcp r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.ads.zzhbt zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhbt r0 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }
}
