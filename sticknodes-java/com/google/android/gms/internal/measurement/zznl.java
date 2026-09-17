package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznl implements com.google.android.gms.internal.measurement.zzns {
    private final com.google.android.gms.internal.measurement.zznh zza;
    private final com.google.android.gms.internal.measurement.zzoe zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.measurement.zzlq zzd;

    private zznl(com.google.android.gms.internal.measurement.zzoe r1, com.google.android.gms.internal.measurement.zzlq r2, com.google.android.gms.internal.measurement.zznh r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            boolean r1 = r3 instanceof com.google.android.gms.internal.measurement.zzma
            r0.zzc = r1
            r0.zzd = r2
            r0.zza = r3
            return
    }

    static com.google.android.gms.internal.measurement.zznl zzc(com.google.android.gms.internal.measurement.zzoe r1, com.google.android.gms.internal.measurement.zzlq r2, com.google.android.gms.internal.measurement.zznh r3) {
            com.google.android.gms.internal.measurement.zznl r0 = new com.google.android.gms.internal.measurement.zznl
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            com.google.android.gms.internal.measurement.zzof r0 = r0.zzc
            int r0 = r0.zzb()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L16
            com.google.android.gms.internal.measurement.zzma r3 = (com.google.android.gms.internal.measurement.zzma) r3
            com.google.android.gms.internal.measurement.zzlu r3 = r3.zzb
            int r3 = r3.zzc()
            int r0 = r0 + r3
        L16:
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            com.google.android.gms.internal.measurement.zzof r0 = r0.zzc
            int r0 = r0.hashCode()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.measurement.zzma r3 = (com.google.android.gms.internal.measurement.zzma) r3
            com.google.android.gms.internal.measurement.zzlu r3 = r3.zzb
            int r0 = r0 * 53
            com.google.android.gms.internal.measurement.zzoa r3 = r3.zza
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final java.lang.Object zze() {
            r2 = this;
            com.google.android.gms.internal.measurement.zznh r0 = r2.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzmd
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzcj()
            return r0
        Ld:
            com.google.android.gms.internal.measurement.zzng r0 = r0.zzcA()
            com.google.android.gms.internal.measurement.zznh r0 = r0.zzbc()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzoe r0 = r1.zzb
            r0.zza(r2)
            com.google.android.gms.internal.measurement.zzlq r0 = r1.zzd
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzoe r0 = r1.zzb
            com.google.android.gms.internal.measurement.zznu.zzp(r0, r2, r3)
            boolean r0 = r1.zzc
            if (r0 == 0) goto Le
            com.google.android.gms.internal.measurement.zzlq r0 = r1.zzd
            com.google.android.gms.internal.measurement.zznu.zzo(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(java.lang.Object r1, byte[] r2, int r3, int r4, com.google.android.gms.internal.measurement.zzks r5) throws java.io.IOException {
            r0 = this;
            r2 = r1
            com.google.android.gms.internal.measurement.zzmd r2 = (com.google.android.gms.internal.measurement.zzmd) r2
            com.google.android.gms.internal.measurement.zzof r3 = r2.zzc
            com.google.android.gms.internal.measurement.zzof r4 = com.google.android.gms.internal.measurement.zzof.zzc()
            if (r3 == r4) goto Lc
            goto L12
        Lc:
            com.google.android.gms.internal.measurement.zzof r3 = com.google.android.gms.internal.measurement.zzof.zzf()
            r2.zzc = r3
        L12:
            com.google.android.gms.internal.measurement.zzma r1 = (com.google.android.gms.internal.measurement.zzma) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzi(java.lang.Object r6, com.google.android.gms.internal.measurement.zzor r7) throws java.io.IOException {
            r5 = this;
            r0 = r6
            com.google.android.gms.internal.measurement.zzma r0 = (com.google.android.gms.internal.measurement.zzma) r0
            com.google.android.gms.internal.measurement.zzlu r0 = r0.zzb
            java.util.Iterator r0 = r0.zze()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.measurement.zzlt r2 = (com.google.android.gms.internal.measurement.zzlt) r2
            com.google.android.gms.internal.measurement.zzoq r3 = r2.zzc()
            com.google.android.gms.internal.measurement.zzoq r4 = com.google.android.gms.internal.measurement.zzoq.zzi
            if (r3 != r4) goto L51
            boolean r3 = r2.zze()
            if (r3 != 0) goto L51
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L51
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzmo
            if (r3 == 0) goto L45
            int r2 = r2.zza()
            com.google.android.gms.internal.measurement.zzmo r1 = (com.google.android.gms.internal.measurement.zzmo) r1
            com.google.android.gms.internal.measurement.zzmr r1 = r1.zza()
            com.google.android.gms.internal.measurement.zzld r1 = r1.zzb()
            r7.zzw(r2, r1)
            goto L9
        L45:
            int r2 = r2.zza()
            java.lang.Object r1 = r1.getValue()
            r7.zzw(r2, r1)
            goto L9
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L59:
            com.google.android.gms.internal.measurement.zzmd r6 = (com.google.android.gms.internal.measurement.zzmd) r6
            com.google.android.gms.internal.measurement.zzof r6 = r6.zzc
            r6.zzk(r7)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            com.google.android.gms.internal.measurement.zzof r0 = r0.zzc
            r1 = r4
            com.google.android.gms.internal.measurement.zzmd r1 = (com.google.android.gms.internal.measurement.zzmd) r1
            com.google.android.gms.internal.measurement.zzof r1 = r1.zzc
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r2.zzc
            if (r0 == 0) goto L23
            com.google.android.gms.internal.measurement.zzma r3 = (com.google.android.gms.internal.measurement.zzma) r3
            com.google.android.gms.internal.measurement.zzlu r3 = r3.zzb
            com.google.android.gms.internal.measurement.zzma r4 = (com.google.android.gms.internal.measurement.zzma) r4
            com.google.android.gms.internal.measurement.zzlu r4 = r4.zzb
            boolean r3 = r3.equals(r4)
            return r3
        L23:
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzma r1 = (com.google.android.gms.internal.measurement.zzma) r1
            com.google.android.gms.internal.measurement.zzlu r1 = r1.zzb
            boolean r1 = r1.zzh()
            return r1
    }
}
