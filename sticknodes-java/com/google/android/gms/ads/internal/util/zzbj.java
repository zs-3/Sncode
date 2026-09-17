package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbj extends com.google.android.gms.internal.ads.zzarh {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ java.util.Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    zzbj(com.google.android.gms.ads.internal.util.zzbo r1, int r2, java.lang.String r3, com.google.android.gms.internal.ads.zzaqh r4, com.google.android.gms.internal.ads.zzaqg r5, byte[] r6, java.util.Map r7, com.google.android.gms.ads.internal.util.client.zzl r8) {
            r0 = this;
            r0.zza = r6
            r0.zzb = r7
            r0.zzc = r8
            r0.<init>(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final java.util.Map zzl() throws com.google.android.gms.internal.ads.zzapk {
            r1 = this;
            java.util.Map r0 = r1.zzb
            if (r0 != 0) goto L8
            java.util.Map r0 = java.util.Collections.emptyMap()
        L8:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzarh, com.google.android.gms.internal.ads.zzaqc
    protected final /* bridge */ /* synthetic */ void zzo(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.zzz(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final byte[] zzx() throws com.google.android.gms.internal.ads.zzapk {
            r1 = this;
            byte[] r0 = r1.zza
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    protected final void zzz(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzl r0 = r1.zzc
            r0.zzg(r2)
            super.zzz(r2)
            return
    }
}
