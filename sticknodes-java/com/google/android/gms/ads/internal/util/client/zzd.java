package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzd extends java.lang.Thread {
    final /* synthetic */ java.lang.String zza;

    zzd(com.google.android.gms.ads.internal.util.client.zzf r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.ads.internal.util.client.zzr r0 = new com.google.android.gms.ads.internal.util.client.zzr
            r1 = 0
            r0.<init>(r1)
            java.lang.String r1 = r2.zza
            r0.zza(r1)
            return
    }
}
