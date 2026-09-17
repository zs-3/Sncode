package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaiw implements com.google.android.gms.internal.ads.zzais {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaiw(com.google.android.gms.internal.ads.zzain r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r2 = r2.zza
            r1.zza = r2
            r0 = 12
            r2.zzL(r0)
            int r0 = r2.zzp()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.zzc = r0
            int r2 = r2.zzp()
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zza() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzc() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 8
            if (r0 != r1) goto Ld
            com.google.android.gms.internal.ads.zzek r0 = r2.zza
            int r0 = r0.zzm()
            return r0
        Ld:
            r1 = 16
            if (r0 != r1) goto L18
            com.google.android.gms.internal.ads.zzek r0 = r2.zza
            int r0 = r0.zzq()
            return r0
        L18:
            int r0 = r2.zzd
            int r1 = r0 + 1
            r2.zzd = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2f
            com.google.android.gms.internal.ads.zzek r0 = r2.zza
            int r0 = r0.zzm()
            r2.zze = r0
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> 4
            return r0
        L2f:
            int r0 = r2.zze
            r0 = r0 & 15
            return r0
    }
}
