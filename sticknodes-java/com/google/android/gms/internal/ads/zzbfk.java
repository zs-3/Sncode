package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfk {
    private final android.content.Context zza;

    public zzbfk(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzbuw r4) {
            r3 = this;
            android.content.Context r0 = r3.zza     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            java.lang.String r1 = "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy"
            com.google.android.gms.internal.ads.zzbfj r2 = new com.google.android.gms.internal.ads.zzbfj     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            r2.<init>()     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r0, r1, r2)     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            com.google.android.gms.internal.ads.zzbfl r0 = (com.google.android.gms.internal.ads.zzbfl) r0     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            r0.zze(r4)     // Catch: android.os.RemoteException -> L13 com.google.android.gms.ads.internal.util.client.zzp -> L26
            return
        L13:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error calling setFlagsAccessedBeforeInitializedListener: "
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L26:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:"
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
    }
}
