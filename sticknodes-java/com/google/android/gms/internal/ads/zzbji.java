package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbji implements com.google.android.gms.internal.ads.zzbjw {
    zzbji() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            android.content.Context r3 = r2.getContext()     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.ads.zzfuu r3 = com.google.android.gms.internal.ads.zzfuu.zzj(r3)     // Catch: java.io.IOException -> L19
            r3.zzk()     // Catch: java.io.IOException -> L19
            android.content.Context r2 = r2.getContext()     // Catch: java.io.IOException -> L19
            com.google.android.gms.internal.ads.zzfuv r2 = com.google.android.gms.internal.ads.zzfuv.zzi(r2)     // Catch: java.io.IOException -> L19
            r2.zzj()     // Catch: java.io.IOException -> L19
            return
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "DefaultGmsgHandlers.ResetPaid"
            r3.zzw(r2, r0)
            return
    }
}
