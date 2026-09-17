package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzf {
    final com.google.android.gms.internal.measurement.zzax zza;
    final com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzg zzc;
    final com.google.android.gms.internal.measurement.zzj zzd;

    public zzf() {
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.measurement.zzax r0 = new com.google.android.gms.internal.measurement.zzax
            r0.<init>()
            r4.zza = r0
            com.google.android.gms.internal.measurement.zzg r1 = new com.google.android.gms.internal.measurement.zzg
            r2 = 0
            r1.<init>(r2, r0)
            r4.zzc = r1
            com.google.android.gms.internal.measurement.zzg r0 = r1.zza()
            r4.zzb = r0
            com.google.android.gms.internal.measurement.zzj r0 = new com.google.android.gms.internal.measurement.zzj
            r0.<init>()
            r4.zzd = r0
            com.google.android.gms.internal.measurement.zzw r2 = new com.google.android.gms.internal.measurement.zzw
            r2.<init>(r0)
            java.lang.String r3 = "require"
            r1.zzg(r3, r2)
            com.google.android.gms.internal.measurement.zze r2 = new com.google.android.gms.internal.measurement.zze
            r2.<init>()
            java.lang.String r3 = "internal.platform"
            r0.zza(r3, r2)
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = "runtime.counter"
            r1.zzg(r2, r0)
            return
    }

    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r5, com.google.android.gms.internal.measurement.zziz... r6) {
            r4 = this;
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            int r1 = r6.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L22
            r0 = r6[r2]
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzi.zza(r0)
            com.google.android.gms.internal.measurement.zzg r3 = r4.zzc
            com.google.android.gms.internal.measurement.zzh.zzc(r3)
            boolean r3 = r0 instanceof com.google.android.gms.internal.measurement.zzaq
            if (r3 != 0) goto L19
            boolean r3 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r3 == 0) goto L1f
        L19:
            com.google.android.gms.internal.measurement.zzax r3 = r4.zza
            com.google.android.gms.internal.measurement.zzap r0 = r3.zza(r5, r0)
        L1f:
            int r2 = r2 + 1
            goto L4
        L22:
            return r0
    }
}
