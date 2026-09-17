package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpl implements com.google.android.gms.internal.ads.zzfpe {
    private static com.google.android.gms.internal.ads.zzfpl zza;
    private float zzb;
    private com.google.android.gms.internal.ads.zzfoz zzc;
    private com.google.android.gms.internal.ads.zzfpd zzd;

    public zzfpl(com.google.android.gms.internal.ads.zzfpa r1, com.google.android.gms.internal.ads.zzfoy r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzfpl zzb() {
            com.google.android.gms.internal.ads.zzfpl r0 = com.google.android.gms.internal.ads.zzfpl.zza
            if (r0 != 0) goto L15
            com.google.android.gms.internal.ads.zzfoy r0 = new com.google.android.gms.internal.ads.zzfoy
            r0.<init>()
            com.google.android.gms.internal.ads.zzfpa r1 = new com.google.android.gms.internal.ads.zzfpa
            r1.<init>()
            com.google.android.gms.internal.ads.zzfpl r2 = new com.google.android.gms.internal.ads.zzfpl
            r2.<init>(r1, r0)
            com.google.android.gms.internal.ads.zzfpl.zza = r2
        L15:
            com.google.android.gms.internal.ads.zzfpl r0 = com.google.android.gms.internal.ads.zzfpl.zza
            return r0
    }

    public final float zza() {
            r1 = this;
            float r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzc(boolean r1) {
            r0 = this;
            if (r1 == 0) goto La
            com.google.android.gms.internal.ads.zzfql r1 = com.google.android.gms.internal.ads.zzfql.zzd()
            r1.zzi()
            return
        La:
            com.google.android.gms.internal.ads.zzfql r1 = com.google.android.gms.internal.ads.zzfql.zzd()
            r1.zzh()
            return
    }

    public final void zzd(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfox r0 = new com.google.android.gms.internal.ads.zzfox
            r0.<init>()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            com.google.android.gms.internal.ads.zzfoz r2 = new com.google.android.gms.internal.ads.zzfoz
            r2.<init>(r1, r4, r0, r3)
            r3.zzc = r2
            return
    }

    public final void zze(float r3) {
            r2 = this;
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzfpd r0 = r2.zzd
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            r2.zzd = r0
        Lc:
            com.google.android.gms.internal.ads.zzfpd r0 = r2.zzd
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            com.google.android.gms.internal.ads.zzfpr r1 = r1.zzg()
            r1.zzl(r3)
            goto L16
        L2a:
            return
    }

    public final void zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfpc r0 = com.google.android.gms.internal.ads.zzfpc.zza()
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzfpc r0 = com.google.android.gms.internal.ads.zzfpc.zza()
            r0.zzf()
            com.google.android.gms.internal.ads.zzfql r0 = com.google.android.gms.internal.ads.zzfql.zzd()
            r0.zzi()
            com.google.android.gms.internal.ads.zzfoz r0 = r1.zzc
            r0.zza()
            return
    }

    public final void zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfql r0 = com.google.android.gms.internal.ads.zzfql.zzd()
            r0.zzj()
            com.google.android.gms.internal.ads.zzfpc r0 = com.google.android.gms.internal.ads.zzfpc.zza()
            r0.zzg()
            com.google.android.gms.internal.ads.zzfoz r0 = r1.zzc
            r0.zzb()
            return
    }
}
