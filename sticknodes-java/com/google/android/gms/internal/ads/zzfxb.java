package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfxb implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfxc zza;

    /* synthetic */ zzfxb(com.google.android.gms.internal.ads.zzfxc r1, com.google.android.gms.internal.ads.zzfxa r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r3.zza
            com.google.android.gms.internal.ads.zzfxd r0 = com.google.android.gms.internal.ads.zzfxc.zzd(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "LmdServiceConnectionManager.onServiceConnected(%s)"
            r0.zzc(r4, r1)
            com.google.android.gms.internal.ads.zzfwy r4 = new com.google.android.gms.internal.ads.zzfwy
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfxc r5 = r3.zza
            com.google.android.gms.internal.ads.zzfxc.zzh(r5, r4)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r3.zza
            com.google.android.gms.internal.ads.zzfxd r0 = com.google.android.gms.internal.ads.zzfxc.zzd(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "LmdServiceConnectionManager.onServiceDisconnected(%s)"
            r0.zzc(r4, r1)
            com.google.android.gms.internal.ads.zzfwz r4 = new com.google.android.gms.internal.ads.zzfwz
            r4.<init>(r3)
            com.google.android.gms.internal.ads.zzfxc r0 = r3.zza
            com.google.android.gms.internal.ads.zzfxc.zzh(r0, r4)
            return
    }
}
