package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzi implements com.google.android.gms.internal.ads.zzfsc {
    final /* synthetic */ com.google.android.gms.ads.internal.zzj zza;

    zzi(com.google.android.gms.ads.internal.zzj r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zza(int r4, long r5) {
            r3 = this;
            com.google.android.gms.ads.internal.zzj r0 = r3.zza
            com.google.android.gms.internal.ads.zzfqz r0 = com.google.android.gms.ads.internal.zzj.zza(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r5
            r0.zzd(r4, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zzb(int r4, long r5, java.lang.String r7) {
            r3 = this;
            com.google.android.gms.ads.internal.zzj r0 = r3.zza
            com.google.android.gms.internal.ads.zzfqz r0 = com.google.android.gms.ads.internal.zzj.zza(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r5
            r0.zze(r4, r1, r7)
            return
    }
}
