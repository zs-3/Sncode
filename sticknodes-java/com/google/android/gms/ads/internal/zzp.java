package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzp implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.ads.internal.zzt zza;

    zzp(com.google.android.gms.ads.internal.zzt r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.ads.internal.zzt r0 = r3.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = com.google.android.gms.ads.internal.zzt.zzm(r0)
            java.lang.String r1 = r1.afmaVersion
            android.content.Context r0 = com.google.android.gms.ads.internal.zzt.zzc(r0)
            r2 = 0
            com.google.android.gms.internal.ads.zzavm r0 = com.google.android.gms.internal.ads.zzavm.zzu(r1, r0, r2)
            com.google.android.gms.internal.ads.zzavn r1 = new com.google.android.gms.internal.ads.zzavn
            r1.<init>(r0)
            return r1
    }
}
