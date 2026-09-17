package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhct implements com.google.android.gms.internal.ads.zzhdk {
    private final com.google.android.gms.internal.ads.zzhcp zza;
    private final com.google.android.gms.internal.ads.zzhdy zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzhap zzd;

    private zzhct(com.google.android.gms.internal.ads.zzhdy r1, com.google.android.gms.internal.ads.zzhap r2, com.google.android.gms.internal.ads.zzhcp r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            boolean r1 = r3 instanceof com.google.android.gms.internal.ads.zzhba
            r0.zzc = r1
            r0.zzd = r2
            r0.zza = r3
            return
    }

    static com.google.android.gms.internal.ads.zzhct zzc(com.google.android.gms.internal.ads.zzhdy r1, com.google.android.gms.internal.ads.zzhap r2, com.google.android.gms.internal.ads.zzhcp r3) {
            com.google.android.gms.internal.ads.zzhct r0 = new com.google.android.gms.internal.ads.zzhct
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zza(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            com.google.android.gms.internal.ads.zzhdz r0 = r0.zzt
            int r0 = r0.zzb()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L16
            com.google.android.gms.internal.ads.zzhba r3 = (com.google.android.gms.internal.ads.zzhba) r3
            com.google.android.gms.internal.ads.zzhat r3 = r3.zza
            int r3 = r3.zzd()
            int r0 = r0 + r3
        L16:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zzb(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            com.google.android.gms.internal.ads.zzhdz r0 = r0.zzt
            int r0 = r0.hashCode()
            boolean r1 = r2.zzc
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.ads.zzhba r3 = (com.google.android.gms.internal.ads.zzhba) r3
            com.google.android.gms.internal.ads.zzhat r3 = r3.zza
            int r0 = r0 * 53
            com.google.android.gms.internal.ads.zzhdu r3 = r3.zza
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final java.lang.Object zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcp r0 = r2.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzhbe
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbj()
            return r0
        Ld:
            com.google.android.gms.internal.ads.zzhco r0 = r0.zzcZ()
            com.google.android.gms.internal.ads.zzhcp r0 = r0.zzbs()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdy r0 = r1.zzb
            r0.zzi(r2)
            com.google.android.gms.internal.ads.zzhap r0 = r1.zzd
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzg(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdy r0 = r1.zzb
            com.google.android.gms.internal.ads.zzhdm.zzq(r0, r2, r3)
            boolean r0 = r1.zzc
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzhap r0 = r1.zzd
            com.google.android.gms.internal.ads.zzhdm.zzp(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzh(java.lang.Object r1, com.google.android.gms.internal.ads.zzhdc r2, com.google.android.gms.internal.ads.zzhao r3) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.ads.zzhdy r2 = r0.zzb
            r2.zza(r1)
            com.google.android.gms.internal.ads.zzhba r1 = (com.google.android.gms.internal.ads.zzhba) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzi(java.lang.Object r1, byte[] r2, int r3, int r4, com.google.android.gms.internal.ads.zzgzg r5) throws java.io.IOException {
            r0 = this;
            r2 = r1
            com.google.android.gms.internal.ads.zzhbe r2 = (com.google.android.gms.internal.ads.zzhbe) r2
            com.google.android.gms.internal.ads.zzhdz r3 = r2.zzt
            com.google.android.gms.internal.ads.zzhdz r4 = com.google.android.gms.internal.ads.zzhdz.zzc()
            if (r3 == r4) goto Lc
            goto L12
        Lc:
            com.google.android.gms.internal.ads.zzhdz r3 = com.google.android.gms.internal.ads.zzhdz.zzf()
            r2.zzt = r3
        L12:
            com.google.android.gms.internal.ads.zzhba r1 = (com.google.android.gms.internal.ads.zzhba) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzj(java.lang.Object r6, com.google.android.gms.internal.ads.zzhen r7) throws java.io.IOException {
            r5 = this;
            r0 = r6
            com.google.android.gms.internal.ads.zzhba r0 = (com.google.android.gms.internal.ads.zzhba) r0
            com.google.android.gms.internal.ads.zzhat r0 = r0.zza
            java.util.Iterator r0 = r0.zzf()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.ads.zzhas r2 = (com.google.android.gms.internal.ads.zzhas) r2
            com.google.android.gms.internal.ads.zzhem r3 = r2.zzc()
            com.google.android.gms.internal.ads.zzhem r4 = com.google.android.gms.internal.ads.zzhem.zzi
            if (r3 != r4) goto L51
            boolean r3 = r2.zze()
            if (r3 != 0) goto L51
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L51
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.zzhbx
            if (r3 == 0) goto L45
            int r2 = r2.zza()
            com.google.android.gms.internal.ads.zzhbx r1 = (com.google.android.gms.internal.ads.zzhbx) r1
            com.google.android.gms.internal.ads.zzhbz r1 = r1.zza()
            com.google.android.gms.internal.ads.zzgzs r1 = r1.zzb()
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
            com.google.android.gms.internal.ads.zzhbe r6 = (com.google.android.gms.internal.ads.zzhbe) r6
            com.google.android.gms.internal.ads.zzhdz r6 = r6.zzt
            r6.zzk(r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final boolean zzk(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            com.google.android.gms.internal.ads.zzhdz r0 = r0.zzt
            r1 = r4
            com.google.android.gms.internal.ads.zzhbe r1 = (com.google.android.gms.internal.ads.zzhbe) r1
            com.google.android.gms.internal.ads.zzhdz r1 = r1.zzt
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r2.zzc
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzhba r3 = (com.google.android.gms.internal.ads.zzhba) r3
            com.google.android.gms.internal.ads.zzhat r3 = r3.zza
            com.google.android.gms.internal.ads.zzhba r4 = (com.google.android.gms.internal.ads.zzhba) r4
            com.google.android.gms.internal.ads.zzhat r4 = r4.zza
            boolean r3 = r3.equals(r4)
            return r3
        L23:
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final boolean zzl(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzhba r1 = (com.google.android.gms.internal.ads.zzhba) r1
            com.google.android.gms.internal.ads.zzhat r1 = r1.zza
            boolean r1 = r1.zzi()
            return r1
    }
}
