package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkq implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzdxb zza;

    public zzbkq(com.google.android.gms.internal.ads.zzdxb r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "The Inspector Manager must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r5, java.util.Map r6) {
            r4 = this;
            if (r6 == 0) goto L2d
            java.lang.String r5 = "extras"
            boolean r0 = r6.containsKey(r5)
            if (r0 != 0) goto Lb
            goto L2d
        Lb:
            java.lang.String r0 = "expires"
            boolean r1 = r6.containsKey(r0)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L22
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.NumberFormatException -> L22
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L22
            long r2 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L22
        L22:
            com.google.android.gms.internal.ads.zzdxb r0 = r4.zza
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.zzi(r5, r2)
        L2d:
            return
    }
}
