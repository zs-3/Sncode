package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfjo {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzfjn zzb;
    private long zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public zzfjo() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzfjn r0 = new com.google.android.gms.internal.ads.zzfjn
            r0.<init>()
            r2.zzb = r0
            r0 = 0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            r2.zza = r0
            r2.zzc = r0
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfjn zzd() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfjn r0 = r3.zzb
            com.google.android.gms.internal.ads.zzfjn r1 = r0.zza()
            r2 = 0
            r0.zza = r2
            r0.zzb = r2
            return r1
    }

    public final java.lang.String zze() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Created: "
            r0.append(r1)
            long r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = " Last accessed: "
            r0.append(r1)
            long r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = " Accesses: "
            r0.append(r1)
            int r1 = r3.zzd
            r0.append(r1)
            java.lang.String r1 = "\nEntries retrieved: Valid: "
            r0.append(r1)
            int r1 = r3.zze
            r0.append(r1)
            java.lang.String r1 = " Stale: "
            r0.append(r1)
            int r1 = r3.zzf
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void zzf() {
            r2 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            r2.zzc = r0
            int r0 = r2.zzd
            int r0 = r0 + 1
            r2.zzd = r0
            return
    }

    public final void zzg() {
            r2 = this;
            int r0 = r2.zzf
            int r0 = r0 + 1
            r2.zzf = r0
            com.google.android.gms.internal.ads.zzfjn r0 = r2.zzb
            int r1 = r0.zzb
            int r1 = r1 + 1
            r0.zzb = r1
            return
    }

    public final void zzh() {
            r2 = this;
            int r0 = r2.zze
            r1 = 1
            int r0 = r0 + r1
            r2.zze = r0
            com.google.android.gms.internal.ads.zzfjn r0 = r2.zzb
            r0.zza = r1
            return
    }
}
