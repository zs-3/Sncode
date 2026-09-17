package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdqf implements com.google.android.gms.internal.ads.zzbkn {
    private final com.google.android.gms.internal.ads.zzczh zza;
    private final com.google.android.gms.internal.ads.zzbwy zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public zzdqf(com.google.android.gms.internal.ads.zzczh r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzbwy r1 = r2.zzl
            r0.zzb = r1
            java.lang.String r1 = r2.zzj
            r0.zzc = r1
            java.lang.String r1 = r2.zzk
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zza(com.google.android.gms.internal.ads.zzbwy r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbwy r0 = r3.zzb
            if (r0 == 0) goto L5
            r4 = r0
        L5:
            if (r4 == 0) goto Lc
            java.lang.String r0 = r4.zza
            int r4 = r4.zzb
            goto Lf
        Lc:
            r4 = 1
            java.lang.String r0 = ""
        Lf:
            com.google.android.gms.internal.ads.zzbwj r1 = new com.google.android.gms.internal.ads.zzbwj
            r1.<init>(r0, r4)
            com.google.android.gms.internal.ads.zzczh r4 = r3.zza
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r3.zzd
            r4.zzd(r1, r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzczh r0 = r1.zza
            r0.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzczh r0 = r1.zza
            r0.zzf()
            return
    }
}
