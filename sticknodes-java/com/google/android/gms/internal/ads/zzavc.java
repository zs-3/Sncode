package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzavc implements com.google.android.gms.internal.ads.zzfsc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqz zza;

    zzavc(com.google.android.gms.internal.ads.zzfqz r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zza(int r3, long r4) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            com.google.android.gms.internal.ads.zzfqz r4 = r2.zza
            r4.zzd(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zzb(int r3, long r4, java.lang.String r6) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            com.google.android.gms.internal.ads.zzfqz r4 = r2.zza
            r4.zze(r3, r0, r6)
            return
    }
}
