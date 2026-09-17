package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfvl extends com.google.android.gms.internal.ads.zzfwo {
    private int zza;
    private java.lang.String zzb;
    private byte zzc;

    zzfvl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final com.google.android.gms.internal.ads.zzfwo zza(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final com.google.android.gms.internal.ads.zzfwo zzb(int r1) {
            r0 = this;
            r0.zza = r1
            r1 = 1
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final com.google.android.gms.internal.ads.zzfwp zzc() {
            r4 = this;
            byte r0 = r4.zzc
            r1 = 1
            if (r0 != r1) goto L10
            com.google.android.gms.internal.ads.zzfvn r0 = new com.google.android.gms.internal.ads.zzfvn
            int r1 = r4.zza
            java.lang.String r2 = r4.zzb
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties: statusCode"
            r0.<init>(r1)
            throw r0
    }
}
