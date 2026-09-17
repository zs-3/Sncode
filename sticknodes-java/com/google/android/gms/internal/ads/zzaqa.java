package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqa implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzaqc zzc;

    zzaqa(com.google.android.gms.internal.ads.zzaqc r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.internal.ads.zzaqc r0 = r4.zzc
            com.google.android.gms.internal.ads.zzaqn r0 = com.google.android.gms.internal.ads.zzaqc.zzi(r0)
            java.lang.String r1 = r4.zza
            long r2 = r4.zzb
            r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzaqc r0 = r4.zzc
            com.google.android.gms.internal.ads.zzaqn r1 = com.google.android.gms.internal.ads.zzaqc.zzi(r0)
            java.lang.String r0 = r0.toString()
            r1.zzb(r0)
            return
    }
}
