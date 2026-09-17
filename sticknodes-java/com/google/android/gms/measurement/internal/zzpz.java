package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpz {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzhv zzb;
    private final java.lang.String zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.measurement.internal.zzmf zze;
    private final long zzf;
    private final long zzg;
    private final int zzh;

    /* synthetic */ zzpz(long r1, com.google.android.gms.internal.measurement.zzhv r3, java.lang.String r4, java.util.Map r5, com.google.android.gms.measurement.internal.zzmf r6, long r7, long r9, long r11, int r13, com.google.android.gms.measurement.internal.zzpy r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r9
            r0.zzg = r11
            r0.zzh = r13
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzmf zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzmf r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzpa zze() {
            r12 = this;
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.Map r0 = r12.zzd
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r5.putString(r2, r1)
            goto Lf
        L2b:
            long r1 = r12.zza
            com.google.android.gms.internal.measurement.zzhv r0 = r12.zzb
            java.lang.String r4 = r12.zzc
            com.google.android.gms.measurement.internal.zzmf r3 = r12.zze
            long r7 = r12.zzf
            com.google.android.gms.measurement.internal.zzpa r10 = new com.google.android.gms.measurement.internal.zzpa
            byte[] r6 = r0.zzcd()
            int r9 = r3.zza()
            java.lang.String r11 = ""
            r0 = r10
            r3 = r6
            r6 = r9
            r9 = r11
            r0.<init>(r1, r3, r4, r5, r6, r7, r9)
            return r10
    }

    public final com.google.android.gms.measurement.internal.zzph zzf() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r1 = r5.zzc
            java.util.Map r2 = r5.zzd
            com.google.android.gms.measurement.internal.zzmf r3 = r5.zze
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzhv zzg() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzhv r0 = r1.zzb
            return r0
    }

    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
