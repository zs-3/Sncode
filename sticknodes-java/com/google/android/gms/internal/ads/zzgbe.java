package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgbe extends com.google.android.gms.internal.ads.zzfyy {
    final /* synthetic */ java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfya zzb;

    zzgbe(java.util.Iterator r1, com.google.android.gms.internal.ads.zzfya r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    protected final java.lang.Object zza() {
            r2 = this;
        L0:
            java.util.Iterator r0 = r2.zza
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L17
            java.util.Iterator r0 = r2.zza
            com.google.android.gms.internal.ads.zzfya r1 = r2.zzb
            java.lang.Object r0 = r0.next()
            boolean r1 = r1.zza(r0)
            if (r1 == 0) goto L0
            return r0
        L17:
            r2.zzb()
            r0 = 0
            return r0
    }
}
