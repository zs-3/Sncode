package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcof implements com.google.android.gms.internal.ads.zzcyv {
    private final com.google.android.gms.internal.ads.zzfia zza;

    public zzcof(com.google.android.gms.internal.ads.zzfia r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfia r2 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzfhj -> L6
            r2.zzg()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = "Cannot invoke onDestroy for the mediation adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfia r2 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzfhj -> L6
            r2.zzt()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = "Cannot invoke onPause for the mediation adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfia r0 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzfhj -> Ld
            r0.zzu()     // Catch: com.google.android.gms.internal.ads.zzfhj -> Ld
            if (r2 == 0) goto Lc
            com.google.android.gms.internal.ads.zzfia r0 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzfhj -> Ld
            r0.zzs(r2)     // Catch: com.google.android.gms.internal.ads.zzfhj -> Ld
        Lc:
            return
        Ld:
            r2 = move-exception
            java.lang.String r0 = "Cannot invoke onResume for the mediation adapter."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            return
    }
}
