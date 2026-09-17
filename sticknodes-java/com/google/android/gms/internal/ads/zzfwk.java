package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfwk extends com.google.android.gms.internal.ads.zzfvd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwl zza;
    private final com.google.android.gms.internal.ads.zzfwq zzb;

    zzfwk(com.google.android.gms.internal.ads.zzfwl r1, com.google.android.gms.internal.ads.zzfwq r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final void zzb(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "statusCode"
            r1 = 8150(0x1fd6, float:1.142E-41)
            int r0 = r3.getInt(r0, r1)
            java.lang.String r1 = "sessionToken"
            java.lang.String r3 = r3.getString(r1)
            com.google.android.gms.internal.ads.zzfwo r1 = com.google.android.gms.internal.ads.zzfwp.zzc()
            r1.zzb(r0)
            if (r3 == 0) goto L1a
            r1.zza(r3)
        L1a:
            com.google.android.gms.internal.ads.zzfwq r3 = r2.zzb
            com.google.android.gms.internal.ads.zzfwp r1 = r1.zzc()
            r3.zza(r1)
            r3 = 8157(0x1fdd, float:1.143E-41)
            if (r0 != r3) goto L2c
            com.google.android.gms.internal.ads.zzfwl r3 = r2.zza
            r3.zza()
        L2c:
            return
    }
}
