package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfa extends com.google.android.gms.ads.internal.client.zzdg {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzfa(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final java.lang.String zzf() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
