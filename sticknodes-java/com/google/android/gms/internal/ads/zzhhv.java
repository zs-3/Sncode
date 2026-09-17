package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhhv extends com.google.android.gms.internal.ads.zzhia {
    final java.lang.String zza;

    public zzhhv(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhia
    public final void zza(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.zza
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 1
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r0 = "isoparser"
            android.util.Log.d(r0, r4)
            return
    }
}
