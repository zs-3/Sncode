package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjn implements com.google.android.gms.internal.ads.zzbjw {
    zzbjn() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcfo r1 = (com.google.android.gms.internal.ads.zzcfo) r1
            com.google.android.gms.internal.ads.zzbai r2 = r1.zzJ()
            if (r2 == 0) goto Lf
            com.google.android.gms.internal.ads.zzbai r2 = r1.zzJ()
            r2.zza()
        Lf:
            com.google.android.gms.ads.internal.overlay.zzm r2 = r1.zzL()
            if (r2 == 0) goto L19
            r2.zzb()
            return
        L19:
            com.google.android.gms.ads.internal.overlay.zzm r1 = r1.zzM()
            if (r1 == 0) goto L23
            r1.zzb()
            return
        L23:
            java.lang.String r1 = "A GMSG tried to close something that wasn't an overlay."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
    }
}
