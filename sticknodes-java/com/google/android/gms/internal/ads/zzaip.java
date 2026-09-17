package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaip {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzek zzf;
    private final com.google.android.gms.internal.ads.zzek zzg;
    private int zzh;
    private int zzi;

    public zzaip(com.google.android.gms.internal.ads.zzek r1, com.google.android.gms.internal.ads.zzek r2, boolean r3) throws com.google.android.gms.internal.ads.zzbo {
            r0 = this;
            r0.<init>()
            r0.zzg = r1
            r0.zzf = r2
            r0.zze = r3
            r3 = 12
            r2.zzL(r3)
            int r2 = r2.zzp()
            r0.zza = r2
            r1.zzL(r3)
            int r2 = r1.zzp()
            r0.zzi = r2
            int r1 = r1.zzg()
            r2 = 1
            if (r1 != r2) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            java.lang.String r1 = "first_chunk must be 1"
            com.google.android.gms.internal.ads.zzadf.zzb(r2, r1)
            r1 = -1
            r0.zzb = r1
            return
    }

    public final boolean zza() {
            r4 = this;
            int r0 = r4.zzb
            r1 = 1
            int r0 = r0 + r1
            r4.zzb = r0
            int r2 = r4.zza
            if (r0 != r2) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r4.zze
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzek r0 = r4.zzf
            long r2 = r0.zzw()
            goto L1d
        L17:
            com.google.android.gms.internal.ads.zzek r0 = r4.zzf
            long r2 = r0.zzu()
        L1d:
            r4.zzd = r2
            int r0 = r4.zzb
            int r2 = r4.zzh
            if (r0 != r2) goto L44
            com.google.android.gms.internal.ads.zzek r0 = r4.zzg
            int r0 = r0.zzp()
            r4.zzc = r0
            com.google.android.gms.internal.ads.zzek r0 = r4.zzg
            r2 = 4
            r0.zzM(r2)
            int r0 = r4.zzi
            r2 = -1
            int r0 = r0 + r2
            r4.zzi = r0
            if (r0 <= 0) goto L42
            com.google.android.gms.internal.ads.zzek r0 = r4.zzg
            int r0 = r0.zzp()
            int r2 = r2 + r0
        L42:
            r4.zzh = r2
        L44:
            return r1
    }
}
