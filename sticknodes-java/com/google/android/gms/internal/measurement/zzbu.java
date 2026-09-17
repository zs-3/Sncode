package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzbu extends com.google.android.gms.internal.measurement.zzcb {
    private java.lang.String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzbu() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.measurement.zzcb zza(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = ""
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcb zzb(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcc zzc() {
            r9 = this;
            byte r0 = r9.zzb
            r1 = 1
            if (r0 != r1) goto L23
            java.lang.String r0 = r9.zza
            if (r0 == 0) goto L23
            int r0 = r9.zzc
            if (r0 == 0) goto L23
            int r0 = r9.zzd
            if (r0 != 0) goto L12
            goto L23
        L12:
            com.google.android.gms.internal.measurement.zzbw r0 = new com.google.android.gms.internal.measurement.zzbw
            java.lang.String r2 = r9.zza
            r3 = 0
            int r4 = r9.zzc
            r5 = 0
            r6 = 0
            int r7 = r9.zzd
            r8 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.zza
            if (r1 != 0) goto L31
            java.lang.String r1 = " fileOwner"
            r0.append(r1)
        L31:
            byte r1 = r9.zzb
            if (r1 != 0) goto L3a
            java.lang.String r1 = " hasDifferentDmaOwner"
            r0.append(r1)
        L3a:
            int r1 = r9.zzc
            if (r1 != 0) goto L43
            java.lang.String r1 = " fileChecks"
            r0.append(r1)
        L43:
            int r1 = r9.zzd
            if (r1 != 0) goto L4c
            java.lang.String r1 = " filePurpose"
            r0.append(r1)
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    final com.google.android.gms.internal.measurement.zzcb zzd(int r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcb zze(int r1) {
            r0 = this;
            r1 = 1
            r0.zzd = r1
            return r0
    }
}
