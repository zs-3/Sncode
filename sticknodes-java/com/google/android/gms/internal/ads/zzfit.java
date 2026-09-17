package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfit {
    private final com.google.android.gms.internal.ads.zzfis zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfit() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfis r0 = new com.google.android.gms.internal.ads.zzfis
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzfis zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfis r0 = r3.zza
            com.google.android.gms.internal.ads.zzfis r1 = r0.zza()
            r2 = 0
            r0.zza = r2
            r0.zzb = r2
            return r1
    }

    public final java.lang.String zzb() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n\tPool does not exist: "
            r0.append(r1)
            int r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = "\n\tNew pools created: "
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = "\n\tPools removed: "
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "\n\tEntries added: "
            r0.append(r1)
            int r1 = r2.zzf
            r0.append(r1)
            java.lang.String r1 = "\n\tNo entries retrieved: "
            r0.append(r1)
            int r1 = r2.zze
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void zzc() {
            r1 = this;
            int r0 = r1.zzf
            int r0 = r0 + 1
            r1.zzf = r0
            return
    }

    public final void zzd() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 1
            int r0 = r0 + r1
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzfis r0 = r2.zza
            r0.zza = r1
            return
    }

    public final void zze() {
            r1 = this;
            int r0 = r1.zze
            int r0 = r0 + 1
            r1.zze = r0
            return
    }

    public final void zzf() {
            r1 = this;
            int r0 = r1.zzd
            int r0 = r0 + 1
            r1.zzd = r0
            return
    }

    public final void zzg() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 1
            int r0 = r0 + r1
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzfis r0 = r2.zza
            r0.zzb = r1
            return
    }
}
